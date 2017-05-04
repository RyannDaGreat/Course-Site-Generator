package _Externals_;
import _Externals_.r.rRunnable;
import com.sun.jmx.remote.internal.ArrayQueue;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.function.Function;

import static _Externals_.r.id;
import static _Externals_.r.rowCol;
@SuppressWarnings("WeakerAccess")
public class rGridPane extends GridPane
{
    //TODO: isRowEmpty(row) ⟶ Makes it easy to verify if TAs will be deleted.
    //region Generalizable methods
    public ArrayList<Node> getChildren(String id)//Gets all children with that ID
    {
        ArrayList<Node> out=new ArrayList<>();
        for(Node n : getChildren())
        {
            if(n.getId().equals(id))
            {
                out.add(n);
            }
        }
        return out;
    }
    public Node getChild(String id)//Gets all children with that ID
    {
        ArrayList<Node> childen=getChildren(id);
        assert childen.size()!=0:"getChild(String id): There no children with this id: \""+id+"\"";
        assert childen.size()==1:"getChild(String id): There are not one, but multiple children with this id: \""+id+"\"";
        try
        {
            return getChildren(id).get(0);
        }
        catch(IndexOutOfBoundsException e)
        {
            r.println(r.fansi("getChild(String id): Error: There is no node with id \""+id+"\"",r.fansi_colors.red));
            return null;
        }
    }
    public void removeChildren(ArrayList<Node> children)//Verified. Does not throw null-pointer errors.
    {
        getChildren().removeAll(FXCollections.observableArrayList(children));
    }
    public void removeChild(Node child)
    {
        ArrayList<Node> nodes=new ArrayList<>();
        nodes.add(child);
        removeChildren(nodes);
    }
    public static class TextCell extends GridPane//Extends gridpane so we can align text to center
    {
        private final Text text=new Text();//Feel free to make this public if you actually want it for some reason; mind you I've already provided methods to set/get the text
        private final ColumnConstraints columnConstraints=new ColumnConstraints();
        private final RowConstraints rowConstraints=new RowConstraints();
        TextCell()
        {
            getChildren().add(text);//This gridpane contains only one cell
            //region Center the text
            columnConstraints.setHgrow(Priority.ALWAYS);
            rowConstraints.setVgrow(Priority.ALWAYS);
            getColumnConstraints().add(columnConstraints);
            getRowConstraints().add(rowConstraints);
            //endregion
        }
        public void setText(String text)
        {
            this.text.setText(text);
        }
        public void modifyText(Function<String,String> modifier)//So we can in-line code such as TextCell child=getChild(time,day);child.setText(r.toggleLine(child.getText(),name));
        {
            this.text.setText(modifier.apply(getText()));
        }
        public String getText()
        {
            return text.getText();
        }
        public void setTextStyle(String style)
        {
            text.setStyle(style);
        }
        public void appendStyle(String style)
        {
            setStyle(getStyle()+";"+style);
        }
    }
    private void addTextCell(String text,int... rowCol)
    {
        assert rowCol.length==2;
        // removeChildren(getChildren(id(rowCol)));//Prevent duplicates
        TextCell ⵁ;
        try
        {
            ⵁ=dueToMemoryLeak.pop();//Attempt to recycle textCells
            System.out.println("BEHH");
        }
        catch(NoSuchElementException ignored)
        {
            ⵁ=new TextCell();
        }
        ⵁ.setText(text);
        GridPane.setRowIndex(ⵁ,rowCol[0]);
        GridPane.setColumnIndex(ⵁ,rowCol[1]);
        ColumnConstraints columnConstraints=new ColumnConstraints();
        RowConstraints rowConstraints=new RowConstraints();
        columnConstraints.setHgrow(Priority.ALWAYS);
        rowConstraints.setVgrow(Priority.ALWAYS);
        getColumnConstraints().add(columnConstraints);
        getRowConstraints().add(rowConstraints);
        ⵁ.setId(id(rowCol));
        getChildren().add(ⵁ);//Returns success value. Will not throw an eror if rowCol is out of bounds.
    }
    private int[] rowsCols()//Gets [#rows,#cols]
    {
        int[] out=new int[2];
        for(Node n : getChildren())
        {
            int[] rc=rowCol(n.getId());
            out[0]=Math.max(out[0],rc[0]+1);
            out[1]=Math.max(out[1],rc[1]+1);
        }
        return out;
    }
    public int rows()//Gets number of rows present
    {
        return rowsCols()[0];
    }
    public int cols()//Gets number of columns present
    {
        return rowsCols()[1];
    }
    public void removeRow(int row)
    {
        for(int col=0;col<cols();col++)
        {
            removeChildren(getChildren(id(row,col)));
        }
    }
    public void removeCol(int col)
    {
        for(int row=0;row<cols();row++)
        {
            removeChildren(getChildren(id(row,col)));
        }
    }
    ArrayDeque<TextCell> dueToMemoryLeak=new ArrayDeque<>();//This recycles the TextCells.
    public void clear()
    {
        //THIS CODE IS WEIRD DUE TO A GLITCH IN JAVAFX THAT I FOUND WHERE REMOVING NODES WITH UNI-DIRECTIONAL LISTENERS ARE NOT REMOVED BY THE GARBAGE COLLECTOR.
        //ORIGINALLY WAS getChildren().clear();//This was producing a memory leak because apparently thest TextCells were referenced
        // somewhere else in the Java code, I have no idea where. Each time I undo/redo'd, and loaded a new state,
        // all of these panes wouldn't be deleted for some reason that I don't understand. So as a result I'm just
        // going to have two lists.
        //My solution: When we 'delete' children, we call the clear method on this array but FIRST, we dump all these objects onto another arraylist.
        forEachChild(x->dueToMemoryLeak.add(x));
        getChildren().clear();
    }
    public void initialize(int rows,int cols)
    {
        clear();
        for(int row=0;row<rows;row++)
        {
            for(int col=0;col<cols;col++)
            {
                addTextCell(id(row,col),row,col);//Initialize rows/columns with the text equal to their ID. You should use forEachChild(x->x.setText("")) to clear this afterwatds.
            }
        }
    }
    public void forEachChild(rRunnable<TextCell> todo)//Do something to each child
    {
        for(Node n : getChildren())
        {
            assert n instanceof TextCell;
            todo.run((TextCell)n);
        }
    }
    private String[] rowColTitles(Node x)
    {
        int[] rc=rowCol(x.getId());
        int row=rc[0], col=rc[1];
        String rowTitle=((TextCell)getChild(id(row,0))).getText();
        String colTitle=((TextCell)getChild(id(0,col))).getText();
        return new String[]{rowTitle,colTitle};
    }
    public String rowTitle(Node x)//Gets the text of the node at left of the row that Node x belongs to
    {
        return rowColTitles(x)[0];
    }
    public String colTitle(Node x)//Gets the text of the node at top of the column that Node x belongs to
    {
        return rowColTitles(x)[1];
    }
    public boolean isCorner(Node x)//If node is on top left of grid
    {
        return rowCol(x.getId())[0]==0&&rowCol(x.getId())[1]==0;//row＝０ ⋀ col＝０
    }
    public boolean isColTitle(Node x)
    {
        return rowCol(x.getId())[0]==0&&!isCorner(x);//col ＝０ ⟹ is row title
    }
    public boolean isRowTitle(Node x)
    {
        return rowCol(x.getId())[1]==0&&!isCorner(x);//row ＝０ ⟹ is col title
    }
    public boolean isTitle(Node x)//In other words, not a toggleable ta zone
    {
        return isColTitle(x)||isRowTitle(x)||isCorner(x);
    }
    public ArrayList<Node> getChildren(String rowTitle,String colTitle)
    {
        /*@formatter:off*/
        ArrayList<Node>out=new ArrayList<>();
        for(Node n:getChildren())
            if(rowTitle(n).equals(rowTitle)&&colTitle(n).equals(colTitle))
                out.add(n);
        return out;
        /*@formatter:on*/
    }
    public TextCell getChild(String rowTitle,String colTitle)
    {
        ArrayList<Node> out=getChildren(rowTitle,colTitle);
        assert out.size()==1:"Child doesnt exist or there are multiple children that match rowTitle and colTitle given";
        return (TextCell)out.get(0);
    }
    public void initialize(String[] rowTitles,String[] colTitles)
    {
        initialize(rowTitles.length+1,colTitles.length+1);
        forEachChild(x->
                     {
                         /*@formatter:off*/
                         final int row=rowCol(x.getId())[0];
                         final int col=rowCol(x.getId())[1];
                         if(isRowTitle(x))//On top and not corner
                             x.setText(rowTitles[row-1]);
                         else if(isColTitle(x))//On far left and not corner
                             x.setText(colTitles[col-1]);
                         else
                             x.setText("");
                         /*@formatter:on*/
                     });
    }
    //endregion
    //――――――――――――――――――――――――――――――――――――――――――――――――――――――――――――Specific to course site designer:
    //If I use gridpane I need to add scroll bar. This is horrible I dont want to do this.
    //Need a grid generator that takes size as input and creates empty text cells. That method goes in this class.
    //The class that extends this has its own version of that function, which then applies styles and stuff to it.
    //Later need toggleTA(Day,Time,TANAME)
    //Need rowTitle(row n),colTitle(col n)
    //Need forEach( (node) -> runnable() )
    public rGridPane()
    {
        initialize("1pm,2pm,3pm,4pm,5pm,6,7,8".split(","),"Mon,Tues,Wed,Thurs,Fri".split(","));
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
        forEachChild(x->x.setOnMouseClicked(e->
                                            {
                                                if(!isTitle(x))
                                                {
                                                    x.setText(r.toggleLine(x.getText(),"TANAME"));
                                                }
                                            }));
    }
}
