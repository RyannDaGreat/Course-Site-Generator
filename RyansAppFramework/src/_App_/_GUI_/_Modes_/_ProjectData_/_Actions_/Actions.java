package _App_._GUI_._Modes_._ProjectData_._Actions_;
import _App_.App;
import _App_._GUI_._Dialogs_.Dialogs;
import _App_._GUI_._Modes_._ProjectData_._Boilerplate_.Boilerplate;
import _App_._GUI_._Modes_._ProjectData_._Reader_.Reader;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_._Components_.PD_StudentsTableView;
import _Externals_._Components_.PD_TeamsTableView;
import _Externals_.r;
import _Externals_._Components_.rButton;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ConcurrentModificationException;

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
    private Dialogs dialogs;
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.modes.projectData.boilerplate;
        propertyGetter=app.io.propertyGetter;
        reader=app.gui.modes.projectData.reader;
        dialogs=app.gui.dialogs;
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
        boilerplate.getT_Color_selector().setValue(Color.web(hexColorWithOrWithoutHashtag));
        updateTeamCircleColors();
    }
    public void setTeamTextColor(String hexColorWithOrWithoutHashtag)
    {
        boilerplate.getT_TextColor_selector().setValue(Color.web(hexColorWithOrWithoutHashtag));
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
        setTeamName(selectedTeam.field1Property().getValue());
        setTeamColor(hexWithOrWithoutHashtagFromColorName(selectedTeam.field2Property().getValue()));
        setTeamTextColor(hexWithOrWithoutHashtagFromColorName(selectedTeam.field3Property().getValue()));
        setTeamLink(selectedTeam.field4Property().getValue());
        updateTeamAddⳆUpdateButton();
    }
    public void updateStudentFieldsToSelected()
    {
        PD_StudentsTableView.Item selectedStudent=getSelectedStudent();
        if(selectedStudent==null)
        {
            return;
        }
        boilerplate.getS_FirstName_textField().setText(selectedStudent.field1Property().getValue());
        boilerplate.getS_LastName_textField().setText(selectedStudent.field2Property().getValue());
        r.setComboboxOption(boilerplate.getSTeam_comboBox(),selectedStudent.field3Property().getValue());
        boilerplate.getS_Role_textField().setText(selectedStudent.field4Property().getValue());
        updateStudentsAddⳆUpdateButton();
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
            b.setDisable(!(reader.uniqueTeamColor()&&reader.uniqueTeamName()));
            b.setText(propertyGetter.getAddButtonLabel());
        }
        else//Update mode
        {
            b.setText(propertyGetter.getUpdateButtonLabel());
            b.setDisable(false);
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
                boilerplate.getT__tableView().addItem(reader.getTeamName(),reader.getTeamColorName(),reader.getTeamTextColorName(),reader.getTeamLink());
            }
            else//Button is update mode
            {
                assert boilerplate.getT_AddUpdate_button().getText().equals(propertyGetter.getUpdateButtonLabel());//This should always be true
                String selectedTeamName=getSelectedTeam().field1Property().getValue();
                String newTeamName=reader.getTeamName();
                boilerplate.getS__tableView().forAll(x->//Update Team names on students
                                                     {
                                                         if(x.field3Property().getValue().equals(selectedTeamName))
                                                         {
                                                             x.field3Property().setValue(newTeamName);
                                                         }
                                                     });
                boilerplate.getT__tableView().updateItem(reader.getTeamName(),reader.getTeamColorName(),reader.getTeamTextColorName(),reader.getTeamLink());
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
        ComboBox c=boilerplate.getSTeam_comboBox();
        String studentTeam=reader.getStudentTeam();
        String[] teams=reader.getTeamNames();
        r.setComboboxOptions(c,teams);
        boolean currentTeamIsOk=false;
        for(String team : teams)
        {
            if(team.equals(studentTeam))
            {
                currentTeamIsOk=true;
            }
        }
        if(currentTeamIsOk)
        {
            r.setComboboxOption(c,studentTeam);
        }
        else
        {
            r.setComboboxOption(c,"");
        }
    }
    public void updateStudentsAddⳆUpdateButton()//Update whether it says add or update, and whether its enabled or disabled
    {
        rButton b=boilerplate.getS_AddUpdate_button();
        if(getSelectedStudent()==null)//Add mode
        {
            b.setDisable(!reader.uniqueStudentName());
            b.setText(propertyGetter.getAddButtonLabel());
        }
        else//Update mode
        {
            b.setText(propertyGetter.getUpdateButtonLabel());
            b.setDisable(false);
        }
        if(reader.getStudentFirstName().equals("")||
           reader.getStudentLastName().equals("")||
           reader.getSStudentTeam().equals("")||
           reader.getStudentRole().equals(""))
        {
            b.setDisable(true);
        }
    }
    public void handleStudentAddⳆUpdateButton()
    {
        try
        {
            rButton b=boilerplate.getS_AddUpdate_button();
            PD_StudentsTableView t=boilerplate.getS__tableView();
            if(b.getText().equals(propertyGetter.getAddButtonLabel()))//Button is add mode`
            {
                t.addItem(reader.getStudentFirstName(),reader.getStudentLastName(),reader.getStudentTeam(),reader.getStudentRole());
            }
            else//Button is update mode
            {
                assert b.getText().equals(propertyGetter.getUpdateButtonLabel());//This should always be true
                t.updateItem(reader.getStudentFirstName(),reader.getStudentLastName(),reader.getStudentTeam(),reader.getStudentRole());
            }
        }
        catch(Exception ignored)
        {
            ignored.printStackTrace();
        }
        updateTeamAddⳆUpdateButton();
    }
    public void handleStudentClearButton()
    {
        boilerplate.getS_FirstName_textField().setText("");
        boilerplate.getS_LastName_textField().setText("");
        r.setComboboxOption(boilerplate.getSTeam_comboBox(),"");
        boilerplate.getS_Role_textField().setText("");
        boilerplate.getS__tableView().deselect();
    }
    //endregion
    public void deleteAllStudentsWithInvalidTeams(String teamName)//This method is full of recursive mystery code :D  Have fun deciphering it!
    {
        PD_StudentsTableView t=boilerplate.getS__tableView();
        try
        {
            if(willdelete(teamName,t)[0])
            {
                if(dialogs.confirmDeleteStudents())
                {
                    t.forAll(x->
                             {
                                 if(teamName.equals(x.field3Property().getValue()))
                                 {
                                     t.remove(x);
                                 }
                             });
                }
                else
                {
                    @SuppressWarnings("NumericOverflow") int i=1/0;//Prevent student from being deleted by throwing error. sloppy code that does the trick when budgeting my tme
                }
                deleteAllStudentsWithInvalidTeams(teamName);
            }
        }
        catch(ConcurrentModificationException ignored)
        {
            if(willdelete(teamName,t)[0])
            {
                deleteAllStudentsWithInvalidTeams(teamName);
            }
        }
    }
    private boolean[] willdelete(String teamName,PD_StudentsTableView t)
    {
        boolean[] temp=new boolean[]{false};
        t.forAll(x->
                 {
                     if(teamName.equals(x.field3Property().getValue()))
                     {
                         temp[0]=true;
                     }
                 });
        return temp;
    }
}
