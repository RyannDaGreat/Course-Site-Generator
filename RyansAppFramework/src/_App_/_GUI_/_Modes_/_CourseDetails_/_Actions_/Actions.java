package _App_._GUI_._Modes_._CourseDetails_._Actions_;
import _App_.App;
import _App_._GUI_._Modes_._CourseDetails_._Boilerplate_.Boilerplate;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.r;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;
public class Actions
{
    public App app;
    public Actions(App app)
    {
        this.app=app;
    }
    private Boilerplate boilerplate;
    private PropertyGetter propertyGetter;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        propertyGetter=app.io.propertyGetter;
        boilerplate=app.gui.modes.courseDetails.boilerplate;
    }
    private void handleChange(Consumer<String> c,Supplier<File> s,Runnable errorDialog)
    {
        try
        {
            app.io.misc.playLoadSound();
            File f=s.get();
            if(f!=null)//User didn't select cancel
            {
                c.accept(app.io.misc.fileToString(f));
            }
        }
        catch(Exception ignored)
        {
            ignored.printStackTrace();
            errorDialog.run();
        }
    }
    private void handleChangeDir(Consumer<String> c)
    {
        handleChange(c,app.gui.dialogs::openDirectory,app.gui.dialogs::showDirLoadErrorDialog);
    }
    public void handleChangeExportDir()
    {
        handleChangeDir(this::setExportDir);
    }
    public void handleChangeTemplateDir()
    {
        handleChangeDir(this::setTemplateDir);
    }
    private void handleChangeImage(Consumer<String> c)
    {
        handleChange(c,app.gui.dialogs::openFile,app.gui.dialogs::showImageLoadErrorDialog);
    }
    public void handleChangeBannerImage()
    {
        handleChangeImage(this::setBannerImagePath);
    }
    public void handleChangeLeftFooterImage()
    {
        handleChangeImage(this::setLeftFooterImagePath);
    }
    public void handleChangeRightFooterImage()
    {
        handleChangeImage(this::setRightFooterImagePath);
    }
    //region Setters
    public void setTemplateDir(String x)
    {
        System.out.println("setTemplateDir: X="+x);
        System.out.println(Arrays.toString(r.listAllPathsInDirectory(x)));
        boilerplate.getStTemplateDir_text().setText(x);
    }
    /*@formatter:off*/
    public void setSubject(String x){r.setComboboxOption(boilerplate.getCiSubject_comboBox(),x);}
    public void setTitle(String x){boilerplate.getCiTitle_textField().setText(x);}
    public void setInstructorName(String x){boilerplate.getCiInstructorName_textField().setText(x);}
    public void setInstructorHome(String x){boilerplate.getCiInstructorHome_textField().setText(x);}
    public void setSemester(String x){r.setComboboxOption(boilerplate.getCiSemester_comboBox(),x);}
    public void setNumber(String x){r.setComboboxOption(boilerplate.getCiNumber_comboBox(),x);}
    public void setYear(String x){r.setComboboxOption(boilerplate.getCiYear_comboBox(),x);}
    public void setExportDir(String x){boilerplate.getCiExportDir_text().setText(x);}
    public void setRightFooterImagePath(String pathOrUrl){r.setImageViewLocatedImage(pathOrUrl,boilerplate.getPsRight_imageView());}
    public void setLeftFooterImagePath(String pathOrUrl){r.setImageViewLocatedImage(pathOrUrl,boilerplate.getPsLeft_imageView());}
    public void setBannerImagePath(String pathOrUrl){r.setImageViewLocatedImage(pathOrUrl,boilerplate.getPsBanner_imageView());}
    public void setSitePagesState(String x){boilerplate.getStSitePages_tableView().setState(x);}
    public void setStylesheet(String x){r.setComboboxOption(boilerplate.getPsStylesheet_comboBox(),x);}
    /*@formatter:on*/
    //endregion
    public void setState(JSONObject state) throws JSONException
    {
        setSubject(state.getString(propertyGetter.getStateKeyCdSubject()));
        setTitle(state.getString(propertyGetter.getStateKeyCdTitle()));
        setInstructorName(state.getString(propertyGetter.getStateKeyCdInstructorName()));
        setInstructorHome(state.getString(propertyGetter.getStateKeyCdInstructorHome()));
        setSemester(state.getString(propertyGetter.getStateKeyCdSemester()));
        setNumber(state.getString(propertyGetter.getStateKeyCdNumber()));
        setYear(state.getString(propertyGetter.getStateKeyCdYear()));
        setExportDir(state.getString(propertyGetter.getStateKeyCdExportDir()));
        setTemplateDir(state.getString(propertyGetter.getStateKeyCdTemplateDir()));
        setBannerImagePath(state.getString(propertyGetter.getStateKeyCdBannerImage()));
        setLeftFooterImagePath(state.getString(propertyGetter.getStateKeyCdLeftFooterImage()));
        setRightFooterImagePath(state.getString(propertyGetter.getStateKeyCdRightFooterImage()));
        setSitePagesState(state.getString(propertyGetter.getStateKeyCdSitePagesState()));
        setStylesheet(state.getString(propertyGetter.getStateKeyCdStylesheet()));
    }
}
