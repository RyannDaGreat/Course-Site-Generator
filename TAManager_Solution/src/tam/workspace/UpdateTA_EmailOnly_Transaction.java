/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tam.workspace;

import javafx.scene.control.TableView;
import jtps.jTPS_Transaction;
import tam.data.TAData;
import tam.data.TeachingAssistant;

/**
 *
 * @author khurr
 */
public class UpdateTA_EmailOnly_Transaction implements jTPS_Transaction{
    
    private String orgName;
    
    private String orgEmail;
    private String newEmail;
    private TAData taData;
    private TAWorkspace workspace;
   public  UpdateTA_EmailOnly_Transaction(String oldName, String oldEmail, String email, TAData data, TAWorkspace workspace )
    {
        orgName=oldName;
        orgEmail=oldEmail;
        newEmail=email;
        taData=data; 
        this.workspace=workspace;
    }
    

    @Override
    public void doTransaction() {  //Control Y 
        TableView taTable = workspace.getTATable();
        TeachingAssistant ta=taData.getTA(orgName); 
        ta.setEmail(newEmail);
        workspace.emailTextField.setText(newEmail);
        taTable.refresh();
        
        //data.getTA(orgName).setEmail(email);
        //tasetEmail(email);
                
        
    }

    @Override
    public void undoTransaction() {  // COntrol Z 
         TableView taTable = workspace.getTATable();
        TeachingAssistant ta=taData.getTA(orgName);
        ta.setEmail(orgEmail);
        workspace.emailTextField.setText(orgEmail);
        taTable.refresh();
        
        
    }
    
}
