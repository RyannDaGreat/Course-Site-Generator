package _App_._GUI_._Modes_._ScheduleData_._Reader_;
import _App_.App;
import _App_._GUI_._Modes_._ScheduleData_._Boilerplate_.Boilerplate;
import _Externals_.SD_ScheduleItemsTableView;
import _Externals_.r;
import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;
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
        boilerplate=app.gui.modes.scheduleData.boilerplate;
    }
    public boolean isValidScheduleItemDate(LocalDate x)
    {
        if(x==null)
            return false;
        for(Object o : boilerplate.getSdScheduledItems_tableView().getItems().toArray())
        {
            try
            {
                if(x.isEqual(LocalDate.parse(((SD_ScheduleItemsTableView.Item)o).dateProperty().getValue())))//Make sure we haven't chosen this date before
                {
                    return getSelected()==o;
                }
            }
            catch(Exception ignored)
            {
                // ignored.printStackTrace();
                // System.out.print("\rError Message 1235931232 (search for me)");
            }
        }
        return x.isAfter(LocalDate.parse(getStartingMonday()))&&
               x.isBefore(LocalDate.parse(getEndingFriday()));
    }
    //region Main getters
    public SD_ScheduleItemsTableView.Item getSelected()
    {
        return boilerplate.getSdScheduledItems_tableView().getSelected();
    }
    public String getTableState()
    {
        return boilerplate.getSdScheduledItems_tableView().getState();
    }
    //
    public String getStartingMonday()
    {
        return ""+boilerplate.getSdStartingMonday_datePicker().getValue();
    }
    public String getEndingFriday()
    {
        return ""+boilerplate.getSdEndingFriday_datePicker().getValue();
    }
    public String getDate()
    {
        return ""+boilerplate.getSdDate_datePicker().getValue();
    }
    public String getType()
    {
        return ""+boilerplate.getSdType_comboBox().getValue();
    }
    public String getTime()
    {
        return boilerplate.getSdTime_textField().getText();
    }
    public String getTitle()
    {
        return boilerplate.getSdTitle_textField().getText();
    }
    public String getTopic()
    {
        return boilerplate.getSdTopic_textField().getText();
    }
    public String getLink()
    {
        return boilerplate.getSdLink_textField().getText();
    }
    public String getCriteria()
    {
        return boilerplate.getSdCriteria_textField().getText();
    }
    //endregion
    public JSONObject getState() throws JSONException
    {
        JSONObject o=new JSONObject();
        o.accumulate("StartingMonday",getStartingMonday());
        o.accumulate("EndingFriday",getEndingFriday());
        o.accumulate("TableState",getTableState());
        return o;
    }
}
