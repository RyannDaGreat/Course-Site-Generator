package _App_._IO_._Misc_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_._Resources_.ResourceGetter;

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
    public File getCurrentDirectory()
    {
        return new File(".");
    }
    public String fileToString(File f)//Exists in case I want to use canonical path instead
    {
        return f.getAbsolutePath();
    }
    public File stringToFile(String s)
    {
        return new File(s);
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
}