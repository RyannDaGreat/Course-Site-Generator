package _App_._GUI_._Window_._Reader_;
import _App_.App;
import _App_._GUI_._Window_._Boilerplate_.Boilerplate;
import javafx.scene.control.Tab;
public class Reader//It is not a coincidence that none of these methods have void or arguments
{
    public App app;
    private Boilerplate boilerplate;
    public Reader(App app)
    {
        this.app=app;
    }
    public void initialize()
    {
        boilerplate=app.gui.window.boilerplate;
    }
    public Tab getCurrentTab()
    {
        return boilerplate.getTabPane().getSelectionModel().getSelectedItem();
    }
}