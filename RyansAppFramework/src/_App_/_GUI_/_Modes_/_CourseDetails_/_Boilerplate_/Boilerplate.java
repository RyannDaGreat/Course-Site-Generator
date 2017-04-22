package _App_._GUI_._Modes_._CourseDetails_._Boilerplate_;
import _App_.App;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
public class Boilerplate
{
    private App app;
    public Boilerplate(App app)
    {
        this.app=app;
    }
    private _App_._GUI_._Window_._Boilerplate_.Boilerplate megaplate;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        megaplate=app.gui.window.boilerplate;
        getCiChange_button().setOnAction(ⵁ->app.gui.modes.courseDetails.actions.handleChangeExportDir());
    }
    public ComboBox getCiSubject_comboBox()
    {
        return megaplate.cdCiSubject_comboBox;
    }
    public TextField getCiTitle_textField()
    {
        return megaplate.cdCiTitle_textField;
    }
    public TextField getCiInstructorName_textField()
    {
        return megaplate.cdCiInstructorName_textField0;
    }
    public TextField getCiInstructorHome_textField()
    {
        return megaplate.cdCiInstructorHome_textField1;
    }
    public ComboBox getCiSemester_comboBox()
    {
        return megaplate.cdCiSemester_comboBox0;
    }
    public ComboBox getCiNumber_comboBox()
    {
        return megaplate.cdCiNumber_comboBox1;
    }
    public ComboBox getCiYear_comboBox()
    {
        return megaplate.cdCiYear_comboBox2;
    }
    public Text getCiExportDir_text()
    {
        return megaplate.cdCiExportDir_text9;
    }
    public Button getCiChange_button()
    {
        return megaplate.cdCiChange_button8;
    }
    public Text getStTemplateDir_text()
    {
        return megaplate.cdStTemplateDir_text12;
    }
    public Button getStChange_button()
    {
        return megaplate.cdStChange_button9;
    }
    public TableView getStSitePages_tableView()
    {
        return megaplate.cdStSitePages_tableView;
    }
    public TableColumn getStUse_tableColumn()
    {
        return megaplate.cdStUse_tableColumn;
    }
    public TableColumn getStNavbarTitle_tableColumn()
    {
        return megaplate.cdStNavbarTitle_tableColumn0;
    }
    public TableColumn getStFileName_tableColumn()
    {
        return megaplate.cdStFileName_tableColumn1;
    }
    public TableColumn getStScript_tableColumn()
    {
        return megaplate.cdStScript_tableColumn2;
    }
    public ImageView getPsBanner_imageView()
    {
        return megaplate.cdPsBanner_imageView8;
    }
    public ImageView getPsLeft_imageView()
    {
        return megaplate.cdPsLeft_imageView9;
    }
    public ImageView getPsRight_imageView()
    {
        return megaplate.cdPsRight_imageView10;
    }
    public Button getPsChangeBanner_button()
    {
        return megaplate.cdPsChangeBanner_button10;
    }
    public Button getPsChangeLeft_button()
    {
        return megaplate.cdPsChangeLeft_button11;
    }
    public Button getPsChangeRight_button()
    {
        return megaplate.cdPsChangeRight_button12;
    }
    public ComboBox getPsStylesheet_comboBox()
    {
        return megaplate.cdPsStylesheet_comboBox3;
    }
}
