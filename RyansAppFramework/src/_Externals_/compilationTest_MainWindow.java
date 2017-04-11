package _Externals_;//Created by Ryan on 4/11/17.
import _App_.App;
import javafx.scene.layout.VBox;
public class compilationTest_MainWindow extends VBox
{
    compilationTest_MainWindow()
    {
        App app=new App();
        r.fitToParent(app.gui.toolbar.boilerplate);
        getChildren().add(app.gui.toolbar.boilerplate);
        tabTester t=new tabTester();
        r.fitToParent(t);
        getChildren().add(new tabTester());

    }
}
