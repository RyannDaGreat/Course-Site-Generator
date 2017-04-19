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
    }
    public ComboBox getCdCiSubject_comboBox()
    {
        return megaplate.cdCiSubject_comboBox;
    }
    public TextField getCdCiTitle_textField()
    {
        return megaplate.cdCiTitle_textField;
    }
    public TextField getCdCiInstructorName_textField()
    {
        return megaplate.cdCiInstructorName_textField0;
    }
    public TextField getCdCiInstructorHome_textField()
    {
        return megaplate.cdCiInstructorHome_textField1;
    }
    public ComboBox getCdCiSemester_comboBox()
    {
        return megaplate.cdCiSemester_comboBox0;
    }
    public ComboBox getCdCiNumber_comboBox()
    {
        return megaplate.cdCiNumber_comboBox1;
    }
    public ComboBox getCdCiYear_comboBox()
    {
        return megaplate.cdCiYear_comboBox2;
    }
    public Text getCdCiExportDir_text()
    {
        return megaplate.cdCiExportDir_text9;
    }
    public Button getCdCiChange_button()
    {
        return megaplate.cdCiChange_button8;
    }
    public Text getCdStTemplateDir_text()
    {
        return megaplate.cdStTemplateDir_text12;
    }
    public Button getCdStChange_button()
    {
        return megaplate.cdStChange_button9;
    }
    public TableView getCdStSitePages_tableView()
    {
        return megaplate.cdStSitePages_tableView;
    }
    public TableColumn getCdStUse_tableColumn()
    {
        return megaplate.cdStUse_tableColumn;
    }
    public TableColumn getCdStNavbarTitle_tableColumn()
    {
        return megaplate.cdStNavbarTitle_tableColumn0;
    }
    public TableColumn getCdStFileName_tableColumn()
    {
        return megaplate.cdStFileName_tableColumn1;
    }
    public TableColumn getCdStScript_tableColumn()
    {
        return megaplate.cdStScript_tableColumn2;
    }
    public ImageView getCdPsBanner_imageView()
    {
        return megaplate.cdPsBanner_imageView8;
    }
    public ImageView getCdPsLeft_imageView()
    {
        return megaplate.cdPsLeft_imageView9;
    }
    public ImageView getCdPsRight_imageView()
    {
        return megaplate.cdPsRight_imageView10;
    }
    public Button getCdPsChangeBanner_button()
    {
        return megaplate.cdPsChangeBanner_button10;
    }
    public Button getCdPsChangeLeft_button()
    {
        return megaplate.cdPsChangeLeft_button11;
    }
    public Button getCdPsChangeRight_button()
    {
        return megaplate.cdPsChangeRight_button12;
    }
    public ComboBox getCdPsStylesheet_comboBox()
    {
        return megaplate.cdPsStylesheet_comboBox3;
    }
}
