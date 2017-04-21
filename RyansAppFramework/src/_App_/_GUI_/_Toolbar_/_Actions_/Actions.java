package _App_._GUI_._Toolbar_._Actions_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Toolbar_._Boilerplate_.Boilerplate;
import _Externals_.r;
public class Actions
{
    public App app;
    public Actions(App app)
    {
        this.app=app;
    }
    private Boilerplate boilerplate;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.toolbar.boilerplate;
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

    }
    public void handleOpen()
    {

    }
    public void handleSave()
    {

    }
    public void handleSaveAs()
    {

    }
    public void handleExport()
    {

    }
    public void handleExit()
    {
        r.say("Exiting App");
        app.stage.close();
    }
    public void handleUndo()
    {
        app.rtps.Undo();
    }
    public void handleRedo()
    {
        app.rtps.Redo();
    }
    public void handleInfo()
    {

    }
    //endregion
}
