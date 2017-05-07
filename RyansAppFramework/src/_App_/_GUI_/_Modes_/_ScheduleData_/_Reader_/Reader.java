package _App_._GUI_._Modes_._ScheduleData_._Reader_;
import _App_.App;
import _App_._GUI_._Modes_._ScheduleData_._Boilerplate_.Boilerplate;
import _App_._IO_._PropertyGetter_.PropertyGetter;
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
    private PropertyGetter propertyGetter;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.scheduleData.boilerplate;
        propertyGetter=app.io.propertyGetter;
    }
    public boolean isValidScheduleItemDate(LocalDate x)
    {
        return x!=null&&x.isAfter(LocalDate.parse(getStartingMonday()))&&x.isBefore(LocalDate.parse(getEndingFriday()));
    }
    //region Main Getters   ([\n][ ]*[{][\n][ ]*)(.*)([\n][ ]*[}])   ⟹  {$2}
    /*@formatter:off*/
    public SD_ScheduleItemsTableView.Item getSelected(){return boilerplate.getSdScheduledItems_tableView().getSelected();}
    public String getTableState(){return boilerplate.getSdScheduledItems_tableView().getState();}
    public String getStartingMonday(){return ""+boilerplate.getSdStartingMonday_datePicker().getValue();}
    public String getEndingFriday(){return ""+boilerplate.getSdEndingFriday_datePicker().getValue();}
    public String getDate(){return emptyToSpace(""+boilerplate.getSdDate_datePicker().getValue());}
    public String getType(){return emptyToSpace(""+boilerplate.getSdType_comboBox().getValue());}
    public String getTime(){return emptyToSpace(boilerplate.getSdTime_textField().getText());}
    public String getTitle(){return emptyToSpace(boilerplate.getSdTitle_textField().getText());}
    public String getTopic(){return emptyToSpace(boilerplate.getSdTopic_textField().getText());}
    public String getLink(){return emptyToSpace(boilerplate.getSdLink_textField().getText());}
    public String getCriteria(){return emptyToSpace(boilerplate.getSdCriteria_textField().getText());}
    public static String emptyToSpace(String x)
    {
        if(x.equals(""))
            return " ";
        return x;
    }
    /*@formatter:on*/
    //endregion
    public JSONObject getState() throws JSONException
    {
        JSONObject o=new JSONObject();
        o.accumulate("StartingMonday",getStartingMonday());
        o.accumulate("EndingFriday",getEndingFriday());
        o.accumulate("TableState",getTableState());
        return o;
    }
    public JSONObject getExport() throws JSONException
    {
        JSONObject o=new JSONObject("{\"holidays\":[],\"references\": [],\"hws\": [],\"recitations\": [],\"lectures\": []}");
        LocalDate startingMonday=LocalDate.parse(getStartingMonday());
        o.accumulate("startingMondayMonth",""+startingMonday.getMonthValue());
        o.accumulate("startingMondayDay",""+startingMonday.getDayOfMonth());
        LocalDate endingFriday=LocalDate.parse(getEndingFriday());
        o.accumulate("endingFridayMonth",""+endingFriday.getMonthValue());
        o.accumulate("endingFridayDay",""+endingFriday.getDayOfMonth());
        boilerplate.getSdScheduledItems_tableView().forAll(x->//x≣item
                                                           {
                                                               try
                                                               {
                                                                   JSONObject temp=new JSONObject();
                                                                   LocalDate date=LocalDate.parse(x.dateProperty().getValue());
                                                                   accumulateIfNotSpace(temp,"month",""+date.getMonthValue());
                                                                   accumulateIfNotSpace(temp,"day",""+date.getDayOfMonth());
                                                                   accumulateIfNotSpace(temp,"title",x.titleProperty().getValue());
                                                                   accumulateIfNotSpace(temp,"time",x .time);
                                                                   String topic=x.topicProperty().getValue();
                                                                   // if(temp.has("time"))topic="due @ "+x.time+"<br />"+topic;
                                                                   accumulateIfNotSpace(temp,"topic",topic);
                                                                   accumulateIfNotSpace(temp,"link",x.link);
                                                                   accumulateIfNotSpace(temp,"criteria",x.criteria);
                                                                   o.accumulate(r.mapString(x.typeProperty().getValue(),propertyGetter.getScheduleItemTypes(),propertyGetter.getScheduleItemTypeKeys()),temp);//Map {Holiday,Lecture,Recitation,Homework,Reference} to {holidays,lectures,recitations,hws,references} for the JSON file keys
                                                               }
                                                               catch(JSONException e)
                                                               {
                                                                   e.printStackTrace();
                                                               }
                                                           });
        return o;
    }
    public void accumulateIfNotSpace(JSONObject temp,String key,String value) throws JSONException
    {
        if(!value.equals(" "))
        {
            temp.accumulate(key,value);
        }
    }
}
