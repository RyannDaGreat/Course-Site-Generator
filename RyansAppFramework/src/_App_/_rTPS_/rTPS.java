package _App_._rTPS_;//Created by Ryan on 4/10/17.
import _App_.App;
import _Externals_.UndoRedoCoordinator;
import _Externals_.r;
import _Externals_.rTextField;
import javafx.scene.control.Tab;
public class rTPS extends UndoRedoCoordinator
{
    public App app;
    public rTPS(App app)//Ryan's Transaction Processing System
    {
        this.app=app;
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        lastState=app.io.saver.getAppState();
        r.fxRunAsNewThreadRepeatedly(app.io.propertyGetter.getAutotransactionsPerSecond(),this::tryToAutotransact);//AUTOTRANSACTOR: Set A timer to keep running refreshlastappstate on a new thread
    }
    //region Auto-Transactor
    //Note that any manual transactions can be integrated with the autotransactor at ease; it takes care of the conflicts automatically
    //Is a thread that runs on a timer and automatically saves any changes as a transaction, detected by a change in App state.
    private String lastState;
    private void refreshLastAppState()
    {
        lastState=app.io.saver.getAppState();
    }
    public void tryToAutotransact()//Only does something if there are changes to App State
    {
        if(rTextField.thereExistsATextfieldInFocusRightNow)//Don't autotransact in the middle of somebody typing a sentence. That's annoying.
        {
            return;
        }
        final String New=app.io.saver.getAppState();//Just in case this takes a while I don't want the thread to cause glitchy problems
        if(lastState.equals(New))
        {
            return;//By definition; NOT just to avoid null errors! Being null is information here: it means we might have changed the state by redoing or undoing something.
        }
        final String Old=lastState+"";//Want a new ID
        DoWithoutRedo(()->app.io.loader.setAppState(New),()->app.io.loader.setAppState(Old));
        refreshLastAppState();
    }
    //endregion
    interface F
    {
        void f(Runnable x,Runnable y);
    }
    public void DoHelper(F f,Runnable Do,Runnable Undo)
    {
        app.io.misc.playDoSound();
        final Tab currentTab=app.gui.window.reader.getCurrentTab();//We go back here when we undo/redo etc.
        Runnable setTab=()->app.gui.window.actions.setCurrentTab(currentTab);
        f.f(r.seq(Do,setTab),r.seq(Undo,setTab));
        refreshToolbarButtons();
    }
    public void Do(Runnable Do,Runnable Undo)
    {
        DoHelper(super::Do,Do,Undo);
    }
    public void DoWithoutRedo(Runnable Do,Runnable Undo)
    {
        DoHelper(super::DoWithoutRedo,Do,Undo);
    }
    public void clearHistory()
    {
        super.clearHistory();
        refreshToolbarButtons();
        refreshLastAppState();
    }
    public void refreshToolbarButtons()
    {
        if(canUndo())
        {
            app.gui.toolbar.actions.enableUndoButton();
        }
        else
        {
            app.gui.toolbar.actions.disableUndoButton();
        }
        if(canRedo())
        {
            app.gui.toolbar.actions.enableRedoButton();
        }
        else
        {
            app.gui.toolbar.actions.disableRedoButton();
        }
        app.gui.toolbar.actions.enableSaveButton();//All changes allow this to be enabled
    }
    public boolean Undo()
    {
        try
        {
            return super.Undo();
        }
        finally
        {
            refreshToolbarButtons();
            refreshLastAppState();
        }
    }
    public boolean Redo()
    {
        lastState=null;
        try
        {
            return super.Redo();
        }
        finally
        {
            refreshToolbarButtons();
            refreshLastAppState();
        }
    }
}
