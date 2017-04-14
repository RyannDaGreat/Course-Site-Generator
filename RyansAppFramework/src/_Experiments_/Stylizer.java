package _Experiments_;//Created by Ryan on 4/13/17.
import javafx.scene.Parent;
import javafx.scene.image.Image;
public class Stylizer
{
    public static void stylize(Parent n,String styleClassName)//A refactored form of initStylesheet found in AppStyleComponent in McKenna/DJF based TAManager_Solution
    {
        String stylesheetPath=Stylizer.class.getResource("appstyle.css").toString();//.toExternalForm() ≣ .toString() SOURCE: https://teamtreehouse.com/community/resources-and-toexternalform
        //NOTE: stylesheetPath looks something like "file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Experiments_/appstyle.css" **Notice that its in the /out/ folder AND that it has "file:" at the beginning**
        n.getStylesheets().add(stylesheetPath);
        n.getStyleClass().add(styleClassName);
    }
    public static Image getImage(String name)
    {
        new Image(getClass().getResource("../Resources/Screen%20Shot%202017-04-12%20at%209.21.51%20PM.png").toExternalForm())
    }
}
