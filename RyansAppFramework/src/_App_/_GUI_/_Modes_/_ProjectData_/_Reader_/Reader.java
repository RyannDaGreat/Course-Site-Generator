package _App_._GUI_._Modes_._ProjectData_._Reader_;
import _App_.App;
import _App_._GUI_._Modes_._ProjectData_._Boilerplate_.Boilerplate;
import _Externals_.ColorNamer;
import _Externals_.PD_TeamsTableView;
import _Externals_.r;
import javafx.scene.paint.Color;
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
    public String getSelectedTeamName()
    {
        return boilerplate.getT__tableView().getSelected().field1Property().getValue();
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
        return r.colorToHexString(getColor());
    }
    public String getTeamTextColor()//As hex string with # in front, Example #FF00FF
    {
        return r.colorToHexString(getTextColor());
    }
    public String getTeamName()
    {
        return boilerplate.getT_Name_textField().getText();
    }
    public String getTeamLink()
    {
        return boilerplate.getT_Link_textField().getText();
    }
    public String[] getTeamNames()
    {
        PD_TeamsTableView t=boilerplate.getT__tableView();
        String[] x=new String[t.getItems().size()];
        int[] i=new int[]{0};
        t.forAll(team->x[i[0]++]=team.field1Property().getValue());
        return x;
    }
    public String getStudentTeam()
    {
        return (String)boilerplate.getSTeam_comboBox().getValue();
    }
    public Color getTextColor()
    {
        return boilerplate.getT_TextColor_selector().getValue();
    }
    public Color getColor()
    {
        return boilerplate.getT_Color_selector().getValue();
    }
    public boolean uniqueTeamName()//If text field team name is unique
    {
        boolean[] temp=new boolean[]{true};
        boilerplate.getT__tableView().forAll(x->
                                             {
                                                 System.out.println(getTeamName()+"+++++"+x.field1Property().getValue());
                                                 if(x.field1Property().getValue().equals(getTeamName()))
                                                 {
                                                     System.out.println("Crampus");
                                                     temp[0]=false;
                                                 }
                                             });
        return temp[0];
    }
    public boolean uniqueTeamColor()//If text field team name is unique
    {
        boolean[] temp=new boolean[]{true};
        boilerplate.getT__tableView().forAll(x->
                                             {
                                                 if(x.field2Property().getValue().equals(getTeamColorName()))
                                                 {
                                                     temp[0]=false;
                                                 }
                                             });
        return temp[0];
    }
    public boolean uniqueStudentName()//If text field team name is unique
    {
        boolean[] temp=new boolean[]{true};
        boilerplate.getS__tableView().forAll(x->
                                             {
                                                 if(x.field1Property().getValue().equals(getStudentFirstName())&&
                                                    x.field2Property().getValue().equals(getStudentLastName()))
                                                 {
                                                     temp[0]=false;
                                                 }
                                             });
        return temp[0];
    }
    public String getTeamColorName()
    {
        return ColorNamer.getColorNameFromHex(getTeamColor());
    }
    public String getTeamTextColorName()
    {
        return ColorNamer.getColorNameFromHex(getTeamTextColor());
    }
    public String getStudentFirstName()
    {
        return boilerplate.getS_FirstName_textField().getText();
    }
    public String getStudentLastName()
    {
        return boilerplate.getS_LastName_textField().getText();
    }
    public String getSStudentTeam()
    {
        String value=(String)boilerplate.getSTeam_comboBox().getValue();
        if(value==null)return "";
        return value;
    }
    public String getStudentRole()
    {
        return boilerplate.getS_Role_textField().getText();
    }
    public boolean hasTeam(String teamName)
    {
        boolean[] temp=new boolean[]{false};
        boilerplate.getT__tableView().forAll(x->
                                             {
                                                 if(x.field1Property().getValue().equals(teamName))
                                                     temp[0]=true;
                                             });
        return temp[0];
    }
}