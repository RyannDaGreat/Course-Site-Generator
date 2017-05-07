package _App_._GUI_._Modes_._RecitationData_._Reader_;
import _App_.App;
import _App_._GUI_._Modes_._RecitationData_._Boilerplate_.Boilerplate;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import org.json.JSONObject;
public class Reader
{
    public App app;
    public Reader(App app)
    {
        this.app=app;
    }
    private Boilerplate boilerplate;
    private PropertyGetter propertyGetter;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.recitationData.boilerplate;
        propertyGetter=app.io.propertyGetter;
    }
    public boolean containsTAName(String name)
    {
        boolean[] temp=new boolean[]{false};
        boilerplate.getTableView().forAll(x->
                                          {
                                              if(x.ta2Property().getValue().equals(name)||x.ta1Property().getValue().equals(name))
                                              {
                                                  temp[0]=true;
                                              }
                                          });
        return temp[0];
    }
    public String getState()
    {
        return boilerplate.getTableView().getState();
    }
    public JSONObject getExport()
    {
        return boilerplate.getTableView().getExport();
    }
    public String getSection()
    {
        return boilerplate.getSection_textField().getText();
    }
    public String getInstructor()
    {
        return boilerplate.getInstructor_textField().getText();
    }
    public String getDayTime()
    {
        return boilerplate.getDayTime_textField().getText();
    }
    public String getLocation()
    {
        return boilerplate.getLocation_textField().getText();
    }
    public String getTA1()
    {
        return (String)boilerplate.getTA1_comboBox().getValue();
    }
    public boolean isUpdateMode()
    {
        return boilerplate.getAddUpdate_button().getText().equals(propertyGetter.getUpdateButtonLabel());
    }
    public boolean isAddMode()
    {
        return boilerplate.getAddUpdate_button().getText().equals(propertyGetter.getAddButtonLabel());
    }
    public String getTA2()
    {
        return (String)boilerplate.getTA2_comboBox().getValue();
    }
}
