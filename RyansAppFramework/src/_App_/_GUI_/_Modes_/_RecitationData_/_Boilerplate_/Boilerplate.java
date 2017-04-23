package _App_._GUI_._Modes_._RecitationData_._Boilerplate_;
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
    public TableView getRd_tableView()
    {
        return megaplate.rd_tableView1;
    }
    public TableColumn getRdSection_tableColumn()
    {
        return megaplate.rdSection_tableColumn6;
    }
    public TableColumn getRdInstructor_tableColumn()
    {
        return megaplate.rdInstructor_tableColumn7;
    }
    public TableColumn getRdRecitationData_tableColumn()
    {
        return megaplate.rdRecitationData_tableColumn8;
    }
    public TableColumn getRdTA1_tableColumn()
    {
        return megaplate.rdTA1_tableColumn9;
    }
    public TableColumn getRdTA2tableColumn()
    {
        return megaplate.rdTA2tableColumn10;
    }
    public TextField getRdSection_textField()
    {
        return megaplate.rdSection_textField4;
    }
    public TextField getRdInstructor_textField()
    {
        return megaplate.rdInstructor_textField5;
    }
    public TextField getRdDayTime_textField()
    {
        return megaplate.rdDayTime_textField6;
    }
    public TextField getRdLocation_textField()
    {
        return megaplate.rdLocation_textField7;
    }
    public ComboBox getRdTA1_comboBox()
    {
        return megaplate.rdTA1_comboBox6;
    }
    public ComboBox getRdTA2_comboBox()
    {
        return megaplate.rdTA2_comboBox7;
    }
    public Button getRdAddUpdate_button()
    {
        return megaplate.rdAddUpdate_button15;
    }
    public Button getRdClear_button()
    {
        return megaplate.rdClear_button16;
    }
}
