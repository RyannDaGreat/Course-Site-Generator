package _App_;//Created by Ryan on 4/10/17.
import _App_._GUI_.GUI;
import _App_._IO_.IO;
import _App_._rTPS_.rTPS;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
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
    public void start(Stage primaryStage)
    {
        this.stage=primaryStage;
        stage.setTitle(io.propertyGetter.getAppTitle());
        stage.getIcons().add(io.styleGetter.getAppIcon());
        stage.setScene(new Scene(gui.window.boilerplate));
        stage.setOnCloseRequest(e->System.out.println("Exiting"));
        stage.setMinHeight(150);//Unlike McKenna's demo
        stage.show();
    }
    public static void main(String[]ⵁ)
    {
        launch();
    }
}
