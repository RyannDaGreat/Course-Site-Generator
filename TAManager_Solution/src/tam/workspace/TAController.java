package tam.workspace;
import djf.ui.AppGUI;
import djf.ui.AppMessageDialogSingleton;
import djf.ui.AppYesNoCancelDialogSingleton;

import static tam.TAManagerProp.*;

import djf.ui.AppYesNoDialogSingleton;

import java.util.Collections;
import java.util.HashMap;

import javafx.beans.property.StringProperty;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import jtps.jTPS;
import jtps.jTPS_Transaction;
import properties_manager.PropertiesManager;
import tam.TAManagerApp;
import tam.data.TAData;
import tam.data.TeachingAssistant;
import tam.style.TAStyle;

import static tam.style.TAStyle.CLASS_HIGHLIGHTED_GRID_CELL;
import static tam.style.TAStyle.CLASS_HIGHLIGHTED_GRID_ROW_OR_COLUMN;
import static tam.style.TAStyle.CLASS_OFFICE_HOURS_GRID_TA_CELL_PANE;

import tam.workspace.TAWorkspace;
/**
 * This class provides responses to all workspace interactions, meaning
 * interactions with the application controls not including the file toolbar.
 *
 * @author Richard McKenna
 * @version 1.0
 */
public class TAController
{
    // THE APP PROVIDES ACCESS TO OTHER COMPONENTS AS NEEDED
    TAManagerApp app;
    static jTPS jTPS=new jTPS();
    /**
     * Constructor, note that the app must already be constructed.
     */
    public TAController(TAManagerApp initApp)
    {
        // KEEP THIS FOR LATER
        app=initApp;
    }
    /**
     * This helper method should be called every time an edit happens.
     */
    private void markWorkAsEdited()
    {
        // MARK WORK AS EDITED
        AppGUI gui=app.getGUI();
        gui.getFileController().markAsEdited(gui);
    }
    /**
     * This method responds to when the user requests to add a new TA via the
     * UI. Note that it must first do some validation to make sure a unique name
     * and email address has been provided.
     */
    public void handleAddTA()
    {
        // WE'LL NEED THE WORKSPACE TO RETRIEVE THE USER INPUT VALUES
        TAWorkspace workspace=(TAWorkspace)app.getWorkspaceComponent();
        TextField nameTextField=workspace.getNameTextField();
        TextField emailTextField=workspace.getEmailTextField();
        String name=nameTextField.getText();
        String email=emailTextField.getText();
        EmailValidator checkEmail=new EmailValidator();
        // WE'LL NEED TO ASK THE DATA SOME QUESTIONS TOO
        TAData data=(TAData)app.getDataComponent();
        // WE'LL NEED THIS IN CASE WE NEED TO DISPLAY ANY ERROR MESSAGES
        PropertiesManager props=PropertiesManager.getPropertiesManager();
        // DID THE USER NEGLECT TO PROVIDE A TA NAME?
        if(name.isEmpty())
        {
            AppMessageDialogSingleton dialog=AppMessageDialogSingleton.getSingleton();
            dialog.show(props.getProperty(MISSING_TA_NAME_TITLE),props.getProperty(MISSING_TA_NAME_MESSAGE));
        } // DID THE USER NEGLECT TO PROVIDE A TA EMAIL?
        else if(email.isEmpty())
        {
            AppMessageDialogSingleton dialog=AppMessageDialogSingleton.getSingleton();
            dialog.show(props.getProperty(MISSING_TA_EMAIL_TITLE),props.getProperty(MISSING_TA_EMAIL_MESSAGE));
        } // DOES A TA ALREADY HAVE THE SAME NAME OR EMAIL?
        else if(data.containsTA(name,email))
        {
            AppMessageDialogSingleton dialog=AppMessageDialogSingleton.getSingleton();
            dialog.show(props.getProperty(TA_NAME_AND_EMAIL_NOT_UNIQUE_TITLE),props.getProperty(TA_NAME_AND_EMAIL_NOT_UNIQUE_MESSAGE));
        } // **********Check the TA Email Address for correct format 
        else if(!checkEmail.validate(email))
        {
            AppMessageDialogSingleton dialog=AppMessageDialogSingleton.getSingleton();
            dialog.show(props.getProperty(INVALID_TA_EMAIL_TITLE),props.getProperty(INVALID_TA_EMAIL_MESSAGE));
        } // EVERYTHING IS FINE, ADD A NEW TA
        else
        {
            // ADD THE NEW TA TO THE DATA
            //data.addTA(name, email);
            jTPS_Transaction transaction1=new AddTA_Transaction(name,email,data);
            jTPS.addTransaction(transaction1);
            //jTPS.doTransaction();
            // CLEAR THE TEXT FIELDS
            nameTextField.setText("");
            emailTextField.setText("");
            // AND SEND THE CARET BACK TO THE NAME TEXT FIELD FOR EASY DATA ENTRY
            nameTextField.requestFocus();
            // WE'VE CHANGED STUFF
            markWorkAsEdited();
        }
    }
    /**
     * This function provides a response for when the user presses a keyboard
     * key. Note that we're only responding to Delete, to remove a TA.
     *
     * @param code The keyboard code pressed.
     */
    public void handleKeyPress(KeyCode code)
    {
        // DID THE USER PRESS THE DELETE KEY?
        if(code==KeyCode.DELETE)
        {
            // GET THE TABLE
            TAWorkspace workspace=(TAWorkspace)app.getWorkspaceComponent();
            TableView taTable=workspace.getTATable();
            // IS A TA SELECTED IN THE TABLE?
            Object selectedItem=taTable.getSelectionModel().getSelectedItem();
            if(selectedItem!=null)
            {
                TeachingAssistant ta=(TeachingAssistant)selectedItem;
                String taName=ta.getName();
                TAData data=(TAData)app.getDataComponent();
                HashMap<String,StringProperty> officeHours=data.getOfficeHours();
                jTPS_Transaction transaction1=new DeleteTA_Transaction(ta,data,officeHours);
                jTPS.addTransaction(transaction1);

                /*data.removeTA(taName);

                // AND BE SURE TO REMOVE ALL THE TA'S OFFICE HOURS
               
                for (Label label : labels.values()) {
                    if (label.getText().equals(taName)
                            || (label.getText().contains(taName + "\n"))
                            || (label.getText().contains("\n" + taName))) {
                        data.removeTAFromCell(label.textProperty(), taName);
                    }
                } */
                // WE'VE CHANGED STUFF
                markWorkAsEdited();
            }
        }
    }
    public void handleUndoTransaction()
    {
        System.out.println("Transaction Control Z");
        jTPS.undoTransaction();
        markWorkAsEdited();
    }
    public void handleReDoTransaction()
    {
        System.out.println("Transaction crlt y");
        jTPS.doTransaction();
        markWorkAsEdited();
    }
    /**
     * This function provides a response for when the user clicks on the office
     * hours grid to add or remove a TA to a time slot.
     *
     * @param pane The pane that was toggled.
     */
    public void handleCellToggle(Pane pane)
    {
        // GET THE TABLE
        TAWorkspace workspace=(TAWorkspace)app.getWorkspaceComponent();
        TableView taTable=workspace.getTATable();
        // IS A TA SELECTED IN THE TABLE?
        Object selectedItem=taTable.getSelectionModel().getSelectedItem();
        if(selectedItem!=null)
        {
            // GET THE TA
            jTPS_Transaction transaction=new ToggleTa_Transaction(selectedItem,app,pane);
            jTPS.addTransaction(transaction);

            /*TeachingAssistant ta = (TeachingAssistant) selectedItem;
            String taName = ta.getName();
            TAData data = (TAData) app.getDataComponent();
            String cellKey = pane.getId();

            // AND TOGGLE THE OFFICE HOURS IN THE CLICKED CELL
            data.toggleTAOfficeHours(cellKey, taName);*/
            // WE'VE CHANGED STUFF
            markWorkAsEdited();
        }
    }
    public void handleTaClicked(Pane pane,Pane addBox)
    {
        // GET THE TABLE
        TAWorkspace workspace=(TAWorkspace)app.getWorkspaceComponent();
        TableView taTable=workspace.getTATable();
        // IS A TA SELECTED IN THE TABLE?
        Object selectedItem=taTable.getSelectionModel().getSelectedItem();
        if(selectedItem!=null)
        {
            //selectedItem = taTable.getSelectionModel().getSelectedItem();
            TeachingAssistant ta=(TeachingAssistant)selectedItem;
            // workspace.nameTextField.clear();
            //workspace.emailTextField.clear(); 
            System.out.println("TA CLICKED");
            System.out.println(ta.getName());
            // addBox.getChildren().remove(workspace.addButton); 
            // addBox.getChildren().remove(workspace.clearButton1); 
            addBox.getChildren().add(workspace.nameTextField);
            addBox.getChildren().add(workspace.emailTextField);
            addBox.getChildren().add(workspace.updateTaButton);
            addBox.getChildren().add(workspace.clearButton);
            // GET THE TA
            String taName=ta.getName();
            String taEmail=ta.getEmail();
            TAData data=(TAData)app.getDataComponent();
            // SET TextField To TA NAME
            workspace.nameTextField.setText(taName);
            workspace.emailTextField.setText(taEmail);
            // workspace.updateTaButton.setOnAction(e -> {
            //handleUpdateTA(taName,taEmail,ta);
            // });
            //markWorkAsEdited();   
        }
    }
    public void handleUpdateTA()
    {
        TAWorkspace workspace=(TAWorkspace)app.getWorkspaceComponent();
        TableView taTable=workspace.getTATable();
        Object selectedItem=taTable.getSelectionModel().getSelectedItem();
        TeachingAssistant ta=(TeachingAssistant)selectedItem;
        String orgName=ta.getName();
        String orgEmail=ta.getEmail();
        TextField nameTextField=workspace.getNameTextField();
        TextField emailTextField=workspace.getEmailTextField();
        String name=nameTextField.getText();
        String email=emailTextField.getText();
        EmailValidator checkEmail=new EmailValidator();
        TAData data=(TAData)app.getDataComponent();
        // WE'LL NEED THIS IN CASE WE NEED TO DISPLAY ANY ERROR MESSAGES
        PropertiesManager props=PropertiesManager.getPropertiesManager();
        if(name.isEmpty())
        {
            AppMessageDialogSingleton dialog=AppMessageDialogSingleton.getSingleton();
            dialog.show(props.getProperty(MISSING_TA_NAME_TITLE),props.getProperty(MISSING_TA_NAME_MESSAGE));
        } // DID THE USER NEGLECT TO PROVIDE A TA EMAIL?
        else if(email.isEmpty())
        {
            AppMessageDialogSingleton dialog=AppMessageDialogSingleton.getSingleton();
            dialog.show(props.getProperty(MISSING_TA_EMAIL_TITLE),props.getProperty(MISSING_TA_EMAIL_MESSAGE));
        } // **********Check the TA Email Address for correct format 
        else if(!checkEmail.validate(email))
        {
            AppMessageDialogSingleton dialog=AppMessageDialogSingleton.getSingleton();
            dialog.show(props.getProperty(INVALID_TA_EMAIL_TITLE),props.getProperty(INVALID_TA_EMAIL_MESSAGE));
        } // EVERYTHING IS FINE, ADD A NEW TA
        else
        {
            // ADD THE NEW TA TO THE DATA
            if(!orgName.equalsIgnoreCase(name))
            { //case if only name is changed
                jTPS_Transaction transaction2=new UpdateTA_Transaction(orgName,name,orgEmail,email,data,app,workspace);
                nameTextField.setText(name);
                emailTextField.setText(email);
                jTPS.addTransaction(transaction2);
                //jTPS.doTransaction();
                /*data.getTA(orgName).setName(name);
                handleUpdateTaGrid(orgName, name);
                ta.setName(name);                        // MOVED TO TRANSACTION CASE 
                taTable.refresh();
                 */
                markWorkAsEdited();
            }
            if(!orgEmail.equalsIgnoreCase(email))
            {   //case if only email is changed
                jTPS_Transaction transaction3=new UpdateTA_EmailOnly_Transaction(orgName,orgEmail,email,data,workspace);
                jTPS.addTransaction(transaction3);
                // data.getTA(orgName).setEmail(email);     //moved to transaction class
                //ta.setEmail(email);
                markWorkAsEdited();
            }
            if(orgEmail.equalsIgnoreCase(email)&&orgName.equalsIgnoreCase(name))
            {                //case if nothing is chagned
                AppMessageDialogSingleton dialog=AppMessageDialogSingleton.getSingleton();
                dialog.show(props.getProperty(NO_UPDATE_TITLE),props.getProperty(NO_UPDATE_MESSAGE));
            }
            taTable.refresh();
            nameTextField.setText(name);
            emailTextField.setText(email);
            // AND SEND THE CARET BACK TO THE NAME TEXT FIELD FOR EASY DATA ENTRY
            nameTextField.requestFocus();
            // WE'VE CHANGED STUFF
        }
        // workspace.reloadOfficeHoursGrid(data);
    }
    public void handleTaTableRefresh()
    {
        TAWorkspace workspace=(TAWorkspace)app.getWorkspaceComponent();
        TableView taTable=workspace.getTATable();
        taTable.refresh();
    }
    public void handleUpdateTaGrid(String taName,String newName)
    {
        TAWorkspace workspace=(TAWorkspace)app.getWorkspaceComponent();
        TAData data=(TAData)app.getDataComponent();
        //data.removeTA(taName);
        // AND BE SURE TO REMOVE ALL THE TA'S OFFICE HOURS
        HashMap<String,Label> labels=workspace.getOfficeHoursGridTACellLabels();
        for(Label label : labels.values())
        {   //iterates thourhg the hashmap to find all occurences of orgTA in the office hour grid
            if(label.getText().equals(taName)
               ||(label.getText().contains(taName+"\n"))
               ||(label.getText().contains("\n"+taName)))
            {
                data.renameTaCell(label.textProperty(),taName,newName);
            }
        }
        TableView taTable=workspace.getTATable();
        Collections.sort(data.getTeachingAssistants());  //sorts the teachingAssistants List 
        taTable.refresh();
        markWorkAsEdited();
    }
    void handleGridCellMouseExited(Pane pane)
    {
        String cellKey=pane.getId();
        TAData data=(TAData)app.getDataComponent();
        int column=Integer.parseInt(cellKey.substring(0,cellKey.indexOf("_")));
        int row=Integer.parseInt(cellKey.substring(cellKey.indexOf("_")+1));
        TAWorkspace workspace=(TAWorkspace)app.getWorkspaceComponent();
        Pane mousedOverPane=workspace.getTACellPane(data.getCellKey(column,row));
        mousedOverPane.getStyleClass().clear();
        mousedOverPane.getStyleClass().add(CLASS_OFFICE_HOURS_GRID_TA_CELL_PANE);
        // THE MOUSED OVER COLUMN HEADER
        Pane headerPane=workspace.getOfficeHoursGridDayHeaderPanes().get(data.getCellKey(column,0));
        headerPane.getStyleClass().remove(CLASS_HIGHLIGHTED_GRID_ROW_OR_COLUMN);
        // THE MOUSED OVER ROW HEADERS
        headerPane=workspace.getOfficeHoursGridTimeCellPanes().get(data.getCellKey(0,row));
        headerPane.getStyleClass().remove(CLASS_HIGHLIGHTED_GRID_ROW_OR_COLUMN);
        headerPane=workspace.getOfficeHoursGridTimeCellPanes().get(data.getCellKey(1,row));
        headerPane.getStyleClass().remove(CLASS_HIGHLIGHTED_GRID_ROW_OR_COLUMN);
        // AND NOW UPDATE ALL THE CELLS IN THE SAME ROW TO THE LEFT
        for(int i=2;i<column;i++)
        {
            cellKey=data.getCellKey(i,row);
            Pane cell=workspace.getTACellPane(cellKey);
            cell.getStyleClass().remove(CLASS_HIGHLIGHTED_GRID_ROW_OR_COLUMN);
            cell.getStyleClass().add(CLASS_OFFICE_HOURS_GRID_TA_CELL_PANE);
        }
        // AND THE CELLS IN THE SAME COLUMN ABOVE
        for(int i=1;i<row;i++)
        {
            cellKey=data.getCellKey(column,i);
            Pane cell=workspace.getTACellPane(cellKey);
            cell.getStyleClass().remove(CLASS_HIGHLIGHTED_GRID_ROW_OR_COLUMN);
            cell.getStyleClass().add(CLASS_OFFICE_HOURS_GRID_TA_CELL_PANE);
        }
    }
    void handleGridCellMouseEntered(Pane pane)
    {
        String cellKey=pane.getId();
        TAData data=(TAData)app.getDataComponent();
        int column=Integer.parseInt(cellKey.substring(0,cellKey.indexOf("_")));
        int row=Integer.parseInt(cellKey.substring(cellKey.indexOf("_")+1));
        TAWorkspace workspace=(TAWorkspace)app.getWorkspaceComponent();
        // THE MOUSED OVER PANE
        Pane mousedOverPane=workspace.getTACellPane(data.getCellKey(column,row));
        mousedOverPane.getStyleClass().clear();
        mousedOverPane.getStyleClass().add(CLASS_HIGHLIGHTED_GRID_CELL);
        // THE MOUSED OVER COLUMN HEADER
        Pane headerPane=workspace.getOfficeHoursGridDayHeaderPanes().get(data.getCellKey(column,0));
        headerPane.getStyleClass().add(CLASS_HIGHLIGHTED_GRID_ROW_OR_COLUMN);
        // THE MOUSED OVER ROW HEADERS
        headerPane=workspace.getOfficeHoursGridTimeCellPanes().get(data.getCellKey(0,row));
        headerPane.getStyleClass().add(CLASS_HIGHLIGHTED_GRID_ROW_OR_COLUMN);
        headerPane=workspace.getOfficeHoursGridTimeCellPanes().get(data.getCellKey(1,row));
        headerPane.getStyleClass().add(CLASS_HIGHLIGHTED_GRID_ROW_OR_COLUMN);
        // AND NOW UPDATE ALL THE CELLS IN THE SAME ROW TO THE LEFT
        for(int i=2;i<column;i++)
        {
            cellKey=data.getCellKey(i,row);
            Pane cell=workspace.getTACellPane(cellKey);
            cell.getStyleClass().add(CLASS_HIGHLIGHTED_GRID_ROW_OR_COLUMN);
        }
        // AND THE CELLS IN THE SAME COLUMN ABOVE
        for(int i=1;i<row;i++)
        {
            cellKey=data.getCellKey(column,i);
            Pane cell=workspace.getTACellPane(cellKey);
            cell.getStyleClass().add(CLASS_HIGHLIGHTED_GRID_ROW_OR_COLUMN);
        }
    }
    void handleChangeTime(String startTime,String endTime)
    {
        //TAWorkspace workspace = (TAWorkspace)app.getWorkspaceComponent();
        PropertiesManager props=PropertiesManager.getPropertiesManager();
        AppYesNoDialogSingleton yesNoDialog=AppYesNoDialogSingleton.getSingleton();
        yesNoDialog.show(props.getProperty(UPDATE_TIME_TITLE),props.getProperty(UPDATE_TIME_MESSAGE));
        // AND NOW GET THE USER'S SELECTION
        String selection=yesNoDialog.getSelection();
        if(selection.equals(AppYesNoDialogSingleton.YES))
        {
            int start=convertToMilitaryTime(startTime);
            int end=convertToMilitaryTime(endTime);
            System.out.println(start);
            //TAWorkspace workspace = (TAWorkspace)app.getDataComponent();
            if(start==end||start==-1||end==-1)
            {
                AppMessageDialogSingleton dialog=AppMessageDialogSingleton.getSingleton();
                dialog.show(props.getProperty(INVALID_TIME_INPUT_TITLE),props.getProperty(INVALID_TIME_INPUT_MESSAGE));       //REMEMBER TO CHANGE TO PROPER ERROR MESSAGE
            }
            else if(start>end)
            {
                AppMessageDialogSingleton dialog=AppMessageDialogSingleton.getSingleton();
                dialog.show(props.getProperty(INVALID_TIME_INPUT_TITLE),props.getProperty(INVALID_TIME_INPUT_MESSAGE));       //REMEMBER TO CHANGE TO PROPER ERROR MESSAGE
            }
            else if(end<start)
            {
                AppMessageDialogSingleton dialog=AppMessageDialogSingleton.getSingleton();
                dialog.show(props.getProperty(INVALID_TIME_INPUT_TITLE),props.getProperty(INVALID_TIME_INPUT_MESSAGE));       //REMEMBER TO CHANGE TO PROPER ERROR MESSAGE
            }
            else
            {    //At this point the time varialbes are good to go.
                TAData data=(TAData)app.getDataComponent();
                jTPS_Transaction transaction=new updateTime_Transaction(start,end,data);
                jTPS.addTransaction(transaction);
                //workspace.resetWorkspace();
                //workspace.reloadWorkspace(oldData);
                markWorkAsEdited();
                //workspace.reloadOfficeHoursGrid(data);
            }
        }
    }
    public int convertToMilitaryTime(String time)
    {
        int milTime=0;
        if(time==null)
        {
            PropertiesManager props=PropertiesManager.getPropertiesManager();
            AppMessageDialogSingleton dialog=AppMessageDialogSingleton.getSingleton();
            dialog.show(props.getProperty(INVALID_TA_EMAIL_TITLE),props.getProperty(INVALID_TA_EMAIL_MESSAGE));       //REMEMBER TO CHANGE TO PROPER ERROR MESSAGE
        }
        else if(time.equalsIgnoreCase("12:00pm"))
        {
            milTime=12;
        }
        else
        {
            int index=time.indexOf(":");
            String subStringTime=time.substring(0,index);
            milTime=Integer.parseInt(subStringTime);
            if(time.contains("p"))
            {
                milTime+=12;
            }
        }
        return milTime;
    }
}
