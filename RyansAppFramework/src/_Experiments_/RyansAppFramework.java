/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _Experiments_;
import _App_.App;
import _Externals_.OfficeHoursGrid;
import _Externals_.r;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import properties_manager.PropertiesManager;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

import static _Experiments_.Stylizer.stylize;
import static djf.settings.AppPropertyType.APP_CSS;
import static djf.settings.AppPropertyType.APP_PATH_CSS;
/**
 * @author Ryan
 */
public class RyansAppFramework extends Application
{
    Scene scene;
    OfficeHoursGrid officeHoursGrid=new OfficeHoursGrid();
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
        stylize(Toolbar,"jabber");
        // Pane root=new Pane();
        // root.getChildren().add(btn);
        tabTester tt=new tabTester();
        tt.courseDetailsTab.setStyle("-fx-border-color:red; -fx-background-color: blue;");
        tt.courseDetailsTab.setGraphic(new Label("Tab B"));
        tt.courseDetailsTab.
                               getGraphic().
                               setStyle("-fx-background-color: chartreuse");
        scene=new Scene(root);
        scene=new Scene(new ScrollPane(officeHoursGrid),1000,250);
        scene=new Scene(new tabTester());
        scene=new Scene(new GoodTryBase());
        scene=new Scene(new SeveralTabsBase());
        scene.setOnKeyPressed(ⵁ->command(r.scan("ENTER INPUT:")));
        // Scene scene=new Scene(new UntitledBase(),1000,250);
        // scene=new Screne(new Columns(),1000,250);
        primaryStage.setTitle("Hello World!");
        primaryStage.getTitle();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void command(String s)
    {
        officeHoursGrid.toggleOfficeHours(s);
        System.out.println(officeHoursGrid.getGridState());
    }

    static
    {
        String l;
        if(r.yesNo("Do you speak "+(l="Italian")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
        else if(r.yesNo("Do you speak "+(l="Chinese")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
        else if(r.yesNo("Do you speak "+(l="French")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
        else if(r.yesNo("Do you speak "+(l="German")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
        else if(r.yesNo("Do you speak "+(l="Greek")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
        else if(r.yesNo("Do you speak "+(l="Japanese")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
        else if(r.yesNo("Do you speak "+(l="Korean")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
        else if(r.yesNo("Do you speak "+(l="Latin")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
        else if(r.yesNo("Do you speak "+(l="Russian")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
        else if(r.yesNo("Do you speak "+(l="Spanish")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
        else if(r.yesNo("Do you speak "+(l="DeathOfTheMind")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
        else if(r.yesNo("Do you speak "+(l="DeathOfTheMind2")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
        else if(r.yesNo("Do you speak "+(l="DeathOfTheMind3")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
        else if(r.yesNo("Do you speak "+(l="DeathOfTheMind4")+"?","Do you speak "+l+"?"))
        {
            Messages.BUNDLE_NAME="_Experiments_.messages"+l; //$NON-NLS-1$
            Messages.RESOURCE_BUNDLE=ResourceBundle.getBundle(Messages.BUNDLE_NAME);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(r.splitLines("\n").length);
        // r.print(new App().gui.dialogs.saveFile("Open","png"));
        // r.print(new App().gui.dialogs.openDirectory("Open","png"));
        // r.print(new App().gui.dialogs.openFile("Open","png"));
        // r.print(new App().gui.dialogs.yesNoCancel("title","Message")==Dialogs.dialogOptions.CANCEL);
        launch(args);
    }
}
