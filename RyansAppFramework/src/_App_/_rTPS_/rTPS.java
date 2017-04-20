package _App_._rTPS_;//Created by Ryan on 4/10/17.
import _App_.App;
import _Externals_.UndoRedoCoordinator;
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
}
