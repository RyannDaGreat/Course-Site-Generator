package _App_._GUI_._Modes_._ScheduleData_._Boilerplate_;
import _App_.App;
import javafx.scene.control.*;
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
    public DatePicker getSdStartingMonday_datePicker()
    {
        return megaplate.sdStartingMonday_datePicker0;
    }
    public DatePicker getSdEndingFriday_datePicker()
    {
        return megaplate.sdEndingFriday_datePicker;
    }
    public TableView getSdScheduledItems_tableView()
    {
        return megaplate.sdScheduledItems_tableView2;
    }
    public TableColumn getSdType_tableColumn()
    {
        return megaplate.sdType_tableColumn11;
    }
    public TableColumn getSdDate_tableColumn()
    {
        return megaplate.sdDate_tableColumn12;
    }
    public TableColumn getSdTitle_tableColumn()
    {
        return megaplate.sdTitle_tableColumn13;
    }
    public TableColumn getSdTopic_tableColumn()
    {
        return megaplate.sdTopic_tableColumn14;
    }
    public DatePicker getSdDate_datePicker()
    {
        return megaplate.sdDate_datePicker1;
    }
    public ComboBox getSdType_comboBox()
    {
        return megaplate.sdType_comboBox8;
    }
    public TextField getSdTime_textField()
    {
        return megaplate.sdTime_textField10;
    }
    public TextField getSdTitle_textField()
    {
        return megaplate.sdTitle_textField11;
    }
    public TextField getSdTopic_textField()
    {
        return megaplate.sdTopic_textField9;
    }
    public TextField getSdLink_textField()
    {
        return megaplate.sdLink_textField12;
    }
    public TextField getSdCriteria_textField()
    {
        return megaplate.sdCriteria_textField8;
    }
    public Button getSdAddUpdate_button()
    {
        return megaplate.sdAddUpdate_button17;
    }
    public Button getSdClear_button()
    {
        return megaplate.sdClear_button18;
    }
}
