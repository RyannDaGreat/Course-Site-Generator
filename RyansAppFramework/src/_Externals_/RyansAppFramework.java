/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _Externals_;
import _App_.App;
import _App_._GUI_._Dialogs_.Dialogs;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 * @author Ryan
 */
public class RyansAppFramework extends Application
{
    @Override
    public void start(Stage primaryStage)
    {
        App app=new App();

        HBox Toolbar=new HBox(new Button("A"),new Button("B"),new Button("C"));
        GridPane Grid=new GridPane();




        Button btn=new Button();


        btn.setText("Say 'Hello World'");
        btn.setOnAction(event->System.out.println("Hello World!"));
        StackPane root=new StackPane();
        root.getChildren().add(btn);
        Scene scene=new Scene(root,300,250);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // r.print(new App().gui.dialogs.saveFile("Open","png"));
        // r.print(new App().gui.dialogs.openDirectory("Open","png"));
        // r.print(new App().gui.dialogs.openFile("Open","png"));
        // r.print(new App().gui.dialogs.yesNoCancel("title","Message")==Dialogs.dialogOptions.CANCEL);
        launch(args);
    }
}
