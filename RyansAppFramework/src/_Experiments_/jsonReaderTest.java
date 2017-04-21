package _Experiments_;
import javax.json.JsonObject;

import _Externals_.r;
import jdk.nashorn.internal.parser.JSONParser;
// import jdk.nashorn.internal.parser.JSONParser;
//
// import java.io.FileReader;
// public class CrunchifyJSONReadFromFile {
//
//     @SuppressWarnings("unchecked")
//     public static void main(String[] args) {
//         JSONParser parser = new JSONParser();
//
//         try {
//
//             Object obj = parser.parse(new FileReader(
//                 "/Users/<username>/Documents/file1.txt"));
//
//             JSONObject jsonObject = (JSONObject) obj;
//
//             String name = (String) jsonObject.get("Name");
//             String author = (String) jsonObject.get("Author");
//             JSONArray companyList = (JSONArray) jsonObject.get("Company List");
//
//             System.out.println("Name: " + name);
//             System.out.println("Author: " + author);
//             System.out.println("\nCompany List:");
//             Iterator<String> iterator = companyList.iterator();
//             while (iterator.hasNext()) {
//                 System.out.println(iterator.next());
//             }
//
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }
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

    static Object jsonParser(String jsonStr, String key) throws JSONException {
        int i = 0;
        Object temp = null;
        Object json = new JSONObject(jsonStr);
        String[] keys = key.split("[.]");
        while (i < keys.length) {

            if (json instanceof JSONArray) {
                int index = Integer.parseInt(keys[i]);
                temp = ((JSONArray) json).get(index);
            } else if (json instanceof JSONObject) {
                temp = ((JSONObject) json).get(keys[i]);
            }
            json = temp;
            i++;
        }
        return temp;
    }
    public static void main(String[] args)
    {
        JSONArray rootOfPage =  new JSONArray(JSONString);
    }
}


