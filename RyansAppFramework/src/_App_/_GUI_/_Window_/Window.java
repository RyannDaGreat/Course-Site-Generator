package _App_._GUI_._Window_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Window_._Actions_.Actions;
import _App_._GUI_._Window_._Boilerplate_.Boilerplate;
public class Window
{
    public Actions actions;
    public Boilerplate boilerplate;
    public Window(App app)
    {
        actions=new Actions(app);
        boilerplate=new Boilerplate(app);
    }
}
