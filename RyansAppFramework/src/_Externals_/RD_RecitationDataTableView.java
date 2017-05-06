package _Externals_;
//TODO Finish this class
//http://stackoverflow.com/questions/20879242/get-checkbox-value-in-a-table-in-javafx
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import org.json.JSONException;
import org.json.JSONObject;
@SuppressWarnings("unchecked")
public class RD_RecitationDataTableView extends TableView
{
    public void addRecitation(String section,String instructor,String dayⳆtime,String location,String ta1,String ta2)
    {
        getItems().add(new Recitation(section,instructor,dayⳆtime,location,ta1,ta2));
    }
    public void setOnItemSelected(Runnable r)
    {
        getSelectionModel().selectedItemProperty().addListener((ⵁ,oldSelected,newSelected)->r.run());
    }
    public JSONObject getExport()
    {
        final JSONObject o=new JSONObject();
        forAll(r->//r ≣ recitation
               {
                   try
                   {
                       JSONObject temp=new JSONObject();
                       temp.accumulate("section","<strong>"+r.section.getValue()+"</strong> ("+r.instructor.getValue()+")");
                       temp.accumulate("day_time",r.dayⳆtime.getValue());
                       temp.accumulate("location",r.location.getValue());
                       temp.accumulate("ta_1",r.ta1.getValue());
                       temp.accumulate("ta_2",r.ta2.getValue());
                       o.append("recitations",temp);
                   }
                   catch(JSONException e)
                   {
                       e.printStackTrace();
                   }
               });
        return o;
    }
    public interface F
    {
        void f(Recitation x);
    }
    public void forAll(F f)
    {
        for(Object o : getItems())
        {
            f.f((Recitation)o);
        }
    }
    public String getState()
    {
        return r.joinLines(getItems().toArray()).replaceAll("\n",";");
    }
    public void setState(String state)
    {
        if(state.equals(getState()))
        {
            return;
        }
        getItems().clear();
        for(String x : state.split(";"))
        {
            String[] y=x.split(",");
            try
            {
                getItems().add(new Recitation(y[0],y[1],y[2],y[3],y[4],y[5]));
            }
            catch(Exception ignored)
            {
                ignored.printStackTrace();
            }
        }
    }
    public Recitation getSelected()
    {
        return (Recitation)getSelectionModel().getSelectedItem();
    }
    public void remove(Recitation x)
    {
        getItems().remove(x);
    }
    public void removeSelected()//Syntactic sugar
    {
        remove(getSelected());
    }
    public void updateRecitation(String section,String instructor,String dayⳆtime,String location,String ta1,String ta2)
    {
        getSelected().sectionProperty().setValue(section);
        getSelected().instructorProperty().setValue(instructor);
        getSelected().dayⳆtimeProperty().setValue(dayⳆtime);
        getSelected().locationProperty().setValue(location);
        getSelected().ta1Property().setValue(ta1);
        getSelected().ta2Property().setValue(ta2);
    }
    public void setOnRecitationSelected(Runnable r)
    {
        getSelectionModel().selectedItemProperty().addListener((ⵁ,oldSelected,newSelected)->r.run());
    }
    public RD_RecitationDataTableView(String sectionHeader,String instructorHeader,String dayⳆtimeHeader,String locationHeader,String ta1Header,String ta2Header)
    {
        this.setMinHeight(300);
        addRecitation("A","B","C","D","E","F");
        addRecitation("A6","B5","C4","D3","E2","F1");
        setOnKeyPressed(ⵁ->r.branch(this::removeSelected,ⵁ.getCode()==KeyCode.DELETE||ⵁ.getCode()==KeyCode.BACK_SPACE));//Only keeping this because I have the auto-transactor!
        //
        final TableColumn<Recitation,String> sectionCol=new TableColumn<>(sectionHeader);
        final TableColumn<Recitation,String> instructorCol=new TableColumn<>(instructorHeader);
        final TableColumn<Recitation,String> dayⳆtimeCol=new TableColumn<>(dayⳆtimeHeader);
        final TableColumn<Recitation,String> locationCol=new TableColumn<>(locationHeader);
        final TableColumn<Recitation,String> ta1Col=new TableColumn<>(ta1Header);
        final TableColumn<Recitation,String> ta2Col=new TableColumn<>(ta2Header);
        //
        getColumns().addAll(sectionCol,instructorCol,dayⳆtimeCol,locationCol,ta1Col,ta2Col);
        //
        sectionCol.setCellValueFactory(new PropertyValueFactory<>("section"));
        instructorCol.setCellValueFactory(new PropertyValueFactory<>("instructor"));
        dayⳆtimeCol.setCellValueFactory(new PropertyValueFactory<>("dayⳆtime"));
        locationCol.setCellValueFactory(new PropertyValueFactory<>("location"));
        ta1Col.setCellValueFactory(new PropertyValueFactory<>("ta1"));
        ta2Col.setCellValueFactory(new PropertyValueFactory<>("ta2"));
    }
    //region Recitation Class (with getters and setters)
    public class Recitation
    {
        private StringProperty section;
        private StringProperty instructor;
        private StringProperty dayⳆtime;
        private StringProperty location;
        private StringProperty ta1;
        private StringProperty ta2;
        public Recitation(String section,String instructor,String dayⳆtime,String location,String ta1,String ta2)
        {
            this.section=new SimpleStringProperty(section);
            this.instructor=new SimpleStringProperty(instructor);
            this.dayⳆtime=new SimpleStringProperty(dayⳆtime);
            this.location=new SimpleStringProperty(location);
            this.ta1=new SimpleStringProperty(ta1);
            this.ta2=new SimpleStringProperty(ta2);
        }
        public StringProperty sectionProperty()//MUST KEEP THIS METHOD OR CHIT WILL BREAK CAUSE JAVA REFLECTION BS
        {
            return section;
        }
        public StringProperty instructorProperty()//MUST KEEP THIS METHOD OR CHIT WILL BREAK CAUSE JAVA REFLECTION BS
        {
            return instructor;
        }
        public StringProperty dayⳆtimeProperty()
        {
            return dayⳆtime;
        }
        public StringProperty locationProperty()
        {
            return location;
        }
        public StringProperty ta1Property()
        {
            return ta1;
        }
        public StringProperty ta2Property()
        {
            return ta2;
        }
        //endregion
        public String toString()
        {
            return section.getValue()+","+instructor.getValue()+","+dayⳆtime.getValue()+","+location.getValue()+","+ta1.getValue()+","+ta2.getValue();
        }
    }
}