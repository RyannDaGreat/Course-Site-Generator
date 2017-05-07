package _App_._IO_._Exporter_;//Created by Ryan on 4/10/17.
import _App_.App;
import _Externals_.r;
import org.json.JSONException;
@SuppressWarnings("WeakerAccess")
public class Exporter
{
    public App app;
    public Exporter(App app)
    {
        this.app=app;
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {

    }
    public void export()//This is incomplete and MUST be replaced later!
    {
        try
        {
            r.println(r.fansi("PROJECT DATA: TEAMS AND STUDENTS:------",r.fansi_colors.magenta));
            r.println(r.jsonToPrettyString(app.gui.modes.projectData.reader.getTeamsAndStudentsExport()));
            r.println(r.fansi("PROJECT DATA: WORK:------",r.fansi_colors.magenta));
            r.println(r.jsonToPrettyString(app.gui.modes.projectData.reader.getWorkExport()));
            r.println(r.fansi("RECITATION DATA:------",r.fansi_colors.magenta));
            r.println(r.jsonToPrettyString(app.gui.modes.recitationData.reader.getExport()));
            r.println(r.fansi("SCHEDULE DATA:------",r.fansi_colors.magenta));
            r.println(r.jsonToPrettyString(app.gui.modes.scheduleData.reader.getExport()));

        }
        catch(JSONException ignored)
        {
            ignored.printStackTrace();
        }
    }
}