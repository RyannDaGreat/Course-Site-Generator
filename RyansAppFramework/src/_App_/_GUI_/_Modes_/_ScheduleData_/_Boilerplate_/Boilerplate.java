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
    public DatePicker getSdStartingMonday_datePicker0()
    {
        return megaplate.sdStartingMonday_datePicker0;
    }
    public DatePicker getSdEndingFriday_datePicker()
    {
        return megaplate.sdEndingFriday_datePicker;
    }
    public TableView getSdScheduledItems_tableView2()
    {
        return megaplate.sdScheduledItems_tableView2;
    }
    public TableColumn getSdType_tableColumn11()
    {
        return megaplate.sdType_tableColumn11;
    }
    public TableColumn getSdDate_tableColumn12()
    {
        return megaplate.sdDate_tableColumn12;
    }
    public TableColumn getSdTitle_tableColumn13()
    {
        return megaplate.sdTitle_tableColumn13;
    }
    public TableColumn getSdTopic_tableColumn14()
    {
        return megaplate.sdTopic_tableColumn14;
    }
    public DatePicker getSdDate_datePicker1()
    {
        return megaplate.sdDate_datePicker1;
    }
    public ComboBox getSdType_comboBox8()
    {
        return megaplate.sdType_comboBox8;
    }
    public TextField getSdTime_textField10()
    {
        return megaplate.sdTime_textField10;
    }
    public TextField getSdTitle_textField11()
    {
        return megaplate.sdTitle_textField11;
    }
    public TextField getSdTopic_textField9()
    {
        return megaplate.sdTopic_textField9;
    }
    public TextField getSdLink_textField12()
    {
        return megaplate.sdLink_textField12;
    }
    public TextField getSdCriteria_textField8()
    {
        return megaplate.sdCriteria_textField8;
    }
    public Button getSdAddUpdate_button17()
    {
        return megaplate.sdAddUpdate_button17;
    }
    public Button getSdClear_button18()
    {
        return megaplate.sdClear_button18;
    }
}
