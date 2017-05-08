package _Externals_._Components_;
//TODO Finish this class
//http://stackoverflow.com/questions/20879242/get-checkbox-value-in-a-table-in-javafx
import _Externals_.r;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
@SuppressWarnings("unchecked")
public class SD_ScheduleItemsTableView extends TableView
{
    public void addItem(String type,String date,String title,String topic,String time,String link,String criteria)
    {
        getItems().add(new Item(type,date,title,topic,time,link,criteria));
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
            try
            {
                getItems().add(new Item(y[0],y[1],y[2],y[3],y[4],y[5],y[6]));
            }
            catch(Exception ignored)
            {
                ignored.printStackTrace();
            }
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
    public void updateItem(String type,String date,String title,String topic,String time,String link,String criteria)
    {
        getSelected().typeProperty().setValue(type);
        getSelected().dateProperty().setValue(date);
        getSelected().titleProperty().setValue(title);
        getSelected().topicProperty().setValue(topic);
        getSelected().time=time;
        getSelected().link=link;
        getSelected().criteria=criteria;
    }
    // region IsValid CHeckers
    // public boolean isValidToAdd(String type,String date,String title,String topic,String time,String link,String criteria)
    // {
    // for(Object x : getItems())//Must not contain duplicate email or name
    // {
    //     if(x!=getSelected())
    //     {
    //         Item y=(Item)x;
    //         if(y.typeProperty().getValue().equals(type)||
    //            y.dateProperty().getValue().equals(date)||
    //            y.titleProperty().getValue().equals(title)||
    //            y.topicProperty().getValue().equals(topic)||
    //            y.time.equals(time)||
    //            y.link.equals(link)||
    //            y.criteria.equals(criteria))
    //         {
    //             return false;//Is not unique
    //         }
    //     }
    // }
    // return true;
    // }
    // public boolean isValidToUpdate(String type,String date,String title,String topic,String time,String link,String criteria)
    // {
    //     if(getSelected()==null)//Can't update anybody if nobody is selected
    //     {
    //         return false;
    //     }
    //     noinspection SimplifiableIfStatement
    // if(getSelected().typeProperty().getValue().equals(type)&&
    //    getSelected().dateProperty().getValue().equals(date)&&
    //    getSelected().titleProperty().getValue().equals(title)&&
    //    getSelected().topicProperty().getValue().equals(topic)&&
    //    getSelected().time.equals(time)&&
    //    getSelected().link.equals(link)&&
    //    getSelected().criteria.equals(criteria))//No fields have been changed
    // {
    //     return false;
    // }
    // return isValidToAdd(type,date,title,topic,time,link,criteria);
    // }
    // endregion
    public void setOnItemSelected(Runnable r)
    {
        getSelectionModel().selectedItemProperty().addListener((ⵁ,oldSelected,newSelected)->r.run());
    }
    public SD_ScheduleItemsTableView(String typeHeader,String dateHeader,String titleHeader,String topicHeader)
    {
        this.setMinHeight(150);
        setOnKeyPressed(ⵁ->r.branch(this::removeSelected,ⵁ.getCode()==KeyCode.DELETE||ⵁ.getCode()==KeyCode.BACK_SPACE));//Only keeping this because I have the auto-transactor!
        //
        addItem("a","2017-04-10","c","d","b","c","d");
        addItem("e","f","g","h","b","c","d");
        addItem("i","j","k","l","b","c","d");
        final TableColumn<Item,String> typeCol=new TableColumn<>(typeHeader);
        final TableColumn<Item,String> dateCol=new TableColumn<>(dateHeader);
        final TableColumn<Item,String> titleCol=new TableColumn<>(titleHeader);
        final TableColumn<Item,String> topicCol=new TableColumn<>(topicHeader);
        //
        getColumns().addAll(typeCol,dateCol,titleCol,topicCol);
        //
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
        dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        topicCol.setCellValueFactory(new PropertyValueFactory<>("topic"));
        //
        // setEditable(true);
    }
    //region Item Class (with getters and setters)
    public class Item
    {
        private StringProperty type;
        private StringProperty date;
        private StringProperty title;
        private StringProperty topic;
        public String time;
        public String link;
        public String criteria;
        public Item(String type,String date,String title,String topic,String time,String link,String criteria)
        {
            this.type=new SimpleStringProperty(type);
            this.date=new SimpleStringProperty(date);
            this.title=new SimpleStringProperty(title);
            this.topic=new SimpleStringProperty(topic);
            this.time=time;
            this.link=link;
            this.criteria=criteria;
        }
        public StringProperty typeProperty()//MUST KEEP THIS METHOD OR CHIT WILL BREAK CAUSE JAVA REFLECTION BS
        {
            return type;
        }
        public StringProperty dateProperty()//MUST KEEP THIS METHOD OR CHIT WILL BREAK CAUSE JAVA REFLECTION BS
        {
            return date;
        }
        public StringProperty titleProperty()
        {
            return title;
        }
        public StringProperty topicProperty()
        {
            return topic;
        }
        //endregion
        public String toString()
        {
            return type.getValue()+","+date.getValue()+","+title.getValue()+","+topic.getValue()+","+time+","+link+","+criteria;
        }
    }
}