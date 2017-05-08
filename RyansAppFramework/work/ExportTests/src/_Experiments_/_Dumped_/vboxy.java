package _Experiments_._Dumped_;

import _Externals_.r;
import javafx.scene.text.*;
import java.lang.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class vboxy extends VBox {

    protected final TitledPane titledPane;
    protected final AnchorPane anchorPane;
    protected final GridPane gridPane;
    protected final Text text;
    protected final Text text0;
    protected final Text text1;
    protected final Text text2;
    protected final Text text3;
    protected final Text text4;
    protected final Text text5;
    protected final Text text6;
    protected final TextField textField;
    protected final TextField textField0;
    protected final TextField textField1;
    protected final ComboBox comboBox;
    protected final ComboBox comboBox0;
    protected final ComboBox comboBox1;
    protected final ComboBox comboBox2;
    protected final Text text7;
    protected final Button button;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final RowConstraints rowConstraints2;
    protected final RowConstraints rowConstraints3;
    protected final RowConstraints rowConstraints4;
    protected final TitledPane titledPane0;
    protected final AnchorPane anchorPane0;
    protected final FlowPane flowPane;
    protected final TitledPane titledPane1;
    protected final AnchorPane anchorPane1;

    public vboxy() {

        titledPane = new TitledPane();
        anchorPane = new AnchorPane();
        gridPane = new GridPane();
        text = new Text();
        text0 = new Text();
        text1 = new Text();
        text2 = new Text();
        text3 = new Text();
        text4 = new Text();
        text5 = new Text();
        text6 = new Text();
        textField = new TextField();
        textField0 = new TextField();
        textField1 = new TextField();
        comboBox = new ComboBox();
        comboBox0 = new ComboBox();
        comboBox1 = new ComboBox();
        comboBox2 = new ComboBox();
        text7 = new Text();
        button = new Button();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rowConstraints2 = new RowConstraints();
        rowConstraints3 = new RowConstraints();
        rowConstraints4 = new RowConstraints();
        titledPane0 = new TitledPane();
        anchorPane0 = new AnchorPane();
        flowPane = new FlowPane();
        titledPane1 = new TitledPane();
        anchorPane1 = new AnchorPane();


        // setPrefHeight(200.0);
        // setPrefWidth(100.0);
        setSpacing(3.0);

        titledPane.setAnimated(false);
        titledPane.setCollapsible(false);
        titledPane.setPrefHeight(444.0);
        titledPane.setText("Course Info");

        anchorPane.setMinHeight(0.0);
        anchorPane.setMinWidth(0.0);
        anchorPane.setPrefHeight(180.0);
        anchorPane.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(gridPane, 0.0);
        AnchorPane.setLeftAnchor(gridPane, 0.0);
        AnchorPane.setRightAnchor(gridPane, 0.0);
        AnchorPane.setTopAnchor(gridPane, 0.0);
        gridPane.setCacheShape(false);
        gridPane.setCenterShape(false);
        gridPane.setFocusTraversable(true);
        gridPane.setGridLinesVisible(true);
        gridPane.setPrefHeight(416.0);
        gridPane.setPrefWidth(1918.0);
        gridPane.setScaleShape(false);

        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Subject:");

        GridPane.setRowIndex(text0, 1);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Semester:");

        GridPane.setColumnIndex(text1, 2);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Number:");

        GridPane.setColumnIndex(text2, 2);
        GridPane.setRowIndex(text2, 1);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Year:");

        GridPane.setRowIndex(text3, 2);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Title:");

        GridPane.setRowIndex(text4, 3);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText("Instructor Name:");

        GridPane.setRowIndex(text5, 4);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Instructor Home:");

        GridPane.setRowIndex(text6, 5);
        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("Export Dir:");

        GridPane.setColumnIndex(textField, 1);
        GridPane.setColumnSpan(textField, 2147483647);
        GridPane.setRowIndex(textField, 2);
        textField.setPromptText("Computer Science III");

        GridPane.setColumnIndex(textField0, 1);
        GridPane.setColumnSpan(textField0, 2147483647);
        GridPane.setRowIndex(textField0, 3);
        textField0.setPromptText("Richard McKenna");

        GridPane.setColumnIndex(textField1, 1);
        GridPane.setColumnSpan(textField1, 2147483647);
        GridPane.setRowIndex(textField1, 4);
        textField1.setPromptText("http://www3.cs.stonybrook.edu/~cse219/Section02/index.html");

        GridPane.setColumnIndex(comboBox, 1);
        comboBox.setPrefWidth(150.0);
        comboBox.setPromptText("CSE");

        GridPane.setColumnIndex(comboBox0, 1);
        GridPane.setRowIndex(comboBox0, 1);
        comboBox0.setPrefWidth(150.0);
        comboBox0.setPromptText("Fall");

        GridPane.setColumnIndex(comboBox1, 3);
        GridPane.setHalignment(comboBox1, javafx.geometry.HPos.RIGHT);
        comboBox1.setPrefWidth(150.0);
        comboBox1.setPromptText("219");

        GridPane.setColumnIndex(comboBox2, 3);
        GridPane.setHalignment(comboBox2, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(comboBox2, 1);
        comboBox2.setPrefWidth(150.0);
        comboBox2.setPromptText("2017");

        r.fitToParent(comboBox2);

        GridPane.setColumnIndex(text7, 1);
        GridPane.setColumnSpan(text7, 2);
        GridPane.setHalignment(text7, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(text7, 5);
        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("aodsjaosidjaoisjdoaisdjoiasjdoiasjdoaijsdoiasjdoiasjdoasjdoasidjaoijdoiajd");

        GridPane.setColumnIndex(button, 3);
        GridPane.setHalignment(button, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(button, 5);
        button.setMnemonicParsing(false);
        button.setText("Change");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMaxWidth(938.9019165039062);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(411.0934753417969);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMaxWidth(1777.0434799194336);
        columnConstraints0.setMinWidth(0.0);
        columnConstraints0.setPrefWidth(537.8076171875);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMaxWidth(1777.0434799194336);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(493.7978515625);

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMaxWidth(1777.0434799194336);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(457.2021484375);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        titledPane.setContent(anchorPane);

        titledPane0.setAnimated(false);
        titledPane0.setCollapsible(false);
        titledPane0.setText("Site Template");

        anchorPane0.setMinHeight(0.0);
        anchorPane0.setMinWidth(0.0);
        anchorPane0.setPrefHeight(180.0);
        anchorPane0.setPrefWidth(200.0);

        flowPane.setPrefHeight(200.0);
        flowPane.setPrefWidth(200.0);
        titledPane0.setContent(anchorPane0);

        titledPane1.setAnimated(false);
        titledPane1.setCollapsible(false);
        titledPane1.setText("Page Style");

        anchorPane1.setMinHeight(0.0);
        anchorPane1.setMinWidth(0.0);
        anchorPane1.setPrefHeight(180.0);
        anchorPane1.setPrefWidth(200.0);
        titledPane1.setContent(anchorPane1);

        gridPane.getChildren().add(text);
        gridPane.getChildren().add(text0);
        gridPane.getChildren().add(text1);
        gridPane.getChildren().add(text2);
        gridPane.getChildren().add(text3);
        gridPane.getChildren().add(text4);
        gridPane.getChildren().add(text5);
        gridPane.getChildren().add(text6);
        gridPane.getChildren().add(textField);
        gridPane.getChildren().add(textField0);
        gridPane.getChildren().add(textField1);
        gridPane.getChildren().add(comboBox);
        gridPane.getChildren().add(comboBox0);
        gridPane.getChildren().add(comboBox1);
        gridPane.getChildren().add(comboBox2);
        gridPane.getChildren().add(text7);
        gridPane.getChildren().add(button);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getColumnConstraints().add(columnConstraints2);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getRowConstraints().add(rowConstraints2);
        gridPane.getRowConstraints().add(rowConstraints3);
        gridPane.getRowConstraints().add(rowConstraints4);
        anchorPane.getChildren().add(gridPane);
        getChildren().add(titledPane);
        anchorPane0.getChildren().add(flowPane);
        getChildren().add(titledPane0);
        getChildren().add(titledPane1);

    }
}
