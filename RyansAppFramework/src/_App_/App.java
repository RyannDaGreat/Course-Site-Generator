package _App_;//Created by Ryan on 4/10/17.
import _App_._GUI_.GUI;
import _App_._IO_.IO;
import _App_._rTPS_.rTPS;
import _Externals_.r;
import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.json.JSONException;
import org.json.JSONObject;

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
        initialize();
        stage=primaryStage;
        io.saver.saveState(new File(io.propertyGetter.getNewFilePath()).getPath());
        stage.setTitle(io.propertyGetter.getAppTitle());
        stage.getIcons().add(io.styleGetter.getAppIcon());
        stage.setScene(new Scene(gui.window.boilerplate));
        stage.setOnCloseRequest(e->gui.toolbar.actions.handleExit());
        stage.setMinHeight(io.propertyGetter.getMinAppHeight());//Unlike McKenna's demo
        stage.setMinWidth(io.propertyGetter.getMinAppWidth());//Unlike McKenna's demo

        //region Get rid of me im just for a small debugging session
        // gui.window.boilerplate.setOnKeyPressed(ⵁ->
        //                                        {
        //                                            if(ⵁ.getCode()==KeyCode.C)
        //                                            {
        //                                                System.out.println(gui.modes.tadata.reader.getAppState());
        //                                                r.StringToClipboard(gui.modes.tadata.reader.getAppState());
        //                                            }
        //                                            if(ⵁ.getCode()==KeyCode.V)
        //                                            {
        //                                                System.out.println("SETTING STATE");
        //                                                gui.modes.tadata.actions.setAppState(r.StringFromClipboard());
        //                                            }
        //                                        });
        //endregion
        // region Get rid of me im just for a small debugging session
        // gui.window.boilerplate.setOnKeyPressed(ⵁ->
        //                                        {
        //                                            if(ⵁ.getCode()==KeyCode.C)
        //                                            {
        //                                                r.say("state copied");
        //                                                String myStringToCopy=r.jsonToPrettyString(gui.modes.courseDetails.reader.getAppState());
        //                                                r.println(myStringToCopy);
        //                                                r.StringToClipboard(myStringToCopy);
        //                                            }
        //                                            if(ⵁ.getCode()==KeyCode.V)
        //                                            {
        //                                                r.say("state pasted");
        //                                                System.out.println("SETTING STATE");
        //                                                try
        //                                                {
        //                                                    gui.modes.courseDetails.actions.setAppState(new JSONObject(r.StringFromClipboard()));
        //                                                }
        //                                                catch(JSONException e)
        //                                                {
        //                                                    e.printStackTrace();
        //                                                }
        //                                            }
        //                                        });
        // endregion
        stage.show();
    }
    public static void main(String[]ⵁ)
    {
        launch();
    }
}
