package _Experiments_._Dumped_;
//http://stackoverflow.com/questions/20879242/get-checkbox-value-in-a-table-in-javafx
import _Externals_.r;
import javafx.application.Application;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
/**
 * @author reegan
 */
@SuppressWarnings("unchecked")
public class CheckBoxTableCellTest extends Application
{
    final TableView<Person> tableView=new TableView<>();
    public void addPerson(String firstname,String lastname,boolean undergrad)
    {
        tableView.getItems().add(new Person(firstname,lastname,undergrad));
    }
    public String getState()
    {
        return r.joinLines(tableView.getItems().toArray()).replaceAll("\n",";");
    }

    public void start(Stage primaryStage)
    {
        addPerson("A","B",true);
        addPerson("C","D",false);
        addPerson("E","F",true);
        addPerson("G","H",false);
        //
        final TableColumn<Person,String> firstNameCol=new TableColumn<>("First Name");
        final TableColumn<Person,String> lastNameCol=new TableColumn<>("Last Name");
        final TableColumn<Person,Boolean> undergradCol=new TableColumn<>("Undergrad");
        //
        tableView.getColumns().addAll(firstNameCol,lastNameCol,undergradCol);
        //
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        undergradCol.setCellValueFactory(new PropertyValueFactory<>("undergrad"));
        undergradCol.setCellFactory(CheckBoxTableCell.forTableColumn(undergradCol));
        //
        undergradCol.setEditable(true);
        tableView.setEditable(true);
        primaryStage.setScene(new Scene(tableView,300,400));
        primaryStage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
    //region Person Class (with getters and setters)
    public static class Person
    {
        private StringProperty firstName;
        private StringProperty lastName;
        private BooleanProperty undergrad;
        public Person(String firstName,String lastName,boolean undergrad)
        {
            this.firstName=new SimpleStringProperty(firstName);
            this.lastName=new SimpleStringProperty(lastName);
            this.undergrad=new SimpleBooleanProperty(undergrad);
        }
        public StringProperty firstNameProperty()
        {
            return firstName;
        }
        public StringProperty lastNameProperty()
        {
            return lastName;
        }
        public BooleanProperty undergradProperty()
        {
            return undergrad;
        }
        //endregion
    }
}