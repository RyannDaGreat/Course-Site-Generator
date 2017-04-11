package _App_._IO_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._IO_._Exporter_.Exporter;
import _App_._IO_._JsonLoader_.JsonLoader;
import _App_._IO_._JsonSaver_.JsonSaver;
import _App_._IO_._Misc_.Misc;
import _App_._IO_._StyleGetter_.StyleGetter;
import _App_._IO_._XMLPropertyGetter_.XMLPropertyGetter;
@SuppressWarnings("WeakerAccess")
public class IO//Doesn't actually do anything. Should not contain any methods or variables other than it's children.
{
    //Note that this class has no reference to 'app' because this class doesn't actually DO anything, and forces the references to go down
    public Exporter exporter;
    public JsonLoader jsonLoader;
    public JsonSaver jsonSaver;
    public Misc misc;
    public StyleGetter styleGetter;
    public XMLPropertyGetter xmlPropertyGetter;
    public IO(App app)
    {
        exporter=new Exporter(app);
        jsonLoader=new JsonLoader(app);
        jsonSaver=new JsonSaver(app);
        misc=new Misc(app);
        styleGetter=new StyleGetter(app);
        xmlPropertyGetter=new XMLPropertyGetter(app);
    }
}