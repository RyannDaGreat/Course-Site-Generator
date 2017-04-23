package _App_._GUI_._Modes_._ScheduleData_._Actions_;
import _App_.App;
import _App_._GUI_._Modes_._ScheduleData_._Boilerplate_.Boilerplate;
import _App_._GUI_._Modes_._ScheduleData_._Reader_.Reader;
import _Externals_.SD_ScheduleItemsTableView;
import _Externals_.r;
import org.json.JSONException;
import org.json.JSONObject;
public class Actions
{
    public App app;
    private Boilerplate boilerplate;
    private Reader reader;
    public Actions(App app)
    {
        this.app=app;
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.scheduleData.boilerplate;
        reader=app.gui.modes.scheduleData.reader;
        boilerplate.getSdScheduledItems_tableView().setOnItemSelected(this::updateFieldsToSelected);
    }
    public void updateFieldsToSelected()//Updates time,title,topic,link etc to the selected item
    {

        SD_ScheduleItemsTableView.Item item=reader.getSelected();
        if(item==null)
            return;
        setDate(item.dateProperty().getValue());
        setType(item.typeProperty().getValue());
        setTime(item.time);
        setTitle(item.titleProperty().getValue());
        setTopic(item.topicProperty().getValue());
        setLink(item.link);
        setCriteria(item.criteria);
    }
    //Setters
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
    }
    //endregion
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
}
