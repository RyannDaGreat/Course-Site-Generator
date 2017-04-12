package _Experiments_;
import _Externals_.r;
import _Externals_.rRunnable;
import javafx.collections.FXCollections;
import javafx.scene.Node;
import javafx.scene.text.*;

import java.lang.*;
import java.util.ArrayList;

import javafx.scene.layout.*;

import static _Externals_.r.id;
import static _Externals_.r.rowCol;
public class GridTestBase extends GridPane
{
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
        ;
        private final RowConstraints rowConstraints=new RowConstraints();
        ;
        TextCell()
        {
            getChildren().add(text);//This gridpane contains only one cell
            //region Center the text
            columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
            rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
            getColumnConstraints().add(columnConstraints);
            getRowConstraints().add(rowConstraints);
            //endregion
        }
        public void setText(String text)
        {
            this.text.setText(text);
        }
        public String getText()
        {
            return text.getText();
        }
        public void setTextStyle(String style)
        {
            text.setStyle(style);
        }
    }
    private void addTextCell(String text,int... rowCol)
    {
        assert rowCol.length==2;
        removeChildren(getChildren(id(rowCol)));//Prevent duplicates
        TextCell ⵁ=new TextCell();
        ⵁ.setText(text);
        GridPane.setRowIndex(ⵁ,rowCol[0]);
        GridPane.setColumnIndex(ⵁ,rowCol[1]);
        ⵁ.setId(id(rowCol));
        ⵁ.setOnMouseClicked(e->ⵁ.setText(r.toggleLine(ⵁ.getText(),"TANAME")));//
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
    public void clear()
    {
        getChildren().clear();
    }
    public void initialize(int rows,int cols)
    {
        // clear();
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
        for(Node n:getChildren())
        {
            assert n instanceof TextCell;
            todo.run((TextCell)n);
        }
    }


    //If I use gridpane I need to add scroll bar. This is horrible I dont want to do this.
    //Need a grid generator that takes size as input and creates empty text cells. That method goes in this class.
    //The class that extends this has its own version of that function, which then applies styles and stuff to it.
    //Later need toggleTA(Day,Time,TANAME)
    //Need rowTitle(row n),colTitle(col n)
    //Need forEach( (node) -> runnable() )
    public GridTestBase()
    {
        addTextCell("00",0,0);
        addTextCell("11",1,1);
        addTextCell("01",0,1);
        addTextCell("10",1,0);
        addTextCell("20",2,0);
        initialize(3,4);
        forEachChild(x->x.setText("JIBBETY"));
        System.out.println(rows());
        System.out.println(cols());
        System.out.println(getChild("4_0"));
        getChild("1_0").setStyle("-fx-background-color: blue");
        // removeChildren(getChild("1_0"));
    }
}
