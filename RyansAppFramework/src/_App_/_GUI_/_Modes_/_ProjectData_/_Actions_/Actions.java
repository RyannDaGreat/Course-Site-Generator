package _App_._GUI_._Modes_._ProjectData_._Actions_;
import _App_.App;
import _App_._GUI_._Modes_._ProjectData_._Boilerplate_.Boilerplate;
import org.json.JSONException;
import org.json.JSONObject;
public class Actions
{
    public App app;
    public Actions(App app)
    {
        this.app=app;
    }
    private Boilerplate boilerplate;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.projectData.boilerplate;
    }
    public void setTeamsTableState(String state)
    {
        return boilerplate.getT__tableView().getState();
    }
    public void setStudentsTableState(String state)
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
