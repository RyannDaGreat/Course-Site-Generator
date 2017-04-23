// package _Externals_;
// //TODO Finish this class
// //http://stackoverflow.com/questions/20879242/get-checkbox-value-in-a-table-in-javafx
// import javafx.beans.property.SimpleStringProperty;
// import javafx.beans.property.StringProperty;
// import javafx.scene.control.TableColumn;
// import javafx.scene.control.TableView;
// import javafx.scene.control.cell.PropertyValueFactory;
// import javafx.scene.input.KeyCode;
// @SuppressWarnings("unchecked")
// public class SD_ScheduleItemsTableView2 extends TableView
// {
//     public void addItem(String type,String date,String title,String topic,String time,String link,String criteria)
//     {
//         getItems().add(new Item(type,date,title,topic,time,link,criteria));
//     }
//     public String getState()
//     {
//         return r.joinLines(getItems().toArray()).replaceAll("\n",";");
//     }
//     public void setState(String state)
//     {
//         this.setMinHeight(300);
//         getItems().clear();
//         for(String x:state.split(";"))
//         {
//             String[]y=x.split(",");
//             getItems().add(new Item(y[0],y[1],y[2],y[3],y[4],y[5],y[6]));
//         }
//     }
//     public Item getSelected()
//     {
//         return (Item)getSelectionModel().getSelectedItem();
//     }
//     public void remove(Item x)
//     {
//         getItems().remove(x);
//     }
//     public void removeSelected()//Syntactic sugar
//     {
//         remove(getSelected());
//     }
//     public void updateItem(String type,String date,String title,String topic)
//     {
//         getSelected().typeProperty().setValue(type);
//         getSelected().dateProperty().setValue(date);
//         getSelected().titleProperty().setValue(title);
//         getSelected().topicProperty().setValue(topic);
//     }
//
//     //region IsValid CHeckers
//     // public boolean isValidToAdd(String type,String date,String title,String topic)
//     // {
//         // if(!mightBeValid(name,email))
//         //     return false;
//         // for(Object x:getItems())//Must not contain duplicate email or name
//         // {
//         //     Item y=(Item)x;
//         //     if(y.nameProperty().getValue().equals(name)||y.emailProperty().getValue().equals(name))
//         //         return false;//Is not unique
//         // }
//         // return true;
//     // }
//     // public boolean isValidToUpdate(String type,String date,String title,String topic)
//     // {
//         // if(getSelected()==null)//Can't update anybody if nobody is selected
//         //     return false;
//         // if(!mightBeValid(name,email))
//         //     return false;
//         // if(getSelected().nameProperty().getValue().equals(name)&&getSelected().emailProperty().getValue().equals(email))//Name nor email havent been changed
//         //     return false;
//         // for(Object x:getItems())//Must not contain duplicate email or name
//         // {
//         //     if(x!=getSelected())
//         //     {
//         //         Item y=(Item)x;
//         //         if(y.nameProperty().getValue().equals(name)||y.emailProperty().getValue().equals(name))
//         //             return false;//Is not unique
//         //     }
//         // }
//         // return true;
//     // }
//     // private boolean mightBeValid(String type,String date,String title,String topic)
//     // {
//         // if(name.equals("")||email.equals(""))//Name and email cannot be empty
//         //     return false;
//         // if((name+email).contains(",")||(name+email).contains(";")||(name+email).contains("\n"))//Cannot contain illegal characters used to save the grid states
//         //     return false;
//         // if(!r.isValidEmail(email))//Must be valid email
//         //     return false;
//         // return true;
//     // }
//     //endregion
//     public void setOnItemSelected(Runnable r)
//     {
//         getSelectionModel().selectedItemProperty().addListener((ⵁ,oldSelected,newSelected)->r.run());
//     }
//     public SD_ScheduleItemsTableView2(String typeHeader,String dateHeader,String titleHeader,String topicHeader)
//     {
//         setOnKeyPressed(ⵁ->r.branch(this::removeSelected,ⵁ.getCode()==KeyCode.DELETE||ⵁ.getCode()==KeyCode.BACK_SPACE));//Only keeping this because I have the auto-transactor!
//         //
//         addItem("a","b","c","d");
//         addItem("e","f","g","h");
//         addItem("i","j","k","l");
//         final TableColumn<Item,String> typeCol=new TableColumn<>(typeHeader);
//         final TableColumn<Item,String> dateCol=new TableColumn<>(dateHeader);
//         final TableColumn<Item,String> titleCol=new TableColumn<>(titleHeader);
//         final TableColumn<Item,String> topicCol=new TableColumn<>(topicHeader);
//         //
//         getColumns().addAll(typeCol,dateCol,titleCol,topicCol);
//         //
//         typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));
//         dateCol.setCellValueFactory(new PropertyValueFactory<>("date"));
//         titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
//         topicCol.setCellValueFactory(new PropertyValueFactory<>("topic"));
//         //
//         // setEditable(true);
//     }
//
//     //region Item Class (with getters and setters)
//     public class Item
//     {
//         private StringProperty type;
//         private StringProperty date;
//         private StringProperty title;
//         private StringProperty topic;
//         public String time;
//         public String link;
//         public String criteria;
//         public Item(String type,String date,String title,String topic,String time,String link,String criteria)
//         {
//             this.type=new SimpleStringProperty(type);
//             this.date=new SimpleStringProperty(date);
//             this.title=new SimpleStringProperty(title);
//             this.topic=new SimpleStringProperty(topic);
//             this.time=time;
//             this.link=link;
//             this.criteria=criteria;
//         }
//         public StringProperty typeProperty()//MUST KEEP THIS METHOD OR CHIT WILL BREAK CAUSE JAVA REFLECTION BS
//         {
//             return type;
//         }
//         public StringProperty dateProperty()//MUST KEEP THIS METHOD OR CHIT WILL BREAK CAUSE JAVA REFLECTION BS
//         {
//             return date;
//         }
//         public StringProperty titleProperty()
//         {
//             return title;
//         }
//         public StringProperty topicProperty()
//         {
//             return topic;
//         }
//         //endregion
//         public String toString()
//         {
//             return type.getValue()+","+date.getValue()+","+title.getValue()+","+topic.getValue()+","+time+","+link+","+criteria;
//         }
//     }
// }