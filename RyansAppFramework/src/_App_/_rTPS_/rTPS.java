package _App_._rTPS_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Toolbar_._Actions_.Actions;
import _App_._GUI_._Window_.Window;
import _Externals_.UndoRedoCoordinator;
import _Externals_.r;
import _Externals_._Components_.rTextField;
import javafx.scene.control.Tab;

import java.util.function.Supplier;
public class rTPS extends UndoRedoCoordinator
{
    public App app;
    public rTPS(App app)//Ryan's Transaction Processing System
    {
        this.app=app;
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        refreshLastAppState();
        r.fxRunAsNewThreadTimer(app.io.propertyGetter.getAutotransactionsPerSecond(),this::tryToAutotransact);//AUTOTRANSACTOR: Set A timer to keep running refreshlastappstate on a new thread
    }
    private void refreshLastAppState()
    {
        lastState=app.io.saver.getAppState();
    }
    //region Auto-Transactor
    //Note that any manual transactions can be integrated with the autotransactor at ease; it takes care of the conflicts automatically
    //Is a thread that runs on a timer and automatically saves any changes as a transaction, detected by a change in App state.
    private String lastState;
    public void tryToAutotransact()//Only does something if there are changes to App State
    {
        /*@formatter:off*/
        if(rTextField.thereExistsATextfieldInFocusRightNow)return;//Don't autotransact in the middle of somebody typing a sentence. That's annoying.
        final String New=app.io.saver.getAppState();//Just in case this takes a while I don't want the thread to cause glitchy problems
        if(New.equals(lastState))return;//By definition; NOT just to avoid null errors! Being null is information here: it means we might have changed the state by redoing or undoing something.
        /*@formatter:on*/
        final String Old=lastState+"";//Want a new ID
        DoWithoutRedo(()->app.io.loader.setAppState(New,false),()->app.io.loader.setAppState(Old,false));
        refreshLastAppState();
    }
    //endregion
    private interface F
    {
        void f(Runnable x,Runnable y);
    }
    private void DoHelper(F f,Runnable Do,Runnable Undo)
    {
        app.io.misc.playDoSound();
        Window window=app.gui.window;
        final Tab currentTab=window.reader.getCurrentTab();//We go back here when we undo/redo etc.
        Runnable setTab=()->window.actions.setCurrentTab(currentTab);
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
        refresh();
    }
    private void refresh()
    {
        refreshToolbarButtons();
        refreshLastAppState();
    }
    public void refreshToolbarButtons()
    {
        Actions actions=app.gui.toolbar.actions;
        /*@formatter:off*/
        if(canUndo())actions.enableUndoButton();
        else actions.disableUndoButton();
        if(canRedo())actions.enableRedoButton();
        else actions.disableRedoButton();
        /*@formatter:on*/
        actions.enableSaveButton();//All changes allow this to be enabled
    }
    private boolean UndoRedoHelper(Supplier<Boolean> r)
    {
        try
        {
            return r.get();
        }
        finally
        {
            refresh();
        }
    }
    public boolean Undo()
    {
        return UndoRedoHelper(super::Undo);
    }
    public boolean Redo()
    {
        lastState=null;
        return UndoRedoHelper(super::Redo);
    }
}