package _App_._GUI_._Modes_._TAData_._Actions_;
import _App_.App;
import _App_._GUI_._Modes_._TAData_._Boilerplate_.Boilerplate;
import _App_._GUI_._Modes_._TAData_._Reader_.Reader;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.r;
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
        boilerplate=app.gui.modes.tadata.boilerplate;
        reader=app.gui.modes.tadata.reader;
        propertyGetter=app.io.propertyGetter;
    }
    public void handleTaSelected()
    {
        r.say(reader.getSelectedTaName());
        setNameTextfield(reader.getSelectedTaName());
        setEmailTextfield(reader.getSelectedTaEmail());
    }
    public void handleClearButton()
    {
        unselectTa();
        setNameTextfield("");
        setEmailTextfield("");
        refreshClearAndAddUpdateButtonStates();
    }
    public void setNameTextfield(String name)
    {
        boilerplate.getTaName_textField().textProperty().setValue(name);
    }
    public void setEmailTextfield(String email)
    {
        boilerplate.getTaEmail_textField().textProperty().setValue(email);
    }
    public void unselectTa()
    {
        boilerplate.getTa_tableView().getSelectionModel().clearSelection();
    }
    public void deleteSelectedTa()
    {
        boilerplate.getOh_gridPane().removeName(reader.getSelectedTaName());//MUST COME FIRST, ORDER MATTERS! Once deleted they are no longer selected, and name changes.
        boilerplate.getTa_tableView().remove(reader.getSelectedTa());//MUST COME SECOND, ORDER MATTERS! Once deleted they are no longer selected, and name changes.
    }
    public void handleAddUpdateButton()
    {
        if(reader.getIsAddUpdateButtonAdd())
            handleAddTa();
        else if(reader.getIsAddUpdateButtonUpdate())
            handleUpdateTa();
    }
    public void handleAddTa()
    {
        addTa(false,reader.getTextfieldInputName(),reader.getTextfieldInputEmail());
        handleClearButton();
        refreshClearAndAddUpdateButtonStates();
    }
    public void handleUpdateTa()
    {
        boilerplate.getOh_gridPane().updateName(reader.getSelectedTaName(),reader.getTextfieldInputName());
        boilerplate.getTa_tableView().updateSelectedTANameEmail(reader.getTextfieldInputName(),reader.getTextfieldInputEmail());
    }
    public void addTa(boolean undergrad,String name,String email)
    {
        boilerplate.getTa_tableView().addPerson(undergrad,name,email);
    }
    public void setTaState(String state)
    {
        boilerplate.getTa_tableView().setState(state);
    }
    public void handleToggleOfficeHour(String time,String day)
    {
        if(reader.getSelectedTaName()!=null)
        {
            handleToggleOfficeHour(time,day,reader.getSelectedTaName());
        }
    }
    public void handleToggleOfficeHour(String time,String day,String name)
    {
        boilerplate.getOh_gridPane().toggleOfficeHours(time,day,name);
    }
    public void enableAddUpdateButton()
    {
        boilerplate.getTaAddUpdate_button().setDisable(false);
    }
    public void disableAddUpdateButton()
    {
        boilerplate.getTaAddUpdate_button().setDisable(true);
    }
    public void disableClearButton()
    {
        boilerplate.getTaClear_button().setDisable(true);
    }
    public void enableClearButton()
    {
        boilerplate.getTaClear_button().setDisable(false);
    }
    public void setAddUpdateButtonToAdd()
    {
        boilerplate.getTaAddUpdate_button().setText(propertyGetter.getAddButtonLabel());
    }
    public void setAddUpdateButtonToUpdate()
    {
        boilerplate.getTaAddUpdate_button().setText(propertyGetter.getUpdateButtonLabel());
    }
    public void refreshAddUpdateButtonState()//Refreshes whether the add/updateTANameEmail button should say add or updateTANameEmail, and whether or not it should be enabled
    {
        /*@formatter:off*/
        if(reader.getIsTaSelected())
            setAddUpdateButtonToUpdate();
        else
            setAddUpdateButtonToAdd();
        if(boilerplate.getTa_tableView().isValidToAdd(reader.getTextfieldInputName(),reader.getTextfieldInputEmail())&&reader.getIsAddUpdateButtonAdd()||
            boilerplate.getTa_tableView().isValidToUpdate(reader.getTextfieldInputName(),reader.getTextfieldInputEmail())&&reader.getIsAddUpdateButtonUpdate())
            //updateSelectedTANameEmail
            enableAddUpdateButton();
        else
            disableAddUpdateButton();
        /*@formatter:on*/
    }
    public void refreshClearButtonState()
    {
        if(reader.getTextfieldInputEmail().equals("")&&reader.getTextfieldInputName().equals("")&&!reader.getIsTaSelected())//If textfields are empty and no TA is selected
            disableClearButton();
        else
            enableClearButton();
    }
    public void refreshClearAndAddUpdateButtonStates()
    {
        refreshAddUpdateButtonState();
        refreshClearButtonState();
    }
}
