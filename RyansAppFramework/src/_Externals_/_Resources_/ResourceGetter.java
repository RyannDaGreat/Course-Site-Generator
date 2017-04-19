package _Externals_._Resources_;//Created by Ryan on 4/13/17.
import javafx.scene.image.Image;
public class ResourceGetter
{
    private static String topakcoa(String nudgy)
    {
        return ResourceGetter.class.getResource(nudgy).toString();//.toExternalForm() ≣ .toString() SOURCE: https://teamtreehouse.com/community/resources-and-toexternalform
        //NOTE: stylesheetPath looks something like "file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Experiments_/appstyle.css" **Notice that its in the /out/ folder AND that it has "file:" at the beginning**
    }
    // public static void stylize(Parent n,String styleClassName)//A refactored form of initStylesheet found in AppStyleComponent in McKenna/DJF based TAManager_Solution
    // {
    //     n.getStylesheets().add(topakcoa("appstyle.css"));
    //     n.getStyleClass().add(styleClassName);
    // }
    public static Image getImage(String name)
    {
        return new Image(topakcoa("Images/"+name));
    }

    // private static String BUNDLE_NAME="_Externals_.messages"; //$NON-NLS-1$
    // private static ResourceBundle RESOURCE_BUNDLE=ResourceBundle.getBundle(BUNDLE_NAME);
    // public static String getProperty(String key)
    // {
    //     try
    //     {
    //         return RESOURCE_BUNDLE.getString(key);
    //     }
    //     catch(MissingResourceException e)
    //     {
    //         return '!'+key+'!';
    //     }
    // }

}
