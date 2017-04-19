package _Externals_._Resources_;//Created by Ryan on 4/13/17.
import javafx.scene.image.Image;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
public class ResourceGetter
{
    private static String topakcoa(String nudgy)
    {
        return ResourceGetter.class.getResource(nudgy).toString();//.toExternalForm() ≣ .toString() SOURCE: https://teamtreehouse.com/community/resources-and-toexternalform
        //NOTE: stylesheetPath looks something like "file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Experiments_/appstyle.css" **Notice that its in the /out/ folder AND that it has "file:" at the beginning**
    }
    public static Image getImage(String name)
    {
        return new Image(topakcoa("_Images_/"+name));
    }
    //
    //region Eclipse-Generated String Loader
    private static final ResourceBundle RESOURCE_BUNDLE;
    static
    {
        //This is where the language selector would come from.
        RESOURCE_BUNDLE=ResourceBundle.getBundle("_Externals_._Resources_.english");
    }
    public static void main(String[]isATest)
    {
        System.out.println(getProperty("prop0"));
    }
    public static String getProperty(String key)
    {
        try
        {
            return RESOURCE_BUNDLE.getString(key);
        }
        catch(MissingResourceException e)
        {
            return '!'+key+'!';
        }
    }
    //endregion

}
