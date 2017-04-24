package _Experiments_._Testbed_;//Created by Ryan on 4/24/17.
import _App_.App;
import _Externals_.r;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
public class TestSave extends App
{
    final String desiredAppState="{\n"+
                                 "    \"RecitationData\": \"A5,22342B,234C,D234,E,234F;32A62,B5652,34C4,D3453431,E12325,6F341\",\n"+
                                 "    \"CourseDetails\": {\n"+
                                 "        \"SitePagesState\": \"true,A,B,AOIJ;true,C,D,AOIJS;false,E,F,aoisf;true,G,H,aiohf\",\n"+
                                 "        \"Semester\": \"Super-Senior Only\",\n"+
                                 "        \"ExportDir\": \"Hell\",\n"+
                                 "        \"BannerImage\": \"file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png\",\n"+
                                 "        \"Title\": \"Marry Poppins Pie\",\n"+
                                 "        \"Subject\": \"Astrology\",\n"+
                                 "        \"Stylesheet\": \"null\",\n"+
                                 "        \"TemplateDir\": \".\\\\templates\\\\CSE219\",\n"+
                                 "        \"InstructorHome\": \"The Kinky Sex Club\",\n"+
                                 "        \"Number\": \"3.14159\",\n"+
                                 "        \"Year\": \"Year Of the Donkeycorn\",\n"+
                                 "        \"InstructorName\": \"Severous Snape\",\n"+
                                 "        \"LeftFooterImage\": \"file:/Users/Ryan/Desktop/RyanCourseSiteGenerator/out/production/RyansAppFramework/_Externals_/_Resources_/_Images_/bannerimmage.png\",\n"+
                                 "        \"RightFooterImage\": \"file:/Users/Ryan/Desktop/Screen Shot 2017-04-23 at 1.26.44 AM.png\"\n"+
                                 "        \"Stylesheet\": \"yeah this is a stylesheet wowza\"\n"+
                                 "    },\n"+
                                 "    \"ScheduleData\": {\n"+
                                 "        \"EndingFriday\": \"2017-04-18\",\n"+
                                 "        \"StartingMonday\": \"2017-04-05\",\n"+
                                 "        \"TableState\": \"aAF,bDF,Vc,dRY,bQ,cX,Ud;Ye,fX,Gg,Wh,bR,cV,dX;EiQ,jC,Tk,WlE,bY,EcY,EdT\"\n"+
                                 "    },\n"+
                                 "    \"TAData\": \"true,A,B;false,C,D;true,E,F;false,G,H;false,Ryan Burgert,aoihfaoihoihef@sdpofuih.iuwhe\\n3:30am\\t to\\t4:00am,4:00am\\t to\\t4:30am,4:30am\\t to\\t5:00am,5:00am\\t to\\t5:30am,5:30am\\t to\\t6:00am,6:00am\\t to\\t6:30am,6:30am\\t to\\t7:00am,7:00am\\t to\\t7:30am;Monday,Tuesday,Wednesday,Thursday,Friday;3:30am\\t to\\t4:00am,Monday,Ryan Burgert;3:30am\\t to\\t4:00am,Tuesday,C;3:30am\\t to\\t4:00am,Wednesday,C;3:30am\\t to\\t4:00am,Friday,Ryan Burgert;4:00am\\t to\\t4:30am,Monday,Ryan Burgert;4:00am\\t to\\t4:30am,Wednesday,Ryan Burgert;4:00am\\t to\\t4:30am,Thursday,Ryan Burgert;4:30am\\t to\\t5:00am,Monday,G;4:30am\\t to\\t5:00am,Tuesday,Ryan Burgert;4:30am\\t to\\t5:00am,Wednesday,Ryan Burgert;5:00am\\t to\\t5:30am,Tuesday,G;5:00am\\t to\\t5:30am,Wednesday,G;5:00am\\t to\\t5:30am,Thursday,Ryan Burgert;5:00am\\t to\\t5:30am,Friday,Ryan Burgert;5:30am\\t to\\t6:00am,Monday,Ryan Burgert;5:30am\\t to\\t6:00am,Wednesday,Ryan Burgert;5:30am\\t to\\t6:00am,Friday,Ryan Burgert;6:00am\\t to\\t6:30am,Monday,Ryan Burgert;6:00am\\t to\\t6:30am,Wednesday,Ryan Burgert;6:00am\\t to\\t6:30am,Thursday,Ryan Burgert;6:30am\\t to\\t7:00am,Tuesday,Ryan Burgert;7:00am\\t to\\t7:30am,Thursday,Ryan Burgert\",\n"+
                                 "    \"ProjectData\": {\n"+
                                 "        \"TeamsTable\": \"awero,bA234,c234,d657;e275,f15,g458,h245;i57,j26,k586,24l\",\n"+
                                 "        \"StudentsTable\": \"asdofoih,basdof,casdoijfo,dasdfoij;esoidfj,fweroij,gewir,hweorij;werkji,jwerj,kwerkj,lwerj\"\n"+
                                 "    }\n"+
                                 "}";
    public void initialize()
    {
        super.initialize();
        io.loader.setAppState(desiredAppState);//This is simply a faster way of hard-coding the controls. It's identically equivalent to spamming all the setter methods in here.
        io.saver.saveAppStateToFile("SiteSaveTest.json");
    }
    //region App Wrapper: Ignore this code. It's duplicated, and is only for a nichy test for my homework.
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
    public static void main(String[] ⵁ)
    {
        launch();
    }
    //endregion
}
