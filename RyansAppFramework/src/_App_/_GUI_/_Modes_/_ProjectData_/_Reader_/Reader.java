package _App_._GUI_._Modes_._ProjectData_._Reader_;
import _App_.App;
import _App_._GUI_._Modes_._ProjectData_._Boilerplate_.Boilerplate;
import org.json.JSONException;
import org.json.JSONObject;
public class Reader
{
    public App app;
    public Reader(App app)
    {
        this.app=app;
    }
    private Boilerplate boilerplate;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.projectData.boilerplate;
    }
    public String getTeamsTableState()
    {
        return boilerplate.getT__tableView().getState();
    }
    public String getStudentsTableState()
    {
        return boilerplate.getS__tableView().getState();
    }
    public JSONObject getState()
    {
        JSONObject o=new JSONObject();
        try
        {
            o.accumulate("TeamsTable",getTeamsTableState());
            o.accumulate("StudentsTable",getStudentsTableState());
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
        return o;
    }

}
    // public String getColor()
    // {
    //     return boilerplate.getT_Color_text().getText().trim();
    // }
    // public String getTextColor()
    // {
    //     return boilerplate.getT_TextColor_text().getText().trim();
    // }
    // public String getTextColor()
    // {
    //     return boilerplate.getT_TextColor_text().getText().trim();
    // }