package _App_._GUI_._Dialogs_;//Created by Ryan on 4/10/17.
import _App_.App;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.Optional;
@SuppressWarnings("WeakerAccess")
public class Dialogs
{
    public App app;
    public Dialogs(App app)
    {
        this.app=app;
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
    }
    //region Alerts:error and info
    //Unfortunately the ones in the r class can't work on a javaFx thread. So, I'm going to implement some here:
    //All came from http://code.makery.ch/blog/javafx-dialogs-official/
    private static void showAlert(String title,String header,String content,Alert.AlertType type)
    {
        Alert alert=new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
    public static void showErrorAlert(String title,String header,String content)
    {
        showAlert(title,header,content,Alert.AlertType.ERROR);
    }
    public static void showErrorAlert(String message)
    {
        showErrorAlert("Error",message,"");
    }
    public static void showInfoAlert(String title,String header,String content)
    {
        showAlert(title,header,content,Alert.AlertType.INFORMATION);
    }
    public static void showInfoAlert(String message)
    {
        showErrorAlert("Info",message,"");
    }
    //endregion
    //region StringDialog
    public static String stringDialog(String title,String header,String message)//Returns null if user cancels
    {
        TextInputDialog dialog=new TextInputDialog();
        dialog.setTitle(title);
        dialog.setHeaderText(header);
        dialog.setContentText(message);
        Optional<String> result=dialog.showAndWait();
        if(result.isPresent())
        {
            return result.get();
        }
        return null;//User decided to cancel.
    }
    //endregion
    //region yesno

    public static boolean yesNo(String title,String header,String message)
    {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);
        ButtonType yes=new ButtonType("Yes");
        ButtonType no=new ButtonType("No");
        // ButtonType buttonTypeThree = new ButtonType("Three");
        // ButtonType buttonTypeCancel = new ButtonType("Cancel",ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(yes,no);//, buttonTypeThree, buttonTypeCancel);
        Optional<ButtonType> result=alert.showAndWait();
        if(!result.isPresent())
            return yesNo(title,header,message);//Keep asking the user until they click yes or no. Clicking the 'x' is not an option.
        if(result.get()==no)
            return false;
        assert result.get()==yes;
        return false;
    }
    public static boolean yesNo(String message)
    {
        return yesNo("",message,"");
    }
    //endregion
    //region open/save file/directory
    private FileChooser getFileChooser()
    {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(app.io.misc.getCurrentDirectory());
        return fileChooser;
    }
    public File openFile()//Returns null if cancelled
    {
        return getFileChooser().showOpenDialog(app.stage);
    }
    public File saveFile()
    {
        return getFileChooser().showSaveDialog(app.stage);
    }
    public File openDirectory()//Returns null if cancelled
    {
        DirectoryChooser directoryChooser=new DirectoryChooser();
        directoryChooser.setInitialDirectory(app.io.misc.getCurrentDirectory());
        return new DirectoryChooser().showDialog(app.stage);
    }
    //endregion
}
