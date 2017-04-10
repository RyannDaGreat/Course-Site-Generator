package _App_._GUI_._Modes_._CourseDetails_;
import _App_.App;
import _App_._GUI_._Modes_._CourseDetails_._Actions_.Actions;
import _App_._GUI_._Modes_._CourseDetails_._Boilerplate_.Boilerplate;
import _App_._GUI_._Modes_._CourseDetails_._Reader_.Reader;
import _App_._GUI_._Modes_._CourseDetails_._Transactions_.Transactions;
@SuppressWarnings("WeakerAccess")
public class CourseDetails
{
    public Actions actions;
    public Transactions transactions;
    public Boilerplate boilerplate;
    public Reader reader;
    public CourseDetails(App app)
    {
        actions=new Actions(app);
        transactions=new Transactions(app);
        boilerplate=new Boilerplate(app);
        reader=new Reader(app);
    }
}
