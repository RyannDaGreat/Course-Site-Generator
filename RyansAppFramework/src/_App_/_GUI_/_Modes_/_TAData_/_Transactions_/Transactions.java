package _App_._GUI_._Modes_._TAData_._Transactions_;
import _App_.App;
import _App_._GUI_._Modes_._TAData_._Actions_.Actions;
import _App_._GUI_._Modes_._TAData_._Reader_.Reader;
import _App_._rTPS_.rTPS;
public class Transactions
{
    public App app;
    public Transactions(App app)
    {
        this.app=app;
    }
    private rTPS rtps;
    private Reader reader;
    private Actions actions;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        rtps=app.rtps;
        reader=app.gui.modes.tadata.reader;
        actions=app.gui.modes.tadata.actions;
    }
    //Toggle, Delete, Update, Add, ChangeTimes
    public void handleTADataChange(Runnable r)//Saves full state TAData change to create transaction
    {
        // System.out.println(reader.getState());
        // System.out.println();
        final String beforeState=reader.getState();
        r.run();
        final String afterState=reader.getState();
        rtps.DoWithoutRedo(()->actions.setState(afterState),()->actions.setState(beforeState));
    }
    public void deleteSelectedTa()
    {
        try
        {
            handleTADataChange(actions::deleteSelectedTa);
        }
        catch(Exception ignored){}//If no TA is selected
    }
    public void handleAddUpdateButton()
    {
        handleTADataChange(actions::handleAddUpdateButton);
    }
    public void setFirstTimeslot(String slot)
    {
        String initState=app.gui.modes.tadata.boilerplate.getOh_gridPane().getTimesDaysNames();
        handleTADataChange(()->actions.setFirstTimeslot(slot));
        if(!app.gui.modes.tadata.boilerplate.getOh_gridPane().getTimesDaysNames().equals(initState)&&!app.gui.dialogs.confirmChangeTATimesDeleteOfficehours())//Prompt the user if we're about to delete office hours
            rtps.Undo();
    }
    public void setLastTimeslot(String slot)
    {
        String initState=app.gui.modes.tadata.boilerplate.getOh_gridPane().getTimesDaysNames();
        handleTADataChange(()->actions.setLastTimeslot(slot));
        if(!app.gui.modes.tadata.boilerplate.getOh_gridPane().getTimesDaysNames().equals(initState)&&!app.gui.dialogs.confirmChangeTATimesDeleteOfficehours())//Prompt the user if we're about to delete office hours
            rtps.Undo();
    }
    public void handleToggleOfficeHour(String time,String day)
    {
        final String name=reader.getSelectedTaName();
        rtps.Do(()->actions.handleToggleOfficeHour(time,day,name),()->actions.handleToggleOfficeHour(time,day,name));
    }
}
