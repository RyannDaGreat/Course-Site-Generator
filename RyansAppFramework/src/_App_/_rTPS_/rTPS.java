package _App_._rTPS_;//Created by Ryan on 4/10/17.
import _App_.App;
import _Externals_.UndoRedoCoordinator;
import _Externals_.r;
public class rTPS extends UndoRedoCoordinator
{
    public App app;
    public rTPS(App app)//Ryan's Transaction Processing System
    {
        this.app=app;
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {

    }
    // public void dо(Runnable redo) //TODO Finish this method once IO is complete
    public void Do(Runnable Do,Runnable Undo)
    {
        super.Do(Do,Undo);
        app.gui.toolbar.actions.disableRedoButton();
        app.gui.toolbar.actions.enableUndoButton();
    }
    public void refreshUndoRedoButtons()
    {
        if(canUndo())
            app.gui.toolbar.actions.enableUndoButton();
        else
            app.gui.toolbar.actions.disableUndoButton();
        if(canRedo())
            app.gui.toolbar.actions.enableRedoButton();
        else
            app.gui.toolbar.actions.disableRedoButton();
    }
    public boolean Undo()
    {
        try
        {
            return super.Undo();
        }
        finally
        {
            refreshUndoRedoButtons();
        }
    }
    public boolean Redo()
    {
        try
        {
            return super.Redo();
        }
        finally
        {
            refreshUndoRedoButtons();
        }
    }
}
