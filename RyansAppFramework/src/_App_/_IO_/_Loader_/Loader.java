package _App_._IO_._Loader_;//Created by Ryan on 4/10/17.
import _App_.App;
import _Externals_.r;

import java.io.File;
@SuppressWarnings("WeakerAccess")
public class Loader
{
    public App app;
    public Loader(App app)
    {
        this.app=app;
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {

    }
    public void handleNew()
    {
        loadState(new File(app.io.propertyGetter.getNewFilePath()));
        app.gui.toolbar.actions.disableSaveButton();
        setCurrentFilePath(app.io.propertyGetter.getAppTitle());
    }
    public String getCurrentFilePath()
    {
        return app.io.saver.getCurrentFilePath();
    }
    public void setCurrentFilePath(String path)
    {
        app.io.saver.setCurrentFilePath(path);
    }
    public void setState(String state)
    {
        String modeStateSeparator=app.io.propertyGetter.getModeStateSeparator();
        String[] modeStates=state.split(modeStateSeparator);
        app.gui.modes.tadata.actions.setState(modeStates[0]);
    }
    public void loadState(File f)
    {
        setState(r.ReadFile(f));
        app.rtps.clearHistory();
        app.gui.toolbar.actions.disableSaveButton();
        setCurrentFilePath(f.getPath());
    }
}