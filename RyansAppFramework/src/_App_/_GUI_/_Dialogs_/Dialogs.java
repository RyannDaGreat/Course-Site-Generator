package _App_._GUI_._Dialogs_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.r;

import java.io.File;
@SuppressWarnings("WeakerAccess")
public class Dialogs
{
    public App app;
    private PropertyGetter propertyGetter;
    public Dialogs(App app)
    {
        this.app=app;
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        propertyGetter=app.io.propertyGetter;
    }
    public File openFile()//Returns null if cancelled
    {
        return r.fxOpenFile(app.stage,app.io.misc.getCurrentDirectory());
    }
    public File saveFile()
    {
        return r.fxSaveFile(app.stage,app.io.misc.getCurrentDirectory());
    }
    public File openDirectory()//Returns null if cancelled
    {
        return r.fxOpenDirectory(app.io.misc.getCurrentDirectory(),app.stage);
    }
    public boolean confirmChangeTATimesDeleteOfficehours()
    {
        return r.fxYesNo(app.io.propertyGetter.getConfirmChangeTATimesDeleteOfficehoursMessage());
    }
    public boolean confirmSave()//Return true if they don't want to save OR they do want to save and select a valid path to save to (without clicking 'cancel'
    {
        if(app.gui.toolbar.reader.saveButtonIsDisabled()||!r.fxYesNo(app.io.propertyGetter.getConfirmSaveMessage()))
        {
            return true;//Don't bother to confirm saving; out file has clearly been saved already.  OR   If they don't want to save
        }
        app.gui.toolbar.actions.handleSave();
        return app.gui.toolbar.reader.saveButtonIsDisabled();//That means they saved the file. If its enabled it means they must have clicked cancel.
    }
    public void showErrorAlert(String x)
    {
        app.io.misc.playErrorSound();
        r.fxShowErrorAlert(x);
    }
    public void showInfoAlert(String x)
    {
        r.fxShowInfoAlert(x);
    }
    public void showFailedToLoadFileErrorDialog()
    {
        showErrorAlert(propertyGetter.getFailedToLoadFileMessage());
    }
    public void showSaveErrorDialog()
    {
        showErrorAlert(propertyGetter.getSaveErrorMessage());
    }
    public void showImageLoadErrorDialog()
    {
        showErrorAlert(propertyGetter.getImageLoadErrorMessage());
    }
    public void showDirLoadErrorDialog()
    {
        showErrorAlert(propertyGetter.getDirLoadErrorMessage());
    }
    public void showCannotDeleteTaAlert()
    {
        showInfoAlert(propertyGetter.getCannot_delete_ta());
    }
}
