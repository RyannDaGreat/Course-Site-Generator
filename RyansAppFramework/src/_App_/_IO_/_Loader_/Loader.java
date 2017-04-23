package _App_._IO_._Loader_;//Created by Ryan on 4/10/17.
import _App_.App;
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
    }
    private PropertyGetter propertyGetter;
    public void setAppState(String state)
    {
        try
        {
            JSONObject x=new JSONObject(state);//'States' are ALWAYS strings. Strings are universal among programming languages, while JSON is not.
            app.gui.modes.tadata.actions.setState(x.getString(propertyGetter.getStateKeyTAData()));
            app.gui.modes.courseDetails.actions.setState(x.getJSONObject(propertyGetter.getStateKeyCourseDetails()).toString());
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
    }
    public void loadAppStateFromFile(File f)
    {
        setAppState(r.ReadFile(f));
        app.rtps.clearHistory();
        app.gui.toolbar.actions.disableSaveButton();
        setCurrentFilePath(f.getPath());
    }
    public void handleNew()
    {
        loadAppStateFromFile(new File(propertyGetter.getNewFilePath()));
        app.gui.toolbar.actions.disableSaveButton();
        setCurrentFilePath(propertyGetter.getAppTitle());
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