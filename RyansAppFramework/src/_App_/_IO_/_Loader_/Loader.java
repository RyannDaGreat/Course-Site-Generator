package _App_._IO_._Loader_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_.GUI;
import _App_._GUI_._Dialogs_.Dialogs;
import _App_._GUI_._Modes_.Modes;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.r;
import org.json.JSONException;
import org.json.JSONObject;

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
        propertyGetter=app.io.propertyGetter;
        dialogs=app.gui.dialogs;
    }
    private Dialogs dialogs;
    private PropertyGetter propertyGetter;
    public void setAppState(String state)
    {
        try
        {
            JSONObject x=new JSONObject(state);
            Modes modes=app.gui.modes;
            modes.courseDetails.actions.setState(x.getJSONObject(propertyGetter.getStateKeyCourseDetails()));
            modes.tadata.actions.setState(x.getString(propertyGetter.getStateKeyTAData()));
            modes.scheduleData.actions.setState(x.getJSONObject(propertyGetter.getStateKeyScheduleData()));
            modes.recitationData.actions.setState(x.getString(propertyGetter.getStateKeyRecitationData()));
            modes.projectData.actions.setState(x.getJSONObject(propertyGetter.getStateKeyProjectData()));
        }
        catch(JSONException e)
        {
            dialogs.showFailedToLoadFileErrorDialog();
            e.printStackTrace();
        }
    }
    public void loadAppStateFromFile(File f)
    {
        setAppState(r.ReadFile(f));
        app.rtps.clearHistory();//ORDER MATTERS HERE! MUST COME AFTER READ-FILE BECAUSE OF AUTO-TPS
        app.gui.toolbar.actions.disableSaveButton();
        setCurrentFilePath(f.getPath());
    }
    public void handleNew()
    {
        loadAppStateFromFile(new File(propertyGetter.getNewFilePath()));
        app.gui.toolbar.actions.disableSaveButton();
        app.io.saver.setCurrentFileToNewFile();
    }
    public String getCurrentFilePath()
    {
        return app.io.saver.getCurrentFilePath();
    }
    public void setCurrentFilePath(String path)
    {
        app.io.saver.setCurrentFilePath(path);
    }
}