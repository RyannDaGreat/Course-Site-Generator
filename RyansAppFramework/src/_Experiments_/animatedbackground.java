package _Experiments_;
import _Externals_._Resources_.ResourceGetter;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.SceneBuilder;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class animatedbackground extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        primaryStage.setTitle("Media");
        Group root=animatedBokehBackground();
        Scene scene=SceneBuilder.create().width(500).height(500).root(root).fill(Color.WHITE).build();
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static Group animatedBokehBackground()
    {
        Group root=new Group();
        MediaPlayer mediaPlayer=new MediaPlayer(ResourceGetter.getVideo("bokehLoop.mp4"));
        root.getChildren().add(new MediaView(mediaPlayer));
        mediaPlayer.play();
        return root;
    }
}