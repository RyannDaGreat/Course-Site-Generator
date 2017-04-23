package _App_._GUI_._Modes_._CourseDetails_._Reader_;
import _App_.App;
import _App_._GUI_._Modes_._CourseDetails_._Boilerplate_.Boilerplate;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.LocatedImage;
import _Externals_.r;
import org.json.JSONException;
import org.json.JSONObject;
public class Reader
{
    public App app;
    public Reader(App app)
    {
        this.app=app;
    }
    private Boilerplate boilerplate;
    private PropertyGetter propertyGetter;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.courseDetails.boilerplate;
        propertyGetter=app.io.propertyGetter;
    }
    public String getSubject()
    {
        return ""+boilerplate.getCiSubject_comboBox().getValue();
    }
    public String getTitle()
    {
        return boilerplate.getCiTitle_textField().getText();
    }
    public String getInstructorName()
    {
        return boilerplate.getCiInstructorName_textField().getText();
    }
    public String getInstructorHome()
    {
        return boilerplate.getCiInstructorHome_textField().getText();
    }
    public String getSemester()
    {
        return ""+boilerplate.getCiSemester_comboBox().getValue();
    }
    public String getNumber()
    {
        return ""+boilerplate.getCiNumber_comboBox().getValue();
    }
    public String getYear()
    {
        return ""+boilerplate.getCiYear_comboBox().getValue();
    }
    public String getExportDir()
    {
        return boilerplate.getCiExportDir_text().getText();
    }
    public String getTemplateDir()
    {
        return boilerplate.getStTemplateDir_text().getText();
    }
    public String getBannerImagePath()
    {
        return ((LocatedImage)boilerplate.getPsBanner_imageView().getImage()).getURL();
    }
    public String getLeftFooterImagePath()
    {
        return ((LocatedImage)boilerplate.getPsLeft_imageView().getImage()).getURL();
    }
    public String getRightFooterImagePath()
    {
        return ((LocatedImage)boilerplate.getPsRight_imageView().getImage()).getURL();
    }
    public String getSitePagesState()
    {
        return boilerplate.getStSitePages_tableView().getState();
    }
    public JSONObject getState()
    {
        JSONObject o=new JSONObject();
        try
        {
            o.accumulate(propertyGetter.getStateKeyCdSubject(),getSubject());
            o.accumulate(propertyGetter.getStateKeyCdTitle(),getTitle());
            o.accumulate(propertyGetter.getStateKeyCdInstructorName(),getInstructorName());
            o.accumulate(propertyGetter.getStateKeyCdInstructorHome(),getInstructorHome());
            o.accumulate(propertyGetter.getStateKeyCdSemester(),getSemester());
            o.accumulate(propertyGetter.getStateKeyCdNumber(),getNumber());
            o.accumulate(propertyGetter.getStateKeyCdYear(),getYear());
            o.accumulate(propertyGetter.getStateKeyCdExportDir(),getExportDir());
            o.accumulate(propertyGetter.getStateKeyCdTemplateDir(),getTemplateDir());
            o.accumulate(propertyGetter.getStateKeyCdBannerImage(),getBannerImagePath());
            o.accumulate(propertyGetter.getStateKeyCdLeftFooterImage(),getLeftFooterImagePath());
            o.accumulate(propertyGetter.getStateKeyCdRightFooterImage(),getRightFooterImagePath());
            o.accumulate(propertyGetter.getStateKeyCdSitePagesState(),getSitePagesState());
        }
        catch(JSONException e)
        {
            r.say("Failed to get state of course details see stack trace");
            e.printStackTrace();
        }
        return o;
    }
}
