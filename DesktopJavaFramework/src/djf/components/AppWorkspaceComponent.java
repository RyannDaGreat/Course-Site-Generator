package djf.components;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * This abstract class provides the structure for workspace components in
 * our applications. Note that by doing so we make it possible
 * for customly provided descendent classes to have their methods
 * called from this framework.
 * 
 * @author Richard McKenna
 * @version 1.0
 */
public abstract class AppWorkspaceComponent {
    // THIS IS THE WORKSPACE WHICH WILL BE DIFFERENT
    // DEPENDING ON THE CUSTOM APP USING THIS FRAMEWORK

    // THIS IS THE MAIN WORKSPACE PANE, ALL OTHER CONTROLS 
    // WOULD GO INSIDE. NOTE THAT WHEN IT IS CONSTRUCTED,
    // IT MAY ACTUALLY BE ANY Pane DESCENDENT CLASS
    protected Pane workspace;
    
    // THIS DENOTES THAT THE USER HAS BEGUN WORKING AND
    // SO THE WORKSPACE IS VISIBLE AND USABLE
    protected boolean workspaceActivated;
    
    /**
     * When called this function puts the workspace into the window,
     * revealing the controls for editing work.
     * 
     * @param appPane The pane that contains all the controls in the
     * entire application, including the file toolbar controls, which
     * this framework manages, as well as the customly provided workspace,
     * which would be different for each app.
     */
    public void activateWorkspace(BorderPane appPane) {
        if (!workspaceActivated) {
            // PUT THE WORKSPACE IN THE GUI
            appPane.setCenter(workspace);
            workspaceActivated = true;
        }
    }
    
    /**
     * Mutator method for setting the custom workspace.
     * 
     * @param initWorkspace The workspace to set as the user
     * interface's workspace.
     */
    public void setWorkspace(Pane initWorkspace) { 
	workspace = initWorkspace; 
    }
    
    /**
     * Accessor method for getting the workspace.
     * 
     * @return The workspace pane for this app.
     */
    public Pane getWorkspace() { return workspace; }
    
    // THE DEFINITION OF THIS CLASS SHOULD BE PROVIDED
    // BY THE CONCRETE WORKSPACE

    /**
     * This function must be defined in the actual workspace
     * component class and should be called before loading
     * new data.
     */
    public abstract void resetWorkspace();

    /**
     * This function must be defined in the actual workspace
     * component class and should be called after data has
     * been loaded and the workspace must use it to initialize
     * controls.
     */
    public abstract void reloadWorkspace(AppDataComponent dataComponent);
}
