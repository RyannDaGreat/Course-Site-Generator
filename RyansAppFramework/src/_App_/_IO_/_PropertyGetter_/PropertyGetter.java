package _App_._IO_._PropertyGetter_;//Created by Ryan on 4/10/17.
import _App_.App;
import _Externals_._Resources_.ResourceGetter;
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
