package _App_._GUI_._Toolbar_._Boilerplate_;//Created by Ryan on 4/10/17.
import _App_.App;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
@SuppressWarnings("WeakerAccess")
public class Boilerplate extends javafx.scene.control.ToolBar
{
    public final Button newButton;
    public final Button loadButton;
    public final Button saveButton;
    public final Button saveAsButton;
    public final Button exportButton;
    public final Pane emptySpaceBetweenExportAndUndo;
    public final Button undoButton;
    public final Button redoButton;
    public final Button aboutButton;
    //
    public App app;
    public Boilerplate(App app)
    {
        this.app=app;//Required by Ryan's Framework
        //
        newButton=new Button();
        loadButton=new Button();
        saveButton=new Button();
        saveAsButton=new Button();
        exportButton=new Button();
        emptySpaceBetweenExportAndUndo=new Pane();
        undoButton=new Button();
        redoButton=new Button();
        aboutButton=new Button();
        //
        setPrefHeight(40.0);
        setPrefWidth(1000.0);
        //
        newButton.setMnemonicParsing(false);
        newButton.setText("New");
        loadButton.setMnemonicParsing(false);
        loadButton.setText("Load");
        saveButton.setMnemonicParsing(false);
        saveButton.setText("Save");
        saveAsButton.setMnemonicParsing(false);
        saveAsButton.setText("Save As");
        exportButton.setMnemonicParsing(false);
        exportButton.setText("Export");
        emptySpaceBetweenExportAndUndo.setPrefWidth(50.0);
        undoButton.setMnemonicParsing(false);
        undoButton.setText("Undo");
        redoButton.setMnemonicParsing(false);
        redoButton.setText("Redo");
        aboutButton.setMnemonicParsing(false);
        aboutButton.setText("About");
        //
        getItems().add(newButton);
        getItems().add(loadButton);
        getItems().add(saveButton);
        getItems().add(saveAsButton);
        getItems().add(exportButton);
        getItems().add(emptySpaceBetweenExportAndUndo);
        getItems().add(undoButton);
        getItems().add(redoButton);
        getItems().add(aboutButton);
    }
}


