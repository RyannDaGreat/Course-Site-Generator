package TableViewTrTomakenonresizablecols;

import java.lang.*;
import javafx.scene.control.*;

public abstract class java extends TableView {

    protected final TableColumn tableColumn;
    protected final TableColumn tableColumn0;

    public java() {

        tableColumn = new TableColumn();
        tableColumn0 = new TableColumn();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        tableColumn.setPrefWidth(219.0);
        tableColumn.setText("C1");

        tableColumn0.setEditable(false);
        tableColumn0.setPrefWidth(268.0);
        tableColumn0.setText("C2");
        setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        getColumns().add(tableColumn);
        getColumns().add(tableColumn0);

    }
}
