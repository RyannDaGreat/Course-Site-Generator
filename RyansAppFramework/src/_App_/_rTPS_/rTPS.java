package _App_._rTPS_;//Created by Ryan on 4/10/17.
import _App_.App;
import _Externals_.UndoRedoCoordinator;
import _Externals_.rTextField;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;
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
        //region AUTOTRANSACTOR: Set A timer to keep running refreshlastappstate on a new thread
//⁠⁠⁠⁠⁠                                    ⎧                                                                                                                ⎫
//⁠⁠⁠⁠⁠                                    ⎪            ⎧                                                                                                  ⎫⎪
//⁠⁠⁠⁠⁠                                    ⎪            ⎪               ⎧                                                          ⎫                       ⎪⎪
//⁠⁠⁠⁠⁠                                    ⎪            ⎪               ⎪                                                        ⎧⎫⎪                     ⎧⎫⎪⎪
        Timeline timeline=new Timeline(new KeyFrame(Duration.millis(app.io.propertyGetter.getAutotransactionIntervalInMillis()),x->tryToAutotransact()));
//⁠⁠⁠⁠⁠                                    ⎪            ⎪               ⎪                                                        ⎩⎭⎪                     ⎩⎭⎪⎪
//⁠⁠⁠⁠⁠                                    ⎪            ⎪               ⎩                                                          ⎭                       ⎪⎪
//⁠⁠⁠⁠⁠                                    ⎪            ⎩                                                                                                  ⎭⎪
//⁠⁠⁠⁠⁠                                    ⎩                                                                                                                ⎭
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
        //endregion
    }
    //region Auto-Transactor
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
    // public void dо(Runnable redo) //TODO Finish this method once IO is complete
    public void Do(Runnable Do,Runnable Undo)
    {
        app.io.misc.playDoSound();
        super.Do(Do,Undo);
        refreshToolbarButtons();
    }
    public void DoWithoutRedo(Runnable Do,Runnable Undo)
    {
        app.io.misc.playDoSound();
        super.DoWithoutRedo(Do,Undo);
        refreshToolbarButtons();
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
