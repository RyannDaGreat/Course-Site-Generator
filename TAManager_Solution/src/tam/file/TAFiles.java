package tam.file;
import java.io.*;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import djf.components.AppDataComponent;
import djf.components.AppFileComponent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import javafx.collections.ObservableList;

import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonWriter;
import javax.json.JsonWriterFactory;
import javax.json.stream.JsonGenerator;

import tam.TAManagerApp;
import tam.data.TAData;
import tam.data.TeachingAssistant;
/**
 * This class serves as the file component for the TA
 * manager app. It provides all saving and loading
 * services for the application.
 *
 * @author Richard McKenna
 */
public class TAFiles implements AppFileComponent
{
    // THIS IS THE APP ITSELF
    final AtomicReference<TAManagerApp> app=new AtomicReference<TAManagerApp>();
    // THESE ARE USED FOR IDENTIFYING JSON TYPES
    static final String JSON_START_HOUR="startHour";
    static final String JSON_END_HOUR="endHour";
    static final String JSON_OFFICE_HOURS="officeHours";
    static final String JSON_DAY="day";
    static final String JSON_TIME="time";
    static final String JSON_NAME="name";
    static final String JSON_UNDERGRAD_TAS="undergrad_tas";
    static final String JSON_EMAIL="email";
    public TAFiles(TAManagerApp initApp)
    {
        app.set(initApp);
    }
    @Override
    public void loadData(AppDataComponent data,String filePath) throws IOException
    {
        // CLEAR THE OLD DATA OUT
        TAData dataManager=(TAData)data;
        // LOAD THE JSON FILE WITH ALL THE DATA
        JsonObject json=loadJSONFile(filePath);
        // LOAD THE START AND END HOURS
        String startHour=json.getString(JSON_START_HOUR);
        String endHour=json.getString(JSON_END_HOUR);
        dataManager.initHours(startHour,endHour);
        // NOW RELOAD THE WORKSPACE WITH THE LOADED DATA
        app.get().getWorkspaceComponent().reloadWorkspace(app.get().getDataComponent());
        // NOW LOAD ALL THE UNDERGRAD TAs
        JsonArray jsonTAArray=json.getJsonArray(JSON_UNDERGRAD_TAS);
        for(int i=0;i<jsonTAArray.size();i++)
        {
            JsonObject jsonTA=jsonTAArray.getJsonObject(i);
            String name=jsonTA.getString(JSON_NAME);
            String email=jsonTA.getString(JSON_EMAIL);
            dataManager.addTA(name,email);
        }
        // AND THEN ALL THE OFFICE HOURS
        JsonArray jsonOfficeHoursArray=json.getJsonArray(JSON_OFFICE_HOURS);
        for(int i=0;i<jsonOfficeHoursArray.size();i++)
        {
            JsonObject jsonOfficeHours=jsonOfficeHoursArray.getJsonObject(i);
            String day=jsonOfficeHours.getString(JSON_DAY);
            String time=jsonOfficeHours.getString(JSON_TIME);
            String name=jsonOfficeHours.getString(JSON_NAME);
            dataManager.addOfficeHoursReservation(day,time,name);
        }
    }
    // HELPER METHOD FOR LOADING DATA FROM A JSON FORMAT
    private JsonObject loadJSONFile(String jsonFilePath) throws IOException
    {
        InputStream is=new FileInputStream(jsonFilePath);
        JsonReader jsonReader=Json.createReader(is);
        JsonObject json=jsonReader.readObject();
        jsonReader.close();
        is.close();
        return json;
    }
    @Override
    public void saveData(AppDataComponent data,String filePath) throws IOException
    {
        // GET THE DATA
        TAData dataManager=(TAData)data;
        // NOW BUILD THE TA JSON OBJCTS TO SAVE
        JsonArrayBuilder taArrayBuilder=Json.createArrayBuilder();
        ObservableList<TeachingAssistant> tas=dataManager.getTeachingAssistants();
        for(TeachingAssistant ta : tas)
        {
            JsonObject taJson=Json.createObjectBuilder()
                                  .add(JSON_NAME,ta.getName())
                                  .add(JSON_EMAIL,ta.getEmail()).build();
            taArrayBuilder.add(taJson);
        }
        JsonArray undergradTAsArray=taArrayBuilder.build();
        // NOW BUILD THE TIME SLOT JSON OBJCTS TO SAVE
        JsonArrayBuilder timeSlotArrayBuilder=Json.createArrayBuilder();
        ArrayList<TimeSlot> officeHours=TimeSlot.buildOfficeHoursList(dataManager);
        for(TimeSlot ts : officeHours)
        {
            JsonObject tsJson=Json.createObjectBuilder()
                                  .add(JSON_DAY,ts.getDay())
                                  .add(JSON_TIME,ts.getTime())
                                  .add(JSON_NAME,ts.getName()).build();
            JsonArrayBuilder add=timeSlotArrayBuilder.add(tsJson);
        }
        JsonArray timeSlotsArray=timeSlotArrayBuilder.build();
        // THEN PUT IT ALL TOGETHER IN A JsonObject
        JsonObject dataManagerJSO=Json.createObjectBuilder()
                                      .add(JSON_START_HOUR,""+dataManager.getStartHour())
                                      .add(JSON_END_HOUR,""+dataManager.getEndHour())
                                      .add(JSON_UNDERGRAD_TAS,undergradTAsArray)
                                      .add(JSON_OFFICE_HOURS,timeSlotsArray)
                                      .build();
        // AND NOW OUTPUT IT TO A JSON FILE WITH PRETTY PRINTING
        Map<String,Object> properties=new HashMap<>(1);
        properties.put(JsonGenerator.PRETTY_PRINTING,true);
        JsonWriterFactory writerFactory=Json.createWriterFactory(properties);
        StringWriter sw=new StringWriter();
        JsonWriter jsonWriter=writerFactory.createWriter(sw);
        jsonWriter.writeObject(dataManagerJSO);
        jsonWriter.close();
        // INIT THE WRITER
        OutputStream os=new FileOutputStream(filePath);
        JsonWriter jsonFileWriter=Json.createWriter(os);
        jsonFileWriter.writeObject(dataManagerJSO);
        String prettyPrinted=sw.toString();
        PrintWriter pw=new PrintWriter(filePath);
        pw.write(prettyPrinted);
        pw.close();
    }
    // IMPORTING/EXPORTING DATA IS USED WHEN WE READ/WRITE DATA IN AN
    // ADDITIONAL FORMAT USEFUL FOR ANOTHER PURPOSE, LIKE ANOTHER APPLICATION
    @Override
    public void importData(AppDataComponent data,String filePath) throws IOException
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public void exportData(AppDataComponent data,String filePath) throws IOException
    {
        KKK((TAData)data,filePath);
    }
    public void KKK(TAData data,String filePath) throws FileNotFoundException
    {
        // GET THE DATA
        TAData dataManager=data;
        // NOW BUILD THE TA JSON OBJCTS TO SAVE
        JsonArrayBuilder taArrayBuilder=Json.createArrayBuilder();
        ObservableList<TeachingAssistant> tas=dataManager.getTeachingAssistants();
        for(TeachingAssistant ta : tas)
        {
            JsonObject taJson=Json.createObjectBuilder()
                                  .add(JSON_NAME,ta.getName())
                                  .add(JSON_EMAIL,ta.getEmail()).build();
            taArrayBuilder.add(taJson);
        }
        JsonArray undergradTAsArray=taArrayBuilder.build();
        // NOW BUILD THE TIME SLOT JSON OBJCTS TO SAVE
        JsonArrayBuilder timeSlotArrayBuilder=Json.createArrayBuilder();
        ArrayList<TimeSlot> officeHours=TimeSlot.buildOfficeHoursList(dataManager);
        for(TimeSlot ts : officeHours)
        {
            JsonObject tsJson=Json.createObjectBuilder()
                                  .add(JSON_DAY,ts.getDay())
                                  .add(JSON_TIME,ts.getTime())
                                  .add(JSON_NAME,ts.getName()).build();
            timeSlotArrayBuilder.add(tsJson);
        }
        JsonArray timeSlotsArray=timeSlotArrayBuilder.build();
        // THEN PUT IT ALL TOGETHER IN A JsonObject
        JsonObject dataManagerJSO=Json.createObjectBuilder()
                                      .add(JSON_START_HOUR,""+dataManager.getStartHour())
                                      .add(JSON_END_HOUR,""+dataManager.getEndHour())
                                      .add(JSON_UNDERGRAD_TAS,undergradTAsArray)
                                      .add(JSON_OFFICE_HOURS,timeSlotsArray)
                                      .build();
        // AND NOW OUTPUT IT TO A JSON FILE WITH PRETTY PRINTING
        Map<String,Object> properties=new HashMap<>(1);
        properties.put(JsonGenerator.PRETTY_PRINTING,true);
        JsonWriterFactory writerFactory=Json.createWriterFactory(properties);
        StringWriter sw=new StringWriter();
        JsonWriter jsonWriter=writerFactory.createWriter(sw);
        jsonWriter.writeObject(dataManagerJSO);
        jsonWriter.close();
        // INIT THE WRITER
        OutputStream os=new FileOutputStream(filePath);
        JsonWriter jsonFileWriter=Json.createWriter(os);
        jsonFileWriter.writeObject(dataManagerJSO);
        String prettyPrinted=sw.toString();
        PrintWriter pw=new PrintWriter(filePath);
        pw.write(prettyPrinted);
        pw.close();
    }
}