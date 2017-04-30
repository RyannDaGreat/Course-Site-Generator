package _App_._GUI_._Dialogs_;//Created by Ryan on 4/10/17.
import _App_.App;
import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.ObjectBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.util.Optional;
@SuppressWarnings("WeakerAccess")
public class Dialogs
{
    public App app;
    public Dialogs(App app)
    {
        this.app=app;
    }
    public void initialize()//Required by Ryan's Framework. This is called AFTER everything in the tree has been constructed.
    {
    }
    //region Alerts:error and info
    //Unfortunately the ones in the r class can't work on a javaFx thread. So, I'm going to implement some here:
    //All came from http://code.makery.ch/blog/javafx-dialogs-official/
    private static void showAlert(String title,String header,String content,Alert.AlertType type)
    {
        Alert alert=new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }
    public static void showErrorAlert(String title,String header,String content)
    {
        showAlert(title,header,content,Alert.AlertType.ERROR);
    }
    public static void showErrorAlert(String message)
    {
        showErrorAlert("Error",message,"");
    }
    public static void showInfoAlert(String title,String header,String content)
    {
        showAlert(title,header,content,Alert.AlertType.INFORMATION);
    }
    public static void showInfoAlert(String message)
    {
        showInfoAlert("Info",message,"");
    }
    //endregion
    //region StringDialog
    public static String stringDialog(String title,String header,String message)//Returns null if user cancels
    {
        TextInputDialog dialog=new TextInputDialog();
        dialog.setTitle(title);
        dialog.setHeaderText(header);
        dialog.setContentText(message);
        Optional<String> result=dialog.showAndWait();
        if(result.isPresent())
        {
            return result.get();
        }
        return null;//User decided to cancel.
    }
    //endregion
    //region yesno
    public static boolean yesNo(String title,String header,String message)
    {
        Alert alert=new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);
        ButtonType yes=new ButtonType("Yes");
        ButtonType no=new ButtonType("No");
        // ButtonType buttonTypeThree = new ButtonType("Three");
        // ButtonType buttonTypeCancel = new ButtonType("Cancel",ButtonBar.ButtonData.CANCEL_CLOSE);
        alert.getButtonTypes().setAll(yes,no);//, buttonTypeThree, buttonTypeCancel);
        Optional<ButtonType> result=alert.showAndWait();
        if(!result.isPresent())
        {
            return yesNo(title,header,message);//Keep asking the user until they click yes or no. Clicking the 'x' is not an option.
        }
        if(result.get()==no)
        {
            return false;
        }
        assert result.get()==yes;
        return true;
    }
    public static boolean yesNo(String message)
    {
        return yesNo("",message,"");
    }
    //endregion
    //region open/save file/directory
    private FileChooser getFileChooser()
    {
        FileChooser fileChooser=new FileChooser();
        fileChooser.setInitialDirectory(app.io.misc.getCurrentDirectory());
        return fileChooser;
    }
    public File openFile()//Returns null if cancelled
    {
        return getFileChooser().showOpenDialog(app.stage);
    }
    public File saveFile()
    {
        return getFileChooser().showSaveDialog(app.stage);
    }
    public File openDirectory()//Returns null if cancelled
    {
        DirectoryChooser directoryChooser=new DirectoryChooser();
        directoryChooser.setInitialDirectory(app.io.misc.getCurrentDirectory());
        return new DirectoryChooser().showDialog(app.stage);
    }
    //endregion
    //region Context-specific methods
    public boolean confirmChangeTATimesDeleteOfficehours()
    {
        return yesNo(app.io.propertyGetter.getConfirmChangeTATimesDeleteOfficehoursMessage());
    }
    public boolean confirmSave()//Return true if they don't want to save OR they do want to save and select a valid path to save to (without clicking 'cancel'
    {
        if(app.gui.toolbar.reader.saveButtonIsDisabled())
        {
            return true;//Don't bother to confirm saving; out file has clearly been saved already.
        }
        if(!yesNo(app.io.propertyGetter.getConfirmSaveMessage()))//If they don't want to save
        {
            return true;
        }
        app.gui.toolbar.actions.handleSave();
        return app.gui.toolbar.reader.saveButtonIsDisabled();//That means they saved the file. If its enabled it means they must have clicked cancel.
    }
    //endregion
    //region Color Chooser
    // public Color showColorDialog(String title,Color initialColor)
    // {
    //     //Adapted from http://stackoverflow.com/questions/27171885/display-custom-color-dialog-directly-javafx-colorpicker with a few tweaks to make it more useable
    //     CountDownLatch countDownLatch=new CountDownLatch(1);
    //     Color[] selectedColor=new Color[1];
    //     Platform.runLater(()->
    //                       {
    //                           try
    //                           {
    //                               final CustomColorDialog customColorDialog=new CustomColorDialog(app.stage.getScene().getWindow());
    //                               customColorDialog.setCurrentColor(initialColor);
    //                               // remove save button
    //                               VBox controllBox=(VBox)customColorDialog.getChildren().get(1);
    //                               HBox buttonBox=(HBox)controllBox.getChildren().get(2);
    //                               buttonBox.getChildren().remove(0);
    //                               Runnable saveUseRunnable=()->
    //                               {
    //                                   try
    //                                   {
    //                                       Field customColorPropertyField=CustomColorDialog.class.getDeclaredField("customColorProperty"); //$NON-NLS-1$
    //                                       customColorPropertyField.setAccessible(true);
    //                                       @SuppressWarnings("unchecked")
    //                                       ObjectProperty<Color> customColorPropertyValue=(ObjectProperty<Color>)customColorPropertyField.get(customColorDialog);
    //                                       // selectedColorHolder.setObject(customColorPropertyValue.getValue());
    //                                       selectedColor[0]=customColorPropertyValue.getValue();
    //                                   }
    //                                   catch(NoSuchFieldException|IllegalArgumentException|IllegalAccessException e)
    //                                   {
    //                                       e.printStackTrace();
    //                                   }
    //                               };
    //                               customColorDialog.setOnUse(saveUseRunnable);
    //                               customColorDialog.setOnHidden(event->countDownLatch.countDown());
    //                               Field dialogField=CustomColorDialog.class.getDeclaredField("dialog"); //$NON-NLS-1$
    //                               dialogField.setAccessible(true);
    //                               Stage dialog=(Stage)dialogField.get(customColorDialog);
    //                               dialog.setTitle(title);
    //                               customColorDialog.show();
    //                               dialog.centerOnScreen();
    //                           }
    //                           catch(Exception e)
    //                           {
    //                               e.printStackTrace();
    //                               countDownLatch.countDown();
    //                           }
    //                       });
    //     try
    //     {
    //         countDownLatch.await();
    //     }
    //     catch(InterruptedException e)
    //     {
    //         e.printStackTrace();
    //     }
    //     return selectedColor[1];
    // }
    public class MyCustomColorPicker extends VBox
    {
        private final ObjectProperty<Color> currentColorProperty=new SimpleObjectProperty<>(Color.WHITE);
        private final ObjectProperty<Color> customColorProperty=new SimpleObjectProperty<>(Color.TRANSPARENT);
        private Pane colorRect;
        private final Pane colorBar;
        private final Pane colorRectOverlayOne;
        private final Pane colorRectOverlayTwo;
        private Region colorRectIndicator;
        private final Region colorBarIndicator;
        private Pane newColorRect;
        private DoubleProperty hue=new SimpleDoubleProperty(-1);
        private DoubleProperty sat=new SimpleDoubleProperty(-1);
        private DoubleProperty bright=new SimpleDoubleProperty(-1);
        private DoubleProperty alpha=new SimpleDoubleProperty(100)
        {
            @Override
            protected void invalidated()
            {
                setCustomColor(new Color(getCustomColor().getRed(),getCustomColor().getGreen(),getCustomColor().getBlue(),clamp(alpha.get()/100)));
            }
        };
        public MyCustomColorPicker()
        {
            getStyleClass().add("my-custom-color");
            VBox box=new VBox();
            box.getStyleClass().add("color-rect-pane");
            customColorProperty().addListener((ov,t,t1)->colorChanged());
            colorRectIndicator=new Region();
            colorRectIndicator.setId("color-rect-indicator");
            colorRectIndicator.setManaged(false);
            colorRectIndicator.setMouseTransparent(true);
            colorRectIndicator.setCache(true);
            final Pane colorRectOpacityContainer=new StackPane();
            colorRect=new StackPane();
            colorRect.getStyleClass().addAll("color-rect","transparent-pattern");
            Pane colorRectHue=new Pane();
            colorRectHue.backgroundProperty().bind(new ObjectBinding<Background>()
            {
                {
                    bind(hue);
                }
                @Override
                protected Background computeValue()
                {
                    return new Background(new BackgroundFill(Color.hsb(hue.getValue(),1.0,1.0),CornerRadii.EMPTY,Insets.EMPTY));
                }
            });
            colorRectOverlayOne=new Pane();
            colorRectOverlayOne.getStyleClass().add("color-rect");
            colorRectOverlayOne.setBackground(new Background(new BackgroundFill(new LinearGradient(0,0,1,0,true,CycleMethod.NO_CYCLE,new Stop(0,Color.rgb(255,255,255,1)),new Stop(1,Color.rgb(255,255,255,0))),CornerRadii.EMPTY,Insets.EMPTY)));
            EventHandler<MouseEvent> rectMouseHandler=event->
            {
                sat.set(clamp(event.getX()/colorRect.getWidth())*100);
                bright.set(100-(clamp(event.getY()/colorRect.getHeight())*100));
                updateHSBColor();
            };
            colorRectOverlayTwo=new Pane();
            colorRectOverlayTwo.getStyleClass().addAll("color-rect");
            colorRectOverlayTwo.setBackground(new Background(new BackgroundFill(new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0,Color.rgb(0,0,0,0)),new Stop(1,Color.rgb(0,0,0,1))),CornerRadii.EMPTY,Insets.EMPTY)));
            colorRectOverlayTwo.setOnMouseDragged(rectMouseHandler);
            colorRectOverlayTwo.setOnMousePressed(rectMouseHandler);
            Pane colorRectBlackBorder=new Pane();
            colorRectBlackBorder.setMouseTransparent(true);
            colorRectBlackBorder.getStyleClass().addAll("color-rect","color-rect-border");
            colorBar=new Pane();
            colorBar.getStyleClass().add("color-bar");
            colorBar.setBackground(new Background(new BackgroundFill(createHueGradient(),CornerRadii.EMPTY,Insets.EMPTY)));
            colorBarIndicator=new Region();
            colorBarIndicator.setId("color-bar-indicator");
            colorBarIndicator.setMouseTransparent(true);
            colorBarIndicator.setCache(true);
            colorRectIndicator.layoutXProperty().bind(sat.divide(100).multiply(colorRect.widthProperty()));
            colorRectIndicator.layoutYProperty().bind(Bindings.subtract(1,bright.divide(100)).multiply(colorRect.heightProperty()));
            colorBarIndicator.layoutXProperty().bind(hue.divide(360).multiply(colorBar.widthProperty()));
            colorRectOpacityContainer.opacityProperty().bind(alpha.divide(100));
            EventHandler<MouseEvent> barMouseHandler=event->
            {
                hue.set(clamp(event.getX()/colorRect.getWidth())*360);
                updateHSBColor();
            };
            colorBar.setOnMouseDragged(barMouseHandler);
            colorBar.setOnMousePressed(barMouseHandler);
            newColorRect=new Pane();
            newColorRect.getStyleClass().add("color-new-rect");
            newColorRect.setId("new-color");
            newColorRect.backgroundProperty().bind(new ObjectBinding<Background>()
            {
                {
                    bind(customColorProperty);
                }
                @Override
                protected Background computeValue()
                {
                    return new Background(new BackgroundFill(customColorProperty.get(),CornerRadii.EMPTY,Insets.EMPTY));
                }
            });
            colorBar.getChildren().setAll(colorBarIndicator);
            colorRectOpacityContainer.getChildren().setAll(colorRectHue,colorRectOverlayOne,colorRectOverlayTwo);
            colorRect.getChildren().setAll(colorRectOpacityContainer,colorRectBlackBorder,colorRectIndicator);
            VBox.setVgrow(colorRect,Priority.SOMETIMES);
            box.getChildren().addAll(colorBar,colorRect,newColorRect);
            getChildren().add(box);
            if(currentColorProperty.get()==null)
            {
                currentColorProperty.set(Color.TRANSPARENT);
            }
            updateValues();
        }
        private void updateValues()
        {
            hue.set(getCurrentColor().getHue());
            sat.set(getCurrentColor().getSaturation()*100);
            bright.set(getCurrentColor().getBrightness()*100);
            alpha.set(getCurrentColor().getOpacity()*100);
            setCustomColor(Color.hsb(hue.get(),clamp(sat.get()/100),clamp(bright.get()/100),clamp(alpha.get()/100)));
        }
        private void colorChanged()
        {
            hue.set(getCustomColor().getHue());
            sat.set(getCustomColor().getSaturation()*100);
            bright.set(getCustomColor().getBrightness()*100);
        }
        private void updateHSBColor()
        {
            Color newColor=Color.hsb(hue.get(),clamp(sat.get()/100),clamp(bright.get()/100),clamp(alpha.get()/100));
            setCustomColor(newColor);
        }
        @Override
        protected void layoutChildren()
        {
            super.layoutChildren();
            colorRectIndicator.autosize();
        }
        double clamp(double value)
        {
            return value<0?0:value>1?1:value;
        }
        private LinearGradient createHueGradient()
        {
            double offset;
            Stop[] stops=new Stop[255];
            for(int x=0;x<255;x++)
            {
                offset=1.0/255*x;
                int h=(int)((x/255.0)*360);
                stops[x]=new Stop(offset,Color.hsb(h,1.0,1.0));
            }
            return new LinearGradient(0f,0f,1f,0f,true,CycleMethod.NO_CYCLE,stops);
        }
        public void setCurrentColor(Color currentColor)
        {
            this.currentColorProperty.set(currentColor);
            updateValues();
        }
        Color getCurrentColor()
        {
            return currentColorProperty.get();
        }
        final ObjectProperty<Color> customColorProperty()
        {
            return customColorProperty;
        }
        void setCustomColor(Color color)
        {
            customColorProperty.set(color);
        }
        Color getCustomColor()
        {
            return customColorProperty.get();
        }
    }
    class CustomColorContextMenu extends Application
    {

        private final ObjectProperty<Color> sceneColorProperty =
            new SimpleObjectProperty<>(Color.WHITE);

        @Override
        public void start(Stage primaryStage) {

            Rectangle rect = new Rectangle (400,400);
            rect.fillProperty().bind(sceneColorProperty);
            Scene scene = new Scene(new StackPane(rect),400,400);
            scene.getStylesheets().add(getClass().getResource("color.css").toExternalForm());
            scene.setOnMouseClicked(e->{
                if(e.getButton().equals(MouseButton.SECONDARY)){
                    MyCustomColorPicker myCustomColorPicker = new MyCustomColorPicker();
                    myCustomColorPicker.setCurrentColor(sceneColorProperty.get());

                    CustomMenuItem itemColor = new CustomMenuItem(myCustomColorPicker);
                    itemColor.setHideOnClick(false);
                    sceneColorProperty.bind(myCustomColorPicker.customColorProperty());
                    ContextMenu contextMenu = new ContextMenu(itemColor);
                    contextMenu.setOnHiding(t->sceneColorProperty.unbind());
                    contextMenu.show(scene.getWindow(),e.getScreenX(),e.getScreenY());
                }
            });

            primaryStage.setTitle("Custom Color Selector");
            primaryStage.setScene(scene);
            primaryStage.show();
        }

        public void main(String[] args) {
            launch(args);
        }

    }
    //endregion
}
