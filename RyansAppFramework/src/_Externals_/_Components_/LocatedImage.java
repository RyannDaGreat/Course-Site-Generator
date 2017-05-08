package _Externals_._Components_;
import _Externals_.r;
import javafx.scene.image.Image;
public class LocatedImage extends Image
{
    //From http://stackoverflow.com/questions/25123115/get-image-path-javafx
    private final String url;
    public LocatedImage(String url)
    {
        super(r.printed(url));
        this.url=url;
    }
    public String getURL()
    {
        return url;
    }
    public static LocatedImage fromPathOrUrl(String pathOrUrl)
    {
        try
        {
            return new LocatedImage(pathOrUrl);
        }
        catch(Exception ignored)
        {
            return new LocatedImage("file:"+pathOrUrl);
        }
    }
}