package _Experiments_;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
public class Messages
{
    public static String BUNDLE_NAME="_Experiments_.messages"; //$NON-NLS-1$
    public static ResourceBundle RESOURCE_BUNDLE=ResourceBundle.getBundle(BUNDLE_NAME);
    private Messages()
    {
    }
    public static String getString(String key)
    {
        try
        {
            return RESOURCE_BUNDLE.getString(key);
        }
        catch(MissingResourceException e)
        {
            return '!'+key+'!';
        }
    }
}