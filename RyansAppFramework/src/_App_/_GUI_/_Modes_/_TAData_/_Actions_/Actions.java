package _App_._GUI_._Modes_._TAData_._Actions_;
import _App_.App;
import _App_._GUI_._Modes_._TAData_._Boilerplate_.Boilerplate;
import _App_._GUI_._Modes_._TAData_._Reader_.Reader;
import _Externals_.TATableView;
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
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.tadata.boilerplate;
        reader=app.gui.modes.tadata.reader;
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
        boilerplate.getTa_tableView().remove(reader.getSelectedTa());
        boilerplate.getOh_gridPane().removeName(reader.getSelectedTaName());
    }
    public void addTa()
    {
        boilerplate.getTa_tableView().addPerson(false,reader.getTextfieldInputName(),reader.getTextfieldInputEmail());
    }
    public void setTaState(String state)
    {
        boilerplate.getTa_tableView().setState(state);
    }
}
