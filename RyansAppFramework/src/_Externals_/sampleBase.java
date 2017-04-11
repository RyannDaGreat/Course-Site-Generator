package _Externals_;

import javafx.collections.FXCollections;
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
    protected final GridPane ciCd_ⵁ0;
    protected final ColumnConstraints ciCd_ⵁ1;
    protected final ColumnConstraints ciCd_ⵁ2;
    protected final ColumnConstraints ciCd_ⵁ3;
    protected final ColumnConstraints ciCd_ⵁ4;
    protected final RowConstraints ciCd_ⵁ5;
    protected final RowConstraints ciCd_ⵁ6;
    protected final RowConstraints ciCd_ⵁ7;
    protected final RowConstraints ciCd_ⵁ8;
    protected final RowConstraints ciCd_ⵁ9;
    protected final RowConstraints ciCd_ⵁ10;
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
    protected final Text courseInfo_exportDirPathText;
    protected final Button courseInfo_changeButton;

    protected final TitledPane siteTemplateTitledPane;
    protected final AnchorPane siteTemplateAnchorPane;
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
        ciCd_ⵁ0= new GridPane();
        ciCd_ⵁ1= new ColumnConstraints();
        ciCd_ⵁ2= new ColumnConstraints();
        ciCd_ⵁ3= new ColumnConstraints();
        ciCd_ⵁ4= new ColumnConstraints();
        ciCd_ⵁ5= new RowConstraints();
        ciCd_ⵁ6= new RowConstraints();
        ciCd_ⵁ7= new RowConstraints();
        ciCd_ⵁ8= new RowConstraints();
        ciCd_ⵁ9= new RowConstraints();
        ciCd_ⵁ10= new RowConstraints();
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
        courseInfo_exportDirPathText= new Text();
        courseInfo_changeButton= new Button();
        siteTemplateTitledPane= new TitledPane();
        siteTemplateAnchorPane= new AnchorPane();
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
        toolbar_loadButton.setText("Load");

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

        AnchorPane.setBottomAnchor(ciCd_ⵁ0,0.0);
        AnchorPane.setLeftAnchor(ciCd_ⵁ0,0.0);
        AnchorPane.setRightAnchor(ciCd_ⵁ0,0.0);
        AnchorPane.setTopAnchor(ciCd_ⵁ0,0.0);
        ciCd_ⵁ0.setCacheShape(false);
        ciCd_ⵁ0.setCenterShape(false);
        ciCd_ⵁ0.setFocusTraversable(true);
        ciCd_ⵁ0.setPrefHeight(416.0);
        ciCd_ⵁ0.setPrefWidth(1918.0);
        ciCd_ⵁ0.setScaleShape(false);

        ciCd_ⵁ1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        ciCd_ⵁ1.setMaxWidth(938.9019165039062);
        ciCd_ⵁ1.setMinWidth(10.0);
        ciCd_ⵁ1.setPrefWidth(411.0934753417969);

        ciCd_ⵁ2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        ciCd_ⵁ2.setMaxWidth(1777.0434799194336);
        ciCd_ⵁ2.setMinWidth(0.0);
        ciCd_ⵁ2.setPrefWidth(537.8076171875);

        ciCd_ⵁ3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        ciCd_ⵁ3.setMaxWidth(1777.0434799194336);
        ciCd_ⵁ3.setMinWidth(10.0);
        ciCd_ⵁ3.setPrefWidth(493.7978515625);

        ciCd_ⵁ4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        ciCd_ⵁ4.setMaxWidth(1777.0434799194336);
        ciCd_ⵁ4.setMinWidth(10.0);
        ciCd_ⵁ4.setPrefWidth(457.2021484375);

        ciCd_ⵁ5.setMinHeight(10.0);
        ciCd_ⵁ5.setPrefHeight(30.0);
        ciCd_ⵁ5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        ciCd_ⵁ6.setMinHeight(10.0);
        ciCd_ⵁ6.setPrefHeight(30.0);
        ciCd_ⵁ6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        ciCd_ⵁ7.setMinHeight(10.0);
        ciCd_ⵁ7.setPrefHeight(30.0);
        ciCd_ⵁ7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        ciCd_ⵁ8.setMinHeight(10.0);
        ciCd_ⵁ8.setPrefHeight(30.0);
        ciCd_ⵁ8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        ciCd_ⵁ9.setMinHeight(10.0);
        ciCd_ⵁ9.setPrefHeight(30.0);
        ciCd_ⵁ9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        ciCd_ⵁ10.setMinHeight(10.0);
        ciCd_ⵁ10.setPrefHeight(30.0);
        ciCd_ⵁ10.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

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
        courseInfo_subjectComboBox.setItems(FXCollections.observableArrayList("1","2","3","4"));

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

        GridPane.setColumnIndex(courseInfo_exportDirPathText,1);
        GridPane.setColumnSpan(courseInfo_exportDirPathText,2);
        GridPane.setHalignment(courseInfo_exportDirPathText,javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(courseInfo_exportDirPathText,5);
        courseInfo_exportDirPathText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        courseInfo_exportDirPathText.setStrokeWidth(0.0);
        courseInfo_exportDirPathText.setText("aodsjaosidjaoisjdoaisdjoiasjdoiasjdoaijsdoiasjdoiasjdoasjdoasidjaoijdoiajd");

        GridPane.setColumnIndex(courseInfo_changeButton,3);
        GridPane.setHalignment(courseInfo_changeButton,javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(courseInfo_changeButton,5);
        courseInfo_changeButton.setMnemonicParsing(false);
        courseInfo_changeButton.setText("Change");
        courseInfoTitledPane.setContent(courseInfo_AnchorPane);

        siteTemplateTitledPane.setAnimated(false);
        siteTemplateTitledPane.setCollapsible(false);
        siteTemplateTitledPane.setText("Site Template");

        siteTemplateAnchorPane.setMinHeight(0.0);
        siteTemplateAnchorPane.setMinWidth(0.0);
        siteTemplateAnchorPane.setPrefHeight(180.0);
        siteTemplateAnchorPane.setPrefWidth(200.0);

        flowPane.setPrefHeight(200.0);
        flowPane.setPrefWidth(200.0);
        siteTemplateTitledPane.setContent(siteTemplateAnchorPane);

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
        ciCd_ⵁ0.getColumnConstraints().add(ciCd_ⵁ1);
        ciCd_ⵁ0.getColumnConstraints().add(ciCd_ⵁ2);
        ciCd_ⵁ0.getColumnConstraints().add(ciCd_ⵁ3);
        ciCd_ⵁ0.getColumnConstraints().add(ciCd_ⵁ4);
        ciCd_ⵁ0.getRowConstraints().add(ciCd_ⵁ5);
        ciCd_ⵁ0.getRowConstraints().add(ciCd_ⵁ6);
        ciCd_ⵁ0.getRowConstraints().add(ciCd_ⵁ7);
        ciCd_ⵁ0.getRowConstraints().add(ciCd_ⵁ8);
        ciCd_ⵁ0.getRowConstraints().add(ciCd_ⵁ9);
        ciCd_ⵁ0.getRowConstraints().add(ciCd_ⵁ10);
        ciCd_ⵁ0.getChildren().add(courseInfo_subjectText);
        ciCd_ⵁ0.getChildren().add(courseInfo_semesterText);
        ciCd_ⵁ0.getChildren().add(courseInfo_numberText);
        ciCd_ⵁ0.getChildren().add(courseInfo_yearText);
        ciCd_ⵁ0.getChildren().add(courseInfo_titleText);
        ciCd_ⵁ0.getChildren().add(courseInfo_instructorNameText);
        ciCd_ⵁ0.getChildren().add(courseInfo_instructorHomeText);
        ciCd_ⵁ0.getChildren().add(courseInfo_exportDirText);
        ciCd_ⵁ0.getChildren().add(courseInfo_titleTextField);
        ciCd_ⵁ0.getChildren().add(courseInfo_instructorNameTextField);
        ciCd_ⵁ0.getChildren().add(courseInfo_instructorHomeTextField);
        ciCd_ⵁ0.getChildren().add(courseInfo_subjectComboBox);
        ciCd_ⵁ0.getChildren().add(courseInfo_semesterComboBox);
        ciCd_ⵁ0.getChildren().add(courseInfo_numberComboBox);
        ciCd_ⵁ0.getChildren().add(courseInfo_yearComboBox);
        ciCd_ⵁ0.getChildren().add(courseInfo_exportDirPathText);
        ciCd_ⵁ0.getChildren().add(courseInfo_changeButton);
        courseInfo_AnchorPane.getChildren().add(ciCd_ⵁ0);
        courseDetails_mainVbox.getChildren().add(courseInfoTitledPane);
        siteTemplateAnchorPane.getChildren().add(flowPane);
        courseDetails_mainVbox.getChildren().add(siteTemplateTitledPane);
        courseDetails_mainVbox.getChildren().add(titledPane1);
        modeSelector_mainTabPane.getTabs().add(modeSelector_courseDetailsTab);
        modeSelector_mainTabPane.getTabs().add(tab0);
        modeSelector_mainTabPane.getTabs().add(tab1);
        modeSelector_mainTabPane.getTabs().add(tab2);
        modeSelector_mainTabPane.getTabs().add(tab3);
        getChildren().add(modeSelector_mainTabPane);

    }
}
