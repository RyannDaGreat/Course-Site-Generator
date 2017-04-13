package tam.style;
import djf.AppTemplate;
import djf.components.AppStyleComponent;

import java.util.HashMap;

import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import tam.data.TeachingAssistant;
import tam.workspace.TAWorkspace;
/**
 * This class manages all CSS style for this application.
 *
 * @author Richard McKenna
 * @version 1.0
 */
public class TAStyle extends AppStyleComponent
{
    // FIRST WE SHOULD DECLARE ALL OF THE STYLE TYPES WE PLAN TO USE
    // WE'LL USE THIS FOR ORGANIZING LEFT AND RIGHT CONTROLS
    public static String CLASS_PLAIN_PANE="plain_pane";
    // THESE ARE THE HEADERS FOR EACH SIDE
    public static String CLASS_HEADER_PANE="header_pane";
    public static String CLASS_HEADER_LABEL="header_label";
    // ON THE LEFT WE HAVE THE TA ENTRY
    public static String CLASS_TA_TABLE="ta_table";
    public static String CLASS_TA_TABLE_COLUMN_HEADER="ta_table_column_header";
    public static String CLASS_ADD_TA_PANE="add_ta_pane";
    public static String CLASS_ADD_TA_TEXT_FIELD="add_ta_text_field";
    public static String CLASS_ADD_TA_BUTTON="add_ta_button";
    public static String CLASS_UPDATE_TA_BUTTON="update_ta_button";
    public static String CLASS_CLEAR_BUTTON="clear_button";
    public static String CLASS_CLEAR_BUTTON_1="clear_button_1";
    // ON THE RIGHT WE HAVE THE OFFICE HOURS GRID
    public static String CLASS_OFFICE_HOURS_GRID="office_hours_grid";
    public static String CLASS_OFFICE_HOURS_GRID_TIME_COLUMN_HEADER_PANE="office_hours_grid_time_column_header_pane";
    public static String CLASS_OFFICE_HOURS_GRID_TIME_COLUMN_HEADER_LABEL="office_hours_grid_time_column_header_label";
    public static String CLASS_OFFICE_HOURS_GRID_DAY_COLUMN_HEADER_PANE="office_hours_grid_day_column_header_pane";
    public static String CLASS_OFFICE_HOURS_GRID_DAY_COLUMN_HEADER_LABEL="office_hours_grid_day_column_header_label";
    public static String CLASS_OFFICE_HOURS_GRID_TIME_CELL_PANE="office_hours_grid_time_cell_pane";
    public static String CLASS_OFFICE_HOURS_GRID_TIME_CELL_LABEL="office_hours_grid_time_cell_label";
    public static String CLASS_OFFICE_HOURS_GRID_TA_CELL_PANE="office_hours_grid_ta_cell_pane";
    public static String CLASS_OFFICE_HOURS_GRID_TA_CELL_LABEL="office_hours_grid_ta_cell_label";
    public static String CLASS_OFFICE_HOURS_GRID_NEW_START_TIME="office_hours_grid_new_start_time";
    public static String CLASS_OFFICE_HOURS_GRID_NEW_END_TIME="office_hours_grid_new_end_time";
    public static String CLASS_OFFICE_HOURS_GRID_UPDATE_TIME_BUTTON="office_hours_grid_update_time_button";
    // FOR HIGHLIGHTING CELLS, COLUMNS, AND ROWS
    public static String CLASS_HIGHLIGHTED_GRID_CELL="highlighted_grid_cell";
    public static String CLASS_HIGHLIGHTED_GRID_ROW_OR_COLUMN="highlighted_grid_row_or_column";
    // THIS PROVIDES ACCESS TO OTHER COMPONENTS
    private AppTemplate app;
    /**
     * This constructor initializes all style for the application.
     *
     * @param initApp The application to be stylized.
     */
    public TAStyle(AppTemplate initApp)
    {
        // KEEP THIS FOR LATER
        app=initApp;
        // LET'S USE THE DEFAULT STYLESHEET SETUP
        super.initStylesheet(app);
        // INIT THE STYLE FOR THE FILE TOOLBAR
        app.getGUI().initFileToolbarStyle();
        // AND NOW OUR WORKSPACE STYLE
        initTAWorkspaceStyle();
    }
    /**
     * This function specifies all the style classes for
     * all user interface controls in the workspace.
     */
    private void initTAWorkspaceStyle()
    {
        // LEFT SIDE - THE HEADER
        TAWorkspace workspaceComponent=(TAWorkspace)app.getWorkspaceComponent();
        workspaceComponent.getTAsHeaderBox().getStyleClass().add(CLASS_HEADER_PANE);
        workspaceComponent.getTAsHeaderLabel().getStyleClass().add(CLASS_HEADER_LABEL);
        // LEFT SIDE - THE TABLE
        TableView<TeachingAssistant> taTable=workspaceComponent.getTATable();
        taTable.getStyleClass().add(CLASS_TA_TABLE);
        for(TableColumn tableColumn : taTable.getColumns())
        {
            tableColumn.getStyleClass().add(CLASS_TA_TABLE_COLUMN_HEADER);
        }
        // LEFT SIDE - THE TA DATA ENTRY
        workspaceComponent.getAddBox().getStyleClass().add(CLASS_ADD_TA_PANE);
        workspaceComponent.getNameTextField().getStyleClass().add(CLASS_ADD_TA_TEXT_FIELD);
        workspaceComponent.getEmailTextField().getStyleClass().add(CLASS_ADD_TA_TEXT_FIELD);
        workspaceComponent.getAddButton().getStyleClass().add(CLASS_ADD_TA_BUTTON);
        workspaceComponent.getUpdateTaButton().getStyleClass().add(CLASS_UPDATE_TA_BUTTON);
        workspaceComponent.getClearButton().getStyleClass().add(CLASS_CLEAR_BUTTON);
        workspaceComponent.getClearButton1().getStyleClass().add(CLASS_CLEAR_BUTTON_1);
        // RIGHT SIDE - THE HEADER
        workspaceComponent.getOfficeHoursSubheaderBox().getStyleClass().add(CLASS_HEADER_PANE);
        workspaceComponent.getOfficeHoursSubheaderLabel().getStyleClass().add(CLASS_HEADER_LABEL);
    }
    /**
     * This method initializes the style for all UI components in
     * the office hours grid. Note that this should be called every
     * time a new TA Office Hours Grid is created or loaded.
     */
    public void initOfficeHoursGridStyle()
    {
        // RIGHT SIDE - THE OFFICE HOURS GRID TIME HEADERS
        TAWorkspace workspaceComponent=(TAWorkspace)app.getWorkspaceComponent();
        workspaceComponent.getOfficeHoursGridPane().getStyleClass().add(CLASS_OFFICE_HOURS_GRID);
        setStyleClassOnAll(workspaceComponent.getOfficeHoursGridTimeHeaderPanes(),CLASS_OFFICE_HOURS_GRID_TIME_COLUMN_HEADER_PANE);
        setStyleClassOnAll(workspaceComponent.getOfficeHoursGridTimeHeaderLabels(),CLASS_OFFICE_HOURS_GRID_TIME_COLUMN_HEADER_LABEL);
        setStyleClassOnAll(workspaceComponent.getOfficeHoursGridDayHeaderPanes(),CLASS_OFFICE_HOURS_GRID_DAY_COLUMN_HEADER_PANE);
        setStyleClassOnAll(workspaceComponent.getOfficeHoursGridDayHeaderLabels(),CLASS_OFFICE_HOURS_GRID_DAY_COLUMN_HEADER_LABEL);
        setStyleClassOnAll(workspaceComponent.getOfficeHoursGridTimeCellPanes(),CLASS_OFFICE_HOURS_GRID_TIME_CELL_PANE);
        setStyleClassOnAll(workspaceComponent.getOfficeHoursGridTimeCellLabels(),CLASS_OFFICE_HOURS_GRID_TIME_CELL_LABEL);
        setStyleClassOnAll(workspaceComponent.getOfficeHoursGridTACellPanes(),CLASS_OFFICE_HOURS_GRID_TA_CELL_PANE);
        setStyleClassOnAll(workspaceComponent.getOfficeHoursGridTACellLabels(),CLASS_OFFICE_HOURS_GRID_TA_CELL_LABEL);
        workspaceComponent.getNewEndBox().getStyleClass().add(CLASS_OFFICE_HOURS_GRID_NEW_END_TIME);
        workspaceComponent.getNewStartBox().getStyleClass().add(CLASS_OFFICE_HOURS_GRID_NEW_START_TIME);
        workspaceComponent.getChangeTimeButton().getStyleClass().add(CLASS_OFFICE_HOURS_GRID_UPDATE_TIME_BUTTON);
    }
    /**
     * This helper method initializes the style of all the nodes in the nodes
     * map to a common style, styleClass.
     */
    private void setStyleClassOnAll(HashMap nodes,String styleClass)
    {
        for(Object nodeObject : nodes.values())
        {
            Node n=(Node)nodeObject;
            n.getStyleClass().add(styleClass);
        }
    }
}