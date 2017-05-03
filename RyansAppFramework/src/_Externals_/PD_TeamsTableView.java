package _Externals_;
//TODO Finish this class
//http://stackoverflow.com/questions/20879242/get-checkbox-value-in-a-table-in-javafx
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
@SuppressWarnings("unchecked")
public class PD_TeamsTableView extends TableView
{
    public void addItem(String field1,String field2,String field3,String field4)
    {
        getItems().add(new Item(field1,field2,field3,field4));
    }
    public String getState()
    {
        return r.joinLines(getItems().toArray()).replaceAll("\n",";");
    }
    public void setState(String state)
    {
        getItems().clear();
        for(String x : state.split(";"))
        {
            String[] y=x.split(",");
            getItems().add(new Item(y[0],y[1],y[2],y[3]));
        }
    }
    public Item getSelected()
    {
        return (Item)getSelectionModel().getSelectedItem();
    }
    public interface F
    {
        void f(Item x);
    }
    public void forAll(F f)
    {
        for(Object o : getItems())
        {
            f.f((Item)o);
        }
    }
    public void remove(Item x)
    {
        getItems().remove(x);
    }
    public void removeSelected()//Syntactic sugar
    {
        remove(getSelected());
    }
    public void updateItem(String field1,String field2,String field3,String field4)
    {
        getSelected().field1Property().setValue(field1);
        getSelected().field2Property().setValue(field2);
        getSelected().field3Property().setValue(field3);
        getSelected().field4Property().setValue(field4);
    }
    //region IsValid CHeckers
    // public boolean isValidToAdd(String field1,String field2,String field3,String field4)
    // {
    // if(!mightBeValid(name,email))
    //     return false;
    // for(Object x:getItems())//Must not contain duplicate email or name
    // {
    //     Item y=(Item)x;
    //     if(y.nameProperty().getValue().equals(name)||y.emailProperty().getValue().equals(name))
    //         return false;//Is not unique
    // }
    // return true;
    // }
    // public boolean isValidToUpfield2(String field1,String field2,String field3,String field4)
    // {
    // if(getSelected()==null)//Can't upfield2 anybody if nobody is selected
    //     return false;
    // if(!mightBeValid(name,email))
    //     return false;
    // if(getSelected().nameProperty().getValue().equals(name)&&getSelected().emailProperty().getValue().equals(email))//Name nor email havent been changed
    //     return false;
    // for(Object x:getItems())//Must not contain duplicate email or name
    // {
    //     if(x!=getSelected())
    //     {
    //         Item y=(Item)x;
    //         if(y.nameProperty().getValue().equals(name)||y.emailProperty().getValue().equals(name))
    //             return false;//Is not unique
    //     }
    // }
    // return true;
    // }
    // private boolean mightBeValid(String field1,String field2,String field3,String field4)
    // {
    // if(name.equals("")||email.equals(""))//Name and email cannot be empty
    //     return false;
    // if((name+email).contains(",")||(name+email).contains(";")||(name+email).contains("\n"))//Cannot contain illegal characters used to save the grid states
    //     return false;
    // if(!r.isValidEmail(email))//Must be valid email
    //     return false;
    // return true;
    // }
    //endregion
    public void setOnItemSelected(Runnable r)
    {
        getSelectionModel().selectedItemProperty().addListener((ⵁ,oldSelected,newSelected)->r.run());
    }
    public PD_TeamsTableView(String field1Header,String field2Header,String field3Header,String field4Header)
    {
        this.setMinHeight(150);
        setOnKeyPressed(ⵁ->r.branch(this::removeSelected,ⵁ.getCode()==KeyCode.DELETE||ⵁ.getCode()==KeyCode.BACK_SPACE));//Only keeping this because I have the auto-transactor!
        //
        addItem("a","b","c","d");
        addItem("e","f","g","h");
        addItem("i","j","k","l");
        final TableColumn<Item,String> field1Col=new TableColumn<>(field1Header);
        final TableColumn<Item,String> field2Col=new TableColumn<>(field2Header);
        final TableColumn<Item,String> field3Col=new TableColumn<>(field3Header);
        final TableColumn<Item,String> field4Col=new TableColumn<>(field4Header);
        //
        getColumns().addAll(field1Col,field2Col,field3Col,field4Col);
        //
        field1Col.setCellValueFactory(new PropertyValueFactory<>("field1"));
        field2Col.setCellValueFactory(new PropertyValueFactory<>("field2"));
        field3Col.setCellValueFactory(new PropertyValueFactory<>("field3"));
        field4Col.setCellValueFactory(new PropertyValueFactory<>("field4"));
    }
    //region Item Class (with getters and setters)
    public class Item
    {
        private StringProperty field1;
        private StringProperty field2;
        private StringProperty field3;
        private StringProperty field4;
        public Item(String field1,String field2,String field3,String field4)
        {
            this.field1=new SimpleStringProperty(field1);
            this.field2=new SimpleStringProperty(field2);
            this.field3=new SimpleStringProperty(field3);
            this.field4=new SimpleStringProperty(field4);
        }
        public StringProperty field1Property()//MUST KEEP THIS METHOD OR CHIT WILL BREAK CAUSE JAVA REFLECTION BS
        {
            return field1;
        }
        public StringProperty field2Property()//MUST KEEP THIS METHOD OR CHIT WILL BREAK CAUSE JAVA REFLECTION BS
        {
            return field2;
        }
        public StringProperty field3Property()
        {
            return field3;
        }
        public StringProperty field4Property()
        {
            return field4;
        }
        //endregion
        public String toString()
        {
            return field1.getValue()+","+field2.getValue()+","+field3.getValue()+","+field4.getValue();
        }
    }
}