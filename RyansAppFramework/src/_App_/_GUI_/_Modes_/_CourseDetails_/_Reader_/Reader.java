package _App_._GUI_._Modes_._CourseDetails_._Reader_;
import _App_.App;
import _App_._GUI_._Modes_._CourseDetails_._Boilerplate_.Boilerplate;
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
        boilerplate=app.gui.modes.courseDetails.boilerplate;
    }
}
