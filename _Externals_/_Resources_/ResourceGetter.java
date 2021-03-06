package _Externals_._Resources_;//Created by Ryan on 4/13/17.
import _Externals_._Components_.LocatedImage;
import _Externals_.r;
import javafx.scene.media.Media;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
public class ResourceGetter
{
    //region getImage
    private static String getResource(String localPathToRyanAppFramework)
    {
        return ResourceGetter.class.getResource(localPathToRyanAppFramework).toString();//.toExternalForm() ≣ .toString() SOURCE: https://teamtreehouse.com/community/resources-and-toexternalform
        //NOTE: stylesheetPath looks something like "file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Experiments_/appstyle.css" **Notice that its in the /out/ folder AND that it has "file:" at the beginning**
    }
    public static LocatedImage getImage(String name)
    {
        return new LocatedImage(getResource("_Images_/"+name));
    }
    //endregion
    //region Eclipse-Generated String Loader
    private static final ResourceBundle RESOURCE_BUNDLE;
    static
    {
        //This is where the language selector would come from.
        RESOURCE_BUNDLE=ResourceBundle.getBundle("_Externals_._Resources_._Properties_.english");
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
    //region Specific File Getters
    public static String getGlobalFontStylesheet()
    {
        return getResource("_Style_/app_global_font.css");
    }

    public static String getColorPickerStylesheet()
    {
        return getResource("_Style_/app_global_font.css");
    }
    public static void playWav(String soundNameWithoutWavExtensionOrPath)
    {
        r.playSound(r.printed(getResource("_Sounds_/"+soundNameWithoutWavExtensionOrPath+".wav").substring(5)));
    }
    public static Media getVideo(String URL)
    {
        return new Media(getResource("_Videos_/"+URL));//"http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv"
    }
    //endregion
}
