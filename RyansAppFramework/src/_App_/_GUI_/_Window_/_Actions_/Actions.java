package _App_._GUI_._Window_._Actions_;//Created by Ryan on 4/10/17.
import _App_.App;
import _App_._GUI_._Window_._Boilerplate_.Boilerplate;
import _Externals_.r;
import javafx.scene.Node;
import javafx.scene.control.Tab;
import javafx.scene.effect.ColorAdjust;
public class Actions
{
    public App app;
    private Boilerplate boilerplate;
    public Actions(App app)
    {
        this.app=app;
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
        boilerplate=app.gui.window.boilerplate;
    }
    public void setCurrentTab(Tab tab)
    {
        boilerplate.getTabPane().getSelectionModel().select(tab);
    }
    public void updateAppHue()//Just for lolz
    {
        ColorAdjust colorAdjust=new ColorAdjust();
        boilerplate.setEffect(colorAdjust);
        ColorAdjust colorAdjustInverse=new ColorAdjust();
        boilerplate.cdPsBanner_imageView8.setEffect(colorAdjustInverse);
        boilerplate.cdPsLeft_imageView9.setEffect(colorAdjustInverse);
        boilerplate.cdPsRight_imageView10.setEffect(colorAdjustInverse);
        boilerplate.pdTColor_circle.setEffect(colorAdjustInverse);
        boilerplate.pdTTextColor_circle0.setEffect(colorAdjustInverse);
        boilerplate.pdTTextColor_text111117.setEffect(colorAdjustInverse);
        boilerplate.pdTColor_text111116.setEffect(colorAdjustInverse);
        //
        double X=2*r.seconds()*boilerplate.app.io.propertyGetter.getHueShiftFrequenciInHz();
        X-=2*Math.round(X/2);
        colorAdjust.setHue(-X);
        colorAdjustInverse.setHue(X);
    }
}
