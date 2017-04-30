package _App_._GUI_._Modes_._ProjectData_._Boilerplate_;
import _App_.App;
import _Externals_.PD_StudentsTableView;
import _Externals_.PD_TeamsTableView;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
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
        // final ColorPicker colorPicker=new ColorPicker();
        // colorPicker.setOnAction(t->
        //                         {
        //                             Color c=colorPicker.getValue();
        //                             colorPicker.
        //                             System.out.println("New Color's RGB = "+c.getRed()+" "+c.getGreen()+" "+c.getBlue());
        //                         });
        // getT_Color_circle().setOnMousePressed(ⵁ->app.gui.dialogs.showColorDialog("C",Color.BLACK));
    }
    public PD_StudentsTableView getS__tableView()
    {
        return megaplate.pdS_tableView4;
    }
    public TableColumn getS_FirstName_tableColumn()
    {
        return megaplate.pdSFirstName_tableColumn19;
    }
    public TableColumn getS_LastName_tableColumn()
    {
        return megaplate.pdSLastName_tableColumn110;
    }
    public TableColumn getS_Team_tableColumn()
    {
        return megaplate.pdSTeam_tableColumn111;
    }
    public TableColumn getS_Role_tableColumn()
    {
        return megaplate.pdSRole_tableColumn112;
    }
    public TextField getS_FirstName_textField()
    {
        return megaplate.pdSFirstName_textField16;
    }
    public TextField getS_LastName_textField()
    {
        return megaplate.pdSLastName_textField17;
    }
    public TextField getPsSTeam_textField()
    {
        return megaplate.pdSTeam_textField15;
    }
    public TextField getS_Role_textField()
    {
        return megaplate.pdSRole_textField18;
    }
    public Button getS_AddUpdate_button()
    {
        return megaplate.pdSAddUpdate_button111;
    }
    public Button getS_Clear_button()
    {
        return megaplate.pdSClear_button112;
    }
    public PD_TeamsTableView getT__tableView()
    {
        return megaplate.pdT_tableView3;
    }
    public TableColumn getT_Use_tableColumn()
    {
        return megaplate.pdTUse_tableColumn15;
    }
    public TableColumn getT_NavbarTitle_tableColumn()
    {
        return megaplate.pdTNavbarTitle_tableColumn16;
    }
    public TableColumn getT_FileName_tableColumn()
    {
        return megaplate.pdTFileName_tableColumn17;
    }
    public TableColumn getT_Script_tableColumn()
    {
        return megaplate.pdTScript_tableColumn18;
    }
    public TextField getT_Link_textField()
    {
        return megaplate.pdTLink_textField13;
    }
    public TextField getT_Name_textField()
    {
        return megaplate.pdTName_textField14;
    }
    public Button getT_AddUpdate_button()
    {
        return megaplate.pdTAddUpdate_button19;
    }
    public Button getT_Clear_button()
    {
        return megaplate.pdTClear_button110;
    }
    public Circle getT_Color_circle()
    {
        return megaplate.pdTColor_circle;
    }
    public Circle getT_TextColor_circle()
    {
        return megaplate.pdTTextColor_circle0;
    }
    public Text getT_Color_text()
    {
        return megaplate.pdTColor_text111116;
    }
    public Text getT_TextColor_text()
    {
        return megaplate.pdTTextColor_text111117;
    }
}
