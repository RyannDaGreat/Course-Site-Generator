/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _Experiments_;
import _Externals_.TATableView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * @author Ryan
 */
public class RyansAppFramework extends Application
{
    Scene scene;
    public void start(Stage primaryStage)
    {
        TATableView taTableView=new TATableView("A","B","C");

        scene=new Scene(taTableView);
        primaryStage.setTitle("Hello World!");
        primaryStage.getTitle();
        primaryStage.setScene(scene);
        taTableView.addPerson(true,"A","B");
        taTableView.addPerson(false,"C","D");
        taTableView.addPerson(true,"E","F");
        taTableView.addPerson(false,"G","H");
        taTableView.setState("true,ASDFSDFS,B;false,C,D;true,E,F;false,G,H;true,A,B;false,C,D;true,E,F;false,G,H\n");
        System.out.println(taTableView.getState());
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
