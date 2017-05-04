package _App_._IO_._Misc_;//Created by Ryan on 4/10/17.
import _App_.App;
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
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {

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
        playWav("QuietDoubleClick");
    }
    public void playDoSound()
    {
        playWav("SingleClick");
    }
    public void playLoadSound()
    {
        playWav("EffectAOpen");
    }
    public void playSaveSound()
    {
        playWav("EffectAClose");
    }
}