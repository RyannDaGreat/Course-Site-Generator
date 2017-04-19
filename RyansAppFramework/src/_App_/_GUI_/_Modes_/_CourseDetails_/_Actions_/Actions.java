package _App_._GUI_._Modes_._CourseDetails_._Actions_;
import _App_.App;
import _App_._GUI_._Modes_._CourseDetails_._Boilerplate_.Boilerplate;

import java.io.File;
public class Actions
{
    public App app;
    public Actions(App app)
    {
        this.app=app;
    }
    private Boilerplate boilerplate;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.courseDetails.boilerplate;
    }
    public void handleChangeExportDir()
    {
        File f=app.gui.dialogs.openDirectory();
        if(f!=null)//User didn't select cancel
        {
            setExportDir(app.io.misc.fileToString(f));
        }
    }
    public void setExportDir(String dir)
    {
        boilerplate.getCdCiExportDir_text().setText(dir);
    }
}
