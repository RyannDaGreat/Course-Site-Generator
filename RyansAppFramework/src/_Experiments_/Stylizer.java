package _Experiments_;//Created by Ryan on 4/13/17.
import javafx.scene.Parent;
import javafx.scene.image.Image;
public class Stylizer
{
    private static String topakcoa(String nudgy)
    {
        return Stylizer.class.getResource(nudgy).toString();//.toExternalForm() ≣ .toString() SOURCE: https://teamtreehouse.com/community/resources-and-toexternalform
        //NOTE: stylesheetPath looks something like "file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Experiments_/appstyle.css" **Notice that its in the /out/ folder AND that it has "file:" at the beginning**
    }
    public static void stylize(Parent n,String styleClassName)//A refactored form of initStylesheet found in AppStyleComponent in McKenna/DJF based TAManager_Solution
    {
        n.getStylesheets().add(topakcoa("appstyle.css"));
        n.getStyleClass().add(styleClassName);
    }
    public static Image getImage(String name)
    {
        return new Image(topakcoa(name));
    }
}
