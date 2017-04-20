package _App_._GUI_._Modes_._TAData_._Boilerplate_;
import _App_.App;
import _App_._GUI_._Modes_._TAData_._Actions_.Actions;
import _App_._GUI_._Modes_._TAData_._Transactions_.Transactions;
import _Externals_.OfficeHoursGrid;
import _Externals_.TATableView;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
@SuppressWarnings("unchecked")
public class Boilerplate
{
    public App app;
    public Boilerplate(App app)
    {
        this.app=app;
    }
    private _App_._GUI_._Window_._Boilerplate_.Boilerplate megaplate;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        Actions actions=app.gui.modes.tadata.actions;
        Transactions transactions=app.gui.modes.tadata.transactions;
        megaplate=app.gui.window.boilerplate;
        getTa_tableView().getSelectionModel().selectedItemProperty().addListener((ⵁ,oldSelected,newSelected)->actions.handleTaSelected());
        getTa_tableView().setOnKeyPressed(ⵁ->
                                          {
                                              if(ⵁ.getCode()==KeyCode.DELETE||ⵁ.getCode()==KeyCode.BACK_SPACE)
                                              {
                                                  transactions.handleDelete();
                                              }
                                          });
        getTaClear_button().setOnAction(ⵁ->actions.handleClearButton());
    }
    public OfficeHoursGrid getOh_gridPane()
    {
        return megaplate.taOh_gridPane7;
    }
    public ComboBox getOhStartTime_comboBox()
    {
        return megaplate.tdOhStartTime_comboBox4;
    }
    public ComboBox getOhEndTime_comboBox()
    {
        return megaplate.tdOhEndTime_comboBox5;
    }
    public TATableView getTa_tableView()
    {
        return megaplate.tdTa_tableView0;
    }
    public TableColumn getTaUndergrad_tableColumn()
    {
        return megaplate.tdTaUndergrad_tableColumn3;
    }
    public TableColumn getTaName_tableColumn()
    {
        return megaplate.tdTaName_tableColumn4;
    }
    public TableColumn getTaEmail_tableColumn()
    {
        return megaplate.tdTaEmail_tableColumn5;
    }
    public TextField getTaName_textField()
    {
        return megaplate.tdTaName_textField3;
    }
    public TextField getTaEmail_textField()
    {
        return megaplate.tdTaEmail_textField2;
    }
    public Button getTaAddUpdate_button()
    {
        return megaplate.tdTaAddUpdate_button13;
    }
    public Button getTaClear_button()
    {
        return megaplate.tdTaClear_button14;
    }
}
