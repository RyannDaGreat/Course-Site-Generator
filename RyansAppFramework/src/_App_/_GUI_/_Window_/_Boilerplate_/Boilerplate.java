package _App_._GUI_._Window_._Boilerplate_;
import _App_.App;
import _App_._GUI_._Window_._Actions_.Actions;
import _App_._IO_._PropertyGetter_.PropertyGetter;
import _Externals_.CourseSiteGeneratorMegaplate;
import _Externals_._Resources_.ResourceGetter;
import _Externals_.r;
import javafx.scene.control.TabPane;
public class Boilerplate extends CourseSiteGeneratorMegaplate//This class is a megaplate: almost all of its variables are accessed without get methods.
{
    public App app;
    private PropertyGetter propertyGetter;
    public Boilerplate(App app)
    {
        super(app);//This is horrible and disgusting but god damn it :(
        this.app=app;
    }
    public Actions actions;
    public void initialize()
    {
        propertyGetter=app.io.propertyGetter;
        actions=app.gui.window.actions;
        getStylesheets().add(ResourceGetter.getGlobalFontStylesheet());
        setOnKeyPressed(ⵁ->
                        {
                            if(ⵁ.isControlDown()||ⵁ.isMetaDown())//Either control key or command key works; good go
                            {
                                switch(ⵁ.getCode())
                                {
                                    /*@formatter:off*/
                                    case Z:app.gui.toolbar.actions.handleUndo();break;//Identical to as if button were pressed (taking into consideration whether it's disabled)
                                    case Y:app.gui.toolbar.actions.handleRedo();break;//Identical to as if button were pressed (taking into consideration whether it's disabled)
                                    case S:app.gui.toolbar.actions.handleSave();break;//Identical to as if button were clicked (NOT taking into consideration whether it's disabled)
                                    case O:app.gui.toolbar.actions.handleOpen();break;//Identical to as if button were clicked (NOT taking into consideration whether it's disabled)
                                    case N:app.gui.toolbar.actions.handleNew();break;//Identical to as if button were clicked (NOT taking into consideration whether it's disabled)
                                    case Q:app.gui.toolbar.actions.handleExit();break;//Q is for 'Quit'. Identical to as if button were clicked (NOT taking into consideration whether it's disabled)
                                    /*@formatter:on*/
                                }
                            }
                        });
        /*app.gui.window.boilerplate.*/
        if(propertyGetter.getAnimateHue())//Hue Shifter can be turned on/off in settings
        {
            r.fxRunAsNewThreadTimer(propertyGetter.getHueShiftFramesPerSecond(),actions::updateAppHue);
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
    public TabPane getTabPane()
    {
        return tabPane;
    }
}
