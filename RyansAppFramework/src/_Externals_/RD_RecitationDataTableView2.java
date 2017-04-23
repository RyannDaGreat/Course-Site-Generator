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
// public class RD_RecitationDataTableView extends TableView
// {
//     public void addRecitation(String type,String date,String title,String topic,String time,String link,String criteria)
//     {
//         getItems().add(new Recitation(type,date,title,topic,time,link,criteria));
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
//             getItems().add(new Recitation(y[0],y[1],y[2],y[3],y[4],y[5],y[6]));
//         }
//     }
//     public Recitation getSelected()
//     {
//         return (Recitation)getSelectionModel().getSelectedItem();
//     }
//     public void remove(Recitation x)
//     {
//         getItems().remove(x);
//     }
//     public void removeSelected()//Syntactic sugar
//     {
//         remove(getSelected());
//     }
//     public void updateRecitation(String type,String date,String title,String topic)
//     {
//         getSelected().typeProperty().setValue(type);
//         getSelected().dateProperty().setValue(date);
//         getSelected().titleProperty().setValue(title);
//         getSelected().topicProperty().setValue(topic);
//     }
//     public void setOnRecitationSelected(Runnable r)
//     {
//         getSelectionModel().selectedItemProperty().addListener((ⵁ,oldSelected,newSelected)->r.run());
//     }
//     public RD_RecitationDataTableView(String typeHeader,String dateHeader,String titleHeader,String topicHeader)
//     {
//         setOnKeyPressed(ⵁ->r.branch(this::removeSelected,ⵁ.getCode()==KeyCode.DELETE||ⵁ.getCode()==KeyCode.BACK_SPACE));//Only keeping this because I have the auto-transactor!
//         //
//         final TableColumn< Recitation,String> typeCol=new TableColumn<>(typeHeader);
//         final TableColumn<Recitation,String> dateCol=new TableColumn<>(dateHeader);
//         final TableColumn<Recitation,String> titleCol=new TableColumn<>(titleHeader);
//         final TableColumn<Recitation,String> topicCol=new TableColumn<>(topicHeader);
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
//     //region Recitation Class (with getters and setters)
//     public class Recitation
//     {
//         private StringProperty type;
//         private StringProperty date;
//         private StringProperty title;
//         private StringProperty topic;
//         public String time;
//         public String link;
//         public String criteria;
//         public Recitation(String type,String date,String title,String topic,String time,String link,String criteria)
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