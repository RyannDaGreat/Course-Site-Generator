package _App_._GUI_._Modes_._CourseDetails_._Actions_;
import _App_.App;
import _App_._GUI_._Modes_._CourseDetails_._Boilerplate_.Boilerplate;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.LocatedImage;
import _Externals_.r;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.File;
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
    public void handleChangeExportDir()
    {
        File f=app.gui.dialogs.openDirectory();
        if(f!=null)//User didn't select cancel
        {
            //noinspection AccessStaticViaInstance
            setExportDir(app.io.misc.fileToString(f));
        }
    }
    //region Setters
    /*@formatter:off*/
    public void setSubject(String x){r.setComboboxOption(boilerplate.getCiSubject_comboBox(),x);}
    public void setTitle(String x){boilerplate.getCiTitle_textField().setText(x);}
    public void setInstructorName(String x){boilerplate.getCiInstructorName_textField().setText(x);}
    public void setInstructorHome(String x){boilerplate.getCiInstructorHome_textField().setText(x);}
    public void setSemester(String x){r.setComboboxOption(boilerplate.getCiSemester_comboBox(),x);}
    public void setNumber(String x){r.setComboboxOption(boilerplate.getCiNumber_comboBox(),x);}
    public void setYear(String x){r.setComboboxOption(boilerplate.getCiYear_comboBox(),x);}
    public void setExportDir(String x){boilerplate.getCiExportDir_text().setText(x);}
    public void setTemplateDir(String x){boilerplate.getStTemplateDir_text().setText(x);}
    public void setBannerImagePath(String x){boilerplate.getPsBanner_imageView().setImage(new LocatedImage(x));}
    public void setLeftFooterImagePath(String x){boilerplate.getPsLeft_imageView().setImage(new LocatedImage(x));}
    public void setRightFooterImagePath(String x){boilerplate.getPsRight_imageView().setImage(new LocatedImage(x));}
    /*@formatter:on*/
    //endregion
    public void setState(JSONObject state)
    {
        try
        {
            setSubject(state.get(propertyGetter.getStateKeyCdSubject()).toString());
            setTitle(state.get(propertyGetter.getStateKeyCdTitle()).toString());
            setInstructorName(state.get(propertyGetter.getStateKeyCdInstructorName()).toString());
            setInstructorHome(state.get(propertyGetter.getStateKeyCdInstructorHome()).toString());
            setSemester(state.get(propertyGetter.getStateKeyCdSemester()).toString());
            setNumber(state.get(propertyGetter.getStateKeyCdNumber()).toString());
            setYear(state.get(propertyGetter.getStateKeyCdYear()).toString());
            setExportDir(state.get(propertyGetter.getStateKeyCdExportDir()).toString());
            setTemplateDir(state.get(propertyGetter.getStateKeyCdTemplateDir()).toString());
            setBannerImagePath(state.get(propertyGetter.getStateKeyCdBannerImage()).toString());
            setLeftFooterImagePath(state.get(propertyGetter.getStateKeyCdLeftFooterImage()).toString());
            setRightFooterImagePath(state.get(propertyGetter.getStateKeyCdRightFooterImage()).toString());
        }
        catch(JSONException e)
        {
            e.printStackTrace();
        }
    }
}
