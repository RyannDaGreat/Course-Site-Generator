package _App_._GUI_._Modes_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Modes_._TAData_.TAData;
import _App_._GUI_._Modes_._ProjectData_.ProjectData;
import _App_._GUI_._Modes_._ScheduleData_.ScheduleData;
import _App_._GUI_._Modes_._CourseDetails_.CourseDetails;
import _App_._GUI_._Modes_._RecitationData_.RecitationData;
@SuppressWarnings("WeakerAccess")
public class Modes
{
    public TAData tadata;
    public ProjectData projectData;
    public ScheduleData scheduleData;
    public CourseDetails courseDetails;
    public RecitationData recitationData;
    public Modes(App app)
    {
        tadata=new TAData(app);
        projectData=new ProjectData(app);
        scheduleData=new ScheduleData(app);
        courseDetails=new CourseDetails(app);
        recitationData=new RecitationData(app);
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        tadata.initialize();
        projectData.initialize();
        scheduleData.initialize();
        courseDetails.initialize();
        recitationData.initialize();
    }
}