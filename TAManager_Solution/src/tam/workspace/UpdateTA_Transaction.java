/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tam.workspace;


import jtps.jTPS_Transaction;
import tam.TAManagerApp;
import tam.data.TAData;
import tam.data.TeachingAssistant;


/**
 *
 * @author khurr
 */
public class UpdateTA_Transaction implements jTPS_Transaction {

    private String oldName;
    private String newName;
    private String oldEmail;
    private String newEmail;
    private TAData taData;
    private TeachingAssistant ta;
    private TAManagerApp app; 
    private TAWorkspace transWorkspace; 

    public UpdateTA_Transaction(String orgName, String name, String orgEmail, String email, TAData data, TAManagerApp taApp, TAWorkspace workspace) {
        oldName = orgName;
        newName = name;
        oldEmail = orgEmail;
        newEmail = email;
        taData = data;
        ta = data.getTA(orgName);
        app=taApp; 
        transWorkspace=workspace; 
    }

    @Override
    public void doTransaction() {  //Control Y 
        System.out.println("updateTA doTransaction ");
        taData.getTA(oldName).setName(newName);
        TAController controller = new TAController(app);
        controller.handleUpdateTaGrid(oldName, newName);
        ta.setName(newName);                        // MOVED TO TRANSACTION CASE 
        ta.setEmail(newEmail);
        transWorkspace.nameTextField.setText(newName);
        transWorkspace.emailTextField.setText(newEmail);
       // transWorkspace.taTable.refresh();

    }

    @Override
    public void undoTransaction() {  //Control Z 
        System.out.println("updateTA undoTransaction ");
        taData.getTA(newName).setName(oldName);
        TAController controller = new TAController(app);
        controller.handleUpdateTaGrid(newName, oldName);
        ta.setName(oldName);        // MOVED TO TRANSACTION CASE 
        ta.setEmail(oldEmail);
        transWorkspace.nameTextField.setText(oldName);
        transWorkspace.emailTextField.setText(oldEmail);
        //transWorkspace.taTable.refresh();

    }

}
