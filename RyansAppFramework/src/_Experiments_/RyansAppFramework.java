/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _Experiments_;
import _App_.App;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
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

        VBox root=new VBox(Toolbar,btn);

        // Pane root=new Pane();
        // root.getChildren().add(btn);
        Scene scene=new Scene(new compilationTest_MainWindow(),1000,250);
        primaryStage.setTitle("Hello World!");
        primaryStage.getTitle();
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
