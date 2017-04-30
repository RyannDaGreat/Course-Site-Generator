package _App_._GUI_._Modes_._ScheduleData_._Boilerplate_;
import _App_.App;
import _App_._GUI_._Modes_._ScheduleData_._Reader_.Reader;
import _Externals_.SD_ScheduleItemsTableView;
import _Externals_.r;
import javafx.scene.control.*;
import javafx.util.Callback;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

import static _Externals_.SD_ScheduleItemsTableView.*;
public class Boilerplate
{
    public App app;
    public Boilerplate(App app)
    {
        this.app=app;
    }
    private _App_._GUI_._Window_._Boilerplate_.Boilerplate megaplate;
    private Reader reader;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        megaplate=app.gui.window.boilerplate;
        reader=app.gui.modes.scheduleData.reader;
        //region Date-Picker Constraints
        r.applyDateFilter(getSdStartingMonday_datePicker(),x->
        {
            for(Object o : getSdScheduledItems_tableView().getItems().toArray())
            {
                SD_ScheduleItemsTableView.Item i=(SD_ScheduleItemsTableView.Item)o;
                try
                {
                    if(x.isAfter(LocalDate.parse(i.dateProperty().getValue())))//Prevent user from creating date conflicts that would need to be erased
                    {
                        return false;
                    }
                }
                catch(Exception ignored)
                {
                    ignored.printStackTrace();
                }
            }
            return x.getDayOfWeek().equals(DayOfWeek.MONDAY)&&x.isBefore(LocalDate.parse(reader.getEndingFriday()));
        });//NOTE: LocalDate.parse(reader.getEndingFriday()) ≣ getSdEndingFriday_datePicker().getValue()
        r.applyDateFilter(getSdEndingFriday_datePicker(),x->
        {
            for(Object o : getSdScheduledItems_tableView().getItems().toArray())
            {
                SD_ScheduleItemsTableView.Item i=(SD_ScheduleItemsTableView.Item)o;
                try
                {
                    if(x.isBefore(LocalDate.parse(i.dateProperty().getValue())))//Make sure we haven't chosen this date before
                    {
                        return false;
                    }
                }
                catch(Exception ignored)
                {
                    ignored.printStackTrace();
                }
            }
            return x.getDayOfWeek().equals(DayOfWeek.FRIDAY)&&x.isAfter(LocalDate.parse(reader.getStartingMonday()));
        });
        r.applyDateFilter(getSdDate_datePicker(),x->
        {
            for(Object o : getSdScheduledItems_tableView().getItems().toArray())
            {
                SD_ScheduleItemsTableView.Item i=(SD_ScheduleItemsTableView.Item)o;
                try
                {
                    if(x.isEqual(LocalDate.parse(i.dateProperty().getValue())))//Make sure we haven't chosen this date before
                    {
                        return false;
                    }
                }
                catch(Exception ignored)
                {
                    ignored.printStackTrace();
                }
            }
            return x.isAfter(LocalDate.parse(reader.getStartingMonday()))&&
                   x.isBefore(LocalDate.parse(reader.getEndingFriday()));
        });
        //endregion
    }
    public DatePicker getSdStartingMonday_datePicker()
    {
        return megaplate.sdStartingMonday_datePicker0;
    }
    public DatePicker getSdEndingFriday_datePicker()
    {
        return megaplate.sdEndingFriday_datePicker;
    }
    public SD_ScheduleItemsTableView getSdScheduledItems_tableView()
    {
        return megaplate.sdScheduledItems_tableView2;
    }
    public TableColumn getSdType_tableColumn()
    {
        return megaplate.sdType_tableColumn11;
    }
    public TableColumn getSdDate_tableColumn()
    {
        return megaplate.sdDate_tableColumn12;
    }
    public TableColumn getSdTitle_tableColumn()
    {
        return megaplate.sdTitle_tableColumn13;
    }
    public TableColumn getSdTopic_tableColumn()
    {
        return megaplate.sdTopic_tableColumn14;
    }
    public DatePicker getSdDate_datePicker()
    {
        return megaplate.sdDate_datePicker1;
    }
    public ComboBox getSdType_comboBox()
    {
        return megaplate.sdType_comboBox8;
    }
    public TextField getSdTime_textField()
    {
        return megaplate.sdTime_textField10;
    }
    public TextField getSdTitle_textField()
    {
        return megaplate.sdTitle_textField11;
    }
    public TextField getSdTopic_textField()
    {
        return megaplate.sdTopic_textField9;
    }
    public TextField getSdLink_textField()
    {
        return megaplate.sdLink_textField12;
    }
    public TextField getSdCriteria_textField()
    {
        return megaplate.sdCriteria_textField8;
    }
    public Button getSdAddUpdate_button()
    {
        return megaplate.sdAddUpdate_button17;
    }
    public Button getSdClear_button()
    {
        return megaplate.sdClear_button18;
    }
}
