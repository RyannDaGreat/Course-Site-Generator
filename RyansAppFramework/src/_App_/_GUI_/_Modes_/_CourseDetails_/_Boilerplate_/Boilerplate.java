package _App_._GUI_._Modes_._CourseDetails_._Boilerplate_;
import _App_.App;
import _App_._GUI_._Modes_._CourseDetails_._Actions_.Actions;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.CD_SitePagesTableView;
import _Externals_.LocatedImage;
import _Externals_.r;
import _Externals_.rButton;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
@SuppressWarnings("FieldCanBeLocal")
public class Boilerplate
{
    private App app;
    public Boilerplate(App app){this.app=app;}
    private _App_._GUI_._Window_._Boilerplate_.Boilerplate megaplate;
    private PropertyGetter propertyGetter;
    private Actions actions;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        megaplate=app.gui.window.boilerplate;
        propertyGetter=app.io.propertyGetter;
        actions=app.gui.modes.courseDetails.actions;
        r.setComboboxOptions(getCiNumber_comboBox(),propertyGetter.getAll_class_numberses());
        r.setComboboxOptions(getCiYear_comboBox(),propertyGetter.getAll_yearses());
        r.setComboboxOptions(getCiSubject_comboBox(),propertyGetter.getAll_sbu_majorses());
        r.setComboboxOptions(getCiSemester_comboBox(),propertyGetter.getAll_semesterses());
        //noinspection AccessStaticViaInstance
        r.setComboboxOptions(getPsStylesheet_comboBox(),app.io.misc.getAvailableStylesheets());
        getCiChange_button().setAction(actions::handleChangeExportDir);
        getStChange_button().setAction(actions::handleChangeTemplateDir);;
        getPsChangeBanner_button().setAction(actions::handleChangeBannerImage);
        getPsChangeLeft_button().setAction(actions::handleChangeLeftFooterImage);
        getPsChangeRight_button().setAction(actions::handleChangeRightFooterImage);
    }
    //region Getters   ([\n][ ]*[{][\n][ ]*)(.*)([\n][ ]*[}])   ⟹  {$2}
    /*@formatter:off*/
    public ComboBox getCiSubject_comboBox(){return megaplate.cdCiSubject_comboBox;}
    public TextField getCiTitle_textField(){return megaplate.cdCiTitle_textField;}
    public TextField getCiInstructorName_textField(){return megaplate.cdCiInstructorName_textField0;}
    public TextField getCiInstructorHome_textField(){return megaplate.cdCiInstructorHome_textField1;}
    public ComboBox getCiSemester_comboBox(){return megaplate.cdCiSemester_comboBox0;}
    public ComboBox getCiNumber_comboBox(){return megaplate.cdCiNumber_comboBox1;}
    public ComboBox getCiYear_comboBox(){return megaplate.cdCiYear_comboBox2;}
    public Text getCiExportDir_text(){return megaplate.cdCiExportDir_text9;}
    public rButton getCiChange_button(){return megaplate.cdCiChange_button8;}
    public Text getStTemplateDir_text(){return megaplate.cdStTemplateDir_text12;}
    public rButton getStChange_button(){return megaplate.cdStChange_button9;}
    public CD_SitePagesTableView getStSitePages_tableView(){return megaplate.cdStSitePages_tableView;}
    public TableColumn getStUse_tableColumn(){return megaplate.cdStUse_tableColumn;}
    public TableColumn getStNavbarTitle_tableColumn(){return megaplate.cdStNavbarTitle_tableColumn0;}
    public TableColumn getStFileName_tableColumn(){return megaplate.cdStFileName_tableColumn1;}
    public TableColumn getStScript_tableColumn(){return megaplate.cdStScript_tableColumn2;}
    public ImageView getPsBanner_imageView(){return megaplate.cdPsBanner_imageView8;}
    public ImageView getPsLeft_imageView(){return megaplate.cdPsLeft_imageView9;}
    public ImageView getPsRight_imageView(){return megaplate.cdPsRight_imageView10;}
    public rButton getPsChangeBanner_button(){return megaplate.cdPsChangeBanner_button10;}
    public rButton getPsChangeLeft_button(){return megaplate.cdPsChangeLeft_button11;}
    public rButton getPsChangeRight_button(){return megaplate.cdPsChangeRight_button12;}
    public ComboBox getPsStylesheet_comboBox(){return megaplate.cdPsStylesheet_comboBox3;}
    /*@formatter:off*/
    //endregion
}
