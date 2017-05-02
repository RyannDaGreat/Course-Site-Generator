package _App_._IO_._PropertyGetter_;//Created by Ryan on 4/10/17.
import _App_.App;
import _Externals_._Resources_.ResourceGetter;
import _Externals_.r;
import com.sun.org.apache.xpath.internal.operations.Bool;
@SuppressWarnings({"WeakerAccess","FieldCanBeLocal"})
public class PropertyGetter
{
    public App app;
    public PropertyGetter(App app)
    {
        this.app=app;
    }
    public String getProperty(String key)//The reason this is private is because every key is accessed via a method.
    {
        return ResourceGetter.getProperty(key);//Actual mechanics of loading file must be outsourced to externals to preserve the logical integrity of my blackbox.
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
    }
    //region Specific properties (by method)
    public String getAppTitle()
    {
        return getProperty("app_title");
    }
    public String getAppIconName()
    {
        return getProperty("app_icon_name");
    }
    public double getMinAppHeight()
    {
        return Double.parseDouble(getProperty("app_min_height"));
    }
    public double getMinAppWidth()
    {
        return Double.parseDouble(getProperty("app_min_width"));
    }
    public String getInitialOfficeHourGridState()
    {
        // return getProperty("initial_office_hour_grid_state");
        return String.join(",",(CharSequence[])getOfficeHourTimeslots())+";"+String.join(",",(CharSequence[])getOfficeHourDays())+";";
    }
    public String getAddButtonLabel()
    {
        return getProperty("add_button_label");
    }
    public String getUpdateButtonLabel()
    {
        return getProperty("update_button_label");
    }
    public String[] getOfficeHourDays()
    {
        return getProperty("office_hour_days").split(",");
    }
    public String[] getOfficeHourTimeslots()
    {
        return getProperty("office_hour_timeslots").split(",");
    }
    public String getDefaultFirstOfficeHourTimeslot()
    {
        String x=getProperty("default_first_timeslot");
        assert r.contains(x,getOfficeHourTimeslots());
        return x;
    }
    public String getDefaultLastOfficeHourTimeslot()
    {
        String x=getProperty("default_last_timeslot");
        assert r.contains(x,getOfficeHourTimeslots());
        return x;
    }
    public String getConfirmChangeTATimesDeleteOfficehoursMessage()
    {
        return getProperty("changing_times_confirmation");
    }
    public String getNewFilePath()//The location of the New File. Is local to CourseSiteGenerator folder
    {
        return getProperty("new_file_path");
    }
    public String getConfirmSaveMessage()//The location of the New File. Is local to CourseSiteGenerator folder
    {
        return getProperty("confirm_save_message");
    }
    public String[] getCdSitePagesHeaders()//The location of the New File. Is local to CourseSiteGenerator folder
    {
        String[] x=getProperty("prop_gui_cd_site_pages_headers").split(",");//Looks like this: "Use,Navbar Title,File Name,Script"
        assert x.length==4;
        return x;
    }
    public long getAutotransactionIntervalInMillis()
    {
        return Long.parseLong(getProperty("autotransaction_interval_in_millis"));
    }
    public double getHueShiftFrequenciInHz()
    {
        return Double.parseDouble(getProperty("hue_shift_frequency_in_hz"));
    }
    public boolean getAnimateHue()
    {
        return Boolean.parseBoolean(getProperty("animate_hue"));
    }
    //endregion
    //region State Keys: Mode Title Keys
    /*@formatter:off*/
    public String getStateKeyCourseDetails(){return getProperty("state_key_CourseDetails");}
    public String getStateKeyTAData(){return getProperty("state_key_TAData");}
    public String getStateKeyRecitationData(){return getProperty("state_key_RecitationData");}
    public String getStateKeyScheduleData(){return getProperty("state_key_ScheduleData");}
    public String getStateKeyProjectData(){return getProperty("state_key_ProjectData");}
    /*@formatter:on*/
    //endregion
    //region State Keys: Course Details
    /*@formatter:off*/
    public String getStateKeyCdSubject(){return getProperty("state_key_cd_Subject");}
    public String getStateKeyCdTitle(){return getProperty("state_key_cd_Title");}
    public String getStateKeyCdInstructorName(){return getProperty("state_key_cd_InstructorName");}
    public String getStateKeyCdInstructorHome(){return getProperty("state_key_cd_InstructorHome");}
    public String getStateKeyCdSemester(){return getProperty("state_key_cd_Semester");}
    public String getStateKeyCdNumber(){return getProperty("state_key_cd_Number");}
    public String getStateKeyCdYear(){return getProperty("state_key_cd_Year");}
    public String getStateKeyCdExportDir(){return getProperty("state_key_cd_ExportDir");}
    public String getStateKeyCdTemplateDir(){return getProperty("state_key_cd_TemplateDir");}
    public String getStateKeyCdBannerImage(){return getProperty("state_key_cd_BannerImage");}
    public String getStateKeyCdLeftFooterImage(){return getProperty("state_key_cd_LeftFooterImage");}
    public String getStateKeyCdRightFooterImage(){return getProperty("state_key_cd_RightFooterImage");}
    public String getStateKeyCdSitePagesState(){return getProperty("state_key_cd_SitePagesState");}
    /*@formatter:on*/
    //endregion
    //region If I ever want to use XML for some reason
    // private final String XMLDataPath="/Users/Ryan/Desktop/RyanCourseSiteGenerator/TAManager_Solution/data/app_properties.xml";
    // private final String XMLSchemaPath="/Users/Ryan/Desktop/RyanCourseSiteGenerator/TAManager_Solution/data/properties_schema.xsd";
    // //region getProperty(String key)―――――――――――――――――――――――――――――――――――――――――
    // private PropertiesManager pm=PropertiesManager.getPropertiesManager();//Dependent on McKenna's Framework here
    // private void initialize()
    // {
    //     try
    //     {
    //         pm.loadProperties(XMLDataPath,XMLSchemaPath,true);
    //     }
    //     catch(InvalidXMLFileFormatException e)
    //     {
    //         e.printStackTrace();
    //     }
    // }
    //endregion
}
