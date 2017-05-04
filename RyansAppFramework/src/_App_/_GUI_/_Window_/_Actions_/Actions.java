package _App_._GUI_._Window_._Actions_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Window_._Boilerplate_.Boilerplate;
import javafx.scene.control.Tab;
public class Actions
{
    public App app;
    private Boilerplate boilerplate;
    public Actions(App app)
    {
        this.app=app;
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.window.boilerplate;
    }
    public void setCurrentTab(Tab tab)
    {
        boilerplate.getTabPane().getSelectionModel().select(tab);
    }
}
