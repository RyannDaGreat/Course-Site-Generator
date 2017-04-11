package _Experiments_;

import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.scene.effect.*;
import javafx.scene.control.*;
import java.lang.*;
import javafx.scene.layout.*;

public abstract class compilationTest_toolbar extends ToolBar 
{

    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Pane pane;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;

    public compilationTest_toolbar() {

        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        pane = new Pane();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();

        setPrefHeight(40.0);
        setPrefWidth(1000.0);

        button.setMnemonicParsing(false);
        button.setText("New");

        button0.setMnemonicParsing(false);
        button0.setText("Load");

        button1.setMnemonicParsing(false);
        button1.setText("Save");

        button2.setMnemonicParsing(false);
        button2.setText("Save As");

        button3.setMnemonicParsing(false);
        button3.setText("Export");

        pane.setPrefWidth(50.0);

        button4.setMnemonicParsing(false);
        button4.setText("Undo");

        button5.setMnemonicParsing(false);
        button5.setText("Redo");

        button6.setMnemonicParsing(false);
        button6.setText("About");

        getItems().add(button);
        getItems().add(button0);
        getItems().add(button1);
        getItems().add(button2);
        getItems().add(button3);
        getItems().add(pane);
        getItems().add(button4);
        getItems().add(button5);
        getItems().add(button6);

    }
}
