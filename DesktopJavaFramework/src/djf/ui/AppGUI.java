package djf.ui;
import djf.AppTemplate;
import djf.controller.AppFileController;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import properties_manager.PropertiesManager;

import static djf.components.AppStyleComponent.CLASS_BORDERED_PANE;
import static djf.components.AppStyleComponent.CLASS_FILE_BUTTON;
import static djf.settings.AppPropertyType.*;
import static djf.settings.AppStartupConstants.FILE_PROTOCOL;
import static djf.settings.AppStartupConstants.PATH_IMAGES;
/**
 * This class provides the basic user interface for this application,
 * including all the file controls, but not including the workspace,
 * which would be customly provided for each app.
 *
 * @author Richard McKenna
 * @version 1.0
 */
public class AppGUI
{



    // THIS HANDLES INTERACTIONS WITH FILE-RELATED CONTROLS
    protected AppFileController fileController;
    // THIS IS THE APPLICATION WINDOW
    protected Stage primaryStage;
    // THIS IS THE STAGE'S SCENE GRAPH
    public Scene primaryScene;
    // THIS PANE ORGANIZES THE BIG PICTURE CONTAINERS FOR THE
    // APPLICATION AppGUI. NOTE THAT THE WORKSPACE WILL GO
    // IN THE CENTER REGION OF THE appPane
    protected BorderPane appPane;
    // THIS IS THE TOP TOOLBAR AND ITS CONTROLS
    protected FlowPane fileToolbarPane;
    // FILE TOOLBAR BUTTONS
    protected Button newButton;
    protected Button loadButton;
    protected Button saveButton;
    protected Button exitButton;
    protected Button saveAsButton;
    protected Button exportButton;
    // THIS DIALOG IS USED FOR GIVING FEEDBACK TO THE USER
    protected AppYesNoCancelDialogSingleton yesNoCancelDialog;
    protected AppYesNoDialogSingleton yesAndNoDialog;
    // THIS TITLE WILL GO IN THE TITLE BAR
    protected String appTitle;
    /**
     * This constructor initializes the file toolbar for use.
     *
     * @param initPrimaryStage The window for this application.
     * @param initAppTitle     The title of this application, which
     *                         will appear in the window bar.
     * @param app              The app within this gui is used.
     */
    public AppGUI(Stage initPrimaryStage,
                  String initAppTitle,
                  AppTemplate app)
    {
        // SAVE THESE FOR LATER
        primaryStage=initPrimaryStage;
        appTitle=initAppTitle;
        // INIT THE TOOLBAR
        initFileToolbar(app);
        // AND FINALLY START UP THE WINDOW (WITHOUT THE WORKSPACE)
        initWindow();
    }
    /**
     * Accessor method for getting the file toolbar controller.
     */
    public AppFileController getFileController()
    {
        return fileController;
    }
    /**
     * Accessor method for getting the application pane, within which all
     * user interface controls are ultimately placed.
     *
     * @return This application GUI's app pane.
     */
    public BorderPane getAppPane()
    {
        return appPane;
    }
    /**
     * Accessor method for getting this application's primary stage's,
     * scene.
     *
     * @return This application's window's scene.
     */
    public Scene getPrimaryScene()
    {
        return primaryScene;
    }
    /**
     * Accessor method for getting this application's window,
     * which is the primary stage within which the full GUI will be placed.
     *
     * @return This application's primary stage (i.e. window).
     */
    public Stage getWindow()
    {
        return primaryStage;
    }
    /**
     * This method is used to activate/deactivate toolbar buttons when
     * they can and cannot be used so as to provide foolproof design.
     *
     * @param saved Describes whether the loaded Page has been saved or not.
     */
    public void updateToolbarControls(boolean saved)
    {
        // THIS TOGGLES WITH WHETHER THE CURRENT COURSE
        // HAS BEEN SAVED OR NOT
        saveButton.setDisable(saved);
        saveAsButton.setDisable(false);
        // ALL THE OTHER BUTTONS ARE ALWAYS ENABLED
        // ONCE EDITING THAT FIRST COURSE BEGINS
        newButton.setDisable(false);
        loadButton.setDisable(false);
        exitButton.setDisable(false);
        exportButton.setDisable(false);
        // NOTE THAT THE NEW, LOAD, AND EXIT BUTTONS
        // ARE NEVER DISABLED SO WE NEVER HAVE TO TOUCH THEM
    }
    /****************************************************************************/
    /* BELOW ARE ALL THE PRIVATE HELPER METHODS WE USE FOR INITIALIZING OUR AppGUI */
    /****************************************************************************/
    /**
     * This function initializes all the buttons in the toolbar at the top of
     * the application window. These are related to file management.
     */
    private void initFileToolbar(AppTemplate app)
    {
        fileToolbarPane=new FlowPane();
        // HERE ARE OUR FILE TOOLBAR BUTTONS, NOTE THAT SOME WILL
        // START AS ENABLED (false), WHILE OTHERS DISABLED (true)
        newButton=initChildButton(fileToolbarPane,NEW_ICON.toString(),NEW_TOOLTIP.toString(),false);
        loadButton=initChildButton(fileToolbarPane,LOAD_ICON.toString(),LOAD_TOOLTIP.toString(),false);
        saveButton=initChildButton(fileToolbarPane,SAVE_ICON.toString(),SAVE_TOOLTIP.toString(),true);
        saveAsButton=initChildButton(fileToolbarPane,SAVE_AS_ICON.toString(),SAVE_AS_TOOLTIP.toString(),true);
        exportButton=initChildButton(fileToolbarPane,EXPORT_ICON.toString(),EXPORT_TOOLTIP.toString(),true);
        exitButton=initChildButton(fileToolbarPane,EXIT_ICON.toString(),EXIT_TOOLTIP.toString(),false);
        // AND NOW SETUP THEIR EVENT HANDLERS
        fileController=new AppFileController(app);
        newButton.setOnAction(e->
                              {
                                  fileController.handleNewRequest();
                              });
        loadButton.setOnAction(e->
                               {
                                   fileController.handleLoadRequest();
                               });
        saveButton.setOnAction(e->
                               {
                                   fileController.handleSaveRequest();
                               });
        saveAsButton.setOnAction(e->
                                 {
                                     fileController.handleSaveAsRequest();
                                 });
        exportButton.setOnAction(e->
                                 {
                                     fileController.handleExportRequest();
                                 });
        exitButton.setOnAction(e->
                                   fileController.handleExitRequest());
    }
    // INITIALIZE THE WINDOW (i.e. STAGE) PUTTING ALL THE CONTROLS
    // THERE EXCEPT THE WORKSPACE, WHICH WILL BE ADDED THE FIRST
    // TIME A NEW Page IS CREATED OR LOADED
    private void initWindow()
    {
        // SET THE WINDOW TITLE
        primaryStage.setTitle(appTitle);
        // GET THE SIZE OF THE SCREEN
        Screen screen=Screen.getPrimary();
        Rectangle2D bounds=screen.getVisualBounds();
        // AND USE IT TO SIZE THE WINDOW
        primaryStage.setX(bounds.getMinX());
        primaryStage.setY(bounds.getMinY());
        primaryStage.setWidth(bounds.getWidth());
        primaryStage.setHeight(bounds.getHeight());
        // ADD THE TOOLBAR ONLY, NOTE THAT THE WORKSPACE
        // HAS BEEN CONSTRUCTED, BUT WON'T BE ADDED UNTIL
        // THE USER STARTS EDITING A COURSE
        appPane=new BorderPane();
        appPane.setTop(fileToolbarPane);
        primaryScene=new Scene(appPane);
        // SET THE APP ICON
        PropertiesManager props=PropertiesManager.getPropertiesManager();
        String appIcon=FILE_PROTOCOL+PATH_IMAGES+props.getProperty(APP_LOGO);
        primaryStage.getIcons().add(new Image(appIcon));
        // NOW TIE THE SCENE TO THE WINDOW AND OPEN THE WINDOW
        primaryStage.setScene(primaryScene);
        primaryStage.show();
    }
    /**
     * This is a public helper method for initializing a simple button with
     * an icon and tooltip and placing it into a toolbar.
     *
     * @param toolbar  Toolbar pane into which to place this button.
     * @param icon     Icon image file name for the button.
     * @param tooltip  Tooltip to appear when the user mouses over the button.
     * @param disabled true if the button is to start off disabled, false otherwise.
     * @return A constructed, fully initialized button placed into its appropriate
     * pane container.
     */
    public Button initChildButton(Pane toolbar,String icon,String tooltip,boolean disabled)
    {
        PropertiesManager props=PropertiesManager.getPropertiesManager();
        // LOAD THE ICON FROM THE PROVIDED FILE
        String imagePath=FILE_PROTOCOL+PATH_IMAGES+props.getProperty(icon);
        Image buttonImage=new Image(imagePath);
        // NOW MAKE THE BUTTON
        Button button=new Button();
        button.setDisable(disabled);
        button.setGraphic(new ImageView(buttonImage));
        Tooltip buttonTooltip=new Tooltip(props.getProperty(tooltip));
        button.setTooltip(buttonTooltip);
        // PUT THE BUTTON IN THE TOOLBAR
        toolbar.getChildren().add(button);
        // AND RETURN THE COMPLETED BUTTON
        return button;
    }
    /**
     * This function specifies the CSS style classes for the controls managed
     * by this framework.
     */
    public void initFileToolbarStyle()
    {
        fileToolbarPane.getStyleClass().add(CLASS_BORDERED_PANE);
        newButton.getStyleClass().add(CLASS_FILE_BUTTON);
        loadButton.getStyleClass().add(CLASS_FILE_BUTTON);
        saveButton.getStyleClass().add(CLASS_FILE_BUTTON);
        saveAsButton.getStyleClass().add(CLASS_FILE_BUTTON);
        exportButton.getStyleClass().add(CLASS_FILE_BUTTON);
        exitButton.getStyleClass().add(CLASS_FILE_BUTTON);
    }
}
