package _Experiments_._Dumped_;

import javafx.geometry.*;
import javafx.scene.text.*;
import java.lang.*;
import javafx.scene.layout.*;

public  class UntitledBase extends GridPane {

    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final Text text;

    public UntitledBase() {

        text = new Text();



        GridPane.setHalignment(text, javafx.geometry.HPos.CENTER);
        GridPane.setValignment(text, javafx.geometry.VPos.CENTER);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Text");

        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        getColumnConstraints().add(columnConstraints);
        getRowConstraints().add(rowConstraints);
        getChildren().add(text);

    }
}
