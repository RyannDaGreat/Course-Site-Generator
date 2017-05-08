package _Externals_._Components_;
//TODO Finish this class
//http://stackoverflow.com/questions/20879242/get-checkbox-value-in-a-table-in-javafx
import _App_.App;
import _Externals_.r;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
@SuppressWarnings("unchecked")
public class TD_TATableView extends TableView
{
    private App app;
    public void addPerson(boolean undergrad,String name,String email)
    {
        getItems().add(new TA(undergrad,name,email));
    }
    public String getState()
    {
        return r.joinLines(getItems().toArray()).replaceAll("\n",";");
    }
    public interface F
    {
        void f(TA x);
    }
    public void forAll(F f)
    {
        for(Object o : getItems())
        {
            f.f((TA)o);
        }
    }
    public void setState(String state)
    {
        getItems().clear();
        for(String x : state.split(";"))
        {
            String[] y=x.split(",");
            try
            {
                getItems().add(new TA(Boolean.parseBoolean(y[0]),y[1],y[2]));
            }
            catch(Exception ignored)
            {
            }
        }
    }
    public TA getSelected()
    {
        return (TA)getSelectionModel().getSelectedItem();
    }
    public ArrayList<String> getTANames()
    {
        ArrayList<String> out=new ArrayList<>();
        for(Object o : getItems())
        {
            out.add(((TA)o).nameProperty().getValue());
        }
        return out;
    }
    public void remove(TA ta)
    {
        if(app.gui.modes.recitationData.reader.containsTAName(ta.name.getValue()))
        {
            app.gui.dialogs.showCannotDeleteTaAlert();
        }
        else
        {
            getItems().remove(ta);
        }
    }
    public void updateSelectedTANameEmail(String name,String email)
    {
        getSelected().nameProperty().setValue(name);
        getSelected().emailProperty().setValue(email);
    }
    public boolean isValidToAdd(String name,String email)
    {
        if(!mightBeValid(name,email))
        {
            return false;
        }
        for(Object x : getItems())//Must not contain duplicate email or name
        {
            TA y=(TA)x;
            if(y.nameProperty().getValue().equals(name)||y.emailProperty().getValue().equals(name))
            {
                return false;//Is not unique
            }
        }
        return true;
    }
    public boolean isValidToUpdate(String name,String email)
    {
        if(getSelected()==null)//Can't update anybody if nobody is selected
        {
            return false;
        }
        if(!mightBeValid(name,email))
        {
            return false;
        }
        if(getSelected().nameProperty().getValue().equals(name)&&getSelected().emailProperty().getValue().equals(email))//Name nor email havent been changed
        {
            return false;
        }
        for(Object x : getItems())//Must not contain duplicate email or name
        {
            if(x!=getSelected())
            {
                TA y=(TA)x;
                if(y.nameProperty().getValue().equals(name)||y.emailProperty().getValue().equals(name))
                {
                    return false;//Is not unique
                }
            }
        }
        return true;
    }
    private boolean mightBeValid(String name,String email)
    {
        if(name.equals("")||email.equals(""))//Name and email cannot be empty
        {
            return false;
        }
        if((name+email).contains(",")||(name+email).contains(";")||(name+email).contains("\n"))//Cannot contain illegal characters used to save the grid states
        {
            return false;
        }
        if(!r.isValidEmail(email))//Must be valid email
        {
            return false;
        }
        return true;
    }
    public TD_TATableView(String undergradHeader,String nameHeader,String emailHeader,App app)//THis is an external and should NOT have access to the app but im pissed off because i got 24 hrs less than I thought I would, cutting my time to work on this in half.
    {
        setMinHeight(50);
        this.app=app;
        addPerson(true,"A","B");
        addPerson(false,"C","D");
        addPerson(true,"E","F");
        addPerson(false,"G","H");
        final TableColumn<TA,Boolean> undergradCol=new TableColumn<>(undergradHeader);
        final TableColumn<TA,String> nameCol=new TableColumn<>(nameHeader);
        final TableColumn<TA,String> emailCol=new TableColumn<>(emailHeader);
        //
        getColumns().addAll(undergradCol,nameCol,emailCol);
        //
        undergradCol.setCellValueFactory(new PropertyValueFactory<>("undergrad"));
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));
        //
        undergradCol.setCellFactory(CheckBoxTableCell.forTableColumn(undergradCol));
        undergradCol.setEditable(true);
        //
        setEditable(true);
    }
    //region Person Class (with getters and setters)
    public class TA
    {
        private BooleanProperty undergrad;
        private StringProperty name;
        private StringProperty email;
        public TA(boolean undergrad,String name,String email)
        {
            this.undergrad=new SimpleBooleanProperty(undergrad);
            this.name=new SimpleStringProperty(name);
            this.email=new SimpleStringProperty(email);
        }
        public BooleanProperty undergradProperty()//MUST KEEP THIS METHOD OR CHIT WILL BREAK CAUSE JAVA REFLECTION BS
        {
            return undergrad;
        }
        public StringProperty nameProperty()
        {
            return name;
        }
        public StringProperty emailProperty()
        {
            return email;
        }
        //endregion
        public String toString()
        {
            return undergrad.getValue()+","+name.getValue()+","+email.getValue();
        }
    }
}