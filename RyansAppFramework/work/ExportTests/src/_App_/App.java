package _App_;//Created by Ryan on 4/10/17.
import _App_._GUI_.GUI;
import _App_._IO_.IO;
import _App_._rTPS_.rTPS;
import _Externals_._Resources_.ResourceGetter;
import _Externals_.r;
import javafx.application.Application;
import javafx.scene.Scene;

import javafx.stage.Stage;

import java.io.File;
@SuppressWarnings("WeakerAccess")
public class App extends Application//This is the head of the tree. It's special. You can launch it.
{
    public IO io;
    public GUI gui;
    public rTPS rtps;


    public Stage stage;
    public App()
    {
        io=new IO(this);
        gui=new GUI(this);
        rtps=new rTPS(this);
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        io.initialize();
        gui.initialize();
        rtps.initialize();
    }
    public void start(Stage primaryStage)
    {
        stage=primaryStage;
        initialize();
        if(!io.loader.loadAppStateFromFile(new File(io.propertyGetter.getNewFilePath())))
        {
            io.saver.saveAppStateToFile(new File(io.propertyGetter.getNewFilePath()).getPath());
        }
        stage.setTitle(io.propertyGetter.getAppTitle());
        stage.getIcons().add(io.styleGetter.getAppIcon());
        stage.setScene(new Scene(gui.window.boilerplate));
        stage.setOnCloseRequest(e->gui.toolbar.actions.handleExit());
        stage.setMinHeight(io.propertyGetter.getMinAppHeight());//Unlike McKenna's demo
        stage.setMinWidth(io.propertyGetter.getMinAppWidth());//Unlike McKenna's demo
        stage.show();
    }
    public static void main(String[] ⵁ)
    {
        r.enableTheGoodOldAssertionKeyword();
        launch();
    }
    public String getUndo_redo_sound()
    {
        return ResourceGetter.getProperty("undo_redo_sound");//Actual mechanics of loading file must be outsourced to externals to preserve the logical integrity of my blackbox.
    }
}
