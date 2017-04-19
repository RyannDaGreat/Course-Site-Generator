package _App_._IO_._StyleGetter_;//Created by Ryan on 4/10/17.
import _App_.App;
import _Externals_._Resources_.ResourceGetter;
import javafx.scene.image.Image;
@SuppressWarnings("WeakerAccess")
public class StyleGetter
{
    public App app;
    public StyleGetter(App app)
    {
        this.app=app;
    }
    public Image getImage(String imageName)
    {
        return ResourceGetter.getImage(imageName);
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {

    }
    //region Specific getters
    public Image getAppIcon()
    {
        return getImage(app.io.propertyGetter.getAppIconName());
    }
    //endregion
}
