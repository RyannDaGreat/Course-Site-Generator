package _Externals_;//Created by Ryan on 5/4/17.
import _App_.App;
import _Externals_._Resources_.ResourceGetter;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
public class CourseSiteGeneratorMegaplate extends VBox
{
    //This class contains the whole GUI for the Course Site generator. This class does the grunt-work of actually creating the GUI and putting the components in the right places.
    public CourseSiteGeneratorMegaplate(App app)
    {
        anchorPane=new AnchorPane();
        gridPane=new GridPane();
        columnConstraints=new ColumnConstraints();
        columnConstraints0=new ColumnConstraints();
        columnConstraints1=new ColumnConstraints();
        rowConstraints=new RowConstraints();
        toolBar=new ToolBar();
        new_button=new rButton();
        imageView=new ImageView();
        open_button0=new rButton();
        imageView0=new ImageView();
        save_button1=new rButton();
        imageView1=new ImageView();
        saveas_button2=new rButton();
        imageView2=new ImageView();
        export_button3=new rButton();
        imageView3=new ImageView();
        power_button4=new rButton();
        imageView4=new ImageView();
        toolBar0=new ToolBar();
        undo_button5=new rButton();
        imageView5=new ImageView();
        redo_button6=new rButton();
        imageView6=new ImageView();
        book_button7=new rButton();
        imageView7=new ImageView();
        tabPane=new TabPane();
        tab=new Tab();
        scrollPane=new ScrollPane();
        vBox=new VBox();
        gridPane0=new GridPane();
        text=new Text();
        columnConstraints2=new ColumnConstraints();
        rowConstraints0=new RowConstraints();
        anchorPane0=new AnchorPane();
        vBox0=new VBox();
        text0=new Text();
        gridPane1=new GridPane();
        text1=new Text();
        text2=new Text();
        text3=new Text();
        text4=new Text();
        text5=new Text();
        text6=new Text();
        text7=new Text();
        text8=new Text();
        cdCiTitle_textField=new rTextField();
        cdCiInstructorName_textField0=new rTextField();
        cdCiInstructorHome_textField1=new rTextField();
        cdCiSubject_comboBox=new ComboBox();
        cdCiSemester_comboBox0=new ComboBox();
        cdCiNumber_comboBox1=new ComboBox();
        cdCiYear_comboBox2=new ComboBox();
        cdCiExportDir_text9=new Text();
        cdCiChange_button8=new rButton();
        columnConstraints3=new ColumnConstraints();
        columnConstraints4=new ColumnConstraints();
        columnConstraints5=new ColumnConstraints();
        columnConstraints6=new ColumnConstraints();
        columnConstraints7=new ColumnConstraints();
        rowConstraints1=new RowConstraints();
        rowConstraints2=new RowConstraints();
        rowConstraints3=new RowConstraints();
        rowConstraints4=new RowConstraints();
        rowConstraints5=new RowConstraints();
        rowConstraints6=new RowConstraints();
        anchorPane1=new AnchorPane();
        vBox1=new VBox();
        text10=new Text();
        text11=new Text();
        gridPane2=new GridPane();
        columnConstraints8=new ColumnConstraints();
        columnConstraints9=new ColumnConstraints();
        columnConstraints10=new ColumnConstraints();
        rowConstraints7=new RowConstraints();
        rowConstraints8=new RowConstraints();
        cdStChange_button9=new rButton();
        cdStTemplateDir_text12=new Text();
        text13=new Text();
        cdStSitePages_tableView=new CD_SitePagesTableView(ResourceGetter.getProperty("prop_gui_cd_site_pages_headers").split(","));
        cdStUse_tableColumn=new TableColumn();
        cdStNavbarTitle_tableColumn0=new TableColumn();
        cdStFileName_tableColumn1=new TableColumn();
        cdStScript_tableColumn2=new TableColumn();
        text14=new Text();
        anchorPane2=new AnchorPane();
        vBox2=new VBox();
        text15=new Text();
        gridPane3=new GridPane();
        text16=new Text();
        cdPsChangeBanner_button10=new rButton();
        cdPsBanner_imageView8=new ImageView();
        text17=new Text();
        text18=new Text();
        cdPsLeft_imageView9=new ImageView();
        cdPsRight_imageView10=new ImageView();
        cdPsChangeLeft_button11=new rButton();
        cdPsChangeRight_button12=new rButton();
        text19=new Text();
        cdPsStylesheet_comboBox3=new ComboBox();
        columnConstraints11=new ColumnConstraints();
        columnConstraints12=new ColumnConstraints();
        columnConstraints13=new ColumnConstraints();
        rowConstraints9=new RowConstraints();
        rowConstraints10=new RowConstraints();
        rowConstraints11=new RowConstraints();
        rowConstraints12=new RowConstraints();
        text110=new Text();
        tab0=new Tab();
        scrollPane0=new ScrollPane();
        splitPane=new SplitPane();
        anchorPane3=new AnchorPane();
        scrollPane1=new ScrollPane();
        vBox3=new VBox();
        gridPane4=new GridPane();
        text111=new Text();
        columnConstraints14=new ColumnConstraints();
        rowConstraints13=new RowConstraints();
        anchorPane4=new AnchorPane();
        vBox4=new VBox();
        tdTa_tableView0=new TD_TATableView(ResourceGetter.getProperty("prop106"),
                                           ResourceGetter.getProperty("prop107"),
                                           ResourceGetter.getProperty("prop108"),app);
        tdTaUndergrad_tableColumn3=new TableColumn();
        tdTaName_tableColumn4=new TableColumn();
        tdTaEmail_tableColumn5=new TableColumn();
        text112=new Text();
        gridPane5=new GridPane();
        text113=new Text();
        tdTaEmail_textField2=new rTextField();
        tdTaName_textField3=new rTextField();
        tdTaAddUpdate_button13=new rButton();
        tdTaClear_button14=new rButton();
        text114=new Text();
        columnConstraints15=new ColumnConstraints();
        columnConstraints16=new ColumnConstraints();
        columnConstraints17=new ColumnConstraints();
        rowConstraints14=new RowConstraints();
        rowConstraints15=new RowConstraints();
        rowConstraints16=new RowConstraints();
        anchorPane5=new AnchorPane();
        scrollPane2=new ScrollPane();
        vBox5=new VBox();
        gridPane6=new GridPane();
        text115=new Text();
        columnConstraints18=new ColumnConstraints();
        rowConstraints17=new RowConstraints();
        anchorPane6=new AnchorPane();
        vBox6=new VBox();
        taOh_gridPane7=new OfficeHoursGrid();
        columnConstraints19=new ColumnConstraints();
        columnConstraints110=new ColumnConstraints();
        rowConstraints18=new RowConstraints();
        rowConstraints19=new RowConstraints();
        rowConstraints110=new RowConstraints();
        gridPane8=new GridPane();
        text116=new Text();
        text117=new Text();
        tdOhStartTime_comboBox4=new ComboBox();
        tdOhEndTime_comboBox5=new ComboBox();
        columnConstraints111=new ColumnConstraints();
        columnConstraints112=new ColumnConstraints();
        rowConstraints111=new RowConstraints();
        rowConstraints112=new RowConstraints();
        tab1=new Tab();
        scrollPane3=new ScrollPane();
        vBox7=new VBox();
        gridPane9=new GridPane();
        columnConstraints113=new ColumnConstraints();
        rowConstraints113=new RowConstraints();
        text118=new Text();
        anchorPane7=new AnchorPane();
        rd_tableView1=new RD_RecitationDataTableView(ResourceGetter.getProperty("prop144"),
                                                     ResourceGetter.getProperty("prop145"),
                                                     ResourceGetter.getProperty("prop146"),
                                                     ResourceGetter.getProperty("prop147"),
                                                     ResourceGetter.getProperty("prop148"),
                                                     ResourceGetter.getProperty("prop666"));
        rdSection_tableColumn6=new TableColumn();
        rdInstructor_tableColumn7=new TableColumn();
        rdRecitationData_tableColumn8=new TableColumn();
        rdTA1_tableColumn9=new TableColumn();
        rdTA2tableColumn10=new TableColumn();
        anchorPane8=new AnchorPane();
        vBox8=new VBox();
        text119=new Text();
        gridPane10=new GridPane();
        text1110=new Text();
        text1111=new Text();
        text1112=new Text();
        text1113=new Text();
        rdSection_textField4=new rTextField();
        rdInstructor_textField5=new rTextField();
        rdDayTime_textField6=new rTextField();
        rdLocation_textField7=new rTextField();
        rdAddUpdate_button15=new rButton();
        rdClear_button16=new rButton();
        rdTA1_comboBox6=new ComboBox();
        rdTA2_comboBox7=new ComboBox();
        text1114=new Text();
        text1115=new Text();
        columnConstraints114=new ColumnConstraints();
        columnConstraints115=new ColumnConstraints();
        rowConstraints114=new RowConstraints();
        rowConstraints115=new RowConstraints();
        rowConstraints116=new RowConstraints();
        rowConstraints117=new RowConstraints();
        rowConstraints118=new RowConstraints();
        rowConstraints119=new RowConstraints();
        rowConstraints1110=new RowConstraints();
        tab2=new Tab();
        scrollPane4=new ScrollPane();
        vBox9=new VBox();
        gridPane11=new GridPane();
        text1116=new Text();
        columnConstraints116=new ColumnConstraints();
        rowConstraints1111=new RowConstraints();
        anchorPane9=new AnchorPane();
        vBox10=new VBox();
        text1117=new Text();
        gridPane12=new GridPane();
        text1118=new Text();
        text1119=new Text();
        sdEndingFriday_datePicker=new DatePicker();
        sdStartingMonday_datePicker0=new DatePicker();
        columnConstraints117=new ColumnConstraints();
        columnConstraints118=new ColumnConstraints();
        columnConstraints119=new ColumnConstraints();
        columnConstraints1110=new ColumnConstraints();
        rowConstraints1112=new RowConstraints();
        anchorPane10=new AnchorPane();
        vBox11=new VBox();
        text11110=new Text();
        sdScheduledItems_tableView2=new SD_ScheduleItemsTableView(ResourceGetter.getProperty("prop198"),
                                                                  ResourceGetter.getProperty("prop199"),
                                                                  ResourceGetter.getProperty("prop200"),
                                                                  ResourceGetter.getProperty("prop201"));
        sdType_tableColumn11=new TableColumn();
        sdDate_tableColumn12=new TableColumn();
        sdTitle_tableColumn13=new TableColumn();
        sdTopic_tableColumn14=new TableColumn();
        anchorPane11=new AnchorPane();
        vBox12=new VBox();
        text11111=new Text();
        gridPane13=new GridPane();
        text11112=new Text();
        text11113=new Text();
        text11114=new Text();
        text11115=new Text();
        sdCriteria_textField8=new rTextField();
        sdTopic_textField9=new rTextField();
        sdTime_textField10=new rTextField();
        sdTitle_textField11=new rTextField();
        sdAddUpdate_button17=new rButton();
        sdClear_button18=new rButton();
        text11116=new Text();
        text11117=new Text();
        text11118=new Text();
        sdDate_datePicker1=new DatePicker();
        sdType_comboBox8=new ComboBox();
        sdLink_textField12=new rTextField();
        columnConstraints1111=new ColumnConstraints();
        columnConstraints1112=new ColumnConstraints();
        rowConstraints1113=new RowConstraints();
        rowConstraints1114=new RowConstraints();
        rowConstraints1115=new RowConstraints();
        rowConstraints1116=new RowConstraints();
        rowConstraints1117=new RowConstraints();
        rowConstraints1118=new RowConstraints();
        rowConstraints1119=new RowConstraints();
        rowConstraints11110=new RowConstraints();
        tab3=new Tab();
        scrollPane5=new ScrollPane();
        vBox13=new VBox();
        gridPane14=new GridPane();
        text11119=new Text();
        columnConstraints1113=new ColumnConstraints();
        rowConstraints11111=new RowConstraints();
        anchorPane12=new AnchorPane();
        vBox14=new VBox();
        text111110=new Text();
        pdT_tableView3=new PD_TeamsTableView(ResourceGetter.getProperty("prop244"),
                                             ResourceGetter.getProperty("prop245"),
                                             ResourceGetter.getProperty("prop246"),
                                             ResourceGetter.getProperty("prop247"));
        pdTUse_tableColumn15=new TableColumn();
        pdTNavbarTitle_tableColumn16=new TableColumn();
        pdTFileName_tableColumn17=new TableColumn();
        pdTScript_tableColumn18=new TableColumn();
        text111111=new Text();
        gridPane15=new GridPane();
        text111112=new Text();
        pdTLink_textField13=new rTextField();
        pdTName_textField14=new rTextField();
        pdTAddUpdate_button19=new rButton();
        pdTClear_button110=new rButton();
        text111113=new Text();
        text111114=new Text();
        text111115=new Text();
        pdTColor_circle=new Circle();
        pdTTextColor_circle0=new Circle();
        pdTColor_text111116=new ColorPicker();
        pdTTextColor_text111117=new ColorPicker();
        columnConstraints1114=new ColumnConstraints();
        columnConstraints1114b=new ColumnConstraints();
        columnConstraints1115=new ColumnConstraints();
        columnConstraints1116=new ColumnConstraints();
        columnConstraints1117=new ColumnConstraints();
        rowConstraints11112=new RowConstraints();
        rowConstraints11113=new RowConstraints();
        rowConstraints11114=new RowConstraints();
        rowConstraints11115=new RowConstraints();
        anchorPane13=new AnchorPane();
        vBox15=new VBox();
        text111118=new Text();
        pdS_tableView4=new PD_StudentsTableView(ResourceGetter.getProperty("prop272"),
                                                ResourceGetter.getProperty("prop273"),
                                                ResourceGetter.getProperty("prop274"),
                                                ResourceGetter.getProperty("prop275"));
        pdSFirstName_tableColumn19=new TableColumn();
        pdSLastName_tableColumn110=new TableColumn();
        pdSTeam_tableColumn111=new TableColumn();
        pdSRole_tableColumn112=new TableColumn();
        text111119=new Text();
        gridPane16=new GridPane();
        text1111110=new Text();
        text1111111=new Text();
        pdSTeam_combobox15=new ComboBox();
        pdSTeam_combobox15.setMinWidth(150);
        pdSFirstName_textField16=new rTextField();
        pdSLastName_textField17=new rTextField();
        pdSAddUpdate_button111=new rButton();
        pdSClear_button112=new rButton();
        text1111112=new Text();
        text1111113=new Text();
        pdSRole_textField18=new rTextField();
        columnConstraints1118=new ColumnConstraints();
        columnConstraints1119=new ColumnConstraints();
        rowConstraints11116=new RowConstraints();
        rowConstraints11117=new RowConstraints();
        rowConstraints11118=new RowConstraints();
        rowConstraints11119=new RowConstraints();
        rowConstraints111110=new RowConstraints();
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(1080.0);
        setPrefWidth(1000.0);
        setStyle(ResourceGetter.getProperty("prop0")); //$NON-NLS-1$
        getStylesheets().add(ResourceGetter.getProperty("prop1")); //$NON-NLS-1$
        anchorPane.setBlendMode(javafx.scene.effect.BlendMode.HARD_LIGHT);
        AnchorPane.setLeftAnchor(gridPane,0.0);
        AnchorPane.setRightAnchor(gridPane,0.0);
        AnchorPane.setTopAnchor(gridPane,0.0);
        gridPane.setLayoutY(15.0);
        gridPane.setStyle(ResourceGetter.getProperty("prop2")); //$NON-NLS-1$
        columnConstraints.setHgrow(javafx.scene.layout.Priority.NEVER);
        columnConstraints0.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        columnConstraints1.setHgrow(javafx.scene.layout.Priority.NEVER);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.ALWAYS);
        GridPane.setHgrow(toolBar,javafx.scene.layout.Priority.NEVER);
        GridPane.setVgrow(toolBar,javafx.scene.layout.Priority.ALWAYS);
        toolBar.setStyle(ResourceGetter.getProperty("prop3")); //$NON-NLS-1$
        new_button.setMnemonicParsing(false);
        new_button.setStyle(ResourceGetter.getProperty("prop4")); //$NON-NLS-1$
        imageView.setFitHeight(40.0);
        imageView.setFitWidth(100.0);
        imageView.setPickOnBounds(true);//Stylizer
        imageView.setPreserveRatio(true);
        // imageView.setImage(new Image(getClass().getResource("Icons/Newcopy.png").toExternalForm()));
        imageView.setImage(ResourceGetter.getImage(ResourceGetter.getProperty("prop5"))); //$NON-NLS-1$
        new_button.setGraphic(imageView);
        open_button0.setMnemonicParsing(false);
        open_button0.setStyle(ResourceGetter.getProperty("prop6")); //$NON-NLS-1$
        imageView0.setFitHeight(40.0);
        imageView0.setFitWidth(200.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        // imageView0.setImage(new Image(getClass().getResource("Icons/Foldercopy.png").toExternalForm()));
        imageView0.setImage(ResourceGetter.getImage(ResourceGetter.getProperty("prop7"))); //$NON-NLS-1$
        open_button0.setGraphic(imageView0);
        save_button1.setMnemonicParsing(false);
        save_button1.setStyle(ResourceGetter.getProperty("prop8")); //$NON-NLS-1$
        imageView1.setFitHeight(40.0);
        imageView1.setFitWidth(200.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        // imageView1.setImage(new Image(getClass().getResource("Icons/Floppycopy.png").toExternalForm()));
        imageView1.setImage(ResourceGetter.getImage(ResourceGetter.getProperty("prop9"))); //$NON-NLS-1$
        save_button1.setGraphic(imageView1);
        saveas_button2.setMnemonicParsing(false);
        saveas_button2.setStyle(ResourceGetter.getProperty("prop10")); //$NON-NLS-1$
        imageView2.setFitHeight(40.0);
        imageView2.setFitWidth(55.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(ResourceGetter.getImage(ResourceGetter.getProperty("prop11"))); //$NON-NLS-1$
        saveas_button2.setGraphic(imageView2);
        export_button3.setMnemonicParsing(false);
        export_button3.setStyle(ResourceGetter.getProperty("prop12")); //$NON-NLS-1$
        imageView3.setFitHeight(40.0);
        imageView3.setFitWidth(100.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        // imageView3.setImage(new Image(getClass().getResource("Icons/Exportcopy.png").toExternalForm()));
        imageView3.setImage(ResourceGetter.getImage(ResourceGetter.getProperty("prop13"))); //$NON-NLS-1$
        export_button3.setGraphic(imageView3);
        power_button4.setMnemonicParsing(false);
        power_button4.setStyle(ResourceGetter.getProperty("prop14")); //$NON-NLS-1$
        imageView4.setFitHeight(40.0);
        imageView4.setFitWidth(100.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setImage(ResourceGetter.getImage(ResourceGetter.getProperty("prop15"))); //$NON-NLS-1$
        power_button4.setGraphic(imageView4);
        GridPane.setColumnIndex(toolBar0,2);
        GridPane.setHgrow(toolBar0,javafx.scene.layout.Priority.NEVER);
        GridPane.setVgrow(toolBar0,javafx.scene.layout.Priority.ALWAYS);
        toolBar0.setStyle(ResourceGetter.getProperty("prop16")); //$NON-NLS-1$
        undo_button5.setMnemonicParsing(false);
        undo_button5.setStyle(ResourceGetter.getProperty("prop17")); //$NON-NLS-1$
        imageView5.setFitHeight(40.0);
        imageView5.setFitWidth(200.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        // imageView5.setImage(new Image(getClass().getResource("Icons/Undocopy.png").toExternalForm()));
        imageView5.setImage(ResourceGetter.getImage(ResourceGetter.getProperty("prop18"))); //$NON-NLS-1$
        undo_button5.setGraphic(imageView5);
        redo_button6.setMnemonicParsing(false);
        redo_button6.setStyle(ResourceGetter.getProperty("prop19")); //$NON-NLS-1$
        imageView6.setFitHeight(40.0);
        imageView6.setFitWidth(200.0);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);
        imageView6.setImage(ResourceGetter.getImage(ResourceGetter.getProperty("prop20"))); //$NON-NLS-1$
        redo_button6.setGraphic(imageView6);
        book_button7.setMnemonicParsing(false);
        book_button7.setStyle(ResourceGetter.getProperty("prop21")); //$NON-NLS-1$
        imageView7.setFitHeight(40.0);
        imageView7.setFitWidth(200.0);
        imageView7.setPickOnBounds(true);
        imageView7.setPreserveRatio(true);
        imageView7.setImage(ResourceGetter.getImage(ResourceGetter.getProperty("prop22"))); //$NON-NLS-1$
        book_button7.setGraphic(imageView7);
        gridPane.setPadding(new Insets(5.0));
        VBox.setVgrow(tabPane,javafx.scene.layout.Priority.ALWAYS);
        tabPane.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        tabPane.setOpacity(0.93);
        tabPane.setPrefHeight(200.0);
        tabPane.setPrefWidth(200.0);
        tabPane.getStylesheets().add(ResourceGetter.getProperty("prop23")); //$NON-NLS-1$
        tabPane.setTabClosingPolicy(javafx.scene.control.TabPane.TabClosingPolicy.UNAVAILABLE);
        tab.setStyle(ResourceGetter.getProperty("prop24")); //$NON-NLS-1$
        tab.setText(ResourceGetter.getProperty("prop25")); //$NON-NLS-1$
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);
        scrollPane.setPrefViewportHeight(1020.0);
        scrollPane.setPrefViewportWidth(1000.0);
        vBox.setSpacing(5.0);
        vBox.setStyle(ResourceGetter.getProperty("prop26")); //$NON-NLS-1$
        gridPane0.setAlignment(javafx.geometry.Pos.CENTER);
        GridPane.setHalignment(text,javafx.geometry.HPos.CENTER);
        text.setFill(javafx.scene.paint.Color.valueOf(ResourceGetter.getProperty("prop27"))); //$NON-NLS-1$
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setStyle(ResourceGetter.getProperty("prop28")); //$NON-NLS-1$
        text.setText(ResourceGetter.getProperty("prop29")); //$NON-NLS-1$
        // text.setFont(new Font(ResourceGetter.getProperty("prop30"),50.0)); //$NON-NLS-1$
        GridPane.setMargin(text,new Insets(5.0,0.0,5.0,0.0));
        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(0.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        anchorPane0.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        anchorPane0.setStyle(ResourceGetter.getProperty("prop31")); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(vBox0,0.0);
        AnchorPane.setLeftAnchor(vBox0,0.0);
        AnchorPane.setRightAnchor(vBox0,0.0);
        AnchorPane.setTopAnchor(vBox0,0.0);
        vBox0.setPrefHeight(251.0);
        vBox0.setPrefWidth(990.0);
        vBox0.setSpacing(5.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setStyle(ResourceGetter.getProperty("prop32")); //$NON-NLS-1$
        text0.setText(ResourceGetter.getProperty("prop33")); //$NON-NLS-1$
        // text0.setFont(new Font(ResourceGetter.getProperty("prop34"),13.0)); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(gridPane1,0.0);
        AnchorPane.setLeftAnchor(gridPane1,0.0);
        AnchorPane.setRightAnchor(gridPane1,0.0);
        AnchorPane.setTopAnchor(gridPane1,0.0);
        gridPane1.setCacheShape(false);
        gridPane1.setCenterShape(false);
        gridPane1.setFocusTraversable(true);
        gridPane1.setHgap(10.0);
        gridPane1.setScaleShape(false);
        gridPane1.setVgap(10.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText(ResourceGetter.getProperty("prop35")); //$NON-NLS-1$
        GridPane.setRowIndex(text2,1);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText(ResourceGetter.getProperty("prop36")); //$NON-NLS-1$
        GridPane.setColumnIndex(text3,3);
        GridPane.setHalignment(text3,javafx.geometry.HPos.LEFT);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText(ResourceGetter.getProperty("prop37")); //$NON-NLS-1$
        GridPane.setColumnIndex(text4,3);
        GridPane.setHalignment(text4,javafx.geometry.HPos.LEFT);
        GridPane.setRowIndex(text4,1);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setText(ResourceGetter.getProperty("prop38")); //$NON-NLS-1$
        GridPane.setRowIndex(text5,2);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText(ResourceGetter.getProperty("prop39")); //$NON-NLS-1$
        GridPane.setRowIndex(text6,3);
        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText(ResourceGetter.getProperty("prop40")); //$NON-NLS-1$
        GridPane.setRowIndex(text7,4);
        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText(ResourceGetter.getProperty("prop41")); //$NON-NLS-1$
        GridPane.setRowIndex(text8,5);
        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setText(ResourceGetter.getProperty("prop42")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdCiTitle_textField,1);
        GridPane.setColumnSpan(cdCiTitle_textField,2147483647);
        GridPane.setRowIndex(cdCiTitle_textField,2);
        cdCiTitle_textField.setPromptText(ResourceGetter.getProperty("prop43")); //$NON-NLS-1$
        cdCiTitle_textField.setStyle(ResourceGetter.getProperty("prop44")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdCiInstructorName_textField0,1);
        GridPane.setColumnSpan(cdCiInstructorName_textField0,2147483647);
        GridPane.setRowIndex(cdCiInstructorName_textField0,3);
        cdCiInstructorName_textField0.setPromptText(ResourceGetter.getProperty("prop45")); //$NON-NLS-1$
        cdCiInstructorName_textField0.setStyle(ResourceGetter.getProperty("prop46")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdCiInstructorHome_textField1,1);
        GridPane.setColumnSpan(cdCiInstructorHome_textField1,2147483647);
        GridPane.setRowIndex(cdCiInstructorHome_textField1,4);
        cdCiInstructorHome_textField1.setPromptText(ResourceGetter.getProperty("prop47")); //$NON-NLS-1$
        cdCiInstructorHome_textField1.setStyle(ResourceGetter.getProperty("prop48")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdCiSubject_comboBox,1);
        cdCiSubject_comboBox.setPrefWidth(150.0);
        cdCiSubject_comboBox.setPromptText(ResourceGetter.getProperty("prop49")); //$NON-NLS-1$
        cdCiSubject_comboBox.setStyle(ResourceGetter.getProperty("prop50")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdCiSemester_comboBox0,1);
        GridPane.setRowIndex(cdCiSemester_comboBox0,1);
        cdCiSemester_comboBox0.setPrefWidth(150.0);
        cdCiSemester_comboBox0.setPromptText(ResourceGetter.getProperty("prop51")); //$NON-NLS-1$
        cdCiSemester_comboBox0.setStyle(ResourceGetter.getProperty("prop52")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdCiNumber_comboBox1,4);
        GridPane.setHalignment(cdCiNumber_comboBox1,javafx.geometry.HPos.RIGHT);
        cdCiNumber_comboBox1.setPrefWidth(150.0);
        cdCiNumber_comboBox1.setPromptText(ResourceGetter.getProperty("prop53")); //$NON-NLS-1$
        cdCiNumber_comboBox1.setStyle(ResourceGetter.getProperty("prop54")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdCiYear_comboBox2,4);
        GridPane.setHalignment(cdCiYear_comboBox2,javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(cdCiYear_comboBox2,1);
        cdCiYear_comboBox2.setPrefWidth(150.0);
        cdCiYear_comboBox2.setPromptText(ResourceGetter.getProperty("prop55")); //$NON-NLS-1$
        cdCiYear_comboBox2.setStyle(ResourceGetter.getProperty("prop56")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdCiExportDir_text9,1);
        GridPane.setColumnSpan(cdCiExportDir_text9,3);
        GridPane.setHalignment(cdCiExportDir_text9,javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(cdCiExportDir_text9,5);
        cdCiExportDir_text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        cdCiExportDir_text9.setStrokeWidth(0.0);
        cdCiExportDir_text9.setText(ResourceGetter.getProperty("prop57")); //$NON-NLS-1$
        cdCiExportDir_text9.setUnderline(true);
        GridPane.setColumnIndex(cdCiChange_button8,4);
        GridPane.setHalignment(cdCiChange_button8,javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(cdCiChange_button8,5);
        cdCiChange_button8.setMnemonicParsing(false);
        cdCiChange_button8.setStyle(ResourceGetter.getProperty("prop58")); //$NON-NLS-1$
        cdCiChange_button8.setText(ResourceGetter.getProperty("prop59")); //$NON-NLS-1$
        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMaxWidth(938.9019165039062);
        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        columnConstraints5.setMinWidth(0.0);
        columnConstraints6.setHgrow(javafx.scene.layout.Priority.NEVER);
        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMaxWidth(1777.0434799194336);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        vBox0.setOpaqueInsets(new Insets(0.0));
        vBox0.setPadding(new Insets(10.0));
        anchorPane1.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        anchorPane1.setStyle(ResourceGetter.getProperty("prop60")); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(vBox1,0.0);
        AnchorPane.setLeftAnchor(vBox1,0.0);
        AnchorPane.setRightAnchor(vBox1,0.0);
        AnchorPane.setTopAnchor(vBox1,0.0);
        vBox1.setPrefHeight(180.0);
        vBox1.setPrefWidth(990.0);
        vBox1.setSpacing(5.0);
        text10.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text10.setStrokeWidth(0.0);
        text10.setStyle(ResourceGetter.getProperty("prop61")); //$NON-NLS-1$
        text10.setText(ResourceGetter.getProperty("prop62")); //$NON-NLS-1$
        text11.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11.setStrokeWidth(0.0);
        text11.setStyle(ResourceGetter.getProperty("prop63")); //$NON-NLS-1$
        text11.setText(ResourceGetter.getProperty("prop64")); //$NON-NLS-1$
        VBox.setVgrow(gridPane2,javafx.scene.layout.Priority.ALWAYS);
        gridPane2.setHgap(10.0);
        gridPane2.setVgap(10.0);
        columnConstraints8.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints9.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        columnConstraints10.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.ALWAYS);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.ALWAYS);
        rowConstraints8.setMinHeight(Double.parseDouble(ResourceGetter.getProperty("propMinSitePagesTableviewHeight")));
        GridPane.setColumnIndex(cdStChange_button9,2);
        GridPane.setHalignment(cdStChange_button9,javafx.geometry.HPos.RIGHT);
        cdStChange_button9.setMnemonicParsing(false);
        cdStChange_button9.setStyle(ResourceGetter.getProperty("prop65")); //$NON-NLS-1$
        cdStChange_button9.setText(ResourceGetter.getProperty("prop66")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdStTemplateDir_text12,1);
        GridPane.setHalignment(cdStTemplateDir_text12,javafx.geometry.HPos.CENTER);
        cdStTemplateDir_text12.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        cdStTemplateDir_text12.setStrokeWidth(0.0);
        cdStTemplateDir_text12.setText(ResourceGetter.getProperty("prop67")); //$NON-NLS-1$
        cdStTemplateDir_text12.setUnderline(true);
        text13.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text13.setStrokeWidth(0.0);
        text13.setText(ResourceGetter.getProperty("prop68")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdStSitePages_tableView,1);
        GridPane.setColumnSpan(cdStSitePages_tableView,2);
        GridPane.setRowIndex(cdStSitePages_tableView,1);
        cdStSitePages_tableView.setStyle(ResourceGetter.getProperty("prop69")); //$NON-NLS-1$
        cdStSitePages_tableView.getStylesheets().add(ResourceGetter.getProperty("prop70")); //$NON-NLS-1$
        cdStUse_tableColumn.setPrefWidth(75.0);
        cdStUse_tableColumn.setText(ResourceGetter.getProperty("prop71")); //$NON-NLS-1$
        cdStNavbarTitle_tableColumn0.setPrefWidth(75.0);
        // cdStNavbarTitle_tableColumn0.setStyle("-fx-background-color: #CBDFF2;");
        cdStNavbarTitle_tableColumn0.setText(ResourceGetter.getProperty("prop72")); //$NON-NLS-1$
        // cdStNavbarTitle_tableColumn0.setStyle("-fx-background-color: #CBDFF2;");
        cdStFileName_tableColumn1.setPrefWidth(75.0);
        // cdStFileName_tableColumn1.setStyle("-fx-background-color: #CBDFF2;");
        cdStFileName_tableColumn1.setText(ResourceGetter.getProperty("prop73")); //$NON-NLS-1$
        cdStScript_tableColumn2.setPrefWidth(75.0);
        // cdStScript_tableColumn2.setStyle("-fx-background-color: #CBDFF2;");
        cdStScript_tableColumn2.setText(ResourceGetter.getProperty("prop74")); //$NON-NLS-1$
        cdStSitePages_tableView.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        GridPane.setRowIndex(text14,1);
        text14.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text14.setStrokeWidth(0.0);
        text14.setText(ResourceGetter.getProperty("prop75")); //$NON-NLS-1$
        vBox1.setPadding(new Insets(10.0));
        anchorPane2.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        anchorPane2.setStyle(ResourceGetter.getProperty("prop76")); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(vBox2,0.0);
        AnchorPane.setLeftAnchor(vBox2,0.0);
        AnchorPane.setRightAnchor(vBox2,0.0);
        AnchorPane.setTopAnchor(vBox2,0.0);
        vBox2.setPrefHeight(151.0);
        vBox2.setPrefWidth(990.0);
        text15.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text15.setStrokeWidth(0.0);
        text15.setStyle(ResourceGetter.getProperty("prop77")); //$NON-NLS-1$
        text15.setText(ResourceGetter.getProperty("prop78")); //$NON-NLS-1$
        VBox.setVgrow(gridPane3,javafx.scene.layout.Priority.ALWAYS);
        gridPane3.setCacheShape(false);
        gridPane3.setCenterShape(false);
        gridPane3.setFocusTraversable(true);
        gridPane3.setHgap(10.0);
        gridPane3.setPrefWidth(998.0);
        gridPane3.setScaleShape(false);
        gridPane3.setVgap(10.0);
        text16.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text16.setStrokeWidth(0.0);
        text16.setText(ResourceGetter.getProperty("prop79")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdPsChangeBanner_button10,2);
        GridPane.setHalignment(cdPsChangeBanner_button10,javafx.geometry.HPos.RIGHT);
        cdPsChangeBanner_button10.setMnemonicParsing(false);
        cdPsChangeBanner_button10.setStyle(ResourceGetter.getProperty("prop80")); //$NON-NLS-1$
        cdPsChangeBanner_button10.setText(ResourceGetter.getProperty("prop81")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdPsBanner_imageView8,1);
        GridPane.setHalignment(cdPsBanner_imageView8,javafx.geometry.HPos.CENTER);
        cdPsBanner_imageView8.setFitHeight(150.0);
        cdPsBanner_imageView8.setFitWidth(200.0);
        cdPsBanner_imageView8.setPickOnBounds(true);
        cdPsBanner_imageView8.setPreserveRatio(true);
        cdPsBanner_imageView8.setImage(ResourceGetter.getImage(ResourceGetter.getProperty("prop82"))); //$NON-NLS-1$
        GridPane.setRowIndex(text17,1);
        text17.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text17.setStrokeWidth(0.0);
        text17.setText(ResourceGetter.getProperty("prop83")); //$NON-NLS-1$
        GridPane.setRowIndex(text18,2);
        text18.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text18.setStrokeWidth(0.0);
        text18.setText(ResourceGetter.getProperty("prop84")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdPsLeft_imageView9,1);
        GridPane.setHalignment(cdPsLeft_imageView9,javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(cdPsLeft_imageView9,1);
        cdPsLeft_imageView9.setFitHeight(150.0);
        cdPsLeft_imageView9.setFitWidth(200.0);
        cdPsLeft_imageView9.setPickOnBounds(true);
        cdPsLeft_imageView9.setPreserveRatio(true);
        cdPsLeft_imageView9.setImage(ResourceGetter.getImage(ResourceGetter.getProperty("prop85"))); //$NON-NLS-1$
        GridPane.setColumnIndex(cdPsRight_imageView10,1);
        GridPane.setHalignment(cdPsRight_imageView10,javafx.geometry.HPos.CENTER);
        GridPane.setRowIndex(cdPsRight_imageView10,2);
        cdPsRight_imageView10.setFitHeight(150.0);
        cdPsRight_imageView10.setFitWidth(200.0);
        cdPsRight_imageView10.setPickOnBounds(true);
        cdPsRight_imageView10.setPreserveRatio(true);
        cdPsRight_imageView10.setImage(ResourceGetter.getImage(ResourceGetter.getProperty("prop86"))); //$NON-NLS-1$
        GridPane.setColumnIndex(cdPsChangeLeft_button11,2);
        GridPane.setHalignment(cdPsChangeLeft_button11,javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(cdPsChangeLeft_button11,1);
        cdPsChangeLeft_button11.setMnemonicParsing(false);
        cdPsChangeLeft_button11.setStyle(ResourceGetter.getProperty("prop87")); //$NON-NLS-1$
        cdPsChangeLeft_button11.setText(ResourceGetter.getProperty("prop88")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdPsChangeRight_button12,2);
        GridPane.setHalignment(cdPsChangeRight_button12,javafx.geometry.HPos.RIGHT);
        GridPane.setRowIndex(cdPsChangeRight_button12,2);
        cdPsChangeRight_button12.setMnemonicParsing(false);
        cdPsChangeRight_button12.setStyle(ResourceGetter.getProperty("prop89")); //$NON-NLS-1$
        cdPsChangeRight_button12.setText(ResourceGetter.getProperty("prop90")); //$NON-NLS-1$
        GridPane.setRowIndex(text19,3);
        text19.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text19.setStrokeWidth(0.0);
        text19.setText(ResourceGetter.getProperty("prop91")); //$NON-NLS-1$
        GridPane.setColumnIndex(cdPsStylesheet_comboBox3,1);
        GridPane.setRowIndex(cdPsStylesheet_comboBox3,3);
        cdPsStylesheet_comboBox3.setPrefWidth(150.0);
        cdPsStylesheet_comboBox3.setPromptText(ResourceGetter.getProperty("prop92")); //$NON-NLS-1$
        cdPsStylesheet_comboBox3.setStyle(ResourceGetter.getProperty("prop93")); //$NON-NLS-1$
        columnConstraints11.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints12.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        columnConstraints12.setMaxWidth(Double.MAX_VALUE);
        columnConstraints13.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints9.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints10.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints11.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints12.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        text110.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text110.setStrokeWidth(0.0);
        text110.setStyle(ResourceGetter.getProperty("prop94")); //$NON-NLS-1$
        text110.setText(ResourceGetter.getProperty("prop95")); //$NON-NLS-1$
        VBox.setMargin(text110,new Insets(10.0,0.0,7.0,0.0));
        vBox2.setPadding(new Insets(10.0));
        vBox.setPadding(new Insets(5.0));
        scrollPane.setContent(vBox);
        tab.setContent(scrollPane);
        tab0.setStyle(ResourceGetter.getProperty("prop96")); //$NON-NLS-1$
        tab0.setText(ResourceGetter.getProperty("prop97")); //$NON-NLS-1$
        scrollPane0.setFitToHeight(true);
        scrollPane0.setFitToWidth(true);
        scrollPane0.setPrefViewportHeight(1020.0);
        scrollPane0.setPrefViewportWidth(1000.0);
        splitPane.setDividerPositions(0.3196392785571142);
        splitPane.setPrefHeight(160.0);
        splitPane.setPrefWidth(200.0);
        anchorPane3.setMinHeight(0.0);
        anchorPane3.setMinWidth(0.0);
        anchorPane3.setPrefHeight(160.0);
        anchorPane3.setPrefWidth(100.0);
        AnchorPane.setBottomAnchor(scrollPane1,0.0);
        AnchorPane.setLeftAnchor(scrollPane1,0.0);
        AnchorPane.setRightAnchor(scrollPane1,0.0);
        AnchorPane.setTopAnchor(scrollPane1,0.0);
        scrollPane1.setFitToHeight(true);
        scrollPane1.setFitToWidth(true);
        scrollPane1.setPrefViewportHeight(984.0);
        scrollPane1.setPrefViewportWidth(419.0);
        AnchorPane.setBottomAnchor(vBox3,0.0);
        AnchorPane.setLeftAnchor(vBox3,0.0);
        AnchorPane.setRightAnchor(vBox3,0.0);
        AnchorPane.setTopAnchor(vBox3,0.0);
        vBox3.setPrefHeight(984.0);
        vBox3.setPrefWidth(518.0);
        vBox3.setSpacing(5.0);
        vBox3.setStyle(ResourceGetter.getProperty("prop98")); //$NON-NLS-1$
        gridPane4.setAlignment(javafx.geometry.Pos.CENTER);
        GridPane.setHalignment(text111,javafx.geometry.HPos.CENTER);
        text111.setFill(javafx.scene.paint.Color.valueOf(ResourceGetter.getProperty("prop99"))); //$NON-NLS-1$
        text111.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text111.setStrokeWidth(0.0);
        text111.setStyle(ResourceGetter.getProperty("prop100")); //$NON-NLS-1$
        text111.setText(ResourceGetter.getProperty("prop101")); //$NON-NLS-1$
        // text111.setFont(new Font(ResourceGetter.getProperty("prop102"),50.0)); //$NON-NLS-1$
        GridPane.setMargin(text111,new Insets(5.0,0.0,5.0,0.0));
        columnConstraints14.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints14.setMinWidth(0.0);
        rowConstraints13.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        anchorPane4.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        anchorPane4.setStyle(ResourceGetter.getProperty("prop103")); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(vBox4,0.0);
        AnchorPane.setLeftAnchor(vBox4,0.0);
        AnchorPane.setRightAnchor(vBox4,0.0);
        AnchorPane.setTopAnchor(vBox4,0.0);
        vBox4.setSpacing(5.0);
        tdTa_tableView0.setStyle(ResourceGetter.getProperty("prop104")); //$NON-NLS-1$
        tdTa_tableView0.getStylesheets().add(ResourceGetter.getProperty("prop105")); //$NON-NLS-1$
        tdTa_tableView0.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        tdTaUndergrad_tableColumn3.setPrefWidth(75.0);
        tdTaUndergrad_tableColumn3.setText(ResourceGetter.getProperty("prop106")); //$NON-NLS-1$
        tdTaName_tableColumn4.setPrefWidth(75.0);
        // tdTaName_tableColumn4.setStyle("-fx-background-color: #553366;");
        tdTaName_tableColumn4.setText(ResourceGetter.getProperty("prop107")); //$NON-NLS-1$
        tdTaEmail_tableColumn5.setPrefWidth(75.0);
        tdTaEmail_tableColumn5.setText(ResourceGetter.getProperty("prop108")); //$NON-NLS-1$
        text112.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text112.setStrokeWidth(0.0);
        text112.setStyle(ResourceGetter.getProperty("prop109")); //$NON-NLS-1$
        text112.setText(ResourceGetter.getProperty("prop110")); //$NON-NLS-1$
        // text112.setFont(new Font(ResourceGetter.getProperty("prop111"),13.0)); //$NON-NLS-1$
        VBox.setMargin(text112,new Insets(10.0,0.0,10.0,0.0));
        AnchorPane.setBottomAnchor(gridPane5,0.0);
        AnchorPane.setLeftAnchor(gridPane5,0.0);
        AnchorPane.setRightAnchor(gridPane5,0.0);
        AnchorPane.setTopAnchor(gridPane5,0.0);
        gridPane5.setCacheShape(false);
        gridPane5.setCenterShape(false);
        gridPane5.setFocusTraversable(true);
        gridPane5.setHgap(10.0);
        gridPane5.setScaleShape(false);
        gridPane5.setVgap(10.0);
        text113.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text113.setStrokeWidth(0.0);
        text113.setText(ResourceGetter.getProperty("prop112")); //$NON-NLS-1$
        GridPane.setColumnIndex(tdTaEmail_textField2,1);
        GridPane.setColumnSpan(tdTaEmail_textField2,2147483647);
        GridPane.setRowIndex(tdTaEmail_textField2,1);
        tdTaEmail_textField2.setPromptText(ResourceGetter.getProperty("prop113")); //$NON-NLS-1$
        tdTaEmail_textField2.setStyle(ResourceGetter.getProperty("prop114")); //$NON-NLS-1$
        GridPane.setColumnIndex(tdTaName_textField3,1);
        GridPane.setColumnSpan(tdTaName_textField3,2147483647);
        tdTaName_textField3.setPromptText(ResourceGetter.getProperty("prop115")); //$NON-NLS-1$
        tdTaName_textField3.setStyle(ResourceGetter.getProperty("prop116")); //$NON-NLS-1$
        GridPane.setRowIndex(tdTaAddUpdate_button13,2);
        tdTaAddUpdate_button13.setMaxWidth(100.0);
        tdTaAddUpdate_button13.setMinWidth(100.0);
        tdTaAddUpdate_button13.setMnemonicParsing(false);
        tdTaAddUpdate_button13.setStyle(ResourceGetter.getProperty("prop117")); //$NON-NLS-1$
        tdTaAddUpdate_button13.setText(ResourceGetter.getProperty("prop118")); //$NON-NLS-1$
        GridPane.setColumnIndex(tdTaClear_button14,1);
        GridPane.setRowIndex(tdTaClear_button14,2);
        tdTaClear_button14.setMaxWidth(100.0);
        tdTaClear_button14.setMnemonicParsing(false);
        tdTaClear_button14.setStyle(ResourceGetter.getProperty("prop119")); //$NON-NLS-1$
        tdTaClear_button14.setText(ResourceGetter.getProperty("prop120")); //$NON-NLS-1$
        GridPane.setRowIndex(text114,1);
        text114.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text114.setStrokeWidth(0.0);
        text114.setText(ResourceGetter.getProperty("prop121")); //$NON-NLS-1$
        columnConstraints15.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints15.setMaxWidth(938.9019165039062);
        columnConstraints16.setPrefWidth(200.0);
        columnConstraints17.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        rowConstraints14.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints15.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints16.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        vBox4.setOpaqueInsets(new Insets(0.0));
        vBox4.setPadding(new Insets(10.0));
        vBox3.setPadding(new Insets(5.0));
        scrollPane1.setContent(vBox3);
        anchorPane5.setMinHeight(0.0);
        anchorPane5.setMinWidth(0.0);
        anchorPane5.setPrefHeight(160.0);
        anchorPane5.setPrefWidth(100.0);
        AnchorPane.setBottomAnchor(scrollPane2,0.0);
        AnchorPane.setLeftAnchor(scrollPane2,0.0);
        AnchorPane.setRightAnchor(scrollPane2,0.0);
        AnchorPane.setTopAnchor(scrollPane2,0.0);
        scrollPane2.setFitToHeight(true);
        scrollPane2.setFitToWidth(true);
        scrollPane2.setPrefViewportHeight(984.0);
        scrollPane2.setPrefViewportWidth(419.0);
        AnchorPane.setBottomAnchor(vBox5,0.0);
        AnchorPane.setLeftAnchor(vBox5,0.0);
        AnchorPane.setRightAnchor(vBox5,0.0);
        AnchorPane.setTopAnchor(vBox5,0.0);
        vBox5.setPrefHeight(984.0);
        vBox5.setPrefWidth(518.0);
        vBox5.setSpacing(5.0);
        vBox5.setStyle(ResourceGetter.getProperty("prop122")); //$NON-NLS-1$
        gridPane6.setAlignment(javafx.geometry.Pos.CENTER);
        GridPane.setHalignment(text115,javafx.geometry.HPos.CENTER);
        text115.setFill(javafx.scene.paint.Color.valueOf(ResourceGetter.getProperty("prop123"))); //$NON-NLS-1$
        text115.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text115.setStrokeWidth(0.0);
        text115.setStyle(ResourceGetter.getProperty("prop124")); //$NON-NLS-1$
        text115.setText(ResourceGetter.getProperty("prop125")); //$NON-NLS-1$
        // text115.setFont(new Font(ResourceGetter.getProperty("prop126"),50.0)); //$NON-NLS-1$
        GridPane.setMargin(text115,new Insets(5.0,0.0,5.0,0.0));
        columnConstraints18.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints18.setMinWidth(0.0);
        rowConstraints17.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        anchorPane6.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        anchorPane6.setStyle(ResourceGetter.getProperty("prop127")); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(vBox6,0.0);
        AnchorPane.setLeftAnchor(vBox6,0.0);
        AnchorPane.setRightAnchor(vBox6,0.0);
        AnchorPane.setTopAnchor(vBox6,0.0);
        vBox6.setSpacing(5.0);
        columnConstraints19.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints19.setMinWidth(10.0);
        columnConstraints19.setPrefWidth(100.0);
        columnConstraints110.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints110.setMinWidth(10.0);
        columnConstraints110.setPrefWidth(100.0);
        rowConstraints18.setMinHeight(10.0);
        rowConstraints18.setPrefHeight(30.0);
        rowConstraints18.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints19.setMinHeight(10.0);
        rowConstraints19.setPrefHeight(30.0);
        rowConstraints19.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints110.setMinHeight(10.0);
        rowConstraints110.setPrefHeight(30.0);
        rowConstraints110.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        AnchorPane.setBottomAnchor(gridPane8,0.0);
        AnchorPane.setLeftAnchor(gridPane8,0.0);
        AnchorPane.setRightAnchor(gridPane8,0.0);
        AnchorPane.setTopAnchor(gridPane8,0.0);
        gridPane8.setCacheShape(false);
        gridPane8.setCenterShape(false);
        gridPane8.setFocusTraversable(true);
        gridPane8.setHgap(10.0);
        gridPane8.setScaleShape(false);
        gridPane8.setVgap(10.0);
        text116.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text116.setStrokeWidth(0.0);
        text116.setText(ResourceGetter.getProperty("prop128")); //$NON-NLS-1$
        GridPane.setRowIndex(text117,1);
        text117.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text117.setStrokeWidth(0.0);
        text117.setText(ResourceGetter.getProperty("prop129")); //$NON-NLS-1$
        GridPane.setColumnIndex(tdOhStartTime_comboBox4,1);
        tdOhStartTime_comboBox4.setPrefWidth(150.0);
        tdOhStartTime_comboBox4.setPromptText(ResourceGetter.getProperty("prop130")); //$NON-NLS-1$
        tdOhStartTime_comboBox4.setStyle(ResourceGetter.getProperty("prop131")); //$NON-NLS-1$
        GridPane.setColumnIndex(tdOhEndTime_comboBox5,1);
        GridPane.setRowIndex(tdOhEndTime_comboBox5,1);
        tdOhEndTime_comboBox5.setPrefWidth(150.0);
        tdOhEndTime_comboBox5.setPromptText(ResourceGetter.getProperty("prop132")); //$NON-NLS-1$
        tdOhEndTime_comboBox5.setStyle(ResourceGetter.getProperty("prop133")); //$NON-NLS-1$
        columnConstraints111.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        columnConstraints111.setMaxWidth(938.9019165039062);
        columnConstraints112.setPrefWidth(1000.0);
        rowConstraints111.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints112.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        gridPane8.setPadding(new Insets(10.0,0.0,0.0,0.0));
        vBox6.setOpaqueInsets(new Insets(0.0));
        vBox6.setPadding(new Insets(10.0));
        vBox5.setPadding(new Insets(5.0));
        scrollPane2.setContent(vBox5);
        scrollPane0.setContent(splitPane);
        tab0.setContent(scrollPane0);
        tab1.setStyle(ResourceGetter.getProperty("prop134")); //$NON-NLS-1$
        tab1.setText(ResourceGetter.getProperty("prop135")); //$NON-NLS-1$
        scrollPane3.setFitToHeight(true);
        scrollPane3.setFitToWidth(true);
        scrollPane3.setPrefViewportHeight(1020.0);
        scrollPane3.setPrefViewportWidth(1000.0);
        vBox7.setSpacing(5.0);
        vBox7.setStyle(ResourceGetter.getProperty("prop136")); //$NON-NLS-1$
        gridPane9.setAlignment(javafx.geometry.Pos.CENTER);
        columnConstraints113.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints113.setMinWidth(10.0);
        rowConstraints113.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        GridPane.setHalignment(text118,javafx.geometry.HPos.CENTER);
        text118.setFill(javafx.scene.paint.Color.valueOf(ResourceGetter.getProperty("prop137"))); //$NON-NLS-1$
        text118.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text118.setStrokeWidth(0.0);
        text118.setStyle(ResourceGetter.getProperty("prop138")); //$NON-NLS-1$
        text118.setText(ResourceGetter.getProperty("prop139")); //$NON-NLS-1$
        // text118.setFont(new Font(ResourceGetter.getProperty("prop140"),50.0)); //$NON-NLS-1$
        GridPane.setMargin(text118,new Insets(5.0,0.0,5.0,0.0));
        anchorPane7.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        anchorPane7.setStyle(ResourceGetter.getProperty("prop141")); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(rd_tableView1,10.0);
        AnchorPane.setLeftAnchor(rd_tableView1,10.0);
        AnchorPane.setRightAnchor(rd_tableView1,10.0);
        AnchorPane.setTopAnchor(rd_tableView1,10.0);
        rd_tableView1.setStyle(ResourceGetter.getProperty("prop142")); //$NON-NLS-1$
        rd_tableView1.getStylesheets().add(ResourceGetter.getProperty("prop143")); //$NON-NLS-1$
        rd_tableView1.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        rdSection_tableColumn6.setPrefWidth(75.0);
        rdSection_tableColumn6.setText(ResourceGetter.getProperty("prop144")); //$NON-NLS-1$
        rdInstructor_tableColumn7.setPrefWidth(75.0);
        // rdInstructor_tableColumn7.setStyle("-fx-background-color: #553366;");
        rdInstructor_tableColumn7.setText(ResourceGetter.getProperty("prop145")); //$NON-NLS-1$
        rdRecitationData_tableColumn8.setPrefWidth(75.0);
        rdRecitationData_tableColumn8.setText(ResourceGetter.getProperty("prop146")); //$NON-NLS-1$
        rdTA1_tableColumn9.setPrefWidth(75.0);
        rdTA1_tableColumn9.setText(ResourceGetter.getProperty("prop147")); //$NON-NLS-1$
        rdTA2tableColumn10.setPrefWidth(75.0);
        rdTA2tableColumn10.setText(ResourceGetter.getProperty("prop148")); //$NON-NLS-1$
        anchorPane8.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        anchorPane8.setStyle(ResourceGetter.getProperty("prop149")); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(vBox8,0.0);
        AnchorPane.setLeftAnchor(vBox8,0.0);
        AnchorPane.setRightAnchor(vBox8,0.0);
        AnchorPane.setTopAnchor(vBox8,0.0);
        text119.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text119.setStrokeWidth(0.0);
        text119.setStyle(ResourceGetter.getProperty("prop150")); //$NON-NLS-1$
        text119.setText(ResourceGetter.getProperty("prop151")); //$NON-NLS-1$
        // text119.setFont(new Font(ResourceGetter.getProperty("prop152"),13.0)); //$NON-NLS-1$
        VBox.setMargin(text119,new Insets(0.0,0.0,10.0,0.0));
        AnchorPane.setBottomAnchor(gridPane10,0.0);
        AnchorPane.setLeftAnchor(gridPane10,0.0);
        AnchorPane.setRightAnchor(gridPane10,0.0);
        AnchorPane.setTopAnchor(gridPane10,0.0);
        gridPane10.setCacheShape(false);
        gridPane10.setCenterShape(false);
        gridPane10.setFocusTraversable(true);
        gridPane10.setHgap(10.0);
        gridPane10.setScaleShape(false);
        gridPane10.setVgap(10.0);
        text1110.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1110.setStrokeWidth(0.0);
        text1110.setText(ResourceGetter.getProperty("prop153")); //$NON-NLS-1$
        GridPane.setRowIndex(text1111,1);
        text1111.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1111.setStrokeWidth(0.0);
        text1111.setText(ResourceGetter.getProperty("prop154")); //$NON-NLS-1$
        GridPane.setRowIndex(text1112,2);
        text1112.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1112.setStrokeWidth(0.0);
        text1112.setText(ResourceGetter.getProperty("prop155")); //$NON-NLS-1$
        GridPane.setRowIndex(text1113,3);
        text1113.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1113.setStrokeWidth(0.0);
        text1113.setText(ResourceGetter.getProperty("prop156")); //$NON-NLS-1$
        GridPane.setColumnIndex(rdSection_textField4,1);
        GridPane.setColumnSpan(rdSection_textField4,2147483647);
        rdSection_textField4.setPromptText(ResourceGetter.getProperty("prop157")); //$NON-NLS-1$
        rdSection_textField4.setStyle(ResourceGetter.getProperty("prop158")); //$NON-NLS-1$
        GridPane.setColumnIndex(rdInstructor_textField5,1);
        GridPane.setColumnSpan(rdInstructor_textField5,2147483647);
        GridPane.setRowIndex(rdInstructor_textField5,1);
        rdInstructor_textField5.setPromptText(ResourceGetter.getProperty("prop159")); //$NON-NLS-1$
        rdInstructor_textField5.setStyle(ResourceGetter.getProperty("prop160")); //$NON-NLS-1$
        GridPane.setColumnIndex(rdDayTime_textField6,1);
        GridPane.setColumnSpan(rdDayTime_textField6,2147483647);
        GridPane.setRowIndex(rdDayTime_textField6,2);
        rdDayTime_textField6.setPromptText(ResourceGetter.getProperty("prop161")); //$NON-NLS-1$
        rdDayTime_textField6.setStyle(ResourceGetter.getProperty("prop162")); //$NON-NLS-1$
        GridPane.setColumnIndex(rdLocation_textField7,1);
        GridPane.setColumnSpan(rdLocation_textField7,2147483647);
        GridPane.setRowIndex(rdLocation_textField7,3);
        rdLocation_textField7.setPromptText(ResourceGetter.getProperty("prop163")); //$NON-NLS-1$
        rdLocation_textField7.setStyle(ResourceGetter.getProperty("prop164")); //$NON-NLS-1$
        GridPane.setRowIndex(rdAddUpdate_button15,6);
        rdAddUpdate_button15.setMaxWidth(100.0);
        rdAddUpdate_button15.setMinWidth(100.0);
        rdAddUpdate_button15.setMnemonicParsing(false);
        rdAddUpdate_button15.setStyle(ResourceGetter.getProperty("prop165")); //$NON-NLS-1$
        rdAddUpdate_button15.setText(ResourceGetter.getProperty("prop166")); //$NON-NLS-1$
        GridPane.setColumnIndex(rdClear_button16,1);
        GridPane.setRowIndex(rdClear_button16,6);
        rdClear_button16.setMaxWidth(100.0);
        rdClear_button16.setMnemonicParsing(false);
        rdClear_button16.setStyle(ResourceGetter.getProperty("prop167")); //$NON-NLS-1$
        rdClear_button16.setText(ResourceGetter.getProperty("prop168")); //$NON-NLS-1$
        GridPane.setColumnIndex(rdTA1_comboBox6,1);
        GridPane.setRowIndex(rdTA1_comboBox6,4);
        rdTA1_comboBox6.setPrefWidth(150.0);
        rdTA1_comboBox6.setPromptText(ResourceGetter.getProperty("prop169")); //$NON-NLS-1$
        rdTA1_comboBox6.setStyle(ResourceGetter.getProperty("prop170")); //$NON-NLS-1$
        GridPane.setColumnIndex(rdTA2_comboBox7,1);
        GridPane.setRowIndex(rdTA2_comboBox7,5);
        rdTA2_comboBox7.setPrefWidth(150.0);
        rdTA2_comboBox7.setPromptText(ResourceGetter.getProperty("prop171")); //$NON-NLS-1$
        rdTA2_comboBox7.setStyle(ResourceGetter.getProperty("prop172")); //$NON-NLS-1$
        GridPane.setRowIndex(text1114,4);
        text1114.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1114.setStrokeWidth(0.0);
        text1114.setText(ResourceGetter.getProperty("prop173")); //$NON-NLS-1$
        GridPane.setRowIndex(text1115,5);
        text1115.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1115.setStrokeWidth(0.0);
        text1115.setText(ResourceGetter.getProperty("prop174")); //$NON-NLS-1$
        columnConstraints114.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints114.setMaxWidth(938.9019165039062);
        columnConstraints115.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        columnConstraints115.setMinWidth(50.0);
        rowConstraints114.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints115.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints116.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints117.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints118.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints119.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints1110.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        vBox8.setOpaqueInsets(new Insets(0.0));
        vBox8.setPadding(new Insets(10.0));
        vBox7.setPadding(new Insets(5.0));
        scrollPane3.setContent(vBox7);
        tab1.setContent(scrollPane3);
        tab2.setStyle(ResourceGetter.getProperty("prop175")); //$NON-NLS-1$
        tab2.setText(ResourceGetter.getProperty("prop176")); //$NON-NLS-1$
        scrollPane4.setFitToHeight(true);
        scrollPane4.setFitToWidth(true);
        scrollPane4.setPrefViewportHeight(1020.0);
        scrollPane4.setPrefViewportWidth(1000.0);
        vBox9.setSpacing(5.0);
        vBox9.setStyle(ResourceGetter.getProperty("prop177")); //$NON-NLS-1$
        gridPane11.setAlignment(javafx.geometry.Pos.CENTER);
        GridPane.setHalignment(text1116,javafx.geometry.HPos.CENTER);
        text1116.setFill(javafx.scene.paint.Color.valueOf(ResourceGetter.getProperty("prop178"))); //$NON-NLS-1$
        text1116.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1116.setStrokeWidth(0.0);
        text1116.setStyle(ResourceGetter.getProperty("prop179")); //$NON-NLS-1$
        text1116.setText(ResourceGetter.getProperty("prop180")); //$NON-NLS-1$
        // text1116.setFont(new Font(ResourceGetter.getProperty("prop181"),50.0)); //$NON-NLS-1$
        GridPane.setMargin(text1116,new Insets(5.0,0.0,5.0,0.0));
        columnConstraints116.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints116.setMinWidth(10.0);
        rowConstraints1111.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        anchorPane9.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        anchorPane9.setStyle(ResourceGetter.getProperty("prop182")); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(vBox10,0.0);
        AnchorPane.setLeftAnchor(vBox10,0.0);
        AnchorPane.setRightAnchor(vBox10,0.0);
        AnchorPane.setTopAnchor(vBox10,0.0);
        vBox10.setSpacing(5.0);
        text1117.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1117.setStrokeWidth(0.0);
        text1117.setStyle(ResourceGetter.getProperty("prop183")); //$NON-NLS-1$
        text1117.setText(ResourceGetter.getProperty("prop184")); //$NON-NLS-1$
        // text1117.setFont(new Font(ResourceGetter.getProperty("prop185"),13.0)); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(gridPane12,0.0);
        AnchorPane.setLeftAnchor(gridPane12,0.0);
        AnchorPane.setRightAnchor(gridPane12,0.0);
        AnchorPane.setTopAnchor(gridPane12,0.0);
        gridPane12.setCacheShape(false);
        gridPane12.setCenterShape(false);
        gridPane12.setFocusTraversable(true);
        gridPane12.setHgap(10.0);
        gridPane12.setScaleShape(false);
        gridPane12.setVgap(10.0);
        text1118.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1118.setStrokeWidth(0.0);
        text1118.setText(ResourceGetter.getProperty("prop186")); //$NON-NLS-1$
        GridPane.setColumnIndex(text1119,2);
        GridPane.setHalignment(text1119,javafx.geometry.HPos.LEFT);
        text1119.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1119.setStrokeWidth(0.0);
        text1119.setText(ResourceGetter.getProperty("prop187")); //$NON-NLS-1$
        GridPane.setColumnIndex(sdEndingFriday_datePicker,3);
        sdEndingFriday_datePicker.setPromptText(ResourceGetter.getProperty("prop188")); //$NON-NLS-1$
        sdEndingFriday_datePicker.setStyle(ResourceGetter.getProperty("prop189")); //$NON-NLS-1$
        GridPane.setColumnIndex(sdStartingMonday_datePicker0,1);
        sdStartingMonday_datePicker0.setPromptText(ResourceGetter.getProperty("prop190")); //$NON-NLS-1$
        sdStartingMonday_datePicker0.setStyle(ResourceGetter.getProperty("prop191")); //$NON-NLS-1$
        columnConstraints117.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints117.setMaxWidth(938.9019165039062);
        columnConstraints118.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        columnConstraints118.setMinWidth(50.0);
        columnConstraints119.setHgrow(javafx.scene.layout.Priority.NEVER);
        columnConstraints1110.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1110.setMaxWidth(1777.0434799194336);
        vBox10.setOpaqueInsets(new Insets(0.0));
        vBox10.setPadding(new Insets(10.0));
        anchorPane10.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        anchorPane10.setStyle(ResourceGetter.getProperty("prop192")); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(vBox11,0.0);
        AnchorPane.setLeftAnchor(vBox11,0.0);
        AnchorPane.setRightAnchor(vBox11,0.0);
        AnchorPane.setTopAnchor(vBox11,0.0);
        vBox11.setLayoutX(10.0);
        vBox11.setLayoutY(10.0);
        vBox11.setSpacing(5.0);
        text11110.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11110.setStrokeWidth(0.0);
        text11110.setStyle(ResourceGetter.getProperty("prop193")); //$NON-NLS-1$
        text11110.setText(ResourceGetter.getProperty("prop194")); //$NON-NLS-1$
        // text11110.setFont(new Font(ResourceGetter.getProperty("prop195"),13.0)); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(sdScheduledItems_tableView2,10.0);
        AnchorPane.setLeftAnchor(sdScheduledItems_tableView2,10.0);
        AnchorPane.setRightAnchor(sdScheduledItems_tableView2,10.0);
        AnchorPane.setTopAnchor(sdScheduledItems_tableView2,10.0);
        sdScheduledItems_tableView2.setStyle(ResourceGetter.getProperty("prop196")); //$NON-NLS-1$
        sdScheduledItems_tableView2.getStylesheets().add(ResourceGetter.getProperty("prop197")); //$NON-NLS-1$
        sdScheduledItems_tableView2.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        sdType_tableColumn11.setPrefWidth(75.0);
        sdType_tableColumn11.setText(ResourceGetter.getProperty("prop198")); //$NON-NLS-1$
        sdDate_tableColumn12.setPrefWidth(75.0);
        // sdDate_tableColumn12.setStyle("-fx-background-color: #553366;");
        sdDate_tableColumn12.setText(ResourceGetter.getProperty("prop199")); //$NON-NLS-1$
        sdTitle_tableColumn13.setPrefWidth(75.0);
        sdTitle_tableColumn13.setText(ResourceGetter.getProperty("prop200")); //$NON-NLS-1$
        sdTopic_tableColumn14.setPrefWidth(75.0);
        sdTopic_tableColumn14.setText(ResourceGetter.getProperty("prop201")); //$NON-NLS-1$
        vBox11.setPadding(new Insets(10.0));
        anchorPane11.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        anchorPane11.setStyle(ResourceGetter.getProperty("prop202")); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(vBox12,0.0);
        AnchorPane.setLeftAnchor(vBox12,0.0);
        AnchorPane.setRightAnchor(vBox12,0.0);
        AnchorPane.setTopAnchor(vBox12,0.0);
        vBox12.setSpacing(5.0);
        text11111.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11111.setStrokeWidth(0.0);
        text11111.setStyle(ResourceGetter.getProperty("prop203")); //$NON-NLS-1$
        text11111.setText(ResourceGetter.getProperty("prop204")); //$NON-NLS-1$
        // text11111.setFont(new Font(ResourceGetter.getProperty("prop205"),13.0)); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(gridPane13,0.0);
        AnchorPane.setLeftAnchor(gridPane13,0.0);
        AnchorPane.setRightAnchor(gridPane13,0.0);
        AnchorPane.setTopAnchor(gridPane13,0.0);
        gridPane13.setCacheShape(false);
        gridPane13.setCenterShape(false);
        gridPane13.setFocusTraversable(true);
        gridPane13.setHgap(10.0);
        gridPane13.setScaleShape(false);
        gridPane13.setVgap(10.0);
        text11112.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11112.setStrokeWidth(0.0);
        text11112.setText(ResourceGetter.getProperty("prop206")); //$NON-NLS-1$
        GridPane.setRowIndex(text11113,1);
        text11113.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11113.setStrokeWidth(0.0);
        text11113.setText(ResourceGetter.getProperty("prop207")); //$NON-NLS-1$
        GridPane.setRowIndex(text11114,2);
        text11114.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11114.setStrokeWidth(0.0);
        text11114.setText(ResourceGetter.getProperty("prop208")); //$NON-NLS-1$
        GridPane.setRowIndex(text11115,3);
        text11115.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11115.setStrokeWidth(0.0);
        text11115.setText(ResourceGetter.getProperty("prop209")); //$NON-NLS-1$
        GridPane.setColumnIndex(sdCriteria_textField8,1);
        GridPane.setColumnSpan(sdCriteria_textField8,2147483647);
        GridPane.setRowIndex(sdCriteria_textField8,6);
        sdCriteria_textField8.setPromptText(ResourceGetter.getProperty("prop210")); //$NON-NLS-1$
        sdCriteria_textField8.setStyle(ResourceGetter.getProperty("prop211")); //$NON-NLS-1$
        GridPane.setColumnIndex(sdTopic_textField9,1);
        GridPane.setColumnSpan(sdTopic_textField9,2147483647);
        GridPane.setRowIndex(sdTopic_textField9,4);
        sdTopic_textField9.setPromptText(ResourceGetter.getProperty("prop212")); //$NON-NLS-1$
        sdTopic_textField9.setStyle(ResourceGetter.getProperty("prop213")); //$NON-NLS-1$
        GridPane.setColumnIndex(sdTime_textField10,1);
        GridPane.setColumnSpan(sdTime_textField10,2147483647);
        GridPane.setRowIndex(sdTime_textField10,2);
        sdTime_textField10.setPromptText(ResourceGetter.getProperty("prop214")); //$NON-NLS-1$
        sdTime_textField10.setStyle(ResourceGetter.getProperty("prop215")); //$NON-NLS-1$
        GridPane.setColumnIndex(sdTitle_textField11,1);
        GridPane.setColumnSpan(sdTitle_textField11,2147483647);
        GridPane.setRowIndex(sdTitle_textField11,3);
        sdTitle_textField11.setPromptText(ResourceGetter.getProperty("prop216")); //$NON-NLS-1$
        sdTitle_textField11.setStyle(ResourceGetter.getProperty("prop217")); //$NON-NLS-1$
        GridPane.setRowIndex(sdAddUpdate_button17,7);
        sdAddUpdate_button17.setMaxWidth(100.0);
        sdAddUpdate_button17.setMinWidth(100.0);
        sdAddUpdate_button17.setMnemonicParsing(false);
        sdAddUpdate_button17.setStyle(ResourceGetter.getProperty("prop218")); //$NON-NLS-1$
        sdAddUpdate_button17.setText(ResourceGetter.getProperty("prop219")); //$NON-NLS-1$
        GridPane.setColumnIndex(sdClear_button18,1);
        GridPane.setRowIndex(sdClear_button18,7);
        sdClear_button18.setMaxWidth(100.0);
        sdClear_button18.setMnemonicParsing(false);
        sdClear_button18.setStyle(ResourceGetter.getProperty("prop220")); //$NON-NLS-1$
        sdClear_button18.setText(ResourceGetter.getProperty("prop221")); //$NON-NLS-1$
        GridPane.setRowIndex(text11116,4);
        text11116.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11116.setStrokeWidth(0.0);
        text11116.setText(ResourceGetter.getProperty("prop222")); //$NON-NLS-1$
        GridPane.setRowIndex(text11117,5);
        text11117.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11117.setStrokeWidth(0.0);
        text11117.setText(ResourceGetter.getProperty("prop223")); //$NON-NLS-1$
        GridPane.setRowIndex(text11118,6);
        text11118.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11118.setStrokeWidth(0.0);
        text11118.setText(ResourceGetter.getProperty("prop224")); //$NON-NLS-1$
        GridPane.setColumnIndex(sdDate_datePicker1,1);
        sdDate_datePicker1.setPromptText(ResourceGetter.getProperty("prop225")); //$NON-NLS-1$
        sdDate_datePicker1.setStyle(ResourceGetter.getProperty("prop226")); //$NON-NLS-1$
        GridPane.setColumnIndex(sdType_comboBox8,1);
        GridPane.setRowIndex(sdType_comboBox8,1);
        sdType_comboBox8.setPrefWidth(150.0);
        sdType_comboBox8.setPromptText(ResourceGetter.getProperty("prop227")); //$NON-NLS-1$
        sdType_comboBox8.setStyle(ResourceGetter.getProperty("prop228")); //$NON-NLS-1$
        GridPane.setColumnIndex(sdLink_textField12,1);
        GridPane.setRowIndex(sdLink_textField12,5);
        sdLink_textField12.setPromptText(ResourceGetter.getProperty("prop229")); //$NON-NLS-1$
        sdLink_textField12.setStyle(ResourceGetter.getProperty("prop230")); //$NON-NLS-1$
        columnConstraints1111.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1111.setMaxWidth(938.9019165039062);
        columnConstraints1112.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        columnConstraints1112.setMinWidth(50.0);
        rowConstraints1113.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints1114.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints1115.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints1116.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints1117.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints1118.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints1119.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints11110.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        vBox12.setOpaqueInsets(new Insets(0.0));
        vBox12.setPadding(new Insets(10.0));
        vBox9.setPadding(new Insets(5.0));
        scrollPane4.setContent(vBox9);
        tab2.setContent(scrollPane4);
        tab3.setStyle(ResourceGetter.getProperty("prop231")); //$NON-NLS-1$
        tab3.setText(ResourceGetter.getProperty("prop232")); //$NON-NLS-1$
        scrollPane5.setFitToHeight(true);
        scrollPane5.setFitToWidth(true);
        scrollPane5.setPrefViewportHeight(1020.0);
        scrollPane5.setPrefViewportWidth(1000.0);
        vBox13.setSpacing(5.0);
        vBox13.setStyle(ResourceGetter.getProperty("prop233")); //$NON-NLS-1$
        gridPane14.setAlignment(javafx.geometry.Pos.CENTER);
        GridPane.setHalignment(text11119,javafx.geometry.HPos.CENTER);
        text11119.setFill(javafx.scene.paint.Color.valueOf(ResourceGetter.getProperty("prop234"))); //$NON-NLS-1$
        text11119.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text11119.setStrokeWidth(0.0);
        text11119.setStyle(ResourceGetter.getProperty("prop235")); //$NON-NLS-1$
        text11119.setText(ResourceGetter.getProperty("prop236")); //$NON-NLS-1$
        // text11119.setFont(new Font(ResourceGetter.getProperty("prop237"),50.0)); //$NON-NLS-1$
        GridPane.setMargin(text11119,new Insets(5.0,0.0,5.0,0.0));
        columnConstraints1113.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1113.setMinWidth(10.0);
        rowConstraints11111.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        anchorPane12.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        anchorPane12.setStyle(ResourceGetter.getProperty("prop238")); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(vBox14,0.0);
        AnchorPane.setLeftAnchor(vBox14,0.0);
        AnchorPane.setRightAnchor(vBox14,0.0);
        AnchorPane.setTopAnchor(vBox14,0.0);
        text111110.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text111110.setStrokeWidth(0.0);
        text111110.setStyle(ResourceGetter.getProperty("prop239")); //$NON-NLS-1$
        text111110.setText(ResourceGetter.getProperty("prop240")); //$NON-NLS-1$
        // text111110.setFont(new Font(ResourceGetter.getProperty("prop241"),13.0)); //$NON-NLS-1$
        VBox.setMargin(text111110,new Insets(0.0,0.0,5.0,0.0));
        pdT_tableView3.setStyle(ResourceGetter.getProperty("prop242")); //$NON-NLS-1$
        pdT_tableView3.getStylesheets().add(ResourceGetter.getProperty("prop243")); //$NON-NLS-1$
        pdT_tableView3.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        pdTUse_tableColumn15.setPrefWidth(75.0);
        pdTUse_tableColumn15.setText(ResourceGetter.getProperty("prop244")); //$NON-NLS-1$
        pdTNavbarTitle_tableColumn16.setPrefWidth(75.0);
        // pdTNavbarTitle_tableColumn16.setStyle("-fx-background-color: #553366;");
        pdTNavbarTitle_tableColumn16.setText(ResourceGetter.getProperty("prop245")); //$NON-NLS-1$
        pdTFileName_tableColumn17.setPrefWidth(75.0);
        pdTFileName_tableColumn17.setText(ResourceGetter.getProperty("prop246")); //$NON-NLS-1$
        pdTScript_tableColumn18.setPrefWidth(75.0);
        pdTScript_tableColumn18.setText(ResourceGetter.getProperty("prop247")); //$NON-NLS-1$
        text111111.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text111111.setStrokeWidth(0.0);
        text111111.setStyle(ResourceGetter.getProperty("prop248")); //$NON-NLS-1$
        text111111.setText(ResourceGetter.getProperty("prop249")); //$NON-NLS-1$
        // text111111.setFont(new Font(ResourceGetter.getProperty("prop250"),13.0)); //$NON-NLS-1$
        VBox.setMargin(text111111,new Insets(20.0,0.0,10.0,0.0));
        AnchorPane.setBottomAnchor(gridPane15,0.0);
        AnchorPane.setLeftAnchor(gridPane15,0.0);
        AnchorPane.setRightAnchor(gridPane15,0.0);
        AnchorPane.setTopAnchor(gridPane15,0.0);
        gridPane15.setCacheShape(false);
        gridPane15.setCenterShape(false);
        gridPane15.setFocusTraversable(true);
        gridPane15.setHgap(10.0);
        gridPane15.setScaleShape(false);
        gridPane15.setVgap(10.0);
        text111112.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text111112.setStrokeWidth(0.0);
        text111112.setText(ResourceGetter.getProperty("prop251")); //$NON-NLS-1$
        GridPane.setColumnIndex(pdTLink_textField13,1);
        GridPane.setColumnSpan(pdTLink_textField13,2147483647);
        GridPane.setRowIndex(pdTLink_textField13,2);
        pdTLink_textField13.setPromptText(ResourceGetter.getProperty("prop252")); //$NON-NLS-1$
        pdTLink_textField13.setStyle(ResourceGetter.getProperty("prop253")); //$NON-NLS-1$
        GridPane.setColumnIndex(pdTName_textField14,1);
        GridPane.setColumnSpan(pdTName_textField14,2147483647);
        pdTName_textField14.setPromptText(ResourceGetter.getProperty("prop254")); //$NON-NLS-1$
        pdTName_textField14.setStyle(ResourceGetter.getProperty("prop255")); //$NON-NLS-1$
        GridPane.setRowIndex(pdTAddUpdate_button19,3);
        pdTAddUpdate_button19.setMaxWidth(Double.MAX_VALUE);
        pdTAddUpdate_button19.setMinWidth(100.0);
        pdTAddUpdate_button19.setMnemonicParsing(false);
        pdTAddUpdate_button19.setStyle(ResourceGetter.getProperty("prop256")); //$NON-NLS-1$
        pdTAddUpdate_button19.setText(ResourceGetter.getProperty("prop257")); //$NON-NLS-1$
        GridPane.setColumnIndex(pdTClear_button110,1);
        GridPane.setRowIndex(pdTClear_button110,3);
        pdTClear_button110.setMaxWidth(100.0);
        pdTClear_button110.setMnemonicParsing(false);
        pdTClear_button110.setStyle(ResourceGetter.getProperty("prop258")); //$NON-NLS-1$
        pdTClear_button110.setText(ResourceGetter.getProperty("prop259")); //$NON-NLS-1$
        GridPane.setRowIndex(text111113,1);
        text111113.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text111113.setStrokeWidth(0.0);
        text111113.setText(ResourceGetter.getProperty("prop260")); //$NON-NLS-1$
        GridPane.setRowIndex(text111114,2);
        text111114.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text111114.setStrokeWidth(0.0);
        text111114.setText(ResourceGetter.getProperty("prop261")); //$NON-NLS-1$
        GridPane.setColumnIndex(text111115,2);
        GridPane.setRowIndex(text111115,1);
        text111115.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text111115.setStrokeWidth(0.0);
        text111115.setText(ResourceGetter.getProperty("prop262")); //$NON-NLS-1$
        GridPane.setColumnIndex(pdTColor_circle,1);
        GridPane.setRowIndex(pdTColor_circle,1);
        pdTColor_circle.setFill(javafx.scene.paint.Color.valueOf(ResourceGetter.getProperty("prop263"))); //$NON-NLS-1$
        double circleRadius=60.0;
        pdTColor_circle.setRadius(circleRadius);
        pdTColor_circle.setStroke(javafx.scene.paint.Color.BLACK);
        pdTColor_circle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        pdTColor_circle.setStrokeWidth(0.0);
        GridPane.setColumnIndex(pdTTextColor_circle0,3);
        GridPane.setRowIndex(pdTTextColor_circle0,1);
        pdTTextColor_circle0.setFill(javafx.scene.paint.Color.WHITE);
        pdTTextColor_circle0.setRadius(circleRadius);
        pdTTextColor_circle0.setStroke(javafx.scene.paint.Color.BLACK);
        pdTTextColor_circle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        pdTTextColor_circle0.setStrokeWidth(0.0);
        GridPane.setColumnIndex(pdTColor_text111116,1);
        GridPane.setRowIndex(pdTColor_text111116,1);
        // pdTColor_text111116.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        // pdTColor_text111116.setStrokeWidth(0.0);
        // pdTColor_text111116.setText(ResourceGetter.getProperty("prop264")); //$NON-NLS-1$
        GridPane.setColumnIndex(pdTTextColor_text111117,3);
        GridPane.setRowIndex(pdTTextColor_text111117,1);
        GridPane.setHalignment(pdTColor_text111116,HPos.CENTER);
        GridPane.setHalignment(pdTTextColor_text111117,HPos.CENTER);
        GridPane.setHalignment(pdTColor_circle,HPos.CENTER);
        GridPane.setHalignment(pdTTextColor_circle0,HPos.CENTER);
        double value=circleRadius*2-10;
        pdTColor_text111116.setPrefWidth(value);
        pdTTextColor_text111117.setPrefWidth(value);
        // pdTTextColor_text111117.setBackground(Background);
        String value1="-fx-background-color: rgba(0,0,0,0);-fx-font-style: oblique;-fx-effect: dropshadow( gaussian , rgba(255,255,255,1) , 10, .4 , 0 , 0 )";
        pdTColor_text111116.setStyle(value1);
        pdTTextColor_text111117.setStyle(value1);
        // pdTTextColor_text111117.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        // pdTTextColor_text111117.setStrokeWidth(0.0);
        // pdTTextColor_text111117.setText(ResourceGetter.getProperty("prop265")); //$NON-NLS-1$
        // pdTTextColor_text111117.setText(ResourceGetter.getProperty("prop265")); //$NON-NLS-1$
        // GridPane.setHalignment(text1119,javafx.geometry.HPos.LEFT);
        columnConstraints1114.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1114b.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1115.setHgrow(Priority.NEVER);
        // columnConstraints1115.setPrefWidth(200.0);
        columnConstraints1116.setPrefWidth(120.0);
        columnConstraints1117.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        rowConstraints11112.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints11113.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints11114.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints11115.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        vBox14.setOpaqueInsets(new Insets(0.0));
        vBox14.setPadding(new Insets(10.0));
        anchorPane13.setNodeOrientation(javafx.geometry.NodeOrientation.LEFT_TO_RIGHT);
        anchorPane13.setStyle(ResourceGetter.getProperty("prop266")); //$NON-NLS-1$
        AnchorPane.setBottomAnchor(vBox15,0.0);
        AnchorPane.setLeftAnchor(vBox15,0.0);
        AnchorPane.setRightAnchor(vBox15,0.0);
        AnchorPane.setTopAnchor(vBox15,0.0);
        vBox15.setSpacing(5.0);
        text111118.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text111118.setStrokeWidth(0.0);
        text111118.setStyle(ResourceGetter.getProperty("prop267")); //$NON-NLS-1$
        text111118.setText(ResourceGetter.getProperty("prop268")); //$NON-NLS-1$
        // text111118.setFont(new Font(ResourceGetter.getProperty("prop269"),13.0)); //$NON-NLS-1$
        VBox.setMargin(text111118,new Insets(0.0));
        pdS_tableView4.setStyle(ResourceGetter.getProperty("prop270")); //$NON-NLS-1$
        pdS_tableView4.getStylesheets().add(ResourceGetter.getProperty("prop271")); //$NON-NLS-1$
        pdS_tableView4.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        pdSFirstName_tableColumn19.setPrefWidth(75.0);
        pdSFirstName_tableColumn19.setText(ResourceGetter.getProperty("prop272")); //$NON-NLS-1$
        pdSLastName_tableColumn110.setPrefWidth(75.0);
        // pdSLastName_tableColumn110.setStyle("-fx-background-color: #553366;");
        pdSLastName_tableColumn110.setText(ResourceGetter.getProperty("prop273")); //$NON-NLS-1$
        pdSTeam_tableColumn111.setPrefWidth(75.0);
        pdSTeam_tableColumn111.setText(ResourceGetter.getProperty("prop274")); //$NON-NLS-1$
        pdSRole_tableColumn112.setPrefWidth(75.0);
        pdSRole_tableColumn112.setText(ResourceGetter.getProperty("prop275")); //$NON-NLS-1$
        text111119.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text111119.setStrokeWidth(0.0);
        text111119.setStyle(ResourceGetter.getProperty("prop276")); //$NON-NLS-1$
        text111119.setText(ResourceGetter.getProperty("prop277")); //$NON-NLS-1$
        // text111119.setFont(new Font(ResourceGetter.getProperty("prop278"),13.0)); //$NON-NLS-1$
        VBox.setMargin(text111119,new Insets(20.0,0.0,10.0,0.0));
        AnchorPane.setBottomAnchor(gridPane16,0.0);
        AnchorPane.setLeftAnchor(gridPane16,0.0);
        AnchorPane.setRightAnchor(gridPane16,0.0);
        AnchorPane.setTopAnchor(gridPane16,0.0);
        gridPane16.setCacheShape(false);
        gridPane16.setCenterShape(false);
        gridPane16.setFocusTraversable(true);
        gridPane16.setHgap(10.0);
        gridPane16.setScaleShape(false);
        gridPane16.setVgap(10.0);
        text1111110.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1111110.setStrokeWidth(0.0);
        text1111110.setText(ResourceGetter.getProperty("prop279")); //$NON-NLS-1$
        GridPane.setRowIndex(text1111111,1);
        text1111111.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1111111.setStrokeWidth(0.0);
        text1111111.setText(ResourceGetter.getProperty("prop280")); //$NON-NLS-1$
        GridPane.setColumnIndex(pdSTeam_combobox15,1);
        GridPane.setColumnSpan(pdSTeam_combobox15,2147483647);
        GridPane.setRowIndex(pdSTeam_combobox15,2);
        pdSTeam_combobox15.setPromptText(ResourceGetter.getProperty("prop281")); //$NON-NLS-1$
        pdSTeam_combobox15.setStyle(ResourceGetter.getProperty("prop282")); //$NON-NLS-1$
        GridPane.setColumnIndex(pdSFirstName_textField16,1);
        GridPane.setColumnSpan(pdSFirstName_textField16,2147483647);
        pdSFirstName_textField16.setPromptText(ResourceGetter.getProperty("prop283")); //$NON-NLS-1$
        pdSFirstName_textField16.setStyle(ResourceGetter.getProperty("prop284")); //$NON-NLS-1$
        GridPane.setColumnIndex(pdSLastName_textField17,1);
        GridPane.setColumnSpan(pdSLastName_textField17,2147483647);
        GridPane.setRowIndex(pdSLastName_textField17,1);
        pdSLastName_textField17.setPromptText(ResourceGetter.getProperty("prop285")); //$NON-NLS-1$
        pdSLastName_textField17.setStyle(ResourceGetter.getProperty("prop286")); //$NON-NLS-1$
        GridPane.setRowIndex(pdSAddUpdate_button111,4);
        pdSAddUpdate_button111.setMaxWidth(Double.MAX_VALUE);
        pdSAddUpdate_button111.setMinWidth(100.0);
        pdSAddUpdate_button111.setMnemonicParsing(false);
        pdSAddUpdate_button111.setStyle(ResourceGetter.getProperty("prop287")); //$NON-NLS-1$
        pdSAddUpdate_button111.setText(ResourceGetter.getProperty("prop288")); //$NON-NLS-1$
        GridPane.setColumnIndex(pdSClear_button112,1);
        GridPane.setRowIndex(pdSClear_button112,4);
        pdSClear_button112.setMaxWidth(100.0);
        pdSClear_button112.setMnemonicParsing(false);
        pdSClear_button112.setStyle(ResourceGetter.getProperty("prop289")); //$NON-NLS-1$
        pdSClear_button112.setText(ResourceGetter.getProperty("prop290")); //$NON-NLS-1$
        GridPane.setRowIndex(text1111112,2);
        text1111112.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1111112.setStrokeWidth(0.0);
        text1111112.setText(ResourceGetter.getProperty("prop291")); //$NON-NLS-1$
        GridPane.setRowIndex(text1111113,3);
        text1111113.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1111113.setStrokeWidth(0.0);
        text1111113.setText(ResourceGetter.getProperty("prop292")); //$NON-NLS-1$
        GridPane.setColumnIndex(pdSRole_textField18,1);
        GridPane.setRowIndex(pdSRole_textField18,3);
        pdSRole_textField18.setPromptText(ResourceGetter.getProperty("prop293")); //$NON-NLS-1$
        pdSRole_textField18.setStyle(ResourceGetter.getProperty("prop294")); //$NON-NLS-1$
        columnConstraints1118.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1118.setMaxWidth(938.9019165039062);
        columnConstraints1119.setHgrow(javafx.scene.layout.Priority.ALWAYS);
        columnConstraints1119.setMinWidth(50.0);
        rowConstraints11116.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints11117.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints11118.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints11119.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints111110.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        vBox15.setOpaqueInsets(new Insets(0.0));
        vBox15.setPadding(new Insets(10.0));
        vBox13.setPadding(new Insets(5.0));
        scrollPane5.setContent(vBox13);
        tab3.setContent(scrollPane5);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        toolBar.getItems().add(new_button);
        toolBar.getItems().add(open_button0);
        toolBar.getItems().add(save_button1);
        toolBar.getItems().add(saveas_button2);
        toolBar.getItems().add(export_button3);
        toolBar.getItems().add(power_button4);
        gridPane.getChildren().add(toolBar);
        toolBar0.getItems().add(undo_button5);
        toolBar0.getItems().add(redo_button6);
        toolBar0.getItems().add(book_button7);
        gridPane.getChildren().add(toolBar0);
        anchorPane.getChildren().add(gridPane);
        getChildren().add(anchorPane);
        gridPane0.getChildren().add(text);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints0);
        vBox.getChildren().add(gridPane0);
        vBox0.getChildren().add(text0);
        gridPane1.getChildren().add(text1);
        gridPane1.getChildren().add(text2);
        gridPane1.getChildren().add(text3);
        gridPane1.getChildren().add(text4);
        gridPane1.getChildren().add(text5);
        gridPane1.getChildren().add(text6);
        gridPane1.getChildren().add(text7);
        gridPane1.getChildren().add(text8);
        gridPane1.getChildren().add(cdCiTitle_textField);
        gridPane1.getChildren().add(cdCiInstructorName_textField0);
        gridPane1.getChildren().add(cdCiInstructorHome_textField1);
        gridPane1.getChildren().add(cdCiSubject_comboBox);
        gridPane1.getChildren().add(cdCiSemester_comboBox0);
        gridPane1.getChildren().add(cdCiNumber_comboBox1);
        gridPane1.getChildren().add(cdCiYear_comboBox2);
        gridPane1.getChildren().add(cdCiExportDir_text9);
        gridPane1.getChildren().add(cdCiChange_button8);
        gridPane1.getColumnConstraints().add(columnConstraints3);
        gridPane1.getColumnConstraints().add(columnConstraints4);
        gridPane1.getColumnConstraints().add(columnConstraints5);
        gridPane1.getColumnConstraints().add(columnConstraints6);
        gridPane1.getColumnConstraints().add(columnConstraints7);
        gridPane1.getRowConstraints().add(rowConstraints1);
        gridPane1.getRowConstraints().add(rowConstraints2);
        gridPane1.getRowConstraints().add(rowConstraints3);
        gridPane1.getRowConstraints().add(rowConstraints4);
        gridPane1.getRowConstraints().add(rowConstraints5);
        gridPane1.getRowConstraints().add(rowConstraints6);
        vBox0.getChildren().add(gridPane1);
        anchorPane0.getChildren().add(vBox0);
        vBox.getChildren().add(anchorPane0);
        vBox1.getChildren().add(text10);
        vBox1.getChildren().add(text11);
        gridPane2.getColumnConstraints().add(columnConstraints8);
        gridPane2.getColumnConstraints().add(columnConstraints9);
        gridPane2.getColumnConstraints().add(columnConstraints10);
        gridPane2.getRowConstraints().add(rowConstraints7);
        gridPane2.getRowConstraints().add(rowConstraints8);
        gridPane2.getChildren().add(cdStChange_button9);
        gridPane2.getChildren().add(cdStTemplateDir_text12);
        gridPane2.getChildren().add(text13);
        // cdStSitePages_tableView.getColumns().add(cdStUse_tableColumn);
        // cdStSitePages_tableView.getColumns().add(cdStNavbarTitle_tableColumn0);
        // cdStSitePages_tableView.getColumns().add(cdStFileName_tableColumn1);
        // cdStSitePages_tableView.getColumns().add(cdStScript_tableColumn2);
        gridPane2.getChildren().add(cdStSitePages_tableView);
        gridPane2.getChildren().add(text14);
        vBox1.getChildren().add(gridPane2);
        anchorPane1.getChildren().add(vBox1);
        vBox.getChildren().add(anchorPane1);
        vBox2.getChildren().add(text15);
        gridPane3.getChildren().add(text16);
        gridPane3.getChildren().add(cdPsChangeBanner_button10);
        gridPane3.getChildren().add(cdPsBanner_imageView8);
        gridPane3.getChildren().add(text17);
        gridPane3.getChildren().add(text18);
        gridPane3.getChildren().add(cdPsLeft_imageView9);
        gridPane3.getChildren().add(cdPsRight_imageView10);
        gridPane3.getChildren().add(cdPsChangeLeft_button11);
        gridPane3.getChildren().add(cdPsChangeRight_button12);
        gridPane3.getChildren().add(text19);
        gridPane3.getChildren().add(cdPsStylesheet_comboBox3);
        gridPane3.getColumnConstraints().add(columnConstraints11);
        gridPane3.getColumnConstraints().add(columnConstraints12);
        gridPane3.getColumnConstraints().add(columnConstraints13);
        gridPane3.getRowConstraints().add(rowConstraints9);
        gridPane3.getRowConstraints().add(rowConstraints10);
        gridPane3.getRowConstraints().add(rowConstraints11);
        gridPane3.getRowConstraints().add(rowConstraints12);
        vBox2.getChildren().add(gridPane3);
        vBox2.getChildren().add(text110);
        anchorPane2.getChildren().add(vBox2);
        vBox.getChildren().add(anchorPane2);
        tabPane.getTabs().add(tab);
        gridPane4.getChildren().add(text111);
        gridPane4.getColumnConstraints().add(columnConstraints14);
        gridPane4.getRowConstraints().add(rowConstraints13);
        vBox3.getChildren().add(gridPane4);
        // tdTa_tableView0.getColumns().add(tdTaUndergrad_tableColumn3);
        // tdTa_tableView0.getColumns().add(tdTaName_tableColumn4);
        // tdTa_tableView0.getColumns().add(tdTaEmail_tableColumn5);
        vBox4.getChildren().add(tdTa_tableView0);
        vBox4.getChildren().add(text112);
        gridPane5.getChildren().add(text113);
        gridPane5.getChildren().add(tdTaEmail_textField2);
        gridPane5.getChildren().add(tdTaName_textField3);
        gridPane5.getChildren().add(tdTaAddUpdate_button13);
        gridPane5.getChildren().add(tdTaClear_button14);
        gridPane5.getChildren().add(text114);
        gridPane5.getColumnConstraints().add(columnConstraints15);
        gridPane5.getColumnConstraints().add(columnConstraints16);
        gridPane5.getColumnConstraints().add(columnConstraints17);
        gridPane5.getRowConstraints().add(rowConstraints14);
        gridPane5.getRowConstraints().add(rowConstraints15);
        gridPane5.getRowConstraints().add(rowConstraints16);
        vBox4.getChildren().add(gridPane5);
        anchorPane4.getChildren().add(vBox4);
        vBox3.getChildren().add(anchorPane4);
        anchorPane3.getChildren().add(scrollPane1);
        splitPane.getItems().add(anchorPane3);
        gridPane6.getChildren().add(text115);
        gridPane6.getColumnConstraints().add(columnConstraints18);
        gridPane6.getRowConstraints().add(rowConstraints17);
        vBox5.getChildren().add(gridPane6);
        taOh_gridPane7.getColumnConstraints().add(columnConstraints19);
        taOh_gridPane7.getColumnConstraints().add(columnConstraints110);
        taOh_gridPane7.getRowConstraints().add(rowConstraints18);
        taOh_gridPane7.getRowConstraints().add(rowConstraints19);
        taOh_gridPane7.getRowConstraints().add(rowConstraints110);
        gridPane8.getChildren().add(text116);
        gridPane8.getChildren().add(text117);
        gridPane8.getChildren().add(tdOhStartTime_comboBox4);
        gridPane8.getChildren().add(tdOhEndTime_comboBox5);
        gridPane8.getColumnConstraints().add(columnConstraints111);
        gridPane8.getColumnConstraints().add(columnConstraints112);
        gridPane8.getRowConstraints().add(rowConstraints111);
        gridPane8.getRowConstraints().add(rowConstraints112);
        vBox6.getChildren().add(gridPane8);
        vBox6.getChildren().add(taOh_gridPane7);
        anchorPane6.getChildren().add(vBox6);
        vBox5.getChildren().add(anchorPane6);
        anchorPane5.getChildren().add(scrollPane2);
        splitPane.getItems().add(anchorPane5);
        tabPane.getTabs().add(tab0);
        gridPane9.getColumnConstraints().add(columnConstraints113);
        gridPane9.getRowConstraints().add(rowConstraints113);
        gridPane9.getChildren().add(text118);
        vBox7.getChildren().add(gridPane9);
        // rd_tableView1.getColumns().add(rdSection_tableColumn6);
        // rd_tableView1.getColumns().add(rdInstructor_tableColumn7);
        // rd_tableView1.getColumns().add(rdRecitationData_tableColumn8);
        // rd_tableView1.getColumns().add(rdTA1_tableColumn9);
        // rd_tableView1.getColumns().add(rdTA2tableColumn10);
        anchorPane7.getChildren().add(rd_tableView1);
        vBox7.getChildren().add(anchorPane7);
        vBox8.getChildren().add(text119);
        gridPane10.getChildren().add(text1110);
        gridPane10.getChildren().add(text1111);
        gridPane10.getChildren().add(text1112);
        gridPane10.getChildren().add(text1113);
        gridPane10.getChildren().add(rdSection_textField4);
        gridPane10.getChildren().add(rdInstructor_textField5);
        gridPane10.getChildren().add(rdDayTime_textField6);
        gridPane10.getChildren().add(rdLocation_textField7);
        gridPane10.getChildren().add(rdAddUpdate_button15);
        gridPane10.getChildren().add(rdClear_button16);
        gridPane10.getChildren().add(rdTA1_comboBox6);
        gridPane10.getChildren().add(rdTA2_comboBox7);
        gridPane10.getChildren().add(text1114);
        gridPane10.getChildren().add(text1115);
        gridPane10.getColumnConstraints().add(columnConstraints114);
        gridPane10.getColumnConstraints().add(columnConstraints115);
        gridPane10.getRowConstraints().add(rowConstraints114);
        gridPane10.getRowConstraints().add(rowConstraints115);
        gridPane10.getRowConstraints().add(rowConstraints116);
        gridPane10.getRowConstraints().add(rowConstraints117);
        gridPane10.getRowConstraints().add(rowConstraints118);
        gridPane10.getRowConstraints().add(rowConstraints119);
        gridPane10.getRowConstraints().add(rowConstraints1110);
        vBox8.getChildren().add(gridPane10);
        anchorPane8.getChildren().add(vBox8);
        vBox7.getChildren().add(anchorPane8);
        tabPane.getTabs().add(tab1);
        gridPane11.getChildren().add(text1116);
        gridPane11.getColumnConstraints().add(columnConstraints116);
        gridPane11.getRowConstraints().add(rowConstraints1111);
        vBox9.getChildren().add(gridPane11);
        vBox10.getChildren().add(text1117);
        gridPane12.getChildren().add(text1118);
        gridPane12.getChildren().add(text1119);
        gridPane12.getChildren().add(sdEndingFriday_datePicker);
        gridPane12.getChildren().add(sdStartingMonday_datePicker0);
        gridPane12.getColumnConstraints().add(columnConstraints117);
        gridPane12.getColumnConstraints().add(columnConstraints118);
        gridPane12.getColumnConstraints().add(columnConstraints119);
        gridPane12.getColumnConstraints().add(columnConstraints1110);
        gridPane12.getRowConstraints().add(rowConstraints1112);
        vBox10.getChildren().add(gridPane12);
        anchorPane9.getChildren().add(vBox10);
        vBox9.getChildren().add(anchorPane9);
        vBox11.getChildren().add(text11110);
        // sdScheduledItems_tableView2.getColumns().add(sdType_tableColumn11);
        // sdScheduledItems_tableView2.getColumns().add(sdDate_tableColumn12);
        // sdScheduledItems_tableView2.getColumns().add(sdTitle_tableColumn13);
        // sdScheduledItems_tableView2.getColumns().add(sdTopic_tableColumn14);
        vBox11.getChildren().add(sdScheduledItems_tableView2);
        anchorPane10.getChildren().add(vBox11);
        vBox9.getChildren().add(anchorPane10);
        vBox12.getChildren().add(text11111);
        gridPane13.getChildren().add(text11112);
        gridPane13.getChildren().add(text11113);
        gridPane13.getChildren().add(text11114);
        gridPane13.getChildren().add(text11115);
        gridPane13.getChildren().add(sdCriteria_textField8);
        gridPane13.getChildren().add(sdTopic_textField9);
        gridPane13.getChildren().add(sdTime_textField10);
        gridPane13.getChildren().add(sdTitle_textField11);
        gridPane13.getChildren().add(sdAddUpdate_button17);
        gridPane13.getChildren().add(sdClear_button18);
        gridPane13.getChildren().add(text11116);
        gridPane13.getChildren().add(text11117);
        gridPane13.getChildren().add(text11118);
        gridPane13.getChildren().add(sdDate_datePicker1);
        gridPane13.getChildren().add(sdType_comboBox8);
        gridPane13.getChildren().add(sdLink_textField12);
        gridPane13.getColumnConstraints().add(columnConstraints1111);
        gridPane13.getColumnConstraints().add(columnConstraints1112);
        gridPane13.getRowConstraints().add(rowConstraints1113);
        gridPane13.getRowConstraints().add(rowConstraints1114);
        gridPane13.getRowConstraints().add(rowConstraints1115);
        gridPane13.getRowConstraints().add(rowConstraints1116);
        gridPane13.getRowConstraints().add(rowConstraints1117);
        gridPane13.getRowConstraints().add(rowConstraints1118);
        gridPane13.getRowConstraints().add(rowConstraints1119);
        gridPane13.getRowConstraints().add(rowConstraints11110);
        vBox12.getChildren().add(gridPane13);
        anchorPane11.getChildren().add(vBox12);
        vBox9.getChildren().add(anchorPane11);
        tabPane.getTabs().add(tab2);
        gridPane14.getChildren().add(text11119);
        gridPane14.getColumnConstraints().add(columnConstraints1113);
        gridPane14.getRowConstraints().add(rowConstraints11111);
        vBox13.getChildren().add(gridPane14);
        vBox14.getChildren().add(text111110);
        // pdT_tableView3.getColumns().add(pdTUse_tableColumn15);
        // pdT_tableView3.getColumns().add(pdTNavbarTitle_tableColumn16);
        // pdT_tableView3.getColumns().add(pdTFileName_tableColumn17);
        // pdT_tableView3.getColumns().add(pdTScript_tableColumn18);
        vBox14.getChildren().add(pdT_tableView3);
        vBox14.getChildren().add(text111111);
        gridPane15.getChildren().add(text111112);
        gridPane15.getChildren().add(pdTLink_textField13);
        gridPane15.getChildren().add(pdTName_textField14);
        gridPane15.getChildren().add(pdTAddUpdate_button19);
        gridPane15.getChildren().add(pdTClear_button110);
        gridPane15.getChildren().add(text111113);
        gridPane15.getChildren().add(text111114);
        gridPane15.getChildren().add(text111115);
        gridPane15.getChildren().add(pdTColor_circle);
        gridPane15.getChildren().add(pdTTextColor_circle0);
        gridPane15.getChildren().add(pdTColor_text111116);
        gridPane15.getChildren().add(pdTTextColor_text111117);
        gridPane15.getColumnConstraints().add(columnConstraints1114);
        gridPane15.getColumnConstraints().add(columnConstraints1115);
        gridPane15.getColumnConstraints().add(columnConstraints1116);
        gridPane15.getColumnConstraints().add(columnConstraints1114b);
        gridPane15.getColumnConstraints().add(columnConstraints1117);
        gridPane15.getRowConstraints().add(rowConstraints11112);
        gridPane15.getRowConstraints().add(rowConstraints11113);
        gridPane15.getRowConstraints().add(rowConstraints11114);
        gridPane15.getRowConstraints().add(rowConstraints11115);
        vBox14.getChildren().add(gridPane15);
        anchorPane12.getChildren().add(vBox14);
        vBox13.getChildren().add(anchorPane12);
        vBox15.getChildren().add(text111118);
        // pdS_tableView4.getColumns().add(pdSFirstName_tableColumn19);
        // pdS_tableView4.getColumns().add(pdSLastName_tableColumn110);
        // pdS_tableView4.getColumns().add(pdSTeam_tableColumn111);
        // pdS_tableView4.getColumns().add(pdSRole_tableColumn112);
        vBox15.getChildren().add(pdS_tableView4);
        vBox15.getChildren().add(text111119);
        gridPane16.getChildren().add(text1111110);
        gridPane16.getChildren().add(text1111111);
        gridPane16.getChildren().add(pdSTeam_combobox15);
        gridPane16.getChildren().add(pdSFirstName_textField16);
        gridPane16.getChildren().add(pdSLastName_textField17);
        gridPane16.getChildren().add(pdSAddUpdate_button111);
        gridPane16.getChildren().add(pdSClear_button112);
        gridPane16.getChildren().add(text1111112);
        gridPane16.getChildren().add(text1111113);
        gridPane16.getChildren().add(pdSRole_textField18);
        gridPane16.getColumnConstraints().add(columnConstraints1118);
        gridPane16.getColumnConstraints().add(columnConstraints1119);
        gridPane16.getRowConstraints().add(rowConstraints11116);
        gridPane16.getRowConstraints().add(rowConstraints11117);
        gridPane16.getRowConstraints().add(rowConstraints11118);
        gridPane16.getRowConstraints().add(rowConstraints11119);
        gridPane16.getRowConstraints().add(rowConstraints111110);
        vBox15.getChildren().add(gridPane16);
        anchorPane13.getChildren().add(vBox15);
        vBox13.getChildren().add(anchorPane13);
        tabPane.getTabs().add(tab3);
        getChildren().add(tabPane);
        //endregion
    }
    //region ⵁ
    public final AnchorPane anchorPane;
    public final GridPane gridPane;
    public final ColumnConstraints columnConstraints;
    public final ColumnConstraints columnConstraints0;
    public final ColumnConstraints columnConstraints1;
    public final RowConstraints rowConstraints;
    public final ToolBar toolBar;
    public final ImageView imageView;
    public final ImageView imageView0;
    public final ImageView imageView1;
    public final ImageView imageView2;
    public final ImageView imageView3;
    public final ImageView imageView4;
    public final ToolBar toolBar0;
    public final ImageView imageView5;
    public final ImageView imageView6;
    //endregion
    public final rButton new_button;//
    public final rButton open_button0;//
    public final rButton save_button1;//
    public final rButton saveas_button2;//
    public final rButton export_button3;//
    public final rButton power_button4;//
    public final rButton undo_button5;//Undo
    public final rButton redo_button6;//Redo
    public final rButton book_button7;//Book
    //region ⵁ
    public final ImageView imageView7;
    public final TabPane tabPane;
    public final Tab tab;
    public final ScrollPane scrollPane;
    public final VBox vBox;
    public final GridPane gridPane0;
    public final Text text;
    public final ColumnConstraints columnConstraints2;
    public final RowConstraints rowConstraints0;
    public final AnchorPane anchorPane0;
    public final VBox vBox0;
    public final Text text0;
    public final GridPane gridPane1;
    public final Text text1;
    public final Text text2;
    public final Text text3;
    public final Text text4;
    public final Text text5;
    public final Text text6;
    public final Text text7;
    public final Text text8;
    //endregion
    public final rTextField cdCiTitle_textField;
    public final rTextField cdCiInstructorName_textField0;
    public final rTextField cdCiInstructorHome_textField1;
    public final ComboBox cdCiSubject_comboBox;
    public final ComboBox cdCiSemester_comboBox0;
    public final ComboBox cdCiNumber_comboBox1;
    public final ComboBox cdCiYear_comboBox2;
    public final Text cdCiExportDir_text9;
    public final rButton cdCiChange_button8;
    //region ⵁ
    public final ColumnConstraints columnConstraints3;
    public final ColumnConstraints columnConstraints4;
    public final ColumnConstraints columnConstraints5;
    public final ColumnConstraints columnConstraints6;
    public final ColumnConstraints columnConstraints7;
    public final RowConstraints rowConstraints1;
    public final RowConstraints rowConstraints2;
    public final RowConstraints rowConstraints3;
    public final RowConstraints rowConstraints4;
    public final RowConstraints rowConstraints5;
    public final RowConstraints rowConstraints6;
    public final AnchorPane anchorPane1;
    public final VBox vBox1;
    public final Text text10;
    public final Text text11;
    public final GridPane gridPane2;
    public final ColumnConstraints columnConstraints8;
    public final ColumnConstraints columnConstraints9;
    public final ColumnConstraints columnConstraints10;
    public final RowConstraints rowConstraints7;
    public final RowConstraints rowConstraints8;
    public final Text text13;
    //endregion
    public final Text cdStTemplateDir_text12;
    public final rButton cdStChange_button9;
    public final CD_SitePagesTableView cdStSitePages_tableView;
    public final TableColumn cdStUse_tableColumn;
    public final TableColumn cdStNavbarTitle_tableColumn0;
    public final TableColumn cdStFileName_tableColumn1;
    public final TableColumn cdStScript_tableColumn2;
    //region ⵁ
    public final Text text14;
    public final AnchorPane anchorPane2;
    public final VBox vBox2;
    public final Text text15;
    public final GridPane gridPane3;
    public final Text text16;
    public final Text text17;
    public final Text text18;
    public final Text text19;
    //endregion
    public final ImageView cdPsBanner_imageView8;
    public final ImageView cdPsLeft_imageView9;
    public final ImageView cdPsRight_imageView10;
    public final rButton cdPsChangeBanner_button10;
    public final rButton cdPsChangeLeft_button11;
    public final rButton cdPsChangeRight_button12;
    public final ComboBox cdPsStylesheet_comboBox3;
    //region ⵁ
    public final ColumnConstraints columnConstraints11;
    public final ColumnConstraints columnConstraints12;
    public final ColumnConstraints columnConstraints13;
    public final RowConstraints rowConstraints9;
    public final RowConstraints rowConstraints10;
    public final RowConstraints rowConstraints11;
    public final RowConstraints rowConstraints12;
    public final Text text110;
    public final Tab tab0;
    public final ScrollPane scrollPane0;
    public final SplitPane splitPane;
    public final AnchorPane anchorPane3;
    public final ScrollPane scrollPane1;
    public final VBox vBox3;
    public final GridPane gridPane4;
    public final Text text111;
    public final ColumnConstraints columnConstraints14;
    public final RowConstraints rowConstraints13;
    public final AnchorPane anchorPane4;
    public final VBox vBox4;
    //endregion
    public final TD_TATableView tdTa_tableView0;
    public final TableColumn tdTaUndergrad_tableColumn3;
    public final TableColumn tdTaName_tableColumn4;
    public final TableColumn tdTaEmail_tableColumn5;
    public final rTextField tdTaName_textField3;
    public final rTextField tdTaEmail_textField2;
    public final rButton tdTaAddUpdate_button13;
    public final rButton tdTaClear_button14;
    //region ⵁ
    public final Text text112;
    public final GridPane gridPane5;
    public final Text text113;
    public final Text text114;
    public final ColumnConstraints columnConstraints15;
    public final ColumnConstraints columnConstraints16;
    public final ColumnConstraints columnConstraints17;
    public final RowConstraints rowConstraints14;
    public final RowConstraints rowConstraints15;
    public final RowConstraints rowConstraints16;
    public final AnchorPane anchorPane5;
    public final ScrollPane scrollPane2;
    public final VBox vBox5;
    //endregion
    public final OfficeHoursGrid taOh_gridPane7;
    public final ComboBox tdOhStartTime_comboBox4;
    public final ComboBox tdOhEndTime_comboBox5;
    //region ⵁ
    public final GridPane gridPane6;
    public final Text text115;
    public final ColumnConstraints columnConstraints18;
    public final RowConstraints rowConstraints17;
    public final AnchorPane anchorPane6;
    public final VBox vBox6;
    public final ColumnConstraints columnConstraints19;
    public final ColumnConstraints columnConstraints110;
    public final RowConstraints rowConstraints18;
    public final RowConstraints rowConstraints19;
    public final RowConstraints rowConstraints110;
    public final GridPane gridPane8;
    public final Text text116;
    public final Text text117;
    public final ColumnConstraints columnConstraints111;
    public final ColumnConstraints columnConstraints112;
    public final RowConstraints rowConstraints111;
    public final RowConstraints rowConstraints112;
    public final Tab tab1;
    public final ScrollPane scrollPane3;
    public final VBox vBox7;
    public final GridPane gridPane9;
    public final ColumnConstraints columnConstraints113;
    public final RowConstraints rowConstraints113;
    public final Text text118;
    public final AnchorPane anchorPane7;
    //endregion
    public final RD_RecitationDataTableView rd_tableView1;
    public final TableColumn rdSection_tableColumn6;
    public final TableColumn rdInstructor_tableColumn7;
    public final TableColumn rdRecitationData_tableColumn8;
    public final TableColumn rdTA1_tableColumn9;
    public final TableColumn rdTA2tableColumn10;
    public final rTextField rdSection_textField4;
    public final rTextField rdInstructor_textField5;
    public final rTextField rdDayTime_textField6;
    public final rTextField rdLocation_textField7;
    public final ComboBox rdTA1_comboBox6;
    public final ComboBox rdTA2_comboBox7;
    public final rButton rdAddUpdate_button15;
    public final rButton rdClear_button16;
    //region ⵁ
    public final AnchorPane anchorPane8;
    public final VBox vBox8;
    public final Text text119;
    public final GridPane gridPane10;
    public final Text text1110;
    public final Text text1111;
    public final Text text1112;
    public final Text text1113;
    public final Text text1114;
    public final Text text1115;
    public final ColumnConstraints columnConstraints114;
    public final ColumnConstraints columnConstraints115;
    public final RowConstraints rowConstraints114;
    public final RowConstraints rowConstraints115;
    public final RowConstraints rowConstraints116;
    public final RowConstraints rowConstraints117;
    public final RowConstraints rowConstraints118;
    public final RowConstraints rowConstraints119;
    public final RowConstraints rowConstraints1110;
    public final Tab tab2;
    public final ScrollPane scrollPane4;
    public final VBox vBox9;
    public final GridPane gridPane11;
    public final Text text1116;
    public final ColumnConstraints columnConstraints116;
    public final RowConstraints rowConstraints1111;
    public final AnchorPane anchorPane9;
    public final VBox vBox10;
    public final Text text1117;
    public final GridPane gridPane12;
    public final Text text1118;
    public final Text text1119;
    public final ColumnConstraints columnConstraints117;
    public final ColumnConstraints columnConstraints118;
    public final ColumnConstraints columnConstraints119;
    public final ColumnConstraints columnConstraints1110;
    public final RowConstraints rowConstraints1112;
    public final AnchorPane anchorPane10;
    public final VBox vBox11;
    public final Text text11110;
    public final AnchorPane anchorPane11;
    public final VBox vBox12;
    public final Text text11111;
    public final GridPane gridPane13;
    public final Text text11112;
    public final Text text11113;
    public final Text text11114;
    public final Text text11115;
    //endregion
    public final DatePicker sdStartingMonday_datePicker0;
    public final DatePicker sdEndingFriday_datePicker;
    public final SD_ScheduleItemsTableView sdScheduledItems_tableView2;
    public final TableColumn sdType_tableColumn11;
    public final TableColumn sdDate_tableColumn12;
    public final TableColumn sdTitle_tableColumn13;
    public final TableColumn sdTopic_tableColumn14;
    public final DatePicker sdDate_datePicker1;
    public final ComboBox sdType_comboBox8;
    public final rTextField sdTime_textField10;
    public final rTextField sdTitle_textField11;
    public final rTextField sdTopic_textField9;
    public final rTextField sdLink_textField12;
    public final rTextField sdCriteria_textField8;
    public final rButton sdAddUpdate_button17;
    public final rButton sdClear_button18;
    //region ⵁ
    public final Text text11116;
    public final Text text11117;
    public final Text text11118;
    public final ColumnConstraints columnConstraints1111;
    public final ColumnConstraints columnConstraints1112;
    public final RowConstraints rowConstraints1113;
    public final RowConstraints rowConstraints1114;
    public final RowConstraints rowConstraints1115;
    public final RowConstraints rowConstraints1116;
    public final RowConstraints rowConstraints1117;
    public final RowConstraints rowConstraints1118;
    public final RowConstraints rowConstraints1119;
    public final RowConstraints rowConstraints11110;
    public final Tab tab3;
    public final ScrollPane scrollPane5;
    public final VBox vBox13;
    public final GridPane gridPane14;
    public final Text text11119;
    public final ColumnConstraints columnConstraints1113;
    public final RowConstraints rowConstraints11111;
    public final AnchorPane anchorPane12;
    public final VBox vBox14;
    public final Text text111110;
    //endregion
    public final PD_TeamsTableView pdT_tableView3;
    public final TableColumn pdTUse_tableColumn15;
    public final TableColumn pdTNavbarTitle_tableColumn16;
    public final TableColumn pdTFileName_tableColumn17;
    public final TableColumn pdTScript_tableColumn18;
    public final rTextField pdTLink_textField13;
    public final rTextField pdTName_textField14;
    public final rButton pdTAddUpdate_button19;
    public final rButton pdTClear_button110;
    public final Circle pdTColor_circle;
    public final Circle pdTTextColor_circle0;
    public final ColorPicker pdTColor_text111116;
    public final ColorPicker pdTTextColor_text111117;
    //region ⵁ
    public final GridPane gridPane15;
    public final Text text111111;
    public final Text text111112;
    public final Text text111113;
    public final Text text111114;
    public final Text text111115;
    public final ColumnConstraints columnConstraints1114;
    public final ColumnConstraints columnConstraints1114b;
    public final ColumnConstraints columnConstraints1115;
    public final ColumnConstraints columnConstraints1116;
    public final ColumnConstraints columnConstraints1117;
    public final RowConstraints rowConstraints11112;
    public final RowConstraints rowConstraints11113;
    public final RowConstraints rowConstraints11114;
    public final RowConstraints rowConstraints11115;
    public final AnchorPane anchorPane13;
    public final VBox vBox15;
    public final Text text111118;
    public final Text text111119;
    public final GridPane gridPane16;
    public final Text text1111110;
    public final Text text1111111;
    public final Text text1111112;
    public final Text text1111113;
    public final ColumnConstraints columnConstraints1118;
    public final ColumnConstraints columnConstraints1119;
    public final RowConstraints rowConstraints11116;
    public final RowConstraints rowConstraints11117;
    public final RowConstraints rowConstraints11118;
    public final RowConstraints rowConstraints11119;
    public final RowConstraints rowConstraints111110;
    //endregion
    public final PD_StudentsTableView pdS_tableView4;
    public final TableColumn pdSFirstName_tableColumn19;
    public final TableColumn pdSLastName_tableColumn110;
    public final TableColumn pdSTeam_tableColumn111;
    public final TableColumn pdSRole_tableColumn112;
    public final rTextField pdSFirstName_textField16;
    public final rTextField pdSLastName_textField17;
    public final ComboBox pdSTeam_combobox15;
    public final rTextField pdSRole_textField18;
    public final rButton pdSAddUpdate_button111;
    public final rButton pdSClear_button112;
}