package _App_._GUI_._Dialogs_;//Created by Ryan on 4/10/17.
import _App_.App;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
@SuppressWarnings("WeakerAccess")
public class Dialogs
{
    public App app;
    public Dialogs(App app)
    {
        this.app=app;
    }
    public enum dialogOptions//Used for checking the values of various dialog results
    {
        YES,NO,CANCEL
    }
    public dialogOptions yesNoCancel(String title,String message)
    {
        /*@formatter:off*/
        //Example: r.print(new App().gui.dialogs.yesNoCancel("title","Message")==Dialogs.dialogOptions.CANCEL);  //⟵ Returns true if user selects cancel else false
        //Based on: http://www.java2s.com/Tutorial/Java/0240__Swing/Yesnocanceldialog.htm
        int out=JOptionPane.showConfirmDialog(null,message,title,JOptionPane.YES_NO_CANCEL_OPTION);
        if(out==0)
            return dialogOptions.YES;
        if(out==1)
            return dialogOptions.NO;
        if(out==2)
            return dialogOptions.CANCEL;
        assert false;//This should never happen.
        return null;
        /*@formatter:on*/
    }
    public dialogOptions yesNo(String title,String message)
    {
        /*@formatter:off*/
        //Example: r.print(new App().gui.dialogs.yesNo("title","Message")==Dialogs.dialogOptions.CANCEL);  //⟵ Returns true if user selects cancel else false
        //Based on: http://www.java2s.com/Tutorial/Java/0240__Swing/Yesnocanceldialog.htm
        int out=JOptionPane.showConfirmDialog(null,message,title,JOptionPane.YES_NO_OPTION);
        if(out==0)
            return dialogOptions.YES;
        if(out==1)
            return dialogOptions.NO;
        assert false;//This should never happen.
        return null;
        /*@formatter:on*/
    }
    public void ok(String title,String message)
    {
        JOptionPane.showConfirmDialog(null,message,title,JOptionPane.OK_OPTION);
    }
    public File selectFile(String...allowedFileExtensions)//You can leave allowedFileExtensions as an empty String[] if you want to accept all files
    {
        /*@formatter:off*/
        JFileChooser fileChooser=new JFileChooser();
        if(allowedFileExtensions.length!=0)//The user has specified which filetypes they want to restrict the input to.
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter(null,allowedFileExtensions));
        fileChooser.showOpenDialog(null);
        return fileChooser.getSelectedFile();//From here you can do things such as selectedFile.getPath() or selectedFile.getName() etc
        /*@formatter:on*/
    }
}
