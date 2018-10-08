package _Experiments_._Dumped_;

import javafx.scene.effect.*;
import javafx.scene.control.*;
import java.lang.*;
import javafx.scene.layout.*;

public abstract class hueyestBase extends Button {

    protected final ColorAdjust colorAdjust;

    public hueyestBase() {

        colorAdjust = new ColorAdjust();

        setMnemonicParsing(false);
        setText("Button");
        setTextFill(javafx.scene.paint.Color.RED);

        colorAdjust.setHue(0.45);
        setEffect(colorAdjust);

    }
}
