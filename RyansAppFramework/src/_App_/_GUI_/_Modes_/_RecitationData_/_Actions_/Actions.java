package _App_._GUI_._Modes_._RecitationData_._Actions_;
import _App_.App;
import _App_._GUI_._Modes_._RecitationData_._Boilerplate_.Boilerplate;
import _App_._GUI_._Modes_._RecitationData_._Reader_.Reader;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.RD_RecitationDataTableView;
import _Externals_.r;

import java.util.ArrayList;
public class Actions
{
    public App app;
    public Actions(App app)
    {
        this.app=app;
    }
    private Boilerplate boilerplate;
    private Reader reader;
    private PropertyGetter propertyGetter;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.recitationData.boilerplate;
        reader=app.gui.modes.recitationData.reader;
        propertyGetter=app.io.propertyGetter;
        clearInputs();
    }
    public void setState(String state)
    {
        boilerplate.getTableView().setState(state);
    }
    public void updateFieldsToSelected()//Updates time,title,topic,link etc to the selected item
    {
        RD_RecitationDataTableView.Recitation item=boilerplate.getTableView().getSelected();
        if(item==null)
        {
            return;
        }
        r.setComboboxOption(boilerplate.getTA1_comboBox(),item.ta2Property().getValue());
        r.setComboboxOption(boilerplate.getTA2_comboBox(),item.ta1Property().getValue());
        boilerplate.getDayTime_textField().setText(item.dayⳆtimeProperty().getValue());
        boilerplate.getInstructor_textField().setText(item.instructorProperty().getValue());
        boilerplate.getLocation_textField().setText(item.locationProperty().getValue());
        boilerplate.getSection_textField().setText(item.sectionProperty().getValue());
        refreshAddⳆUpdateButton();
    }
    public void refreshAddⳆUpdateButton()//Update whether it says add or update, and whether its enabled or disabled
    {
        if(app.gui.modes.tadata.reader.thereExistsTA(reader.getTA1Name())&&
           app.gui.modes.tadata.reader.thereExistsTA(reader.getTA2Name())&&
           reader.getSection().length()>0&&
           reader.getInstructor().length()>0&&
           reader.getDayTime().length()>0&&
           reader.getLocation().length()>0)
        {
            enableAddUpdateButton();
        }
        else
        {
            disableAddUpdateButton();
        }
        if(boilerplate.getTableView().getSelected()==null)
        {
            boilerplate.getAddUpdate_button().setText(propertyGetter.getAddButtonLabel());
        }
        else
        {
            boilerplate.getAddUpdate_button().setText(propertyGetter.getUpdateButtonLabel());
        }
    }
    public void enableAddUpdateButton()
    {
        boilerplate.getAddUpdate_button().setDisable(false);
    }
    public void disableAddUpdateButton()
    {
        boilerplate.getAddUpdate_button().setDisable(true);
    }
    public void handleClear()
    {
        boilerplate.getTableView().getSelectionModel().clearSelection();
        refreshAddⳆUpdateButton();
    }
    public void handleAddⳆUpdate()
    {
        try
        {
            if(reader.isAddMode())//Button is add mode
            {
                handleAddRecitation();
            }
            else//Button is update mode
            {
                assert reader.isUpdateMode();//This should always be true
                handleUpdateRecitation();
            }
        }
        catch(Exception ignored)
        {
        }
        refreshAddⳆUpdateButton();
    }
    public void handleUpdateRecitation()
    {
        boilerplate.getTableView().updateRecitation(reader.getSection(),reader.getInstructor(),reader.getDayTime(),reader.getLocation(),reader.getTA1Name(),reader.getTA2Name());
    }
    public void handleAddRecitation()
    {
        boilerplate.getTableView().addRecitation(reader.getSection(),reader.getInstructor(),reader.getDayTime(),reader.getLocation(),reader.getTA1Name(),reader.getTA2Name());
    }
    public void updateComboboxOptions()
    {
        ArrayList<String> tas=app.gui.modes.tadata.boilerplate.getTa_tableView().getTANames();
        String ta1=reader.getTA1Name();//Im getting sloppy. This should be a method in reader. But I know what I'm doing and im too lazy to bother with it.
        String ta2=reader.getTA2Name();
        ArrayList<String> ta1Options=new ArrayList<>();
        ArrayList<String> ta2Options=new ArrayList<>();
        for(String ta : tas)
        {
            if(!ta.equals(ta1))
            {
                ta2Options.add(ta);
            }
            if(!ta.equals(ta2))
            {
                ta1Options.add(ta);
            }
        }
        String[] a1=new String[ta1Options.size()];
        String[] a2=new String[ta2Options.size()];
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=ta1Options.get(i);
        }
        for(int i=0;i<a2.length;i++)
        {
            a2[i]=ta2Options.get(i);
        }
        r.setComboboxOptions(boilerplate.getTA1_comboBox(),a1);
        r.setComboboxOptions(boilerplate.getTA2_comboBox(),a2);
        r.setComboboxOption(boilerplate.getTA1_comboBox(),ta1);
        r.setComboboxOption(boilerplate.getTA2_comboBox(),ta2);
    }
    public void clearInputs()
    {
        boilerplate.getSection_textField().clear();
        boilerplate.getInstructor_textField().clear();
        boilerplate.getDayTime_textField().clear();
        boilerplate.getLocation_textField().clear();
        r.setComboboxOption(boilerplate.getTA1_comboBox(),"");
        r.setComboboxOption(boilerplate.getTA2_comboBox(),"");
    }

}
