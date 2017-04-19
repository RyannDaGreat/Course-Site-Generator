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
        getItems().add(new Person(undergrad,email,name));
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
            getItems().add(new Person(Boolean.parseBoolean(y[0]),y[1],y[2]));
        }
    }
    public TATableView(String undergradHeader,String nameHeader,String emailHeader)
    {
        addPerson(true,"A","B");
        addPerson(false,"C","D");
        addPerson(true,"E","F");
        addPerson(false,"G","H");
        final TableColumn<Person,Boolean> undergradCol=new TableColumn<>(undergradHeader);
        final TableColumn<Person,String> nameCol=new TableColumn<>(nameHeader);
        final TableColumn<Person,String> emailCol=new TableColumn<>(emailHeader);
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
    public static class Person
    {
        private BooleanProperty undergrad;
        private StringProperty name;
        private StringProperty email;
        public Person(boolean undergrad,String email,String name)
        {
            this.undergrad=new SimpleBooleanProperty(undergrad);
            this.name=new SimpleStringProperty(name);
            this.email=new SimpleStringProperty(email);
        }
        public BooleanProperty undergradProperty()
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