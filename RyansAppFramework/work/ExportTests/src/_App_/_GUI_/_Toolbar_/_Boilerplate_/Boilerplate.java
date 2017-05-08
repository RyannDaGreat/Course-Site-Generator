package _App_._GUI_._Toolbar_._Boilerplate_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Toolbar_._Actions_.Actions;
import javafx.scene.control.Button;
@SuppressWarnings("WeakerAccess")
public class Boilerplate extends javafx.scene.control.ToolBar
{
    public App app;
    public Boilerplate(App app)
    {
        this.app=app;
    }
    private _App_._GUI_._Window_._Boilerplate_.Boilerplate megaplate;
    private Actions actions;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        actions=app.gui.toolbar.actions;
        megaplate=app.gui.window.boilerplate;
        getNewButton().setOnAction(ⵁ->actions.handleNew());
        getOpenButton().setOnAction(ⵁ->actions.handleOpen());
        getSaveButton().setOnAction(ⵁ->actions.handleSave());
        getSaveAsButton().setOnAction(ⵁ->actions.handleSaveAs());
        getExportButton().setOnAction(ⵁ->actions.handleExport());
        getExitButton().setOnAction(ⵁ->actions.handleExit());
        getUndoButton().setOnAction(ⵁ->actions.handleUndo());
        getRedoButton().setOnAction(ⵁ->actions.handleRedo());
        getInfoButton().setOnAction(ⵁ->actions.handleInfo());
    }
    //region Getters   ([\n][ ]*[{][\n][ ]*)(.*)([\n][ ]*[}])   ⟹  {$2}
    /*@formatter:off*/
    public Button getNewButton(){return megaplate.new_button;}
    public Button getOpenButton(){return megaplate.open_button0;}
    public Button getSaveButton(){return megaplate.save_button1;}
    public Button getSaveAsButton(){return megaplate.saveas_button2;}
    public Button getExportButton(){return megaplate.export_button3;}
    public Button getExitButton(){return megaplate.power_button4;}
    public Button getUndoButton(){return megaplate.undo_button5;}
    public Button getRedoButton(){return megaplate.redo_button6;}
    public Button getInfoButton(){return megaplate.book_button7;}
    /*@formatter:on*/
    //endregion
}