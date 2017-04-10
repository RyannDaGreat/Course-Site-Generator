package _App_._GUI_._Modes_._TAData_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Modes_._TAData_._Actions_.Actions;
import _App_._GUI_._Modes_._TAData_._Boilerplate_.Boilerplate;
import _App_._GUI_._Modes_._TAData_._Reader_.Reader;
import _App_._GUI_._Modes_._TAData_._Transactions_.Transactions;
@SuppressWarnings("WeakerAccess")
public class TAData
{
    public Actions actions;
    public Transactions transactions;
    public Boilerplate boilerplate;
    public Reader reader;
    public TAData(App app)
    {
        actions=new Actions(app);
        transactions=new Transactions(app);
        boilerplate=new Boilerplate(app);
        reader=new Reader(app);
    }
}
