package _App_._IO_._XMLPropertyGetter_;//Created by Ryan on 4/10/17.
import _App_.App;
import properties_manager.PropertiesManager;
@SuppressWarnings("WeakerAccess")
public class XMLPropertyGetter
{
    public App app;
    public XMLPropertyGetter(App app)
    {
        this.app=app;
    }

    public static void main(String...args)//To test stuff
    {

    }

    private String getProperty(String key)//The reason this is private is because every key is accessed via a method.
    {
        //This method is dependent on the jTPS
        PropertiesManager props=PropertiesManager.getPropertiesManager();

    }


}
