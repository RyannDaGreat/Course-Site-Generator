package _App_._GUI_._Modes_._RecitationData_._Boilerplate_;
import _App_.App;
import _App_._GUI_._Modes_._RecitationData_._Actions_.Actions;
import _Externals_.RD_RecitationDataTableView;
import _Externals_.rButton;
import javafx.scene.control.*;
public class Boilerplate
{
    public App app;
    public Boilerplate(App app){this.app=app;}
    private _App_._GUI_._Window_._Boilerplate_.Boilerplate megaplate;
    private Actions actions;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        megaplate=app.gui.window.boilerplate;
        actions=app.gui.modes.recitationData.actions;
        getTA1_comboBox().setOnMouseEntered(ⵁ->actions.updateComboboxOptions());
        getTA2_comboBox().setOnMouseEntered(ⵁ->actions.updateComboboxOptions());
        getAddUpdate_button().setAction(actions::handleAddⳆUpdate);
        getClear_button().setAction(actions::handleClear);
        getTableView().setOnItemSelected(actions::updateFieldsToSelected);
    }
    //region Getters   ([\n][ ]*[{][\n][ ]*)(.*)([\n][ ]*[}])   ⟹  {$2}
    /*@formatter:off*/
    public RD_RecitationDataTableView getTableView(){return megaplate.rd_tableView1;}
    public TableColumn getSection_tableColumn(){return megaplate.rdSection_tableColumn6;}
    public TableColumn getInstructor_tableColumn(){return megaplate.rdInstructor_tableColumn7;}
    public TableColumn getRecitationData_tableColumn(){return megaplate.rdRecitationData_tableColumn8;}
    public TableColumn getTA1_tableColumn(){return megaplate.rdTA1_tableColumn9;}
    public TableColumn getTA2tableColumn(){return megaplate.rdTA2tableColumn10;}
    public TextField getSection_textField(){return megaplate.rdSection_textField4;}
    public TextField getInstructor_textField(){return megaplate.rdInstructor_textField5;}
    public TextField getDayTime_textField(){return megaplate.rdDayTime_textField6;}
    public TextField getLocation_textField(){return megaplate.rdLocation_textField7;}
    public ComboBox getTA1_comboBox(){return megaplate.rdTA1_comboBox6;}
    public ComboBox getTA2_comboBox(){return megaplate.rdTA2_comboBox7;}
    public rButton getAddUpdate_button(){return megaplate.rdAddUpdate_button15;}
    public rButton getClear_button(){return megaplate.rdClear_button16;}
    /*@formatter:on*/
    //endregion
}
