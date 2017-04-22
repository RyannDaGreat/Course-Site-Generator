package _Externals_;
import javafx.scene.image.Image;
public class LocatedImage extends Image
{
    //From http://stackoverflow.com/questions/25123115/get-image-path-javafx
    private final String url;
    public LocatedImage(String url)
    {
        super(url);
        this.url=url;
    }
    public String getURL()
    {
        return url;
    }
}