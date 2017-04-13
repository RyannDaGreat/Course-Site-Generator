package _Experiments_;//Created by Ryan on 4/13/17.
import javafx.scene.Parent;
public class Stylizer
{
    public static void stylize(Parent n,String styleClassName)//A refactored form of initStylesheet found in AppStyleComponent in McKenna/DJF based TAManager_Solution
    {
        String stylesheetPath=Stylizer.class.getResource("tam_style.css").toString();//.toExternalForm() ≣ .toString() SOURCE: https://teamtreehouse.com/community/resources-and-toexternalform
        //NOTE: stylesheetPath looks something like "file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Experiments_/tam_style.css" **Notice that its in the /out/ folder AND that it has "file:" at the beginning**
        n.getStylesheets().add(stylesheetPath);
        n.getStyleClass().add(styleClassName);
    }
}
