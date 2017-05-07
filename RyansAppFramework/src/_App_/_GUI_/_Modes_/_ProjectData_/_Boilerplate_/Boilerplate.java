package _App_._GUI_._Modes_._ProjectData_._Boilerplate_;
import _App_.App;
import _App_._GUI_._Modes_._ProjectData_._Actions_.Actions;
import _Externals_.PD_StudentsTableView;
import _Externals_.PD_TeamsTableView;
import _Externals_.r;
import _Externals_.rButton;
import javafx.scene.control.*;
import javafx.scene.shape.Circle;
public class Boilerplate
{
    public App app;
    public Boilerplate(App app)
    {
        this.app=app;
    }
    private _App_._GUI_._Window_._Boilerplate_.Boilerplate megaplate;
    private Actions actions;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        megaplate=app.gui.window.boilerplate;
        actions=app.gui.modes.projectData.actions;
        getT_TextColor_selector().setOnAction(ⵁ->actions.updateTeamCircleColors());
        getT_Color_selector().setOnAction(ⵁ->actions.updateTeamCircleColors());
        getT_AddUpdate_button().setAction(actions::handleTeamAddⳆUpdateButton);
        getT_Clear_button().setAction(actions::handleTeamClearButton);
        getT__tableView().setOnItemSelected(actions::updateTeamFieldsToSelected);
        getPsSTeam_comboBox().setOnMouseEntered(ⵁ->actions.updateStudentTeamComboboxOptions());
        r.fxRunAsNewThreadTimer(5,actions::updateTeamAddⳆUpdateButton);
    }
    //region Getters   ([\n][ ]*[{][\n][ ]*)(.*)([\n][ ]*[}])   ⟹  {$2}
    /*@formatter:off*/
    public PD_StudentsTableView getS__tableView(){return megaplate.pdS_tableView4;}
    public TableColumn getS_FirstName_tableColumn(){return megaplate.pdSFirstName_tableColumn19;}
    public TableColumn getS_LastName_tableColumn(){return megaplate.pdSLastName_tableColumn110;}
    public TableColumn getS_Team_tableColumn(){return megaplate.pdSTeam_tableColumn111;}
    public TableColumn getS_Role_tableColumn(){return megaplate.pdSRole_tableColumn112;}
    public TextField getS_FirstName_textField(){return megaplate.pdSFirstName_textField16;}
    public TextField getS_LastName_textField(){return megaplate.pdSLastName_textField17;}
    public ComboBox getPsSTeam_comboBox(){return megaplate.pdSTeam_combobox15;}
    public TextField getS_Role_textField(){return megaplate.pdSRole_textField18;}
    public rButton getS_AddUpdate_button(){return megaplate.pdSAddUpdate_button111;}
    public rButton getS_Clear_button(){return megaplate.pdSClear_button112;}
    public PD_TeamsTableView getT__tableView(){return megaplate.pdT_tableView3;}
    public TableColumn getT_Use_tableColumn(){return megaplate.pdTUse_tableColumn15;}
    public TableColumn getT_NavbarTitle_tableColumn(){return megaplate.pdTNavbarTitle_tableColumn16;}
    public TableColumn getT_FileName_tableColumn(){return megaplate.pdTFileName_tableColumn17;}
    public TableColumn getT_Script_tableColumn(){return megaplate.pdTScript_tableColumn18;}
    public TextField getT_Link_textField(){return megaplate.pdTLink_textField13;}
    public TextField getT_Name_textField(){return megaplate.pdTName_textField14;}
    public rButton getT_AddUpdate_button(){return megaplate.pdTAddUpdate_button19;}
    public rButton getT_Clear_button(){return megaplate.pdTClear_button110;}
    public Circle getT_Color_circle(){return megaplate.pdTColor_circle;}
    public Circle getT_TextColor_circle(){return megaplate.pdTTextColor_circle0;}
    public ColorPicker getT_Color_selector(){return megaplate.pdTColor_text111116;}
    public ColorPicker getT_TextColor_selector(){return megaplate.pdTTextColor_text111117;}
    /*@formatter:on*/
    //endregion
}
