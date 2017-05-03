package _App_._GUI_._Modes_._ProjectData_._Reader_;
import _App_.App;
import _App_._GUI_._Modes_._ProjectData_._Boilerplate_.Boilerplate;
import _Externals_.PD_TeamsTableView;
import _Externals_.r;
import org.json.JSONException;
import org.json.JSONObject;

import static _Externals_.ColorNamer.hexWithOrWithoutHashtagFromColorName;
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
    public JSONObject getState() throws JSONException
    {
        JSONObject o=new JSONObject();
        o.accumulate("TeamsTable",getTeamsTableState());
        o.accumulate("StudentsTable",getStudentsTableState());
        return o;
    }
    public JSONObject getTeamsAndStudentsExport()
    {
        JSONObject o=new JSONObject();
        boilerplate.getT__tableView().forAll(t->//t≣team
                                             {
                                                 try
                                                 {
                                                     JSONObject temp=new JSONObject();
                                                     temp.accumulate("name",t.field2Property().getValue());
                                                     int[] rgb=r.hexToRGB(hexWithOrWithoutHashtagFromColorName(t.field2Property().getValue()));
                                                     temp.accumulate("red",rgb[0]);
                                                     temp.accumulate("green",rgb[1]);
                                                     temp.accumulate("blue",rgb[2]);
                                                     temp.accumulate("text_color","#"+hexWithOrWithoutHashtagFromColorName(t.field3Property().getValue()));
                                                     temp.accumulate("link",t.field4Property().getValue());
                                                     o.append("teams",temp);
                                                 }
                                                 catch(JSONException e)
                                                 {
                                                     e.printStackTrace();
                                                 }
                                             });
        boilerplate.getS__tableView().forAll(s->//s≣student
                                             {
                                                 try
                                                 {
                                                     JSONObject temp=new JSONObject();
                                                     temp.accumulate("lastName",s.field1Property().getValue());
                                                     temp.accumulate("firstName",s.field2Property().getValue());
                                                     temp.accumulate("team",s.field3Property().getValue());
                                                     temp.accumulate("role",s.field4Property().getValue());
                                                     o.append("students",temp);
                                                 }
                                                 catch(JSONException e)
                                                 {
                                                     e.printStackTrace();
                                                 }
                                             });
        return o;
    }
    public JSONObject getWorkExport()
    {
        JSONObject o=new JSONObject();
        boilerplate.getT__tableView().forAll(t->//t≣team
                                             {
                                                 try
                                                 {
                                                     JSONObject temp=new JSONObject();
                                                     temp.accumulate("name",t.field1Property().getValue());
                                                     temp.accumulate("link",t.field4Property().getValue());
                                                     String teamName=t.field1Property().getValue();
                                                     boilerplate.getS__tableView().forAll(s->//s≣student
                                                                                          {
                                                                                              String studentTeamName=s.field3Property().getValue();
                                                                                              String studentName=s.field1Property().getValue()+" "+s.field2Property().getValue();
                                                                                              if(studentTeamName.equals(teamName))//Student's team name matches our team name
                                                                                              {
                                                                                                  try
                                                                                                  {
                                                                                                      temp.append("students",studentName);
                                                                                                  }
                                                                                                  catch(JSONException e)
                                                                                                  {
                                                                                                      e.printStackTrace();
                                                                                                  }
                                                                                              }
                                                                                          });
                                                     o.append("projects",temp);
                                                 }
                                                 catch(JSONException e)
                                                 {
                                                     e.printStackTrace();
                                                 }
                                             });
        JSONObject out=new JSONObject();
        try
        {
            o.accumulate("semester",app.gui.modes.courseDetails.reader.getSemester()+" "+app.gui.modes.courseDetails.reader.getYear());
            out.append("work",o);
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
        return out;
    }
    public String getTeamColor()//As hex string with # in front, Example #FF00FF
    {
        return r.colorToHexString(boilerplate.getT_Color_selector().getValue());
    }
    public String getTeamTextColor()//As hex string with # in front, Example #FF00FF
    {
        return r.colorToHexString(boilerplate.getT_TextColor_selector().getValue());
    }
    public String getTeamName()
    {
        return boilerplate.getT_Name_textField().getText();
    }
    public String getTeamLink()
    {
        return boilerplate.getT_Link_textField().getText();
    }
    public String[]getTeamNames()
    {
        PD_TeamsTableView t=boilerplate.getT__tableView();
        String[]x=new String[t.getItems().size()];
        int[]i=new int[]{0};
        t.forAll(team->x[i[0]++]=team.field1Property().getValue());
        return x;
    }
    public String getStudentTeam()
    {
        return (String)boilerplate.getPsSTeam_comboBox().getValue();
    }
}
// public String getTeamTextColor()
// {
//     return boilerplate.getT_TextColor_selector().getText().trim();
// }
// public String getTeamTextColor()
// {
//     return boilerplate.getT_TextColor_selector().getText().trim();
// }