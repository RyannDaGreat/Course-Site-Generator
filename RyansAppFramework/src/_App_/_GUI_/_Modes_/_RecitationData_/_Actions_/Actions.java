package _App_._GUI_._Modes_._RecitationData_._Actions_;
import _App_.App;
import _App_._GUI_._Modes_._RecitationData_._Boilerplate_.Boilerplate;
public class Actions
{
    public App app;
    public Actions(App app)
    {
        this.app=app;
    }
    private Boilerplate boilerplate;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.recitationData.boilerplate;
    }
    public void setState(String state)
    {
        boilerplate.getTableView().setState(state);
    }
}
