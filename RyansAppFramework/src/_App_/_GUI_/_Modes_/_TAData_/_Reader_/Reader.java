package _App_._GUI_._Modes_._TAData_._Reader_;
import _App_.App;
import _App_._GUI_._Modes_._TAData_._Boilerplate_.Boilerplate;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.TD_TATableView;
import _Externals_.r;
public class Reader//It is not a coincidence that none of these methods have void or arguments
{
    public App app;
    public Reader(App app)
    {
        this.app=app;
    }
    private Boilerplate boilerplate;
    private PropertyGetter propertyGetter;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.tadata.boilerplate;
        propertyGetter=app.io.propertyGetter;
    }
    public TD_TATableView.TA getSelectedTa()
    {
        return boilerplate.getTa_tableView().getSelected();
    }
    public String getSelectedTaName()
    {
        return getSelectedTa().nameProperty().getValue();
    }
    public String getSelectedTaEmail()
    {
        return getSelectedTa().emailProperty().getValue();
    }
    public boolean getSelectedTaIsUndergrad()
    {
        return getSelectedTa().undergradProperty().getValue();
    }
    public String getTaState()
    {
        return boilerplate.getTa_tableView().getState();
    }
    public String getTextfieldInputName()
    {
        return boilerplate.getTaName_textField().getText();
    }
    public String getTextfieldInputEmail()
    {
        return boilerplate.getTaEmail_textField().getText();
    }
    public boolean getIsTaSelected()
    {
        return boilerplate.getTa_tableView().getSelected()!=null;
    }
    public boolean getIsAddUpdateButtonAdd()
    {
        return boilerplate.getTaAddUpdate_button().getText().equals(propertyGetter.getAddButtonLabel());
    }
    public boolean getIsAddUpdateButtonUpdate()
    {
        return boilerplate.getTaAddUpdate_button().getText().equals(propertyGetter.getUpdateButtonLabel());
        // return !getIsAddUpdateButtonAdd();
    }
    public String getFirstOfficeHourTimeslot()
    {
        return boilerplate.getOh_gridPane().getFirstTimeSlot();
    }
    public String getLastOfficeHourTimeslot()
    {
        return boilerplate.getOh_gridPane().getLastTimeSlot();
    }
    public String getOhState()
    {
        return boilerplate.getOh_gridPane().getGridState();
    }
    public String getState()
    {
        return r.joinLines(getTaState(),getOhState());
    }
}
