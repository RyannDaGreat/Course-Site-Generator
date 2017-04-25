package _Experiments_._Testbed_;//Created by Ryan on 4/24/17.
import _App_.App;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
public class TestSave extends App
{
    public static final String hardcodedSettings="{\n"+
                                                 "    \"RecitationData\": \"Arya,Bethany,Cathode,Dent,Ear,Fence;Plane,Air,Assistant,Teacher,Stigma,Sterling\",\n"+
                                                 "    \"CourseDetails\": {\n"+
                                                 "        \"SitePagesState\": \"true,A,B,AOIJ;true,C,D,AOIJS;false,E,F,aoisf;false,G,H,aiohf\",\n"+
                                                 "        \"Semester\": \"Spring\",\n"+
                                                 "        \"ExportDir\": \"This is the export directory\",\n"+
                                                 "        \"BannerImage\": \"file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png\",\n"+
                                                 "        \"Title\": \"Computer Science III\",\n"+
                                                 "        \"Subject\": \"CSE\",\n"+
                                                 "        \"Stylesheet\": \"My Stylesheet\",\n"+
                                                 "        \"TemplateDir\": \".\\\\templates\\\\CSE219\",\n"+
                                                 "        \"InstructorHome\": \"http://www3.cs.stonybrook.edu/~cse219/Section02/hw/HW5.html\",\n"+
                                                 "        \"Number\": \"123\",\n"+
                                                 "        \"Year\": \"2017\",\n"+
                                                 "        \"InstructorName\": \"McKenna\",\n"+
                                                 "        \"LeftFooterImage\": \"file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png\",\n"+
                                                 "        \"RightFooterImage\": \"file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png\"\n"+
                                                 "    },\n"+
                                                 "    \"ScheduleData\": {\n"+
                                                 "        \"EndingFriday\": \"2017-04-14\",\n"+
                                                 "        \"StartingMonday\": \"2017-04-04\",\n"+
                                                 "        \"TableState\": \"Alpha,Beta,Charlie,Delta,Eernie,Spock,Dump;Elbow,Farlong,Garble,Hobbit,Barren,Crustation,Derby;Iodine,Juniper,Koala,Lion,Bob,Cat,Dog\"\n"+
                                                 "    },\n"+
                                                 "    \"TAData\": \"false,Ryan Burgert,ryanburgert@sbu.com;true,Teacher Assistant,TA@sbuTA.com\\n10:30am\\t to\\t11:00am,11:00am\\t to\\t11:30am,11:30am\\t to\\tNoon,Noon\\t to\\t12:30pm,12:30pm\\t to\\t1:00pm,1:00pm\\t to\\t1:30pm,1:30pm\\t to\\t2:00pm,2:00pm\\t to\\t2:30pm,2:30pm\\t to\\t3:00pm,3:00pm\\t to\\t3:30pm,3:30pm\\t to\\t4:00pm,4:00pm\\t to\\t4:30pm,4:30pm\\t to\\t5:00pm,5:00pm\\t to\\t5:30pm,5:30pm\\t to\\t6:00pm,6:00pm\\t to\\t6:30pm,6:30pm\\t to\\t7:00pm;Monday,Tuesday,Wednesday,Thursday,Friday;11:00am\\t to\\t11:30am,Monday,Teacher Assistant;11:30am\\t to\\tNoon,Monday,Teacher Assistant;11:30am\\t to\\tNoon,Thursday,Teacher Assistant;Noon\\t to\\t12:30pm,Monday,Teacher Assistant;Noon\\t to\\t12:30pm,Tuesday,Ryan Burgert;Noon\\t to\\t12:30pm,Thursday,Teacher Assistant;12:30pm\\t to\\t1:00pm,Tuesday,Ryan Burgert;12:30pm\\t to\\t1:00pm,Thursday,Teacher Assistant;1:00pm\\t to\\t1:30pm,Tuesday,Ryan Burgert;1:00pm\\t to\\t1:30pm,Thursday,Teacher Assistant;1:30pm\\t to\\t2:00pm,Tuesday,Ryan Burgert;1:30pm\\t to\\t2:00pm,Tuesday,Teacher Assistant;1:30pm\\t to\\t2:00pm,Friday,Ryan Burgert;2:00pm\\t to\\t2:30pm,Tuesday,Ryan Burgert;2:00pm\\t to\\t2:30pm,Tuesday,Teacher Assistant;2:00pm\\t to\\t2:30pm,Thursday,Teacher Assistant;2:00pm\\t to\\t2:30pm,Friday,Ryan Burgert;2:30pm\\t to\\t3:00pm,Monday,Teacher Assistant;2:30pm\\t to\\t3:00pm,Tuesday,Ryan Burgert;2:30pm\\t to\\t3:00pm,Tuesday,Teacher Assistant;2:30pm\\t to\\t3:00pm,Thursday,Teacher Assistant;2:30pm\\t to\\t3:00pm,Friday,Ryan Burgert;3:00pm\\t to\\t3:30pm,Monday,Ryan Burgert;3:00pm\\t to\\t3:30pm,Monday,Teacher Assistant;3:00pm\\t to\\t3:30pm,Tuesday,Teacher Assistant;3:00pm\\t to\\t3:30pm,Thursday,Teacher Assistant;3:00pm\\t to\\t3:30pm,Friday,Ryan Burgert;3:00pm\\t to\\t3:30pm,Friday,Teacher Assistant;3:30pm\\t to\\t4:00pm,Monday,Ryan Burgert;3:30pm\\t to\\t4:00pm,Monday,Teacher Assistant;3:30pm\\t to\\t4:00pm,Wednesday,Ryan Burgert;3:30pm\\t to\\t4:00pm,Thursday,Teacher Assistant;3:30pm\\t to\\t4:00pm,Friday,Ryan Burgert;4:00pm\\t to\\t4:30pm,Monday,Ryan Burgert;4:00pm\\t to\\t4:30pm,Monday,Teacher Assistant;4:00pm\\t to\\t4:30pm,Wednesday,Ryan Burgert;4:30pm\\t to\\t5:00pm,Monday,Ryan Burgert;4:30pm\\t to\\t5:00pm,Monday,Teacher Assistant;4:30pm\\t to\\t5:00pm,Wednesday,Ryan Burgert;4:30pm\\t to\\t5:00pm,Friday,Teacher Assistant;5:00pm\\t to\\t5:30pm,Monday,Ryan Burgert;5:00pm\\t to\\t5:30pm,Wednesday,Ryan Burgert;5:00pm\\t to\\t5:30pm,Friday,Teacher Assistant;5:30pm\\t to\\t6:00pm,Monday,Teacher Assistant;5:30pm\\t to\\t6:00pm,Wednesday,Ryan Burgert;6:00pm\\t to\\t6:30pm,Monday,Teacher Assistant;6:30pm\\t to\\t7:00pm,Monday,Teacher Assistant\",\n"+
                                                 "    \"ProjectData\": {\n"+
                                                 "        \"TeamsTable\": \"Shank,shunk,up,down;left,far,bottom,top;listen,boy,youre,done\",\n"+
                                                 "        \"StudentsTable\": \"Student,Alien,American,Pie\"\n"+
                                                 "    }\n"+
                                                 "}\n";
    public void initialize()
    {
        super.initialize();
        io.loader.setAppState(hardcodedSettings);//This is simply a faster way of hard-coding the controls. It's identically equivalent to spamming all the setter methods in here.
        io.saver.saveAppStateToFile("SiteSaveTest.json");
    }
    @SuppressWarnings("Duplicates")
    public void start(Stage primaryStage)
    {
        initialize();
        stage=primaryStage;
        io.saver.saveAppStateToFile(new File(io.propertyGetter.getNewFilePath()).getPath());
        stage.setTitle(io.propertyGetter.getAppTitle());
        stage.getIcons().add(io.styleGetter.getAppIcon());
        stage.setScene(new Scene(gui.window.boilerplate));
        stage.setOnCloseRequest(e->gui.toolbar.actions.handleExit());
        stage.setMinHeight(io.propertyGetter.getMinAppHeight());//Unlike McKenna's demo
        stage.setMinWidth(io.propertyGetter.getMinAppWidth());//Unlike McKenna's demo
        stage.show();
    }
}
