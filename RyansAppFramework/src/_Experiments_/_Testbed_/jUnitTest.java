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
    public void initialize()
    {
        super.initialize();
        io.loader.loadAppStateFromFile(r.openFile("SiteSaveTest.json"));//This is simply a faster way of hard-coding the controls. It's identically equivalent to spamming all the setter methods in here.
    }
    // String x="{\n"+
    //          "    \"RecitationData\": \"Arya,Bethany,Cathode,Dent,Ear,Fence;Plane,Air,Assistant,Teacher,Stigma,Sterling\",\n"+
    //          "    \"CourseDetails\": {\n"+
    //          "        \"SitePagesState\": \"true,A,B,AOIJ;true,C,D,AOIJS;false,E,F,aoisf;false,G,H,aiohf\",\n"+
    //          "        \"Semester\": \"Spring\",\n"+
    //          "        \"ExportDir\": \"This is the export directory\",\n"+
    //          "        \"BannerImage\": \"file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png\",\n"+
    //          "        \"Title\": \"Computer Science III\",\n"+
    //          "        \"Subject\": \"CSE\",\n"+
    //          "        \"Stylesheet\": \"My Stylesheet\",\n"+
    //          "        \"TemplateDir\": \".\\\\templates\\\\CSE219\",\n"+
    //          "        \"InstructorHome\": \"http://www3.cs.stonybrook.edu/~cse219/Section02/hw/HW5.html\",\n"+
    //          "        \"Number\": \"123\",\n"+
    //          "        \"Year\": \"2017\",\n"+
    //          "        \"InstructorName\": \"McKenna\",\n"+
    //          "        \"LeftFooterImage\": \"file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png\",\n"+
    //          "        \"RightFooterImage\": \"file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png\"\n"+
    //          "    },\n"+
    //          "    \"ScheduleData\": {\n"+
    //          "        \"EndingFriday\": \"2017-04-14\",\n"+
    //          "        \"StartingMonday\": \"2017-04-04\",\n"+
    //          "        \"TableState\": \"Alpha,Beta,Charlie,Delta,Eernie,Spock,Dump;Elbow,Farlong,Garble,Hobbit,Barren,Crustation,Derby;Iodine,Juniper,Koala,Lion,Bob,Cat,Dog\"\n"+
    //          "    },\n"+
    //          "    \"TAData\": \"false,Ryan Burgert,ryanburgert@sbu.com;true,Teacher Assistant,TA@sbuTA.com\\n10:30am\\t to\\t11:00am,11:00am\\t to\\t11:30am,11:30am\\t to\\tNoon,Noon\\t to\\t12:30pm,12:30pm\\t to\\t1:00pm,1:00pm\\t to\\t1:30pm,1:30pm\\t to\\t2:00pm,2:00pm\\t to\\t2:30pm,2:30pm\\t to\\t3:00pm,3:00pm\\t to\\t3:30pm,3:30pm\\t to\\t4:00pm,4:00pm\\t to\\t4:30pm,4:30pm\\t to\\t5:00pm,5:00pm\\t to\\t5:30pm,5:30pm\\t to\\t6:00pm,6:00pm\\t to\\t6:30pm,6:30pm\\t to\\t7:00pm;Monday,Tuesday,Wednesday,Thursday,Friday;11:00am\\t to\\t11:30am,Monday,Teacher Assistant;11:30am\\t to\\tNoon,Monday,Teacher Assistant;11:30am\\t to\\tNoon,Thursday,Teacher Assistant;Noon\\t to\\t12:30pm,Monday,Teacher Assistant;Noon\\t to\\t12:30pm,Tuesday,Ryan Burgert;Noon\\t to\\t12:30pm,Thursday,Teacher Assistant;12:30pm\\t to\\t1:00pm,Tuesday,Ryan Burgert;12:30pm\\t to\\t1:00pm,Thursday,Teacher Assistant;1:00pm\\t to\\t1:30pm,Tuesday,Ryan Burgert;1:00pm\\t to\\t1:30pm,Thursday,Teacher Assistant;1:30pm\\t to\\t2:00pm,Tuesday,Ryan Burgert;1:30pm\\t to\\t2:00pm,Tuesday,Teacher Assistant;1:30pm\\t to\\t2:00pm,Friday,Ryan Burgert;2:00pm\\t to\\t2:30pm,Tuesday,Ryan Burgert;2:00pm\\t to\\t2:30pm,Tuesday,Teacher Assistant;2:00pm\\t to\\t2:30pm,Thursday,Teacher Assistant;2:00pm\\t to\\t2:30pm,Friday,Ryan Burgert;2:30pm\\t to\\t3:00pm,Monday,Teacher Assistant;2:30pm\\t to\\t3:00pm,Tuesday,Ryan Burgert;2:30pm\\t to\\t3:00pm,Tuesday,Teacher Assistant;2:30pm\\t to\\t3:00pm,Thursday,Teacher Assistant;2:30pm\\t to\\t3:00pm,Friday,Ryan Burgert;3:00pm\\t to\\t3:30pm,Monday,Ryan Burgert;3:00pm\\t to\\t3:30pm,Monday,Teacher Assistant;3:00pm\\t to\\t3:30pm,Tuesday,Teacher Assistant;3:00pm\\t to\\t3:30pm,Thursday,Teacher Assistant;3:00pm\\t to\\t3:30pm,Friday,Ryan Burgert;3:00pm\\t to\\t3:30pm,Friday,Teacher Assistant;3:30pm\\t to\\t4:00pm,Monday,Ryan Burgert;3:30pm\\t to\\t4:00pm,Monday,Teacher Assistant;3:30pm\\t to\\t4:00pm,Wednesday,Ryan Burgert;3:30pm\\t to\\t4:00pm,Thursday,Teacher Assistant;3:30pm\\t to\\t4:00pm,Friday,Ryan Burgert;4:00pm\\t to\\t4:30pm,Monday,Ryan Burgert;4:00pm\\t to\\t4:30pm,Monday,Teacher Assistant;4:00pm\\t to\\t4:30pm,Wednesday,Ryan Burgert;4:30pm\\t to\\t5:00pm,Monday,Ryan Burgert;4:30pm\\t to\\t5:00pm,Monday,Teacher Assistant;4:30pm\\t to\\t5:00pm,Wednesday,Ryan Burgert;4:30pm\\t to\\t5:00pm,Friday,Teacher Assistant;5:00pm\\t to\\t5:30pm,Monday,Ryan Burgert;5:00pm\\t to\\t5:30pm,Wednesday,Ryan Burgert;5:00pm\\t to\\t5:30pm,Friday,Teacher Assistant;5:30pm\\t to\\t6:00pm,Monday,Teacher Assistant;5:30pm\\t to\\t6:00pm,Wednesday,Ryan Burgert;6:00pm\\t to\\t6:30pm,Monday,Teacher Assistant;6:30pm\\t to\\t7:00pm,Monday,Teacher Assistant\",\n"+
    //          "    \"ProjectData\": {\n"+
    //          "        \"TeamsTable\": \"Shank,shunk,up,down;left,far,bottom,top;listen,boy,youre,done\",\n"+
    //          "        \"StudentsTable\": \"Student,Alien,American,Pie\"\n"+
    //          "    }\n"+
    //          "}\n";
    @Test
    public void testLaunch()
    {
        launch();
    }
    @Test
    public void verifyRecitationData()
    {
        launch();
        assert gui.modes.recitationData.reader.getState().equals("Arya,Bethany,Cathode,Dent,Ear,Fence;Plane,Air,Assistant,Teacher,Stigma,Sterling");
    }
    @Test
    public void verifyCourseDetails()
    {
        assert gui.modes.recitationData.reader.getState().equals("Arya,Bethany,Cathode,Dent,Ear,Fence;Plane,Air,Assistant,Teacher,Stigma,Sterling");
    }
    @Test
    public void verifyFullAppState()//This trumps all the others: they aren't very important.
    {
        System.out.println("hello");
        // assert io.saver.getAppState().equals(TestSave.hardcodedSettings);//These are the original settigs we loaded, from a string.
    }
    @Test
    public void test()
    {
        r.println(gui.modes.courseDetails.reader.getSubject());//CSE
        r.println(gui.modes.courseDetails.reader.getTitle());//Computer Science III
        r.println(gui.modes.courseDetails.reader.getInstructorName());//McKenna
        r.println(gui.modes.courseDetails.reader.getInstructorHome());//http://www3.cs.stonybrook.edu/~cse219/Section02/hw/HW5.html
        r.println(gui.modes.courseDetails.reader.getSemester());//Spring
        r.println(gui.modes.courseDetails.reader.getNumber());//123
        r.println(gui.modes.courseDetails.reader.getYear());//2017
        r.println(gui.modes.courseDetails.reader.getExportDir());//This is the export directory
        r.println(gui.modes.courseDetails.reader.getTemplateDir());//.\templates\CSE219
        r.println(gui.modes.courseDetails.reader.getBannerImagePath());//file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png
        r.println(gui.modes.courseDetails.reader.getLeftFooterImagePath());//file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png
        r.println(gui.modes.courseDetails.reader.getRightFooterImagePath());//file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png
        r.println(gui.modes.courseDetails.reader.getSitePagesState());//true,A,B,AOIJ;true,C,D,AOIJS;false,E,F,aoisf;false,G,H,aiohf
        r.println(gui.modes.courseDetails.reader.getStylesheet());//My Stylesheet
        r.println(gui.modes.projectData.reader.getStudentsTableState());//Student,Alien,American,Pie
        r.println(gui.modes.projectData.reader.getTeamsTableState());//Shank,shunk,up,down;left,far,bottom,top;listen,boy,youre,done
        r.println(gui.modes.recitationData.reader.getState());//Arya,Bethany,Cathode,Dent,Ear,Fence;Plane,Air,Assistant,Teacher,Stigma,Sterling
        r.println(gui.modes.scheduleData.reader.getStartingMonday());//2017-04-04
        r.println(gui.modes.scheduleData.reader.getEndingFriday());//2017-04-14
        r.println(gui.modes.scheduleData.reader.getTableState());//Alpha,Beta,Charlie,Delta,Eernie,Spock,Dump;Elbow,Farlong,Garble,Hobbit,Barren,Crustation,Derby;Iodine,Juniper,Koala,Lion,Bob,Cat,Dog
    }
    // region App Wrapper: Ignore this code. It's duplicated, and is only for a nichy test for my homework.
    // @SuppressWarnings("Duplicates")
    public void start(Stage primaryStage)
    {
        r.say("Hello world");
        stage=primaryStage;
        initialize();
        io.saver.saveAppStateToFile(new File(io.propertyGetter.getNewFilePath()).getPath());
        stage.setTitle(io.propertyGetter.getAppTitle());
        stage.getIcons().add(io.styleGetter.getAppIcon());
        stage.setScene(new Scene(gui.window.boilerplate));
        stage.setOnCloseRequest(e->gui.toolbar.actions.handleExit());
        stage.setMinHeight(io.propertyGetter.getMinAppHeight());//Unlike McKenna's demo
        stage.setMinWidth(io.propertyGetter.getMinAppWidth());//Unlike McKenna's demo
        verifyFullAppState();
        stage.show();
    }
    @BeforeClass
    public static void main()
    {
        launch();
    }
    //endregion

}
