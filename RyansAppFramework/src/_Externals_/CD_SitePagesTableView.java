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
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
@SuppressWarnings("unchecked")
public class CD_SitePagesTableView extends TableView
{
    private String[] useHeaderⳆnavbarTitleHeaderⳆfileNameHeaderⳆscriptHeader;
    public void addPage(boolean use,String navbarTitle,String fileName,String script)
    {
        getItems().add(new page(use,navbarTitle,fileName,script));
    }
    public String getState()
    {
        return r.joinLines(getItems().toArray()).replaceAll("\n",";");
    }
    public void setState(String state)
    {
        if(state.equals(getState()))
            return;
        getItems().clear();
        for(String x : state.split(";"))
        {
            String[] y=x.split(",");
            getItems().add(new page(Boolean.parseBoolean(y[0]),y[1],y[2],y[3]));
        }
    }
    public page getSelected()
    {
        return (page)getSelectionModel().getSelectedItem();
    }
    public void remove(page x)
    {
        getItems().remove(x);
    }
    public CD_SitePagesTableView(String... useHeaderⳆnavbarTitleHeaderⳆfileNameHeaderⳆscriptHeader)
    {
        this.useHeaderⳆnavbarTitleHeaderⳆfileNameHeaderⳆscriptHeader=useHeaderⳆnavbarTitleHeaderⳆfileNameHeaderⳆscriptHeader;
        @SuppressWarnings("UnnecessaryLocalVariable") String[] x;
        x=useHeaderⳆnavbarTitleHeaderⳆfileNameHeaderⳆscriptHeader;
        addPage(true,"A","B","AOIJ");
        addPage(false,"C","D","AOIJS");
        addPage(true,"E","F","aoisf");
        addPage(false,"G","H","aiohf");
        //
        final TableColumn<page,Boolean> useCol=new TableColumn<>(x[0]);
        final TableColumn<page,String> navbarTitleCol=new TableColumn<>(x[1]);
        final TableColumn<page,String> fileNameCol=new TableColumn<>(x[2]);
        final TableColumn<page,String> scriptCol=new TableColumn<>(x[3]);
        //
        getColumns().addAll(useCol,navbarTitleCol,fileNameCol,scriptCol);
        //
        useCol.setCellValueFactory(new PropertyValueFactory<>("use"));
        navbarTitleCol.setCellValueFactory(new PropertyValueFactory<>("fileName"));
        fileNameCol.setCellValueFactory(new PropertyValueFactory<>("navbarTitle"));
        scriptCol.setCellValueFactory(new PropertyValueFactory<>("script"));
        //
        useCol.setCellFactory(CheckBoxTableCell.forTableColumn(useCol));
        useCol.setEditable(true);
        //
        setEditable(true);
    }
    //region File Class (with getters and setters)
    public class page
    {
        private BooleanProperty use;
        private StringProperty navbarTitle;
        private StringProperty fileName;
        private StringProperty script;
        public page(boolean use,String navbarTitle,String fileName,String script)
        {
            this.use=new SimpleBooleanProperty(use);
            this.navbarTitle=new SimpleStringProperty(navbarTitle);
            this.fileName=new SimpleStringProperty(fileName);
            this.script=new SimpleStringProperty(script);
        }
        public BooleanProperty useProperty()//MUST KEEP THIS METHOD OR CHIT WILL BREAK CAUSE JAVA REFLECTION BS
        {
            return use;
        }
        public StringProperty navbarTitleProperty()
        {
            return navbarTitle;
        }
        public StringProperty fileNameProperty()
        {
            return fileName;
        }
        public StringProperty scriptTitleProperty()
        {
            return script;
        }
        //endregion
        public String toString()
        {
            return use.getValue()+","+navbarTitle.getValue()+","+fileName.getValue()+","+script.getValue();
        }
    }
    //region Updated: Json States (String States are obsolete)
    public interface F
    {
        void f(page x) throws JSONException;
    }
    public void forAll(F f)
    {
        for(Object o : getItems())
        {
            try
            {
                f.f((page)o);
            }
            catch(JSONException e)
            {
                e.printStackTrace();
            }
        }
    }
    // public JSONArray getJsonState()//Uses the String version of state
    // {
    //     String[] s=this.useHeaderⳆnavbarTitleHeaderⳆfileNameHeaderⳆscriptHeader;
    //     JSONArray a1=new JSONArray();
    //     forAll(x->
    //            {
    //                JSONArray a2=new JSONArray();
    //                a2.put(x.use.getValue());
    //                a2.put(x.navbarTitle.getValue());
    //                a2.put(x.fileName.getValue());
    //                a2.put(x.script.getValue());
    //                a1.put(a2);
    //            });
    //     return a1;
    // }
    // public void setJsonState(JSONArray state) throws JSONException
    // {
    //     String[] s=this.useHeaderⳆnavbarTitleHeaderⳆfileNameHeaderⳆscriptHeader;
    //     getItems().clear();
    //     for(int i=0;i<state.length();i++)
    //     {
    //         page o=(page)state.get(i);
    //         getItems().add(new page(Boolean.parseBoolean(),
    //                                 y[1],
    //                                 y[2],
    //                                 y[3]));
    //     }
    //     {
    //         String[] y=x.split(",");
    //     }
    // }
}