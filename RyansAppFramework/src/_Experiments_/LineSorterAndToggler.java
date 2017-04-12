package _Experiments_;//Created by Ryan on 4/11/17.
import java.util.ArrayList;
import java.util.Arrays;
public class LineSorterAndToggler
{
    //region Email checker ［isValidEmail］
    public static boolean isValidEmail(String s)
    {
        //CODE FROM: https://www.mkyong.com/regular-expressions/how-to-validate-email-address-with-regular-expression/
        //⁠⁠⁠⁠⁠              ⎧                                                                                          ⎫
        //⁠⁠⁠⁠⁠              ⎪                   ⎧                 ⎫               ⎧               ⎫ ⎧               ⎫  ⎪
        //⁠⁠⁠⁠⁠              ⎪  ⎧              ⎫ ⎪   ⎧           ⎫ ⎪  ⎧          ⎫ ⎪   ⎧         ⎫ ⎪ ⎪   ⎧      ⎫⎧  ⎫⎪  ⎪
        return s.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        //⁠⁠⁠⁠⁠              ⎪  ⎩              ⎭ ⎪   ⎩           ⎭ ⎪  ⎩          ⎭ ⎪   ⎩         ⎭ ⎪ ⎪   ⎩      ⎭⎩  ⎭⎪  ⎪
        //⁠⁠⁠⁠⁠              ⎪                   ⎩                 ⎭               ⎩               ⎭ ⎩               ⎭  ⎪
        //⁠⁠⁠⁠⁠              ⎩                                                                                          ⎭
    }
    //endregion
    //region String line manipulators ［splitLines，joinLines，addLine，toggleLine，removeMatchingLines，replaceMatchingLines，hasMatchingLine，numberOfMatchingLines，sortedLines］
    //These were all originally created to update a TA name in TAManager office hours grid in the CSE219 Course Site Generator project
    public static String lineSeparator="\n";//Just in case I want to change this for whatever reason
    public static String[] splitLines(String body)//To decrease redundancy
    {
        //tested ⋀ verified ✔
        return body.split(lineSeparator);//⟵ Self explanatory
    }
    public static String joinLines(Object[]lines)//Objects are implicitly converted to strings
    {
        //tested ⋀ verified ✔ (tested edge cases: where lines.length ∈ {0,1,2,3})
        /*@formatter:off*/
        String out="";
        if(lines.length==0)
            return out;
        int i=0;//a counter variable used to determine when we use the last line. Don't worry about it.
        for(Object line:lines)
        {
            out+=line;
            if(++i!=lines.length)//If 'line' is not the last element of 'lines'
               out+=lineSeparator;
        }
        return out;
        /*@formatter:on*/
    }
    public static String addLine(String body,String line)
    {
        if(body.equals(""))
            return line;
        return body+lineSeparator+line;
    }
    public static String removeMatchingLines(String body,String line)
    {
        String[] lines=splitLines(body);
        String[] out=new String[lines.length-numberOfMatchingLines(body,line)];
        int i=0;
        for(String l:lines)
            if(!l.equals(line))
                out[i++]=l;
        return joinLines(out);
    }
    public static String toggleLine(String body,String line)
    {
        //Toggles the existence of 'line' in 'body'. If line is not in body,
        if(body.equals(""))
            return line;
        if(!hasMatchingLine(body,line))
            return body+lineSeparator+line;
        return removeMatchingLines(body,line);
    }
    public static String replaceMatchingLines(String body,String oldLine,String newLine)
    {
        //Replaces all splitLines in 'body' that are equal to 'oldLine' to 'newLine'.
        ArrayList<CharSequence>newLines=new ArrayList<>();
        for(String line: splitLines(body))
            newLines.add(line.equals(oldLine)?newLine:line);
        return joinLines(newLines.toArray());//StringUtils.join(newLines,lineSeparator);

    }
    public static boolean hasMatchingLine(String body,String line)//If body has has a line that matches 'line', it returns true. Else, false.
    {
        return numberOfMatchingLines(body,line)!=0;//Is always ∈ ℕ
    }
    public static int numberOfMatchingLines(String body,String line)
    {
        //Returns the number of splitLines in 'body' that are equal to 'line'
        int i=0;
        for(String x: splitLines(body))
            if(x.equals(line))
                i++;
        return i;
        /*@formatter:on*/
    }
    public static String sortedLines(String body)
    {
        //tested ⋀ verified ✔
        //Sorts the splitLines of 'body' in alphabetical order.
        String[]x=splitLines(body);
        Arrays.sort(x);
        return joinLines(x);//String.join(lineSeparator,(CharSequence[])x);
    }
    //endregion
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        // System.out.println(joinLines(""));
        // System.out.println(joinLines(splitLines(joinLines("A","B"))));
        // System.out.println(joinLines("A"));
    }
}
