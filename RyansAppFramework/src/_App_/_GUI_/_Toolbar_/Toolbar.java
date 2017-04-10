package _App_._GUI_._Toolbar_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Toolbar_._Reader_.Reader;
import _App_._GUI_._Toolbar_._Actions_.Actions;
import _App_._GUI_._Toolbar_._Boilerplate_.Boilerplate;
@SuppressWarnings("WeakerAccess")
public class Toolbar
{
    public Reader reader;
    public Actions actions;
    public Boilerplate boilerplate;
    public Toolbar(App app)
    {
        reader=new Reader(app);
        actions=new Actions(app);
        boilerplate=new Boilerplate(app);
    }
}