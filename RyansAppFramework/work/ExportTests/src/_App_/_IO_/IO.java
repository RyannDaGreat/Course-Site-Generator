package _App_._IO_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._IO_._Exporter_.Exporter;
import _App_._IO_._Loader_.Loader;
import _App_._IO_._Saver_.Saver;
import _App_._IO_._Misc_.Misc;
import _App_._IO_._StyleGetter_.StyleGetter;
import _App_._IO_._PropertyGetter_.PropertyGetter;
@SuppressWarnings("WeakerAccess")
public class IO//Doesn't actually do anything. Should not contain any methods or variables other than it's children.
{
    //Note that this class has no reference to 'app' because this class doesn't actually DO anything, and forces the references to go down
    public Exporter exporter;
    public Loader loader;
    public Saver saver;
    public Misc misc;
    public StyleGetter styleGetter;
    public PropertyGetter propertyGetter;
    public IO(App app)
    {
        exporter=new Exporter(app);
        loader=new Loader(app);
        saver=new Saver(app);
        misc=new Misc(app);
        styleGetter=new StyleGetter(app);
        propertyGetter=new PropertyGetter(app);
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        exporter.initialize();
        loader.initialize();
        saver.initialize();
        misc.initialize();
        styleGetter.initialize();
        propertyGetter.initialize();
    }
}
