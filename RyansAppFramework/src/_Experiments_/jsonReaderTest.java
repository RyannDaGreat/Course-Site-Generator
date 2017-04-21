package _Experiments_;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public class jsonReaderTest
{
    static String K="{\n"+
                    "  \"Course Details\":{\n"+
                    "    \"Course Info\":{\n"+
                    "      \"Subject\":\"CSE\",\n"+
                    "      \"Number\":\"219\",\n"+
                    "      \"Semester\":\"Fall\",\n"+
                    "      \"Year\":\"2017\",\n"+
                    "      \"Title\":\"Computer Science III\",\n"+
                    "      \"Instructor Name\":\"Richard McKenna\",\n"+
                    "      \"Instructor Home\":\"www.websiteurl.com\",\n"+
                    "      \"Export Dir\":\"users/whatever/exportdir\"\n"+
                    "    },\n"+
                    "    \"Site Template\":{\n"+
                    "      \"Template Dir\":\"users/templates/whatever\",\n"+
                    "      \"Site Pages\":[\n"+
                    "        {\n"+
                    "          \"Use\":\"true\",\n"+
                    "          \"Navbar Title\":\"Home\",\n"+
                    "          \"File Name\":\"index.html\",\n"+
                    "          \"Script\":\"HomeBuilder.js\"\n"+
                    "        },\n"+
                    "        {\n"+
                    "          \"Use\":\"true\",\n"+
                    "          \"Navbar Title\":\"Syllabus\",\n"+
                    "          \"File Name\":\"syllabus.html\",\n"+
                    "          \"Script\":\"SyllabusBuilder.js\"\n"+
                    "        }\n"+
                    "      ]\n"+
                    "    },\n"+
                    "    \"Page Style\":\n"+
                    "    {\n"+
                    "      \"Banner School Image\":\"Yale University\",\n"+
                    "      \"Left Footer Image\":\"Yale University\",\n"+
                    "      \"Right Footer Image\":\"Yale CS\",\n"+
                    "      \"Stylesheet\":\"sea_wolf.css\"\n"+
                    "    }\n"+
                    "  }\n"+
                    "}";
    public static String jsonAddress(String json,String... address)//Object...address is composed of strings. Assumes json is entirely composed of strings
    {
        try
        {
            JSONObject jsonObject=new JSONObject(json);
            int i;
            for(i=0;i<address.length-1;i++)
            {
                jsonObject=jsonObject.getJSONObject(address[i]);
            }
            return (String)jsonObject.get(address[i]);
        }
        catch(JSONException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) throws JSONException
    {
        JSONObject jsonObject=new JSONObject(K);
        Object jsonObject1=jsonObject.getJSONObject("Course Details").getJSONObject("Course Info").get("Number");
        System.out.println(jsonObject1);
        System.out.println(jsonAddress(K,"Course Details","Course Info","Subject"));
//⁠⁠⁠⁠⁠        ⎧                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ⎫
//⁠⁠⁠⁠⁠        ⎪                                                                                                                                                                        ⎧                                                                                                                                                                                                                                                   ⎫                                                                                                                                                                                                                                 ⎪
//⁠⁠⁠⁠⁠        ⎪                                                                                                                                                                        ⎪                                                       ⎧                                                                                                                                                                                          ⎫⎪                                                                                                                                                                                                                                 ⎪
//⁠⁠⁠⁠⁠        ⎪             ⎧                                                                                                                                        ⎫                 ⎪                                                       ⎪⎧                                                                                     ⎫ ⎧                                                                                                ⎫⎪⎪               ⎧                                                                                                                                                                                                                ⎫⎪
        //{"Page Style":{"Left Footer Image":"Yale University","Banner School Image":"Yale University","Right Footer Image":"Yale CS","Stylesheet":"sea_wolf.css"},"Site Template":{"Template Dir":"users/templates/whatever","Site Pages":[{"Navbar Title":"Home","Script":"HomeBuilder.js","Use":"true","File Name":"index.html"},{"Navbar Title":"Syllabus","Script":"SyllabusBuilder.js","Use":"true","File Name":"syllabus.html"}]},"Course Info":{"Export Dir":"users/whatever/exportdir","Instructor Home":"www.websiteurl.com","Number":"219","Semester":"Fall","Year":"2017","Title":"Computer Science III","Instructor Name":"Richard McKenna","Subject":"CSE"}}
//⁠⁠⁠⁠⁠        ⎪             ⎩                                                                                                                                        ⎭                 ⎪                                                       ⎪⎩                                                                                     ⎭ ⎩                                                                                                ⎭⎪⎪               ⎩                                                                                                                                                                                                                ⎭⎪
//⁠⁠⁠⁠⁠        ⎪                                                                                                                                                                        ⎪                                                       ⎩                                                                                                                                                                                          ⎭⎪                                                                                                                                                                                                                                 ⎪
//⁠⁠⁠⁠⁠        ⎪                                                                                                                                                                        ⎩                                                                                                                                                                                                                                                   ⎭                                                                                                                                                                                                                                 ⎪
//⁠⁠⁠⁠⁠        ⎩                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ⎭
    }
}


