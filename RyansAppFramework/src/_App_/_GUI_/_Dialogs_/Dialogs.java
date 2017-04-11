package _App_._GUI_._Dialogs_;//Created by Ryan on 4/10/17.
import _App_.App;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.util.Arrays;
@SuppressWarnings("WeakerAccess")
public class Dialogs
{
    public App app;
    public Dialogs(App app)
    {
        this.app=app;
    }
    //region Yes/No/Cancel Dialogs
    public enum dialogOptions//Used for checking the values of various dialog results
    {
        YES,NO,CANCEL
    }
    private dialogOptions intToDialogOption(int i)//Just here to prevent code-redundancy in this class
    {
        /*@formatter:off*/
        if(i==0)
            return dialogOptions.YES;
        if(i==1)
            return dialogOptions.NO;
        if(i==2)
            return dialogOptions.CANCEL;
        assert false;//This should not happen.
        return null;
        /*@formatter:on*/
    }
    public dialogOptions yesNoCancel(String title,String message)//A dialog with the options Yes, No and Cancel
    {
        //Example: r.print(new App().gui.dialogs.yesNoCancel("title","Message")==Dialogs.dialogOptions.CANCEL);  //⟵ Returns true if user selects cancel else false
        //Based on: http://www.java2s.com/Tutorial/Java/0240__Swing/Yesnocanceldialog.htm
        return intToDialogOption(JOptionPane.showConfirmDialog(null,message,title,JOptionPane.YES_NO_CANCEL_OPTION));
    }
    public dialogOptions yesNo(String title,String message)//A dialog with the options Yes and No
    {
        return intToDialogOption(JOptionPane.showConfirmDialog(null,message,title,JOptionPane.YES_NO_OPTION));
    }
    public void ok(String title,String message)//A simple notification dialog with the option "ok"
    {
        JOptionPane.showConfirmDialog(null,message,title,JOptionPane.OK_OPTION);
    }
    //endregion―――――――――――――――――――――――――――――――――――――――――
    //region File/Dir Open/Save Dialogs
    //DOCUMENTATION:
        //'Saving' refers to a dialog where the user has to put in a string, as you would normally do when saving a file.
        //'Opening' refers to selecting exclusively from files/directories that are already there.
        //String[] extensions refers to the available types of files you normally choose from. Leave it blank to enable all filetypes.
        //All methods here are derived from four combinations of true and false from fileDialog, which is private for that reason.
        //These methods can be copy-pasted to and from the r class if necessary.
    private File fileDialog(String title,boolean openIfTrueElseSave,boolean fileIfTrueElseDir,String...extensions)//Leave extensions blank to accept all file types
    {
        /*@formatter:off*/
        JFileChooser chooser=new JFileChooser();
        chooser.setDialogTitle(title);
        if(extensions.length!=0)chooser.setFileFilter(new FileNameExtensionFilter(Arrays.toString(extensions),extensions));
        chooser.setFileSelectionMode(fileIfTrueElseDir?JFileChooser.FILES_ONLY:JFileChooser.DIRECTORIES_ONLY);
        chooser.setCurrentDirectory(new java.io.File("."));//Set pwd
        if(openIfTrueElseSave)chooser.showOpenDialog(null);//Show the dialog
        else chooser.showSaveDialog(null);//Show the dialog
        return chooser.getSelectedFile();
        /*@formatter:on*/
    }
    public File openFile(String title,String...extensions)
    {
        return fileDialog(title,true,true,extensions);
    }
    public File openDirectory(String title,String...extensions)
    {
        return fileDialog(title,true,false,extensions);
    }
    public File saveFile(String title,String...extensions)//Save is defined as a thing where you gotta type out a new file path or something in the dialog, as opposed to open where you only select whats there
    {
        return fileDialog(title,false,true,extensions);
    }
    public File saveDirectory(String title,String...extensions)
    {
        return fileDialog(title,false,false,extensions);
    }
    //endregion
}
