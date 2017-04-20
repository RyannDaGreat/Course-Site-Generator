package _Externals_;
//TODO Finish this class
//http://stackoverflow.com/questions/20879242/get-checkbox-value-in-a-table-in-javafx
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
/**
 * @author reegan
 */
@SuppressWarnings("unchecked")
public class TATableView extends TableView
{
    public void addPerson(boolean undergrad,String name,String email)
    {
        getItems().add(new TA(undergrad,email,name));
    }
    public String getState()
    {
        return r.joinLines(getItems().toArray()).replaceAll("\n",";");
    }
    public void setState(String state)
    {
        getItems().clear();
        for(String x:state.split(";"))
        {
            String[]y=x.split(",");
            getItems().add(new TA(Boolean.parseBoolean(y[0]),y[1],y[2]));
        }
    }
    public TA getSelected()
    {
        return (TA)getSelectionModel().getSelectedItem();
    }
    public void remove(TA ta)
    {
        getItems().remove(ta);
    }
    public void updateSelectedTANameEmail(String name,String email)
    {
        getSelected().nameProperty().setValue(name);
        getSelected().emailProperty().setValue(email);
    }
    public boolean isValidToAdd(String name,String email)
    {
        if(!mightBeValid(name,email))
            return false;
        for(Object x:getItems())//Must not contain duplicate email or name
        {
            TA y=(TA)x;
            if(y.nameProperty().getValue().equals(name)||y.emailProperty().getValue().equals(name))
                return false;//Is not unique
        }
        return true;
    }
    public boolean isValidToUpdate(String name,String email)
    {
        if(!mightBeValid(name,email))
            return false;
        for(Object x:getItems())//Must not contain duplicate email or name
        {
            if(x!=getSelected())
            {
                TA y=(TA)x;
                if(y.nameProperty().getValue().equals(name)||y.emailProperty().getValue().equals(name))
                    return false;//Is not unique
            }
        }
        return true;
    }
    private boolean mightBeValid(String name,String email)
    {
        if(name.equals("")||email.equals(""))//Name and email cannot be empty
            return false;
        if((name+email).contains(",")||(name+email).contains(";")||(name+email).contains("\n"))//Cannot contain illegal characters used to save the grid states
            return false;
        if(!r.isValidEmail(email))//Must be valid email
            return false;
        return true;
    }
    public TATableView(String undergradHeader,String nameHeader,String emailHeader)
    {
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
        public TA(boolean undergrad,String email,String name)
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