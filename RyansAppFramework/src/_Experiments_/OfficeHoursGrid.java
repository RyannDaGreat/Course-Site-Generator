package _Experiments_;//Created by Ryan on 4/12/17.
import _Externals_.*;
import javafx.geometry.Insets;

import java.util.ArrayList;
public class OfficeHoursGrid extends rGridPane
{
    public OfficeHoursGrid()//These two strings are broken into lists, separated by commas
    {
        setGridState("A,B,C,D,E;a,b,c,d,e;A,a,bert;B,c,eernie;E,e,Eevie");
        // setGridState("A,B,C,D,E;a,b,c,d,e;A,a,bert;A,b,;A,c,;A,d,;A,e,;B,a,3;B,b,;B,c,eernie;B,d,;B,e,;C,a,;C,b,;C,c,;C,d,;C,e,;D,a,;D,b,;D,c,;D,d,;D,e,;E,a,;E,b,;E,c,;E,d,;E,e,Eevie");
    }
    public boolean toggleOfficeHours(String time,String day,String name)
    {
        try
        {
            getChild(time,day).modifyText(x->r.toggleLine(x,name));
            return true;
        }
        catch(Exception ignored)
        {
            return false;
        }
    }
    public boolean toggleOfficeHours(String timeDayName)//Separated by commas
    {
        String[] ⵁ=timeDayName.split(",");
        return toggleOfficeHours(ⵁ[0],ⵁ[1],ⵁ[2]);
    }
    public void toggleOfficeHours(String... timesDaysNames)
    {
        for(String x : timesDaysNames)
        {
            toggleOfficeHours(x);
        }
    }
    public void setGridState(String state)
    {
        //state is in the following format:
        // times;days;time,day,name;time,day,name;tim....
        //The fist two separated by ; determine the labels
        //All the others after that are just the TA things we have to toggle.
        // /*@formatter:off*/
        String[] chunks=state.split(";");
        initialize(chunks[0].split(","),chunks[1].split(","));
        stylize();
        for(int i=2;i<chunks.length;i++)
            toggleOfficeHours(chunks[i]);
        /*@formatter:on*/
    }
    public String getTimesDaysNames()//Returns time,day,name;tim....
    {
        /*@formatter:off*/
        ArrayList<String> l=new ArrayList<>();
        forEachChild(x->
                     {
                         if(!isTitle(x))
                             for(String name : r.splitLines(x.getText()))
                                 l.add(rowTitle(x)+","+colTitle(x)+","+name);
                     });
        return String.join(";",l);
        /*@formatter:on*/
    }
    public String getRowTitles()
    {
        ArrayList<String> rowTitles=new ArrayList<>();
        forEachChild(x->
                     {
                         if(isRowTitle(x))
                         {
                             rowTitles.add(x.getText());
                         }
                     });
        return String.join(",",rowTitles);
    }
    public String getColTitles()
    {
        ArrayList<String> colTitles=new ArrayList<>();
        forEachChild(x->
                     {
                         if(isColTitle(x))
                         {
                             colTitles.add(x.getText());
                         }
                     });
        return String.join(",",colTitles);
    }
    public String getGridState()
    {
        //TODO Complete me
        //state is in the following format:
        // times;days;time,day,name;time,day,name;tim....
        //The fist two separated by ; determine the labels
        //All the others after that are just the TA things we have to toggle.
        return getRowTitles()+";"+getColTitles()+";"+getTimesDaysNames();
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
    public void removeName(String name)//Remove the name from the grid
    {
        forEachChild(x->x.modifyText(s->r.removeMatchingLines(s,name)));
    }
    public void updateName(String oldName,String newName)//Remove the name from the grid
    {
        forEachChild(x->x.modifyText(s->r.replaceMatchingLines(s,oldName,newName)));
    }
}
