package _Experiments_;//Created by Ryan on 4/11/17.
import _Externals_.r;

import java.util.Arrays;
public class LineSorterAndToggler
{


    public static String toggleLine(String body,String line)
    {
        //Toggles the existence of 'line' in 'body'. If line is not in body,
    }
    public static String replaceAllLines(String body,String oldLine,String newLine)
    {
        //Replaces all lines in 'body' that are equal to 'oldLine' to 'newLine'

    }
    public static boolean hasLine(String body,String line)
    {
        //tested ⋀ verified ✔
        //If body has has a line that matches 'line', it returns true. Else, false. /*@formatter:off*/
        for(String x:body.split("\n"))
            if(x.equals(line))
                return true;
        return false;
        /*@formatter:on*/
    }
    public static String sortedLines(String body)
    {
        //tested ⋀ verified ✔
        //Sorts the lines of 'body' in alphabetical order.
        String[]x=body.split("\n");
        Arrays.sort(x);
        return String.join("\n",(CharSequence[])x);
    }
    public static void main(String[] args)
    {
        String s="A\nB\nC";
        r.println(s.)
    }
}
