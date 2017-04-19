package _Externals_;
import java.util.ArrayList;

import static _Externals_.r.say;
/**
 * @author McKillaGorilla and then modified by Ryan B
 */
@SuppressWarnings({"unchecked","Duplicates"})
public class UndoRedoCoordinator
{
    private ArrayList<Undoable> history=new ArrayList();
    private int cursor=-1;
    private class Undoable
    {
        Runnable Do;
        Runnable Undo;
    }
    public void clearHistory()
    {
        //Deletes all undos and redos
        cursor=-1;
        history.clear();
        if(history.size()!=0)
            say("What the hell this is impossible size should definately be 0");
    }
    public void Do(Runnable Do,Runnable Undo)
    {
        // say("hi");
        Undoable transaction=new Undoable();
        transaction.Do=Do;
        transaction.Undo=Undo;
        if(cursor<0)// IS THIS THE FIRST TRANSACTION?
        {
            if(history.size()>0)// DO WE HAVE TO CHOP THE LIST?
            {
                history=new ArrayList();
            }
            history.add(transaction);
        }
        else if(cursor<(history.size()-1))// ARE WE ERASING ALL THE REDO TRANSACTIONS?
        {
            history.set(cursor+1,transaction);
            history=new ArrayList(history.subList(0,cursor+2));
        }
        else
        {
            history.add(transaction);// IS IT JUST A TRANSACTION TO APPEND TO THE END?
        }
        Redo();
    }
    public boolean Redo()//true if success false if fail
    {
        if(cursor<(history.size()-1))
        {
            say("reDo succeeded");
            history.get(++cursor).Do.run();
            return true;
        }
        else
        {
            say("redo failed");
            return false;
        }
    }
    public boolean Undo()//true if success false if fail
    {
        if(cursor>=0)
        {
            say("Undo succeeded");
            history.get(cursor--).Undo.run();
            return true;
        }
        else
        {
            say("Undo failed");
            return false;
        }
    }
    public String toString()
    {
        String text="--Number of Transactions: "+history.size()+"\n";
        text+="--Current Index on Stack: "+cursor+"\n";
        text+="--Current Transaction Stack:\n";
        for(Undoable u : history)
        {
            text+="----"+u+"\n";
        }
        return text;
    }
}