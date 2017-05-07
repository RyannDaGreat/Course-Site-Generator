package _App_._IO_._Exporter_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Modes_._CourseDetails_._Reader_.Reader;
import _Externals_.CD_SitePagesTableView;
import _Externals_.app_specific_tools;
import _Externals_.r;
import org.json.JSONException;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
@SuppressWarnings("WeakerAccess")
public class Exporter
{
    public App app;
    public Exporter(App app)
    {
        this.app=app;
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
    }
    public void export()//This is incomplete and MUST be replaced later!
    {
        try
        {
            //region Export jsons to strings
            String teamsAndStudents=r.jsonToPrettyString(app.gui.modes.projectData.reader.getTeamsAndStudentsExport());
            String projectData=r.jsonToPrettyString(app.gui.modes.projectData.reader.getWorkExport());
            String recitationData=r.jsonToPrettyString(app.gui.modes.recitationData.reader.getExport());
            String scheduleData=r.jsonToPrettyString(app.gui.modes.scheduleData.reader.getExport());
            String officeHoursGridData=r.jsonToPrettyString(app.gui.modes.tadata.reader.getExport());
            //endregion
            //region Printout jsons in console
            r.println(r.fansi("PROJECT DATA: TEAMS AND STUDENTS:------",r.fansi_colors.magenta));
            r.println(teamsAndStudents);
            r.println(r.fansi("PROJECT DATA: WORK:------",r.fansi_colors.magenta));
            r.println(projectData);
            r.println(r.fansi("RECITATION DATA:------",r.fansi_colors.magenta));
            r.println(recitationData);
            r.println(r.fansi("SCHEDULE DATA:------",r.fansi_colors.magenta));
            r.println(scheduleData);
            r.println(r.fansi("OfficeHoursGridData:------",r.fansi_colors.magenta));
            r.println(officeHoursGridData);
            //endregion
            //region Setup file paths
            String exportDirPath=app.gui.modes.courseDetails.reader.getExportDir();
            File exportDir=new File(exportDirPath);
            String templateDirPath=app.gui.modes.courseDetails.reader.getTemplateDir();
            File templateDir=new File(templateDirPath);
            r.copyPasteDirectory(templateDir,exportDir);
            File[] exportedHTMLFiles=exportDir.listFiles();
            CD_SitePagesTableView t=app.gui.modes.courseDetails.boilerplate.getStSitePages_tableView();
            //endregion
            //region Copy/Paste the banner/footers into the image directory
            String imageDirPath=exportDirPath+"/images";
            File imageDir=new File(imageDirPath);
            File leftFooterImage=r.stringToFile(app.gui.modes.courseDetails.reader.getLeftFooterImagePath());
            File rightFooterImage=r.stringToFile(app.gui.modes.courseDetails.reader.getRightFooterImagePath());
            File bannerImage=r.stringToFile(app.gui.modes.courseDetails.reader.getBannerImagePath());
            r.copyPasteFile(leftFooterImage,imageDir);
            r.copyPasteFile(rightFooterImage,imageDir);
            r.copyPasteFile(bannerImage,imageDir);
            String leftFooterImageName=leftFooterImage.getName();
            String rightFooterImageName=rightFooterImage.getName();
            String bannerImageName=bannerImage.getName();
            //endregion
            //region Handle the HTML Files
            //region Delete Unused HTML Files
            ArrayList<CD_SitePagesTableView.page> usedPages=t.getUsedPages();
            String[] usedHtmlFileNames=new String[usedPages.size()];
            for(int i=0;i<usedHtmlFileNames.length;i++)
            {
                usedHtmlFileNames[i]=usedPages.get(i).fileNameProperty().getValue();
            }
            r.println("USED HTML:"+Arrays.toString(usedHtmlFileNames));
            if(exportedHTMLFiles!=null)
            {
                for(File exportedHTMLFile : exportedHTMLFiles)
                {
                    if(!r.contains(exportedHTMLFile.getName(),usedHtmlFileNames))
                    {
                        exportedHTMLFile.delete();
                    }
                }
            }
            //endregion
            exportedHTMLFiles=exportDir.listFiles();//Refresh the list now
            for(File f : exportedHTMLFiles)
            {
                if(f.getName().toLowerCase().endsWith(".html"))
                {
                    r.modifyFileText(f,x->
                    {
                        //region Update the navbar titles to reflect the selected webpages.
                        String index=Pattern.quote("<a class=\"nav\" href=\"index.html\" id=\"home_link\">Home</a>");//NOTE THAT THESE MUST BE IDENTICAL IN THE HTML FILE OR SHIT WONT WORK!! I KNOW ITS FINICKY BUT I CANT SPEND MORE TIME ON THIS
                        String syllabus=Pattern.quote("<a class=\"nav\" href=\"syllabus.html\" id=\"syllabus_link\">Syllabus</a>");//NOTE THAT THESE MUST BE IDENTICAL IN THE HTML FILE OR SHIT WONT WORK!! I KNOW ITS FINICKY BUT I CANT SPEND MORE TIME ON THIS
                        String schedule=Pattern.quote("<a class=\"nav\" href=\"schedule.html\" id=\"schedule_link\">Schedule</a>");//NOTE THAT THESE MUST BE IDENTICAL IN THE HTML FILE OR SHIT WONT WORK!! I KNOW ITS FINICKY BUT I CANT SPEND MORE TIME ON THIS
                        String hws=Pattern.quote("<a class=\"nav\" href=\"hws.html\" id=\"hws_link\">HWs</a>");//NOTE THAT THESE MUST BE IDENTICAL IN THE HTML FILE OR SHIT WONT WORK!! I KNOW ITS FINICKY BUT I CANT SPEND MORE TIME ON THIS
                        String projects=Pattern.quote("<a class=\"nav\" href=\"projects.html\" id=\"projects_link\">Projects</a>");//NOTE THAT THESE MUST BE IDENTICAL IN THE HTML FILE OR SHIT WONT WORK!! I KNOW ITS FINICKY BUT I CANT SPEND MORE TIME ON THIS
                    /*@formatter:off*/
                    if(!r.contains("index.html",usedHtmlFileNames))
                        x=x.replaceAll(index,"");
                    if(!r.contains("syllabus.html",usedHtmlFileNames))
                        x=x.replaceAll(syllabus,"");
                    if(!r.contains("schedule.html",usedHtmlFileNames))
                        x=x.replaceAll(schedule,"");
                    if(!r.contains("hws.html",usedHtmlFileNames))
                        x=x.replaceAll(hws,"");
                    if(!r.contains("projects.html",usedHtmlFileNames))
                        x=x.replaceAll(projects,"");
                    /*@formatter:on*/
                        //endregion
                        //region Set the class acronym, year, number and semester
                        Reader reader=app.gui.modes.courseDetails.reader;
                        x=r.replaceAll(x,"CSE",reader.getSubject());
                        //
                        x=r.replaceAll(x,"219",reader.getNumber());
                        x=r.replaceAll(x,"308",reader.getNumber());
                        //
                        x=r.replaceAll(x,"2016",reader.getYear());
                        x=r.replaceAll(x,"2017",reader.getYear());
                        //
                        x=r.replaceAll(x,"Fall",reader.getSemester());
                        x=r.replaceAll(x,"Spring",reader.getSemester());
                        //
                        x=r.replaceAll(x,"Software Engineering",reader.getTitle());
                        x=r.replaceAll(x,"SOMETHING FOR TITLE!",reader.getTitle());
                        //
                        x=r.replaceAll(x,"TESTAAAA",reader.getInstructorName());
                        x=r.replaceAll(x,"Richard McKenna",reader.getInstructorName());
                        //
                        x=r.replaceAll(x,"http://www.cs.stonybrook.edu/~richard",reader.getInstructorHome());
                        x=r.replaceAll(x,"SOME VALUE",reader.getInstructorHome());
                        //
                        x=r.replaceAll(x,"sea_wolf.css",reader.getStylesheet());
                        //
                        x=r.replaceAll(x,"CSLogo.png",rightFooterImageName);
                        //
                        x=r.replaceAll(x,"SBUWhiteShieldLogo.jpg",leftFooterImageName);
                        //
                        x=r.replaceAll(x,"SBUDarkRedShieldLogo.png",bannerImageName);
                        //
                        return x;
                    });
                }
            }
            //endregion
            //region Write the JSON data into the /js directory
            String jsDirPath=exportDirPath+"/js";
            File jsDir=new File(jsDirPath);
            r.WriteFileIgnoreExceptions(jsDirPath+"/"+"OfficeHoursGridData.json",officeHoursGridData);
            r.WriteFileIgnoreExceptions(jsDirPath+"/"+"ProjectsData.json",projectData);
            r.WriteFileIgnoreExceptions(jsDirPath+"/"+"RecitationsData.json",recitationData);
            r.WriteFileIgnoreExceptions(jsDirPath+"/"+"ScheduleData.json",scheduleData);
            r.WriteFileIgnoreExceptions(jsDirPath+"/"+"TeamsAndStudents.json",teamsAndStudents);
            //endregion
        }
        catch(JSONException ignored)
        {
            ignored.printStackTrace();
        }
    }
}