package _App_._GUI_._Window_._Boilerplate_;
import _App_.App;
import _App_._GUI_._Toolbar_._Actions_.Actions;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.CourseSiteGeneratorMegaplate;
import _Externals_._Resources_.ResourceGetter;
import _Externals_.r;
import javafx.scene.control.TabPane;
import javafx.scene.effect.ColorAdjust;
public class Boilerplate extends CourseSiteGeneratorMegaplate//This class is a megaplate: almost all of its variables are accessed without get methods.
{
    public App app;
    private PropertyGetter propertyGetter;
    public void initialize()
    {
        propertyGetter=app.io.propertyGetter;
        getStylesheets().add(ResourceGetter.getGlobalFontStylesheet());
        setOnKeyPressed(ⵁ->
                        {
                            if(ⵁ.isControlDown()||ⵁ.isMetaDown())//Either control key or command key works; good go
                            {
                                Actions actions=app.gui.toolbar.actions;
                                switch(ⵁ.getCode())
                                {
                                    /*@formatter:off*/
                                    case Z:actions.handleUndo();break;//Identical to as if button were pressed (taking into consideration whether it's disabled)
                                    case Y:actions.handleRedo();break;//Identical to as if button were pressed (taking into consideration whether it's disabled)
                                    case S:actions.handleSave();break;//Identical to as if button were clicked (NOT taking into consideration whether it's disabled)
                                    case O:actions.handleOpen();break;//Identical to as if button were clicked (NOT taking into consideration whether it's disabled)
                                    case N:actions.handleNew();break;//Identical to as if button were clicked (NOT taking into consideration whether it's disabled)
                                    case Q:actions.handleExit();break;//Q is for 'Quit'. Identical to as if button were clicked (NOT taking into consideration whether it's disabled)
                                    /*@formatter:on*/
                                }
                            }
                        });
        /*app.gui.window.boilerplate.*/
        if(propertyGetter.getAnimateHue())//Hue Shifter can be turned on/off in settings
        {
            r.fxRunAsNewThreadRepeatedly(propertyGetter.getHueShiftFramesPerSecond(),this::updateAppHue);
        }
        String graphicStyle=propertyGetter.getCircle_and_image_style();
        cdPsBanner_imageView8.setStyle(graphicStyle);
        cdPsLeft_imageView9.setStyle(graphicStyle);
        cdPsRight_imageView10.setStyle(graphicStyle);
        pdTColor_circle.setStyle(graphicStyle);
        pdTTextColor_circle0.setStyle(graphicStyle);
        // sdEndingFriday_datePicker.setStyle(graphicStlye);
        // sdStartingMonday_datePicker0.setStyle(graphicStlye);
        // sdDate_datePicker1.setStyle(graphicStlye);
    }
    public void updateAppHue()//Just for lolz
    {
        ColorAdjust colorAdjust=new ColorAdjust();
        setEffect(colorAdjust);
        ColorAdjust colorAdjustInverse=new ColorAdjust();
        cdPsBanner_imageView8.setEffect(colorAdjustInverse);
        cdPsLeft_imageView9.setEffect(colorAdjustInverse);
        cdPsRight_imageView10.setEffect(colorAdjustInverse);
        pdTColor_circle.setEffect(colorAdjustInverse);
        pdTTextColor_circle0.setEffect(colorAdjustInverse);
        pdTTextColor_text111117.setEffect(colorAdjustInverse);
        pdTColor_text111116.setEffect(colorAdjustInverse);
        //
        double X=2*r.seconds()*app.io.propertyGetter.getHueShiftFrequenciInHz();
        X-=2*Math.round(X/2);
        colorAdjust.setHue(-X);
        colorAdjustInverse.setHue(X);
    }
    public TabPane getTabPane()
    {
        return tabPane;
    }
}
