package _App_._IO_._XMLPropertyGetter_;//Created by Ryan on 4/10/17.
import _App_.App;
import properties_manager.InvalidXMLFileFormatException;
import properties_manager.PropertiesManager;
@SuppressWarnings({"WeakerAccess","FieldCanBeLocal"})
public class XMLPropertyGetter
{
    public App app;
    public XMLPropertyGetter(App app)
    {
        this.app=app;
        initialize();
    }
    private final String XMLDataPath="/Users/Ryan/Desktop/RyanCourseSiteGenerator/TAManager_Solution/data/app_properties.xml";
    private final String XMLSchemaPath="/Users/Ryan/Desktop/RyanCourseSiteGenerator/TAManager_Solution/data/properties_schema.xsd";
    //region getProperty(String key)―――――――――――――――――――――――――――――――――――――――――
    private PropertiesManager pm=PropertiesManager.getPropertiesManager();//Dependent on McKenna's Framework here
    private void initialize()
    {
        try
        {
            pm.loadProperties(XMLDataPath,XMLSchemaPath,true);
        }
        catch(InvalidXMLFileFormatException e)
        {
            e.printStackTrace();
        }
    }
    private String getProperty(String key)//The reason this is private is because every key is accessed via a method.
    {
        return pm.getProperty(key);
    }
    //endregion―――――――――――――――――――――――――――――――――――――――――
    

    public static void main(String...args)//To test stuff
    {
        // System.out.println(new App().gui.dialogs.yesNoCancel("H","H"));
        System.out.println(new App().io.xmlPropertyGetter.getProperty("TAS_HEADER_TEXT"));
    }



}
