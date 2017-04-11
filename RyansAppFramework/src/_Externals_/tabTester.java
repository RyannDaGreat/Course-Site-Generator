package _Externals_;
import java.lang.*;

import _App_.App;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
@SuppressWarnings("WeakerAccess")
public class tabTester extends TabPane
{
    public final Tab tab;
    public final AnchorPane anchorPane;
    public final VBox vBox;
    public final Tab tab0;
    // public final AnchorPane anchorPane0;
    public tabTester()
    {
        r.fitToParent(this);
        tab=new Tab();
        anchorPane=new AnchorPane();
        vBox=new VBox();
        tab0=new Tab();
        setTabClosingPolicy(javafx.scene.control.TabPane.TabClosingPolicy.UNAVAILABLE);
        tab.setText("Course Details");
        tab.setContent(new App().gui.toolbar.boilerplate);
        tab0.setText("Fifth Tab");
        tab.setContent(anchorPane);
        vboxy v=new vboxy();
        AnchorPane.setBottomAnchor(v,0.0);
        r.fitToParent(v);
        anchorPane.getChildren().add(v);
        // anchorPane.getChildren().add(new TAManagerApp().gui.primaryScene.getFocusOwner());
        getTabs().add(tab);
        getTabs().add(tab0);
    }
}
