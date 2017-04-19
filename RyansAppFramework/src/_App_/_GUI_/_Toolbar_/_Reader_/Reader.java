package _App_._GUI_._Toolbar_._Reader_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Toolbar_._Boilerplate_.Boilerplate;
public class Reader
{
    public App app;
    public Reader(App app)
    {
        this.app=app;
    }
    private Boilerplate boilerplate;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.toolbar.boilerplate;
    }
    public boolean saveButtonIsDisabled()
    {
        return boilerplate.getSaveButton().isDisabled();
    }
    public boolean saveButtonIsEnabled()
    {
        return !saveButtonIsDisabled();
    }
}
