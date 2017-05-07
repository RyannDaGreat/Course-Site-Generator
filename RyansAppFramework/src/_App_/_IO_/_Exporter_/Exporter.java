package _App_._IO_._Exporter_;//Created by Ryan on 4/10/17.
import _App_.App;
import _Externals_.CD_SitePagesTableView;
import _Externals_.r;
import org.json.JSONException;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
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
            r.println(r.fansi("PROJECT DATA: TEAMS AND STUDENTS:------",r.fansi_colors.magenta));
            r.println(r.jsonToPrettyString(app.gui.modes.projectData.reader.getTeamsAndStudentsExport()));
            r.println(r.fansi("PROJECT DATA: WORK:------",r.fansi_colors.magenta));
            r.println(r.jsonToPrettyString(app.gui.modes.projectData.reader.getWorkExport()));
            r.println(r.fansi("RECITATION DATA:------",r.fansi_colors.magenta));
            r.println(r.jsonToPrettyString(app.gui.modes.recitationData.reader.getExport()));
            r.println(r.fansi("SCHEDULE DATA:------",r.fansi_colors.magenta));
            r.println(r.jsonToPrettyString(app.gui.modes.scheduleData.reader.getExport()));
            r.println(r.fansi("OfficeHoursGridData:------",r.fansi_colors.magenta));
            r.println(r.jsonToPrettyString(app.gui.modes.tadata.reader.getExport()));
            //
            String exportDirPath=app.gui.modes.courseDetails.reader.getExportDir();
            File exportDir=new File(exportDirPath);
            String templateDirPath=app.gui.modes.courseDetails.reader.getTemplateDir();
            File templateDir=new File(templateDirPath);
            r.copyPasteDirectory(templateDir,exportDir);
            File[] exportedHTMLFiles=exportDir.listFiles();
            CD_SitePagesTableView t=app.gui.modes.courseDetails.boilerplate.getStSitePages_tableView();
            //
            //region Delete Unused HTML Files
            ArrayList<CD_SitePagesTableView.page> usedPages=t.getUsedPages();


            String[]usedHtmlFileNames=new String[usedPages.size()];
            for(int i=0;i<usedHtmlFileNames.length;i++)
            {
                usedHtmlFileNames[i]=usedPages.get(i).fileNameProperty().getValue();
            }
            r.println("USED HTML:"+Arrays.toString(usedHtmlFileNames));
            if(exportedHTMLFiles != null)
            {

                for(File exportedHTMLFile : exportedHTMLFiles)
                {
                    if(!r.contains(exportedHTMLFile.getName(),usedHtmlFileNames))
                        exportedHTMLFile.delete();
                }
            }
            //endregion

        }
        catch(JSONException ignored)
        {
            ignored.printStackTrace();
        }
    }
}