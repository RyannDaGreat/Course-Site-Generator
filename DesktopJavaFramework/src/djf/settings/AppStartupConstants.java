package djf.settings;

/**
 * This class provides a set of constants useful for setting up the app.
 * 
 * @author Richard McKenna
 * @version 1.0
 */
public class AppStartupConstants
{
    // WE NEED THESE CONSTANTS JUST TO GET STARTED
    // LOADING SETTINGS FROM OUR XML FILES

    // XML PROPERTIES FILE WHERE ALL LANGUAGE-SPECIFIC TEXT CAN BE FOUND
    public static final String APP_PROPERTIES_FILE_NAME = "app_properties.xml";

    // XML SCHEMA FOR VALIDATING THE XML PROPERTIES FILE
    public static final String PROPERTIES_SCHEMA_FILE_NAME = "properties_schema.xsd";    

    // PROTOCOLS AND PATHS NEEDED FOR LOADING CERTAIN FILES
    public static final String FILE_PROTOCOL = "file:";
    public static final String PATH_DATA = "./data/";
    public static final String PATH_WORK = "./work/";
    public static final String PATH_IMAGES = "./images/";
    public static final String PATH_EMPTY = ".";
  
    // ERROR MESSAGE ASSOCIATED WITH PROPERTIES FILE LOADING ERRORS.
    // NOTE THAT THE REASON WE CAN'T LOAD THIS FROM THE XML FILE IS
    // THAT WE DISPLAY IT WHEN THE LOADING OF THAT FILE FAILS
    public static String PROPERTIES_FILE_ERROR_MESSAGE = "Error Loading " + APP_PROPERTIES_FILE_NAME;

    // ERROR DIALOG CONTROL
    public static String CLOSE_BUTTON_LABEL = "Close";
}