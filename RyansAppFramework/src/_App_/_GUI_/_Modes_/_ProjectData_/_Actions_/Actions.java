package _App_._GUI_._Modes_._ProjectData_._Actions_;
import _App_.App;
import _App_._GUI_._Modes_._ProjectData_._Boilerplate_.Boilerplate;
import _App_._GUI_._Modes_._ProjectData_._Reader_.Reader;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.*;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;
import org.json.JSONException;
import org.json.JSONObject;

import static _Externals_.ColorNamer.hexWithOrWithoutHashtagFromColorName;
@SuppressWarnings("WeakerAccess")
public class Actions
{
    public App app;
    public Actions(App app)
    {
        this.app=app;
    }
    public Boilerplate boilerplate;
    private PropertyGetter propertyGetter;
    private Reader reader;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.projectData.boilerplate;
        propertyGetter=app.io.propertyGetter;
        reader=app.gui.modes.projectData.reader;
    }
    //region State
    public void setTeamsTableState(String state)
    {
        boilerplate.getT__tableView().setState(state);
    }
    public void setStudentsTableState(String state)
    {
        boilerplate.getS__tableView().setState(state);
    }
    public void setState(JSONObject state) throws JSONException
    {
        setTeamsTableState(state.getString("TeamsTable"));
        setStudentsTableState(state.getString("StudentsTable"));
    }
    //endregion
    //region Teams
    public void setTeamColor(String hexColorWithOrWithoutHashtag)
    {
        boilerplate.getT_Color_selector().setValue(Color.web(r.printed(hexColorWithOrWithoutHashtag)));
        updateTeamCircleColors();
    }
    public void setTeamTextColor(String hexColorWithOrWithoutHashtag)
    {
        boilerplate.getT_TextColor_selector().setValue(Color.web(r.printed(hexColorWithOrWithoutHashtag)));
        updateTeamCircleColors();
    }
    public void setTeamName(String name)
    {
        boilerplate.getT_Name_textField().setText(name);
    }
    public void setTeamLink(String link)
    {
        boilerplate.getT_Link_textField().setText(link);
    }
    public void updateTeamCircleColors()
    {
        boilerplate.getT_TextColor_circle().setFill(reader.getTextColor());
        boilerplate.getT_Color_circle().setFill(reader.getColor());
    }
    public void updateTeamFieldsToSelected()
    {
        PD_TeamsTableView.Item selectedTeam=getSelectedTeam();
        if(selectedTeam==null)
        {
            return;
        }
        setTeamName(selectedTeam.field1PropertyTeamName().getValue());
        setTeamColor(hexWithOrWithoutHashtagFromColorName(selectedTeam.field2PropertyTeamColor().getValue()));
        setTeamTextColor(hexWithOrWithoutHashtagFromColorName(selectedTeam.field3Property().getValue()));
        setTeamLink(selectedTeam.field4Property().getValue());
        updateTeamAddⳆUpdateButton();
    }
    PD_TeamsTableView.Item getSelectedTeam()
    {
        return boilerplate.getT__tableView().getSelected();
    }
    public void updateTeamAddⳆUpdateButton()//Update whether it says add or update, and whether its enabled or disabled
    {
        rButton b=boilerplate.getT_AddUpdate_button();
        if(getSelectedTeam()==null)//Add mode
        {
            b.setDisable(!reader.uniqueTeamColor()&&!reader.uniqueTeamName());
            b.setText(propertyGetter.getAddButtonLabel());
        }
        else//Update mode
        {
            b.setText(propertyGetter.getUpdateButtonLabel());
        }
        if(reader.getTeamName().equals("")||reader.getTeamLink().equals(""))
        {
            b.setDisable(true);
        }
    }
    public void handleTeamClearButton()
    {
        boilerplate.getT__tableView().getSelectionModel().clearSelection();
        updateTeamAddⳆUpdateButton();
    }
    public void handleTeamAddⳆUpdateButton()
    {
        try
        {
            if(boilerplate.getT_AddUpdate_button().getText().equals(propertyGetter.getAddButtonLabel()))//Button is add mode
            {
//⁠⁠⁠⁠⁠                                                   ⎧                                                                                                                                                         ⎫
//⁠⁠⁠⁠⁠                                                   ⎪                                                   ⎧                     ⎫                               ⎧                         ⎫                     ⎪
//⁠⁠⁠⁠⁠                                         ⎧⎫        ⎪                  ⎧⎫                               ⎪                   ⎧⎫⎪                               ⎪                       ⎧⎫⎪                   ⎧⎫⎪
                boilerplate.getT__tableView().addItem(r.printed(reader.getTeamName()),ColorNamer.getColorNameFromHex(reader.getTeamColor()),ColorNamer.getColorNameFromHex(reader.getTeamTextColor()),reader.getTeamLink());
//⁠⁠⁠⁠⁠                                         ⎩⎭        ⎪                  ⎩⎭                               ⎪                   ⎩⎭⎪                               ⎪                       ⎩⎭⎪                   ⎩⎭⎪
//⁠⁠⁠⁠⁠                                                   ⎪                                                   ⎩                     ⎭                               ⎩                         ⎭                     ⎪
//⁠⁠⁠⁠⁠                                                   ⎩                                                                                                                                                         ⎭
            }
            else//Button is update mode
            {
                assert boilerplate.getT_AddUpdate_button().getText().equals(propertyGetter.getUpdateButtonLabel());//This should always be true
//⁠⁠⁠⁠⁠                                                      ⎧                                                                                                                                                         ⎫
//⁠⁠⁠⁠⁠                                                      ⎪                                                   ⎧                     ⎫                               ⎧                         ⎫                     ⎪
//⁠⁠⁠⁠⁠                                         ⎧⎫           ⎪                  ⎧⎫                               ⎪                   ⎧⎫⎪                               ⎪                       ⎧⎫⎪                   ⎧⎫⎪
                boilerplate.getT__tableView().updateItem(reader.getTeamName(),ColorNamer.getColorNameFromHex(reader.getTeamColor()),ColorNamer.getColorNameFromHex(reader.getTeamTextColor()),reader.getTeamLink());
//⁠⁠⁠⁠⁠                                         ⎩⎭           ⎪                  ⎩⎭                               ⎪                   ⎩⎭⎪                               ⎪                       ⎩⎭⎪                   ⎩⎭⎪
//⁠⁠⁠⁠⁠                                                      ⎪                                                   ⎩                     ⎭                               ⎩                         ⎭                     ⎪
//⁠⁠⁠⁠⁠                                                      ⎩                                                                                                                                                         ⎭
            }
        }
        catch(Exception ignored)
        {
            ignored.printStackTrace();
        }
        updateTeamAddⳆUpdateButton();
    }
    //endregion
    //region Students
    PD_StudentsTableView.Item getSelectedStudent()
    {
        return boilerplate.getS__tableView().getSelected();
    }
    public void updateStudentTeamComboboxOptions()
    {
        ComboBox c=boilerplate.getPsSTeam_comboBox();
        String studentTeam=reader.getStudentTeam();
        r.setComboboxOptions(c,reader.getTeamNames());
        r.setComboboxOption(c,studentTeam);
    }
    //endregion
}
