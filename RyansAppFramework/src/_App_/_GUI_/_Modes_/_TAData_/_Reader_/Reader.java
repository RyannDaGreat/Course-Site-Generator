package _App_._GUI_._Modes_._TAData_._Reader_;
import _App_.App;
import _App_._GUI_._Modes_._TAData_._Boilerplate_.Boilerplate;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.OfficeHoursGrid;
import _Externals_.TD_TATableView;
import _Externals_.r;
import org.json.JSONException;
import org.json.JSONObject;
public class Reader//It is not a coincidence that none of these methods have void or arguments
{
    public App app;
    public Reader(App app)
    {
        this.app=app;
    }
    private Boilerplate boilerplate;
    private PropertyGetter propertyGetter;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.tadata.boilerplate;
        propertyGetter=app.io.propertyGetter;
    }
    public boolean thereExistsTA(String name)
    {
        boolean[] temp=new boolean[]{false};
        boilerplate.getTa_tableView().forAll(x->
                                             {
                                                 if(x.nameProperty().getValue().equals(name))
                                                 {
                                                     temp[0]=true;
                                                 }
                                             });
        return temp[0];
    }
    public TD_TATableView.TA getSelectedTa()
    {
        return boilerplate.getTa_tableView().getSelected();
    }
    public String getSelectedTaName()
    {
        return getSelectedTa().nameProperty().getValue();
    }
    public String getSelectedTaEmail()
    {
        return getSelectedTa().emailProperty().getValue();
    }
    public boolean getSelectedTaIsUndergrad()
    {
        return getSelectedTa().undergradProperty().getValue();
    }
    public String getTaState()
    {
        return boilerplate.getTa_tableView().getState();
    }
    public String getTextfieldInputName()
    {
        return boilerplate.getTaName_textField().getText();
    }
    public String getTextfieldInputEmail()
    {
        return boilerplate.getTaEmail_textField().getText();
    }
    public boolean getIsTaSelected()
    {
        return boilerplate.getTa_tableView().getSelected()!=null;
    }
    public boolean getIsAddUpdateButtonAdd()
    {
        return boilerplate.getTaAddUpdate_button().getText().equals(propertyGetter.getAddButtonLabel());
    }
    public boolean getIsAddUpdateButtonUpdate()
    {
        return boilerplate.getTaAddUpdate_button().getText().equals(propertyGetter.getUpdateButtonLabel());
        // return !getIsAddUpdateButtonAdd();
    }
    public String getFirstOfficeHourTimeslot()
    {
        return boilerplate.getOh_gridPane().getFirstTimeSlot();
    }
    public String getLastOfficeHourTimeslot()
    {
        return boilerplate.getOh_gridPane().getLastTimeSlot();
    }
    public String getOhState()
    {
        return boilerplate.getOh_gridPane().getGridState();
    }
    public String getState()
    {
        return r.joinLines(getTaState(),getOhState());
    }
    public JSONObject getExport()
    {
        JSONObject o=new JSONObject();
        int startTime=r.indexOf(getFirstOfficeHourTimeslot(),propertyGetter.getOfficeHourTimeslots());
        int endTime=r.indexOf(getLastOfficeHourTimeslot(),propertyGetter.getOfficeHourTimeslots());
        try
        {
            o.accumulate("startHour",startTime/2);
            o.accumulate("endHour",(endTime+2)/2);
            boilerplate.getTa_tableView().forAll(x->
                                                 {
                                                     JSONObject temp=new JSONObject();
                                                     try
                                                     {
                                                         temp.accumulate("name",x.nameProperty().getValue());
                                                         temp.accumulate("email",x.emailProperty().getValue());
                                                         o.append("undergrad_tas",temp);
                                                     }
                                                     catch(JSONException e)
                                                     {
                                                         e.printStackTrace();
                                                     }
                                                 });
            String[] dayKeys="MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY".split(",");
            String[] timeKeys="12_00am,12_30am,1_00am,1_30am,2_00am,2_30am,3_00am,3_30am,4_00am,4_30am,5_00am,5_30am,6_00am,6_30am,7_00am,7_30am,8_00am,8_30am,9_00am,9_30am,10_00am,10_30am,11_00am,11_30am,12_00pm,12_30pm,1_00pm,1_30pm,2_00pm,2_30pm,3_00pm,3_30pm,4_00pm,4_30pm,5_00pm,5_30pm,6_00pm,6_30pm,7_00pm,7_30pm,8_00pm,8_30pm,9_00pm,9_30pm,10_00pm,10_30pm,11_00pm,11_30pm".split(",");
            OfficeHoursGrid g=boilerplate.getOh_gridPane();
            g.forEachChild(x->
                           {
                               for(String name : r.splitLines(x.getText()))
                               {
                                   JSONObject temp=new JSONObject();
                                   try
                                   {
                                       if(!g.isTitle(x))
                                       {
                                           temp.accumulate("name",name);
                                           temp.accumulate("time",r.mapString(g.rowTitle(x),propertyGetter.getOfficeHourTimeslots(),timeKeys));
                                           temp.accumulate("day",r.mapString(g.colTitle(x),propertyGetter.getOfficeHourDays(),dayKeys));
                                           o.accumulate("officeHours",temp);
                                       }
                                   }
                                   catch(JSONException e)
                                   {
                                       e.printStackTrace();
                                   }
                               }
                           });
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
        return o;
    }
}
