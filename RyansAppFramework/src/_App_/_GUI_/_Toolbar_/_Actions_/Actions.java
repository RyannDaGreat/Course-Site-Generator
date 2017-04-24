package _App_._GUI_._Toolbar_._Actions_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Toolbar_._Boilerplate_.Boilerplate;
import _App_._GUI_._Toolbar_._Reader_.Reader;
import _Externals_.r;
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
        if(app.gui.dialogs.confirmSave())
        {
            app.io.loader.handleNew();
            r.say("Sucessfully loaded new file");
        }
    }
    public void handleOpen()
    {
        if(app.gui.dialogs.confirmSave())
        {
            app.io.loader.loadAppStateFromFile(app.gui.dialogs.openFile());
            r.say("Successfully opened file");
        }
    }
    public void handleSave()
    {
        /*@formatter:off*/
        if(app.io.saver.isCurrentlyNewFile())
            handleSaveAs();
        else
           app.io.saver.saveAppStateToFile(app.io.saver.getCurrentFilePath());
        r.say("successfully Saved current file");
        /*@formatter:on*/
    }
    public void handleSaveAs()
    {
        app.io.saver.saveAppStateToFile(app.gui.dialogs.saveFile().getAbsolutePath());
    }
    public void handleExport()
    {
    }
    public void handleExit()
    {
        if(app.gui.dialogs.confirmSave())
        {
            r.say("Exiting App");
            app.stage.close();
        }
    }
    public void handleUndo()
    {
        if(reader.undoButtonIsEnabled())//This check is here because we might also call this method via keyboard shortcur
        {
            app.rtps.Undo();
        }
    }
    public void handleRedo()
    {
        if(reader.redoButtonIsEnabled())//This check is here because we might also call this method via keyboard shortcur
        {
            app.rtps.Redo();
        }
    }
    public void handleInfo()
    {
    }
    //endregion
}
