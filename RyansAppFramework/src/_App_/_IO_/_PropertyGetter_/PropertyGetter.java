package _App_._IO_._PropertyGetter_;//Created by Ryan on 4/10/17.
import _App_.App;
import _Externals_._Resources_.ResourceGetter;
public class PropertyGetter
{
    public App app;
    public PropertyGetter(App app){this.app=app;}
    public String getProperty(String key)//The reason this is private is because every key is accessed via a method.
    {
        return ResourceGetter.getProperty(key);//Actual mechanics of loading file must be outsourced to externals to preserve the logical integrity of my blackbox.
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
    }
    //regionProperty Methods: Turn into one-liners via the following Regex search and replace: ([\n][ ]*[{][\n][ ]*)(.*)([\n][ ]*[}])   ⟹   {$2}
    //region Specific properties (by method)
    /*@formatter:off*/
    public String getAppTitle(){return getProperty("app_title");}
    public String getAppIconName(){return getProperty("app_icon_name");}
    public double getMinAppHeight(){return Double.parseDouble(getProperty("app_min_height"));}
    public double getMinAppWidth(){return Double.parseDouble(getProperty("app_min_width"));}
    public String getInitialOfficeHourGridState(){return String.join(",",(CharSequence[])getOfficeHourTimeslots())+";"+String.join(",",(CharSequence[])getOfficeHourDays())+";";}// return getProperty("initial_office_hour_grid_state");}
    public String getAddButtonLabel(){return getProperty("add_button_label");}
    public String getUpdateButtonLabel(){return getProperty("update_button_label");}
    public String[] getOfficeHourDays(){return getProperty("office_hour_days").split(",");}
    public String[] getOfficeHourTimeslots(){return getProperty("office_hour_timeslots").split(",");}
    public String getConfirmChangeTATimesDeleteOfficehoursMessage(){return getProperty("changing_times_confirmation");}
    public String getNewFilePath()/*//The location of the New File. Is local to CourseSiteGenerator folder*/{return getProperty("new_file_path");}
    public String getConfirmSaveMessage()/*//The location of the New File. Is local to CourseSiteGenerator folder*/{return getProperty("confirm_save_message");}
    public String[] getCdSitePagesHeaders()/*//The location of the New File. Is local to CourseSiteGenerator folder*/{String[] x=getProperty("prop_gui_cd_site_pages_headers").split(",");assert x.length==4;return x;/*//Looks like this: "Use,Navbar Title,File Name,Script"*/}
    public double getAutotransactionsPerSecond(){return Double.parseDouble(getProperty("auto_transactions_per_second"));}
    public double getHueShiftFrequenciInHz(){return Double.parseDouble(getProperty("hue_shift_frequency_in_hz"));}
    public boolean getAnimateHue(){return Boolean.parseBoolean(getProperty("animate_hue"));}
    public String[]getScheduleItemTypes(){return getProperty("schedule_item_types").split(",");/*"Holiday","Lecture","Recitation","Homework","Reference"*/}
    public String[]getScheduleItemTypeKeys(){return getProperty("schedule_item_type_keys").split(",");}
    public String getSave_sound(){return getProperty("save_sound");}
    public String getLoad_sound(){return getProperty("load_sound");}
    public String getError_sound(){return getProperty("error_sound");}
    public String getDo_sound(){return getProperty("do_sound");}
    public String[] getAll_yearses(){return getProperty("all_years").split(",");}
    public String[] getAll_class_numberses(){return getProperty("all_class_numbers").split(",");}
    public String[] getAll_sbu_majorses(){return getProperty("all_sbu_majors").split(",");}
    public String[] getAll_semesterses(){return getProperty("all_semesters").split(",");}
    public String getCircle_and_image_style(){return getProperty("circle_and_image_style");}
    public int getHueShiftFramesPerSecond(){return Integer.parseInt(app.io.propertyGetter.getProperty("hueShiftFramesPerSeconds"));}
    public String getSaveErrorMessage(){return getProperty("failed.to.save.file");}
    public String getImageLoadErrorMessage(){return getProperty("failed.to.load.image");}
    public String getDirLoadErrorMessage(){return getProperty("failed.to.load.dir");}
    /*@formatter:on*/
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
    public String getStateKeyCdStylesheet(){return getProperty("state_key_cd_stylesheet");}
    public String getFailedToLoadFileMessage()
    {
        return app.io.propertyGetter.getProperty("failed.to.load.file");
    }
    public String getCannot_delete_ta()
    {

        return app.io.propertyGetter.getProperty("cannot_delete_ta");
    }
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
    //endregion
}
