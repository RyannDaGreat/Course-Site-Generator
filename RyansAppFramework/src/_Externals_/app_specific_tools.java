package _Externals_;//Created by Ryan on 5/7/17.
public class app_specific_tools
{
    public static String scriptFromHtml(String htmlContents)
    {
        //region Python
        // def f(ans):
        // ans = ans.split('<script src="./js/')
        // ans = ans[1]
        // ans = ans.split('"')
        // ans = ans[0]
        // return ans
        //endregion
        try
        {
            return htmlContents.split("<script src=\"./js/")[1].split("\"")[0];
        }
        catch(Exception ignored)
        {
            return "(none)";
        }
    }
    public static String getNavbarTitle(String nameOfHtmlile,String htmlFileContents)
    {
        //region Python
        //def getNavbarTitle(nameOfHtmlFile,htmlFileContents):
        //ans.split("schedule.html")
        //ans[1]
        //ans.split(">")
        //ans[1]
        //ans.split("<")
        //ans[0]
        //endregion
        return htmlFileContents.split(nameOfHtmlile)[1].split(">")[1].split("<")[0];
    }
    public static void main(String[] a)
    {
        // System.out.println(scriptFromHtml());
        // System.out.println(getNavbarTitle());
    }
}
