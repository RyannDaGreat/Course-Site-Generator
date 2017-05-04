package _Externals_;//Created by Ryan on 4/29/17.
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;
import javafx.scene.effect.Bloom;
public class rTextField extends TextField
{
    static public boolean thereExistsATextfieldInFocusRightNow;
    public rTextField()
    {
        setActionTextChanged(()->setText(getText().replaceAll(",",".").replaceAll(";",":").replaceAll("\n"," ")));//Illegal characters:    ';'  and  ','
        setOnFocusChange(()->
                         {
                             Bloom bloom = new Bloom();
                             bloom.setThreshold(0.1);
                             setEffect(bloom);
                             thereExistsATextfieldInFocusRightNow=true;
                         },()->
                         {
                             setEffect(null);
                             thereExistsATextfieldInFocusRightNow=false;
                         });
    }
    public void setOnFocusChange(Runnable onFocus,Runnable onDefocus)
    {
        focusedProperty().addListener((ObservableValue<? extends Boolean> observable,Boolean oldValue,Boolean newValue)->
                                      {
                                          if(newValue)
                                          {
                                              onFocus.run();
                                          }
                                          else
                                          {
                                              onDefocus.run();
                                          }
                                      });
    }
    public void setActionTextChanged(Runnable action)
    {
        textProperty().addListener((observable,oldValue,newValue)->action.run());
    }
    public void setAction(Runnable action)
    {
        setOnAction(ⵁ->action.run());
    }
}