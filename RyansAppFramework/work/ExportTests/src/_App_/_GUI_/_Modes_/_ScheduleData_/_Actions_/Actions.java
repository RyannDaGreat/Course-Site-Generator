package _App_._GUI_._Modes_._ScheduleData_._Actions_;
import _App_.App;
import _App_._GUI_._Dialogs_.Dialogs;
import _App_._GUI_._Modes_._ScheduleData_._Boilerplate_.Boilerplate;
import _App_._GUI_._Modes_._ScheduleData_._Reader_.Reader;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_._Components_.SD_ScheduleItemsTableView;
import _Externals_.r;
import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;
@SuppressWarnings("AccessStaticViaInstance")
public class Actions
{
    public App app;
    private Boilerplate boilerplate;
    private Reader reader;
    private PropertyGetter propertyGetter;
    public Actions(App app)
    {
        this.app=app;
    }
    private Dialogs dialogs;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.scheduleData.boilerplate;
        reader=app.gui.modes.scheduleData.reader;
        propertyGetter=app.io.propertyGetter;
        dialogs=app.gui.dialogs;
        boilerplate.getSdScheduledItems_tableView().setOnItemSelected(this::updateFieldsToSelected);
    }
    public void updateFieldsToSelected()//Updates time,title,topic,link etc to the selected item
    {
        SD_ScheduleItemsTableView.Item item=reader.getSelected();
        if(item==null)
        {
            return;
        }
        setDate(item.dateProperty().getValue());
        setType(item.typeProperty().getValue());
        setTime(item.time);
        setTitle(item.titleProperty().getValue());
        setTopic(item.topicProperty().getValue());
        setLink(item.link);
        setCriteria(item.criteria);
    }
    public void updateAddⳆUpdateButton()//Update whether it says add or update, and whether its enabled or disabled
    {
        boilerplate.getSdAddUpdate_button().setDisable(reader.getType().equals(""));
        if(reader.getSelected()==null)//Add mode
        {
            boilerplate.getSdAddUpdate_button().setText(propertyGetter.getAddButtonLabel());
        }
        else//Update mode
        {
            boilerplate.getSdAddUpdate_button().setText(propertyGetter.getUpdateButtonLabel());

        }
    }
    public void handleClear()
    {
        setType("");
        setTime("");
        setTitle("");
        setLink("");
        setTopic("");
        setCriteria("");
        boilerplate.getSdScheduledItems_tableView().getSelectionModel().clearSelection();
        updateAddⳆUpdateButton();
    }
    public void handleAddⳆUpdate()
    {
        if(reader.getDate().equals(""+null)||!reader.isValidScheduleItemDate(LocalDate.parse(reader.getDate())))
        {
            app.io.misc.playErrorSound();
            dialogs.showInfoAlert(app.io.propertyGetter.getProperty("error.bad.date.cannot.add.or.update"));
            return;
        }
        //All checks passed: Continue the rest of it
        if(boilerplate.getSdAddUpdate_button().getText().equals(propertyGetter.getAddButtonLabel()))//Button is add mode
        {
            boilerplate.getSdScheduledItems_tableView().addItem(reader.getType(),reader.getDate(),reader.getTitle(),reader.getTopic(),reader.getTime(),reader.getLink(),reader.getCriteria());
        }
        else//Button is update mode
        {
            assert boilerplate.getSdAddUpdate_button().getText().equals(propertyGetter.getUpdateButtonLabel());//This should always be true
            boilerplate.getSdScheduledItems_tableView().updateItem(reader.getType(),reader.getDate(),reader.getTitle(),reader.getTopic(),reader.getTime(),reader.getLink(),reader.getCriteria());
        }
        updateAddⳆUpdateButton();
    }
    //region Setters
    public void setStartingMonday(String x)
    {
        r.setDatePickerValue(boilerplate.getSdStartingMonday_datePicker(),x);
    }
    public void setEndingFriday(String x)
    {
        r.setDatePickerValue(boilerplate.getSdEndingFriday_datePicker(),x);
    }
    public void setDate(String x)
    {
        r.setDatePickerValue(boilerplate.getSdDate_datePicker(),x);
    }
    public void setType(String x)
    {
        r.setComboboxOption(boilerplate.getSdType_comboBox(),x);
    }
    public void setTime(String x)
    {
        boilerplate.getSdTime_textField().setText(x);
    }
    public void setTitle(String x)
    {
        boilerplate.getSdTitle_textField().setText(x);
    }
    public void setTopic(String x)
    {
        boilerplate.getSdTopic_textField().setText(x);
    }
    public void setLink(String x)
    {
        boilerplate.getSdLink_textField().setText(x);
    }
    public void setCriteria(String x)
    {
        boilerplate.getSdCriteria_textField().setText(x);
    }
    public void setTableState(String x)
    {
        boilerplate.getSdScheduledItems_tableView().setState(x);
        updateAddⳆUpdateButton();
    }
    public void setState(JSONObject state)
    {
        try
        {
            setStartingMonday(state.getString("StartingMonday"));
            setEndingFriday(state.getString("EndingFriday"));
            setTableState(state.getString("TableState"));
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
    }
    //endregion
}
