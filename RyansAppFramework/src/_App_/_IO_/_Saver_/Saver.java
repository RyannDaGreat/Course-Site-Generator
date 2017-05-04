package _App_._IO_._Saver_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Modes_.Modes;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.r;
import org.json.JSONException;
import org.json.JSONObject;
@SuppressWarnings("WeakerAccess")
public class Saver
{
    public App app;
    public Saver(App app)
    {
        this.app=app;
    }
    private PropertyGetter propertyGetter;
    private Modes modes;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        propertyGetter=app.io.propertyGetter;
        modes=app.gui.modes;
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
    public void setCurrentFileToNewFile()
    {
        setCurrentFilePath(app.io.propertyGetter.getAppTitle());//Is not an actual path
    }
    public String getAppState()//In JSON format
    {
        JSONObject o = new JSONObject();
        try
        {
            o.accumulate(propertyGetter.getStateKeyCourseDetails(),modes.courseDetails.reader.getState());
            o.accumulate(propertyGetter.getStateKeyTAData(),modes.tadata.reader.getState());
            o.accumulate(propertyGetter.getStateKeyScheduleData(),modes.scheduleData.reader.getState());
            o.accumulate(propertyGetter.getStateKeyRecitationData(),modes.recitationData.reader.getState());
            o.accumulate(propertyGetter.getStateKeyProjectData(),modes.projectData.reader.getState());
        }
        catch(JSONException e)
        {
            //noinspection AccessStaticViaInstance
            app.gui.dialogs.showErrorAlert("Failed to save file");
            e.printStackTrace();
        }
        return r.jsonToPrettyString(o);
    }
    public void saveAppStateToFile(String path)//DON'T CREATE A SECOND FILE WRITING METHOD! JUST REPLACE THIS ONE IF YOU NEED TO. JSON IS CONSIDERED AN EXPORT.
    {
        app.io.misc.playSaveSound();
        r.WriteFileIgnoreExceptions(path,getAppState());
        app.gui.toolbar.actions.disableSaveButton();
        setCurrentFilePath(path);
    }
}