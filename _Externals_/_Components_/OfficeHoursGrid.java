package _Externals_._Components_;//Created by Ryan on 4/12/17.
import _Externals_._Resources_.ResourceGetter;
import _Externals_.r;
import javafx.geometry.Insets;
import javafx.scene.Node;

import java.util.ArrayList;
public class OfficeHoursGrid extends rGridPane
{
    public OfficeHoursGrid()//These two strings are broken into lists, separated by commas
    {
        // setGridState("A,B,C,D,2,4,6,2,4,2,1,4,4,1,7,2,E,E,E,E,E,5,5,6,2,3,4,45,5,2,3,4,5,2,3,4,52,3,4,5,2,34,5,2,3,E;a,e,e,b,_Experiments_.c,d,e;A,a,bert;B,_Experiments_.c,eernie;E,e,Eevie");
        // setGridState("A,B,D,E;a,b,_Experiments_.c,d,e;A,a,Aa;A,b,Ab;B,a,Ba;B,b,Bb;C,a,Ca;C,b,Cb;D,a,Da;D,b,Db");
        // System.out.println(getGridState());
        //            A,B,C,D,E;a,b,_Experiments_.c,d,e;A,a,bert;B,_Experiments_.c,eernie;E,e,Eevie
    }
    public interface timeDayMethod
    {
        void f(String time,String day);
    }
    private timeDayMethod onClick=null;
    public void setOnClick(timeDayMethod f)//Must be called before using setGridState
    {
        assert f!=null;
        onClick=f;
    }
    public boolean toggleOfficeHours(String time,String day,String name)
    {
        try
        {
            for(Node child : getChildren(time,day))
            {
                TextCell tx=(TextCell)child;
                if(!isTitle(tx))
                {
                    tx.modifyText(x->r.sortedLines(r.toggleLine(x,name)));
                }
            }
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
        if(state.equals(getGridState()))
        {
            return;
        }
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
    public void setTimeslots(String[] timeslots)
    {
        setGridState(String.join(",",(CharSequence[])timeslots)+";"+getColTitles()+";"+getTimesDaysNames());
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
    public String getFirstTimeSlot()
    {
        return getRowTitles().split(",")[0];
    }
    public String getLastTimeSlot()
    {
        return getRowTitles().split(",")[getRowTitles().split(",").length-1];
    }
    public void stylize()
    {
        forEachChild(x->x.setPadding(new Insets(10,10,10,10)));
        // forEachChild(x->x.appendStyle("-fx-border-width: 1"));
        forEachChild(x->//Set The Background-Color Style
                     {
                         x.setVisible(true);
                         setMargin(x,new Insets(3,3,3,3));
                         // x.setEffect(new Shadow());
                         if(isColTitle(x))
                         {
                             x.appendStyle(ResourceGetter.getProperty("office_hour_col_title_style"));
                         }
                         else if(isRowTitle(x))
                         {
                             x.appendStyle(ResourceGetter.getProperty("office_hour_row_title_style"));
                         }
                         else if(isCorner(x))
                         {
                             x.setVisible(false);
                             // x.appendStyle("-fx-background-color: blue");
                         }
                         else
                         {
                             x.appendStyle(ResourceGetter.getProperty("office_hour_regular_style"));
                             x.setOnMouseClicked(ⵁ->
                                                 {
                                                     assert onClick!=null;//This should have been taken care of...
                                                     onClick.f(rowTitle(x),colTitle(x));
                                                 });
                             x.setOnMouseEntered(ⵁ->forEachChild(t->
                                                                 {
                                                                     if(rowTitle(t).equals(rowTitle(x))&&getColumnIndex(x)>=getColumnIndex(t)||
                                                                        colTitle(t).equals(colTitle(x))&&   getRowIndex(x)>=getRowIndex(t))
                                                                     {
                                                                         if(isTitle(t)||rowTitle(t).equals(rowTitle(x))&&colTitle(t).equals(colTitle(x)))
                                                                         {
                                                                             t.setOpacity(1);
                                                                         }
                                                                         else
                                                                         {
                                                                             t.setOpacity(.9);
                                                                         }
                                                                     }
                                                                     else
                                                                     {
                                                                         t.setOpacity(.7);
                                                                     }
                                                                 }));
                         }
                     });
        r.rRunnable<TextCell> textCellrRunnable=t->t.setOpacity(.9);
        setOnMouseExited(ⵁ->forEachChild(textCellrRunnable));
        forEachChild(x->x.appendStyle(ResourceGetter.getProperty("office_hour_grid_shared_style")));
        forEachChild(x->
                     {
                         if(isTitle(x))
                         {
                             x.setOnMouseEntered(ⵁ->forEachChild(textCellrRunnable));
                         }
                     });
        // forEachChild(x->x.appendStyle("-fx-border-color: black"));
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
