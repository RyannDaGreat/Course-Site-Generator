package _App_._GUI_._Toolbar_._Actions_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Toolbar_._Boilerplate_.Boilerplate;
import _App_._GUI_._Toolbar_._Reader_.Reader;
import _Externals_.r;

import java.io.File;
public class Actions
{
    public App app;
    public Actions(App app)
    {
        this.app=app;
    }
    private Boilerplate boilerplate;
    private Reader reader;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        reader=app.gui.toolbar.reader;
        boilerplate=app.gui.toolbar.boilerplate;
        disableSaveButton();
        disableRedoButton();
        disableUndoButton();
    }
    //region enable/disable save button
    public void enableSaveButton()
    {
        boilerplate.getSaveButton().setDisable(false);
    }
    public void disableSaveButton()
    {
        boilerplate.getSaveButton().setDisable(true);
    }
    public void enableUndoButton()
    {
        boilerplate.getUndoButton().setDisable(false);
    }
    public void disableUndoButton()
    {
        boilerplate.getUndoButton().setDisable(true);
    }
    public void enableRedoButton()
    {
        boilerplate.getRedoButton().setDisable(false);
    }
    public void disableRedoButton()
    {
        boilerplate.getRedoButton().setDisable(true);
    }
    //endregion
    //region Button Handlers
    public void handleNew()
    {
        app.io.misc.playLoadSound();
        if(app.gui.dialogs.confirmSave())
        {
            app.io.loader.handleNew();
        }
    }
    public void handleOpen()
    {
        app.io.misc.playLoadSound();
        if(app.gui.dialogs.confirmSave())
        {
            File f=app.gui.dialogs.openFile();
            // r.say("open file");
            //noinspection StatementWithEmptyBody
            if(f!=null)
            {
                app.io.loader.loadAppStateFromFile(f);
            }
            else
            {
                //User cancelled
            }
        }
    }
    public void handleSave()
    {
        /*@formatter:off*/
        if(app.io.saver.isCurrentlyNewFile())
            handleSaveAs();
        else
           app.io.saver.saveAppStateToFile(app.io.saver.getCurrentFilePath());
        // r.say("successfully Saved current file");
        app.io.misc.playSaveSound();
        /*@formatter:on*/
    }
    public void handleSaveAs()
    {
        app.io.misc.playSaveSound();
        File file=app.gui.dialogs.saveFile();
        //noinspection StatementWithEmptyBody
        if(file!=null)
        {
            app.io.saver.saveAppStateToFile(file.getAbsolutePath());
        }
        else
        {
            //User cancelled
        }
    }
    public void handleExport()
    {
        app.io.exporter.export();
        app.io.misc.playSaveSound();
    }
    public void handleExit()
    {
        if(app.gui.dialogs.confirmSave())
        {
            r.say("Exiting App");
            //region Fade out then close stage
            double fadeOutDurationInSeconds=1.5;//UserInput++
            double now=r.seconds();
            r.fxRunAsNewThreadRepeatedly(60,()->//at 60fps
            {
                double v=now-r.seconds()+fadeOutDurationInSeconds;
                if(v>0)
                {
                    app.stage.setOpacity(Math.pow(v/fadeOutDurationInSeconds,2));//Parabolic so its smooth
                }
                else
                {
                    app.stage.close();
                }
            });
            //endregion
        }
    }
    public void handleUndo()
    {
        if(reader.undoButtonIsEnabled())//This check is here because we might also call this method via keyboard shortcur
        {
            app.rtps.Undo();
            app.io.misc.playUndoRedoSound();
        }
    }
    public void handleRedo()
    {
        if(reader.redoButtonIsEnabled())//This check is here because we might also call this method via keyboard shortcur
        {
            app.rtps.Redo();
            app.io.misc.playUndoRedoSound();
        }
    }
    public void handleInfo()
    {
        app.gui.window.boilerplate.updateAppHue();
    }
    //endregion
}
