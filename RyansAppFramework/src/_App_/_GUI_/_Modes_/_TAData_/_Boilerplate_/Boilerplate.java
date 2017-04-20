package _App_._GUI_._Modes_._TAData_._Boilerplate_;
import _App_.App;
import _Externals_.OfficeHoursGrid;
import _Externals_.TATableView;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
public class Boilerplate
{
    public App app;
    public Boilerplate(App app)
    {
        this.app=app;
    }
    private _App_._GUI_._Window_._Boilerplate_.Boilerplate megaplate;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        megaplate=app.gui.window.boilerplate;
    }
    public OfficeHoursGrid getTaOh_gridPane()
    {
        return megaplate.taOh_gridPane7;
    }
    public ComboBox getTdOhStartTime_comboBox()
    {
        return megaplate.tdOhStartTime_comboBox4;
    }
    public ComboBox getTdOhEndTime_comboBox()
    {
        return  megaplate.tdOhEndTime_comboBox5;
    }
    public TATableView getTdTa_tableView()
    {
        return  megaplate.tdTa_tableView0;
    }
    public TableColumn getTdTaUndergrad_tableColumn()
    {
        return  megaplate.tdTaUndergrad_tableColumn3;
    }
    public TableColumn getTdTaName_tableColumn()
    {
        return  megaplate.tdTaName_tableColumn4;
    }
    public TableColumn getTdTaEmail_tableColumn()
    {
        return  megaplate.tdTaEmail_tableColumn5;
    }
    public TextField getTdTaName_textField()
    {
        return  megaplate.tdTaName_textField3;
    }
    public TextField getTdTaEmail_textField()
    {
        return  megaplate.tdTaEmail_textField2;
    }
    public Button getTdTaAddUpdate_button()
    {
        return  megaplate.tdTaAddUpdate_button13;
    }
    public Button getTdTaClear_button()
    {
        return  megaplate.tdTaClear_button14;
    }
}
