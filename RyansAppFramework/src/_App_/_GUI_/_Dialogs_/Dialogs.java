package _App_._GUI_._Dialogs_;//Created by Ryan on 4/10/17.
import _App_.App;
import djf.ui.AppMessageDialogSingleton;
import djf.ui.AppYesNoCancelDialogSingleton;
import djf.ui.AppYesNoDialogSingleton;
public class Dialogs
{
    public App app;
    public Dialogs(App app)
    {
        this.app=app;
    }

    // public String yesNoCancel(String title,String message)
    // {
        // AppYesNoCancelDialogSingleton singleton=AppYesNoCancelDialogSingleton.getSingleton();
        // singleton.show(title, message);
        // return singleton.getSelection();
    // }
    // public String yesNo(String title,String message)
    // {
        // AppYesNoDialogSingleton singleton=AppYesNoDialogSingleton.getSingleton();
        // singleton.show(title,message);
        // return singleton.getSelection();
    // }
    // public void message(String title,String message)
    // {
        // AppMessageDialogSingleton.getSingleton().show(title, message);
    // }


}
