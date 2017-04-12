package _Experiments_;//Created by Ryan on 4/12/17.
import _Externals_.*;
import javafx.geometry.Insets;
public class OfficeHoursGrid extends rGridPane
{
    public OfficeHoursGrid(String times,String days)//These two strings are broken into lists, separated by commas
    {
        initialize(times.split(","),days.split(","));
    }
    public void toggleOfficeHours(String time,String day,String name)
    {
        getChild(time,day).modifyText(x->r.toggleLine(x,name));
    }
    public void toggleOfficeHours(String timeDayName)//Separated by commas
    {
        String[]ⵁ=timeDayName.split(",");
        toggleOfficeHours(ⵁ[0],ⵁ[1],ⵁ[2]);
    }
    public void setGridState(String state)
    {
        //state is in the following format:
        // times;days;time,day,name;time,day,name;tim....
        //The fist two separated by ; determine the labels
        //All the others after that are just the TA things we have to toggle.
        String[] chunks=state.split(";");
        initialize(chunks[0].split(","),chunks[1].split(","));
        stylize();

    }
    public void stylize()
    {
        forEachChild(x->x.setPadding(new Insets(10,10,10,10)));
        forEachChild(x->x.appendStyle("-fx-border-width: 1"));
        forEachChild(x->//Set The Background-Color Style
                     {
                         if(isColTitle(x))
                         {
                             x.appendStyle("-fx-background-color: green");
                         }
                         else if(isRowTitle(x))
                         {
                             x.appendStyle("-fx-background-color: red");
                         }
                         else if(isCorner(x))
                         {
                             x.appendStyle("-fx-background-color: blue");
                         }
                         else
                         {
                             x.appendStyle("-fx-background-color: white");
                         }
                     });
        forEachChild(x->x.appendStyle("-fx-border-color: black"));

    }
}
