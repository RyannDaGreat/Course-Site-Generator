package _App_._IO_._Saver_;//Created by Ryan on 4/10/17.
import _App_.App;
import _Externals_.r;

import java.io.File;
@SuppressWarnings("WeakerAccess")
public class Saver
{
    public App app;
    public Saver(App app)
    {
        this.app=app;
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {

    }
    public boolean isCurrentlyNewFile()
    {
        return app.stage.getTitle().equals(app.io.propertyGetter.getAppTitle());//We must have not opened nor saved any files because doing so always changes the title of the app to that file's path
    }
    public String getCurrentFilePath()
    {
        if(isCurrentlyNewFile())
            return null;//Is a new file
        return app.stage.getTitle();
    }
    public void setCurrentFilePath(String path)
    {
        app.stage.setTitle(path);
    }
    public String getState()
    {
        String out="";
        String modeStateSeparator=app.io.propertyGetter.getModeStateSeparator();
        out+=app.gui.modes.tadata.reader.getState();
        return out;
    }
    public void saveState(String path)//DON'T CREATE A SECOND FILE WRITING METHOD! JUST REPLACE THIS ONE IF YOU NEED TO. JSON IS CONSIDERED AN EXPORT.
    {
        r.WriteFileIgnoreExceptions(path,getState());
        app.gui.toolbar.actions.disableSaveButton();
        setCurrentFilePath(path);
    }
}
