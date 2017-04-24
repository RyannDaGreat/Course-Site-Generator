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
        boilerplate.getT__tableView().setState(state);
    }
    public void setStudentsTableState(String state)
    {
        boilerplate.getS__tableView().setState(state);
    }
    public void setState(JSONObject state)
    {
        try
        {
            setTeamsTableState(state.getString("TeamsTable"));
            setStudentsTableState(state.getString("StudentsTable"));
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
    }
}
