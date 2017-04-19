package _App_._GUI_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Dialogs_.Dialogs;
import _App_._GUI_._Modes_.Modes;
import _App_._GUI_._Toolbar_.Toolbar;
import _App_._GUI_._Window_.Window;
@SuppressWarnings("WeakerAccess")
public class GUI
{
    //Note that this class has no reference to 'app' because this class doesn't actually DO anything, and forces the references to go down
    public Window window;
    public Toolbar toolbar;
    public Modes modes;
    public Dialogs dialogs;
    public GUI(App app)
    {
        window=new Window(app);
        toolbar=new Toolbar(app);
        modes=new Modes(app);
        dialogs=new Dialogs(app);
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        window.initialize();
        toolbar.initialize();
        modes.initialize();
        dialogs.initialize();
    }
}
