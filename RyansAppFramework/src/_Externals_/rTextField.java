package _Externals_;//Created by Ryan on 4/29/17.
import javafx.scene.control.TextField;
public class rTextField extends TextField
{
    public rTextField()
    {
        setActionTextChanged(()->setText(getText().replaceAll(",","،").replaceAll(";","⁏").replaceAll("\n"," ")));//Illegal characters:    ';'  and  ','
    }
    public void setActionTextChanged(Runnable action)
    {
        textProperty().addListener((observable, oldValue, newValue) -> action.run());
    }
    public void setAction(Runnable action)
    {
        setOnAction(ⵁ->action.run());
    }
}