package _Experiments_._Testbed_;//Created by Ryan on 4/24/17.
import _App_.App;
import _Externals_.r;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.BeforeClass;
import org.junit.Test;
import java.io.File;
public class jUnitTest extends App
{
    static
    {
        r.enableTheGoodOldAssertionKeyword();
    }
    @BeforeClass
    public static void main()
    {
        launch();
    }
    @Test
    public void verifySubject()
    {
        assert Subject.equals("CSE");
    }
    @Test
    public void verifyTitle()
    {
        assert Title.equals("Computer Science III");
    }
    @Test
    public void verifyInstructorName()
    {
        assert InstructorName.equals("McKenna");
    }
    @Test
    public void verifyInstructorHome()
    {
        assert InstructorHome.equals("http://www3.cs.stonybrook.edu/~cse219/Section02/hw/HW5.html");
    }
    @Test
    public void verifySemester()
    {
        assert Semester.equals("Spring");
    }
    @Test
    public void verifyNumber()
    {
        assert Number.equals("123");
    }
    @Test
    public void verifyYear()
    {
        assert Year.equals("2017");
    }
    @Test
    public void verifyExportDir()
    {
        assert ExportDir.equals("This is the export directory");
    }
    @Test
    public void verifyTemplateDir()
    {
        assert TemplateDir.equals(".\\templates\\CSE219");
    }
    @Test
    public void verifyBannerImagePath()
    {
        assert BannerImagePath.equals("file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png");
    }
    @Test
    public void verifyLeftFooterImagePath()
    {
        assert LeftFooterImagePath.equals("file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png");
    }
    @Test
    public void verifyRightFooterImagePath()
    {
        assert RightFooterImagePath.equals("file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png");
    }
    @Test
    public void verifySitePagesState()
    {
        assert SitePagesState.equals("true,A,B,AOIJ;true,C,D,AOIJS;false,E,F,aoisf;false,G,H,aiohf");
    }
    @Test
    public void verifyStylesheet()
    {
        assert Stylesheet.equals("My Stylesheet");
    }
    @Test
    public void verifyStudentsTableState()
    {
        assert StudentsTableState.equals("Student,Alien,American,Pie");
    }
    @Test
    public void verifyTeamsTableState()
    {
        assert TeamsTableState.equals("Shank,shunk,up,down;left,far,bottom,top;listen,boy,youre,done");
    }
    @Test
    public void verifyState()
    {
        assert State.equals("Arya,Bethany,Cathode,Dent,Ear,Fence;Plane,Air,Assistant,Teacher,Stigma,Sterling");
    }
    @Test
    public void verifyStartingMonday()
    {
        assert StartingMonday.equals("2017-04-04");
    }
    @Test
    public void verifyEndingFriday()
    {
        assert EndingFriday.equals("2017-04-14");
    }
    @Test
    public void verifyTableState()
    {
        assert TableState.equals("Alpha,Beta,Charlie,Delta,Eernie,Spock,Dump;Elbow,Farlong,Garble,Hobbit,Barren,Crustation,Derby;Iodine,Juniper,Koala,Lion,Bob,Cat,Dog");
    }
    public static String Subject;
    public static String Title;
    public static String InstructorName;
    public static String InstructorHome;
    public static String Semester;
    public static String Number;
    public static String Year;
    public static String ExportDir;
    public static String TemplateDir;
    public static String BannerImagePath;
    public static String LeftFooterImagePath;
    public static String RightFooterImagePath;
    public static String SitePagesState;
    public static String Stylesheet;
    public static String StudentsTableState;
    public static String TeamsTableState;
    public static String State;
    public static String StartingMonday;
    public static String EndingFriday;
    public static String TableState;
    public void start(Stage primaryStage)
    {
        r.say("Hello world");
        stage=primaryStage;
        super.initialize();
        io.loader.loadAppStateFromFile(new File(r.getParentDir(new File("").getAbsolutePath())+"SiteSaveTest.json"));
        System.out.println("1");
        io.saver.saveAppStateToFile(new File(io.propertyGetter.getNewFilePath()).getPath());
        System.out.println("2");
        stage.setTitle(io.propertyGetter.getAppTitle());
        System.out.println("3");
        stage.getIcons().add(io.styleGetter.getAppIcon());
        System.out.println("4");
        stage.setScene(new Scene(gui.window.boilerplate));
        System.out.println("5");
        stage.setOnCloseRequest(e->gui.toolbar.actions.handleExit());
        System.out.println("6");
        stage.setMinHeight(io.propertyGetter.getMinAppHeight());//Unlike McKenna's demo
        System.out.println("7");
        stage.setMinWidth(io.propertyGetter.getMinAppWidth());//Unlike McKenna's demo
        System.out.println("9");
        Subject=gui.modes.courseDetails.reader.getSubject();
        Title=gui.modes.courseDetails.reader.getTitle();
        InstructorName=gui.modes.courseDetails.reader.getInstructorName();
        InstructorHome=gui.modes.courseDetails.reader.getInstructorHome();
        Semester=gui.modes.courseDetails.reader.getSemester();
        Number=gui.modes.courseDetails.reader.getNumber();
        Year=gui.modes.courseDetails.reader.getYear();
        ExportDir=gui.modes.courseDetails.reader.getExportDir();
        TemplateDir=gui.modes.courseDetails.reader.getTemplateDir();
        BannerImagePath=gui.modes.courseDetails.reader.getBannerImagePath();
        LeftFooterImagePath=gui.modes.courseDetails.reader.getLeftFooterImagePath();
        RightFooterImagePath=gui.modes.courseDetails.reader.getRightFooterImagePath();
        SitePagesState=gui.modes.courseDetails.reader.getSitePagesState();
        Stylesheet=gui.modes.courseDetails.reader.getStylesheet();
        StudentsTableState=gui.modes.projectData.reader.getStudentsTableState();
        TeamsTableState=gui.modes.projectData.reader.getTeamsTableState();
        State=gui.modes.recitationData.reader.getState();
        StartingMonday=gui.modes.scheduleData.reader.getStartingMonday();
        EndingFriday=gui.modes.scheduleData.reader.getEndingFriday();
        TableState=gui.modes.scheduleData.reader.getTableState();
        stage.show();
        gui.toolbar.actions.handleExit();
    }
}
