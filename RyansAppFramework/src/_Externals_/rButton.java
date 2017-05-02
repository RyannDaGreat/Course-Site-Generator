package _Externals_;//Created by Ryan on 4/29/17.
import javafx.scene.control.Button;
public class rButton extends Button
{
    private volatile String originalStyle=null;
    public rButton()
    {
        super();
        setOnMousePressed(ⵁ->
                          {
                              if(originalStyle==null)
                                  originalStyle=getStyle();
                              setStyle(originalStyle+"-fx-background-color: #090a0c,  linear-gradient(#38424b 0%, #1f2429 20%, #191d22 100%),  linear-gradient(#9988FF, #8888FF),  radial-gradient(center 50% 0%, radius 100%, rgba(200,150,255,0.9), rgba(255,255,255,0));");
                          });
        setOnMouseReleased(ⵁ->setStyle(originalStyle));
    }
    public void setAction(Runnable action)
    {
        setOnAction(ⵁ->action.run());
    }
}