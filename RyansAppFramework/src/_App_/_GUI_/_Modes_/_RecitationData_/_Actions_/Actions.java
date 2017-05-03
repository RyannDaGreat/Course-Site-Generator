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
        updateAddⳆUpdateButton();
    }
    public void updateAddⳆUpdateButton()//Update whether it says add or update, and whether its enabled or disabled
    {
        if(boilerplate.getTableView().getSelected()==null)
        {
            boilerplate.getAddUpdate_button().setText(propertyGetter.getAddButtonLabel());
        }
        else
        {
            boilerplate.getAddUpdate_button().setText(propertyGetter.getUpdateButtonLabel());
        }
    }
    public void handleClear()
    {
        boilerplate.getTableView().getSelectionModel().clearSelection();
        updateAddⳆUpdateButton();
    }
    public void handleAddⳆUpdate()
    {
        try
        {
            if(boilerplate.getAddUpdate_button().getText().equals(propertyGetter.getAddButtonLabel()))//Button is add mode
            {
                boilerplate.getTableView().addRecitation(boilerplate.getSection_textField().getText(),boilerplate.getInstructor_textField().getText(),boilerplate.getDayTime_textField().getText(),boilerplate.getLocation_textField().getText(),(String)boilerplate.getTA1_comboBox().getValue(),(String)boilerplate.getTA2_comboBox().getValue());
            }
            else//Button is update mode
            {
                assert boilerplate.getAddUpdate_button().getText().equals(propertyGetter.getUpdateButtonLabel());//This should always be true
                boilerplate.getTableView().updateRecitation(boilerplate.getSection_textField().getText(),boilerplate.getInstructor_textField().getText(),boilerplate.getDayTime_textField().getText(),boilerplate.getLocation_textField().getText(),(String)boilerplate.getTA1_comboBox().getValue(),(String)boilerplate.getTA2_comboBox().getValue());
            }
        }
        catch(Exception ignored){}
        updateAddⳆUpdateButton();
    }
    public void updateComboboxOptions()
    {
        ArrayList<String> tas=app.gui.modes.tadata.boilerplate.getTa_tableView().getTANames();
        String ta1=(String)boilerplate.getTA1_comboBox().getValue();//Im getting sloppy. This should be a method in reader. But I know what I'm doing and im too lazy to bother with it.
        String ta2=(String)boilerplate.getTA2_comboBox().getValue();
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

    }
}
