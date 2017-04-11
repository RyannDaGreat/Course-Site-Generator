package _Experiments_;
import java.lang.*;

import _App_.App;
import _Externals_.r;
import javafx.scene.control.*;
import javafx.scene.layout.*;
@SuppressWarnings("WeakerAccess")
public class tabTester extends TabPane
{
    public final Tab courseDetailsTab;
    // public final AnchorPane anchorPane;
    public final VBox vBox;
    public final Tab fifthtab;
    // public final AnchorPane anchorPane0;
    public tabTester()
    {
        r.fitToParent(this);
        courseDetailsTab=new Tab();
        vBox=new VBox();
        fifthtab=new Tab();
        setTabClosingPolicy(javafx.scene.control.TabPane.TabClosingPolicy.UNAVAILABLE);
        courseDetailsTab.setText("Course Details");
        courseDetailsTab.setContent(new AnchorPane(new App().gui.toolbar.boilerplate));
        fifthtab.setText("Fifth Tab");
        vboxy v=new vboxy();
        courseDetailsTab.setContent(new AnchorPane(v));
        r.fitToParent(v);
        // anchorPane.getChildren().add(new TAManagerApp().gui.primaryScene.getFocusOwner());
        getTabs().add(courseDetailsTab);
        getTabs().add(fifthtab);
    }
}
