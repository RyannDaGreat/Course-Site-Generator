package _App_._IO_._Misc_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_._Resources_.ResourceGetter;
import javafx.scene.image.Image;
@SuppressWarnings("WeakerAccess")
public class Misc
{
    public App app;
    public Misc(App app)
    {
        this.app=app;
    }
    private Image getImage(String imageName)
    {
        return ResourceGetter.getImage(imageName);
    }
    public Image getAppIcon()
    {
        return getImage(app.io.propertyGetter.getAppIconName());
    }
}
