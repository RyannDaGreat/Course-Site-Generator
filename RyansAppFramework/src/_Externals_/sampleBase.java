package _Externals_;

import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public  class sampleBase extends VBox {

    protected final ToolBar toolBar;
    protected final Button toolbar_newButton;
    protected final Button toolbar_loadButton;
    protected final Button toolbar_saveButton;
    protected final Button toolbar_saveAsButton;
    protected final Button toolbar_exportButton;
    protected final Pane toolbar_emptySpaceBetweenExportAndUndo;
    protected final Button toolbar_undoButton;
    protected final Button toolbar_redoButton;
    protected final Button toolbar_aboutButton;
    protected final TabPane modeSelector_mainTabPane;


    protected final Tab modeSelector_courseDetailsTab;
    protected final VBox courseDetails_mainVbox;

    protected final TitledPane courseInfoTitledPane;
    protected final AnchorPane courseInfo_AnchorPane;
    protected final GridPane courseInfo_gridPane;

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

    protected final Text courseInfo_subjectText;
    protected final Text courseInfo_semesterText;
    protected final Text courseInfo_numberText;
    protected final Text courseInfo_yearText;
    protected final Text courseInfo_titleText;
    protected final Text courseInfo_instructorNameText;
    protected final Text courseInfo_instructorHomeText;
    protected final Text courseInfo_exportDirText;
    protected final TextField courseInfo_titleTextField;
    protected final TextField courseInfo_instructorNameTextField;
    protected final TextField courseInfo_instructorHomeTextField;
    protected final ComboBox courseInfo_subjectComboBox;
    protected final ComboBox courseInfo_semesterComboBox;
    protected final ComboBox courseInfo_numberComboBox;
    protected final ComboBox courseInfo_yearComboBox;
    protected final Text text7;
    protected final Button button7;
    protected final TitledPane titledPane0;
    protected final AnchorPane anchorPane0;
    protected final FlowPane flowPane;
    protected final TitledPane titledPane1;
    protected final AnchorPane anchorPane1;
    protected final Tab tab0;
    protected final ScrollPane scrollPane;
    protected final Tab tab1;
    protected final ScrollPane scrollPane0;
    protected final Tab tab2;
    protected final ScrollPane scrollPane1;
    protected final Tab tab3;
    protected final ScrollPane scrollPane2;

    public sampleBase() {

        toolBar = new ToolBar();
        toolbar_newButton= new Button();
        toolbar_loadButton= new Button();
        toolbar_saveButton= new Button();
        toolbar_saveAsButton= new Button();
        toolbar_exportButton= new Button();
        toolbar_emptySpaceBetweenExportAndUndo= new Pane();
        toolbar_undoButton= new Button();
        toolbar_redoButton= new Button();
        toolbar_aboutButton= new Button();
        modeSelector_mainTabPane= new TabPane();
        modeSelector_courseDetailsTab= new Tab();
        courseDetails_mainVbox= new VBox();
        courseInfoTitledPane= new TitledPane();
        courseInfo_AnchorPane= new AnchorPane();
        courseInfo_gridPane= new GridPane();
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
        courseInfo_subjectText= new Text();
        courseInfo_semesterText= new Text();
        courseInfo_numberText= new Text();
        courseInfo_yearText= new Text();
        courseInfo_titleText= new Text();
        courseInfo_instructorNameText= new Text();
        courseInfo_instructorHomeText= new Text();
        courseInfo_exportDirText= new Text();
        courseInfo_titleTextField= new TextField();
        courseInfo_instructorNameTextField= new TextField();
        courseInfo_instructorHomeTextField= new TextField();
        courseInfo_subjectComboBox= new ComboBox();
        courseInfo_semesterComboBox= new ComboBox();
        courseInfo_numberComboBox= new ComboBox();
        courseInfo_yearComboBox= new ComboBox();
        text7 = new Text();
        button7 = new Button();
        titledPane0 = new TitledPane();
        anchorPane0 = new AnchorPane();
        flowPane = new FlowPane();
        titledPane1 = new TitledPane();
        anchorPane1 = new AnchorPane();
        tab0 = new Tab();
        scrollPane = new ScrollPane();
        tab1 = new Tab();
        scrollPane0 = new ScrollPane();
        tab2 = new Tab();
        scrollPane1 = new ScrollPane();
        tab3 = new Tab();
        scrollPane2 = new ScrollPane();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(1080.0);
        setPrefWidth(1920.0);

        toolBar.setPrefHeight(40.0);
        toolBar.setPrefWidth(200.0);

        toolbar_newButton.setMnemonicParsing(false);
        toolbar_newButton.setText("New");

        toolbar_loadButton.setMnemonicParsing(false);
        toolbar_loadButton.setText("toolbar_loadButton");

        toolbar_saveButton.setMnemonicParsing(false);
        toolbar_saveButton.setText("Save");

        toolbar_saveAsButton.setMnemonicParsing(false);
        toolbar_saveAsButton.setText("Save As");

        toolbar_exportButton.setMnemonicParsing(false);
        toolbar_exportButton.setText("Export");

        toolbar_emptySpaceBetweenExportAndUndo.setPrefWidth(50.0);

        toolbar_undoButton.setMnemonicParsing(false);
        toolbar_undoButton.setText("Undo");

        toolbar_redoButton.setMnemonicParsing(false);
        toolbar_redoButton.setText("Redo");

        toolbar_aboutButton.setMnemonicParsing(false);
        toolbar_aboutButton.setText("About");

        VBox.setVgrow(modeSelector_mainTabPane,javafx.scene.layout.Priority.ALWAYS);
        modeSelector_mainTabPane.setPrefHeight(200.0);
        modeSelector_mainTabPane.setPrefWidth(200.0);
        modeSelector_mainTabPane.setTabClosingPolicy(javafx.scene.control.TabPane.TabClosingPolicy.UNAVAILABLE);

        modeSelector_courseDetailsTab.setText("Course Details");

        courseDetails_mainVbox.setPrefHeight(200.0);
        courseDetails_mainVbox.setPrefWidth(100.0);
        courseDetails_mainVbox.setSpacing(5.0);
        courseDetails_mainVbox.setStyle("-fx-background-color: #777777;");

        courseInfoTitledPane.setAnimated(false);
        courseInfoTitledPane.setCollapsible(false);
        courseInfoTitledPane.setPrefHeight(444.0);
        courseInfoTitledPane.setText("Course Info");

        courseInfo_AnchorPane.setMinHeight(0.0);
        courseInfo_AnchorPane.setMinWidth(0.0);
        courseInfo_AnchorPane.setPrefHeight(180.0);
        courseInfo_AnchorPane.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(courseInfo_gridPane,0.0);
        AnchorPane.setLeftAnchor(courseInfo_gridPane,0.0);
        AnchorPane.setRightAnchor(courseInfo_gridPane,0.0);
        AnchorPane.setTopAnchor(courseInfo_gridPane,0.0);
        courseInfo_gridPane.setCacheShape(false);
        courseInfo_gridPane.setCenterShape(false);
        courseInfo_gridPane.setFocusTraversable(true);
        courseInfo_gridPane.setPrefHeight(416.0);
        courseInfo_gridPane.setPrefWidth(1918.0);
        courseInfo_gridPane.setScaleShape(false);

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

        courseInfo_subjectText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        courseInfo_subjectText.setStrokeWidth(0.0);
        courseInfo_subjectText.setText("Subject:");

        GridPane.setRowIndex(courseInfo_semesterText,1);
        courseInfo_semesterText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        courseInfo_semesterText.setStrokeWidth(0.0);
        courseInfo_semesterText.setText("Semester:");

        GridPane.setColumnIndex(courseInfo_numberText,2);
        courseInfo_numberText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        courseInfo_numberText.setStrokeWidth(0.0);
        courseInfo_numberText.setText("Number:");

        GridPane.setColumnIndex(courseInfo_yearText,2);
        GridPane.setRowIndex(courseInfo_yearText,1);
        courseInfo_yearText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        courseInfo_yearText.setStrokeWidth(0.0);
        courseInfo_yearText.setText("Year:");

        GridPane.setRowIndex(courseInfo_titleText,2);
        courseInfo_titleText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        courseInfo_titleText.setStrokeWidth(0.0);
        courseInfo_titleText.setText("Title:");

        GridPane.setRowIndex(courseInfo_instructorNameText,3);
        courseInfo_instructorNameText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        courseInfo_instructorNameText.setStrokeWidth(0.0);
        courseInfo_instructorNameText.setText("Instructor Name:");

        GridPane.setRowIndex(courseInfo_instructorHomeText,4);
        courseInfo_instructorHomeText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        courseInfo_instructorHomeText.setStrokeWidth(0.0);
        courseInfo_instructorHomeText.setText("Instructor Home:");

        GridPane.setRowIndex(courseInfo_exportDirText,5);
        courseInfo_exportDirText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        courseInfo_exportDirText.setStrokeWidth(0.0);
        courseInfo_exportDirText.setText("Export Dir:");

        GridPane.setColumnIndex(courseInfo_titleTextField,1);
        GridPane.setColumnSpan(courseInfo_titleTextField,2147483647);
        GridPane.setRowIndex(courseInfo_titleTextField,2);
        courseInfo_titleTextField.setPromptText("Computer Science III");

        GridPane.setColumnIndex(courseInfo_instructorNameTextField,1);
        GridPane.setColumnSpan(courseInfo_instructorNameTextField,2147483647);
        GridPane.setRowIndex(courseInfo_instructorNameTextField,3);
        courseInfo_instructorNameTextField.setPromptText("Richard McKenna");

        GridPane.setColumnIndex(courseInfo_instructorHomeTextField,1);
        GridPane.setColumnSpan(courseInfo_instructorHomeTextField,2147483647);
        GridPane.setRowIndex(courseInfo_instructorHomeTextField,4);
        courseInfo_instructorHomeTextField.setPromptText("http://www3.cs.stonybrook.edu/~cse219/Section02/index.html");

        GridPane.setColumnIndex(courseInfo_subjectComboBox,1);
        courseInfo_subjectComboBox.setPrefWidth(150.0);
        courseInfo_subjectComboBox.setPromptText("CSE");

        GridPane.setColumnIndex(courseInfo_semesterComboBox,1);
        GridPane.setRowIndex(courseInfo_semesterComboBox,1);
        courseInfo_semesterComboBox.setPrefWidth(150.0);
        courseInfo_semesterComboBox.setPromptText("Fall");

        GridPane.setColumnIndex(courseInfo_numberComboBox,3);
        GridPane.setHalignment(courseInfo_numberComboBox,javafx.geometry.HPos.RIGHT);
        courseInfo_numberComboBox.setPrefWidth(150.0);
        courseInfo_numberComboBox.setPromptText("219");

        GridPane.setColumnIndex(courseInfo_yearComboBox,3);
        GridPane.setHalignment(courseInfo_yearComboBox,javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(courseInfo_yearComboBox,1);
        courseInfo_yearComboBox.setPrefWidth(150.0);
        courseInfo_yearComboBox.setPromptText("2017");

        GridPane.setColumnIndex(text7, 1);
        GridPane.setColumnSpan(text7, 2);
        GridPane.setHalignment(text7, javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(text7, 5);
        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("aodsjaosidjaoisjdoaisdjoiasjdoiasjdoaijsdoiasjdoiasjdoasjdoasidjaoijdoiajd");

        GridPane.setColumnIndex(button7, 3);
        GridPane.setHalignment(button7, javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(button7, 5);
        button7.setMnemonicParsing(false);
        button7.setText("Change");
        courseInfoTitledPane.setContent(courseInfo_AnchorPane);

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
        courseDetails_mainVbox.setPadding(new Insets(5.0));
        modeSelector_courseDetailsTab.setContent(courseDetails_mainVbox);

        tab0.setText("TA Data");

        scrollPane.setHbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane.setPrefViewportHeight(327.0);
        scrollPane.setPrefViewportWidth(600.0);
        scrollPane.setVbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.ALWAYS);
        tab0.setContent(scrollPane);

        tab1.setText("Recitaiton Data");

        scrollPane0.setHbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane0.setPrefViewportHeight(327.0);
        scrollPane0.setPrefViewportWidth(600.0);
        scrollPane0.setVbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.ALWAYS);
        tab1.setContent(scrollPane0);

        tab2.setText("Schedule Data");

        scrollPane1.setHbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane1.setPrefViewportHeight(327.0);
        scrollPane1.setPrefViewportWidth(600.0);
        scrollPane1.setVbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.ALWAYS);
        tab2.setContent(scrollPane1);

        tab3.setText("Project Data");

        scrollPane2.setHbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.ALWAYS);
        scrollPane2.setPrefViewportHeight(327.0);
        scrollPane2.setPrefViewportWidth(600.0);
        scrollPane2.setVbarPolicy(javafx.scene.control.ScrollPane.ScrollBarPolicy.ALWAYS);
        tab3.setContent(scrollPane2);

        toolBar.getItems().add(toolbar_newButton);
        toolBar.getItems().add(toolbar_loadButton);
        toolBar.getItems().add(toolbar_saveButton);
        toolBar.getItems().add(toolbar_saveAsButton);
        toolBar.getItems().add(toolbar_exportButton);
        toolBar.getItems().add(toolbar_emptySpaceBetweenExportAndUndo);
        toolBar.getItems().add(toolbar_undoButton);
        toolBar.getItems().add(toolbar_redoButton);
        toolBar.getItems().add(toolbar_aboutButton);
        getChildren().add(toolBar);
        courseInfo_gridPane.getColumnConstraints().add(columnConstraints);
        courseInfo_gridPane.getColumnConstraints().add(columnConstraints0);
        courseInfo_gridPane.getColumnConstraints().add(columnConstraints1);
        courseInfo_gridPane.getColumnConstraints().add(columnConstraints2);
        courseInfo_gridPane.getRowConstraints().add(rowConstraints);
        courseInfo_gridPane.getRowConstraints().add(rowConstraints0);
        courseInfo_gridPane.getRowConstraints().add(rowConstraints1);
        courseInfo_gridPane.getRowConstraints().add(rowConstraints2);
        courseInfo_gridPane.getRowConstraints().add(rowConstraints3);
        courseInfo_gridPane.getRowConstraints().add(rowConstraints4);
        courseInfo_gridPane.getChildren().add(courseInfo_subjectText);
        courseInfo_gridPane.getChildren().add(courseInfo_semesterText);
        courseInfo_gridPane.getChildren().add(courseInfo_numberText);
        courseInfo_gridPane.getChildren().add(courseInfo_yearText);
        courseInfo_gridPane.getChildren().add(courseInfo_titleText);
        courseInfo_gridPane.getChildren().add(courseInfo_instructorNameText);
        courseInfo_gridPane.getChildren().add(courseInfo_instructorHomeText);
        courseInfo_gridPane.getChildren().add(courseInfo_exportDirText);
        courseInfo_gridPane.getChildren().add(courseInfo_titleTextField);
        courseInfo_gridPane.getChildren().add(courseInfo_instructorNameTextField);
        courseInfo_gridPane.getChildren().add(courseInfo_instructorHomeTextField);
        courseInfo_gridPane.getChildren().add(courseInfo_subjectComboBox);
        courseInfo_gridPane.getChildren().add(courseInfo_semesterComboBox);
        courseInfo_gridPane.getChildren().add(courseInfo_numberComboBox);
        courseInfo_gridPane.getChildren().add(courseInfo_yearComboBox);
        courseInfo_gridPane.getChildren().add(text7);
        courseInfo_gridPane.getChildren().add(button7);
        courseInfo_AnchorPane.getChildren().add(courseInfo_gridPane);
        courseDetails_mainVbox.getChildren().add(courseInfoTitledPane);
        anchorPane0.getChildren().add(flowPane);
        courseDetails_mainVbox.getChildren().add(titledPane0);
        courseDetails_mainVbox.getChildren().add(titledPane1);
        modeSelector_mainTabPane.getTabs().add(modeSelector_courseDetailsTab);
        modeSelector_mainTabPane.getTabs().add(tab0);
        modeSelector_mainTabPane.getTabs().add(tab1);
        modeSelector_mainTabPane.getTabs().add(tab2);
        modeSelector_mainTabPane.getTabs().add(tab3);
        getChildren().add(modeSelector_mainTabPane);

    }
}
