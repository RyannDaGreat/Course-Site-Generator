package _App_._IO_._Misc_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_._Resources_.ResourceGetter;
import _Externals_.r;

import java.io.File;
@SuppressWarnings("WeakerAccess")
public class Misc
{
    public App app;
    public Misc(App app)
    {
        this.app=app;
    }
    private PropertyGetter propertyGetter;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        propertyGetter=app.io.propertyGetter;
    }
    public static File getCurrentDirectory()
    {
        return new File(".");
    }
    public static String pwd()
    {
        return r.getParentDir(getCurrentDirectory().getAbsoluteFile().toString());///Users/Ryan/Desktop/RyanCourseSiteGeneratorThirdRecovery/ryan-burgert-course-site-generator/
    }
    public String fileToString(File f)//Exists in case I want to use canonical path instead
    {
        return f.getAbsolutePath();
    }
    public File stringToFile(String s)
    {
        return new File(s);
    }
    public static String[]getAvailableStylesheets()
    {
        return r.listAllPathsInDirectory(cssDirectoryPath());
    }
    public static String cssDirectoryPath()
    {
        return pwd()+"RyansAppFramework/work/css";
    }
    public File[]getAvailableHtmlFilesInTemplate()
    {
        return r.listAllFilesInDirectory(app.gui.modes.courseDetails.reader.getTemplateDir());
    }
    //region Audio
    public static void playWav(String soundNameWithoutPathOrExtension)
    {
        ResourceGetter.playWav(soundNameWithoutPathOrExtension);
    }
    public void playUndoRedoSound()
    {
        playWav(app.getUndo_redo_sound());
    }
    public void playDoSound()
    {
        playWav(propertyGetter.getDo_sound());
    }
    public void playLoadSound()
    {
        playWav(propertyGetter.getLoad_sound());
    }
    public void playSaveSound()
    {
        playWav(propertyGetter.getSave_sound());
    }
    public void playErrorSound()
    {
        playWav(propertyGetter.getError_sound());
    }
    public void playAlertSound()
    {
        playWav(propertyGetter.getAlert_sound());
    }
    public void playAutosaveSound()
    {
        playWav(app.io.propertyGetter.getProperty("autosave_sound"));
    }
    public void playDecisionSound()
    {
        //playWav(propertyGetter.getDecisionSound());
        ResourceGetter.playWav("YesNo");
    }
    //endregion
}