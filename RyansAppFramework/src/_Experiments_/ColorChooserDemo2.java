// package _Experiments_;
// import _Externals_._Resources_.ResourceGetter;
// import javafx.application.Application;
// import javafx.beans.binding.Bindings;
// import javafx.beans.binding.ObjectBinding;
// import javafx.beans.property.DoubleProperty;
// import javafx.beans.property.ObjectProperty;
// import javafx.beans.property.SimpleDoubleProperty;
// import javafx.beans.property.SimpleObjectProperty;
// import javafx.event.EventHandler;
// import javafx.geometry.Insets;
// import javafx.scene.Scene;
// import javafx.scene.control.ContextMenu;
// import javafx.scene.control.CustomMenuItem;
// import javafx.scene.input.MouseButton;
// import javafx.scene.input.MouseEvent;
// import javafx.scene.layout.*;
// import javafx.scene.paint.Color;
// import javafx.scene.paint.CycleMethod;
// import javafx.scene.paint.LinearGradient;
// import javafx.scene.paint.Stop;
// import javafx.scene.shape.Rectangle;
// import javafx.stage.Stage;
// class MyCustomColorPicker extends VBox
// {
//     private final ObjectProperty<Color> currentColorProperty=new SimpleObjectProperty<>(Color.WHITE);
//     private final ObjectProperty<Color> customColorProperty=new SimpleObjectProperty<>(Color.TRANSPARENT);
//     private Pane colorRect;
//     private final Pane colorBar;
//     private final Pane colorRectOverlayOne;
//     private final Pane colorRectOverlayTwo;
//     private Region colorRectIndicator;
//     private final Region colorBarIndicator;
//     private Pane newColorRect;
//     private DoubleProperty hue=new SimpleDoubleProperty(-1);
//     private DoubleProperty sat=new SimpleDoubleProperty(-1);
//     private DoubleProperty bright=new SimpleDoubleProperty(-1);
//     private DoubleProperty alpha=new SimpleDoubleProperty(100)
//     {
//         @Override
//         protected void invalidated()
//         {
//             setCustomColor(new Color(getCustomColor().getRed(),getCustomColor().getGreen(),getCustomColor().getBlue(),clamp(alpha.get()/100)));
//         }
//     };
//     public MyCustomColorPicker()
//     {
//         System.out.println("iu");
//         getStyleClass().add("my-custom-color");
//         VBox box=new VBox();
//         box.getStyleClass().add("color-rect-pane");
//         System.out.println("iu");
//         customColorProperty().addListener((ov,t,t1)->colorChanged());
//         colorRectIndicator=new Region();
//         colorRectIndicator.setId("color-rect-indicator");
//         colorRectIndicator.setManaged(false);
//         colorRectIndicator.setMouseTransparent(true);
//         System.out.println("iu");
//         colorRectIndicator.setCache(true);
//         final Pane colorRectOpacityContainer=new StackPane();
//         colorRect=new StackPane();
//         colorRect.getStyleClass().addAll("color-rect","transparent-pattern");
//         Pane colorRectHue=new Pane();
//         System.out.println("iu");
//         colorRectHue.backgroundProperty().bind(new ObjectBinding<Background>()
//         {
//             {
//                 bind(hue);
//             }
//             @Override
//             protected Background computeValue()
//             {
//                 return new Background(new BackgroundFill(Color.hsb(hue.getValue(),1.0,1.0),CornerRadii.EMPTY,Insets.EMPTY));
//             }
//         });
//         colorRectOverlayOne=new Pane();
//         colorRectOverlayOne.getStyleClass().add("color-rect");
//         colorRectOverlayOne.setBackground(new Background(new BackgroundFill(new LinearGradient(0,0,1,0,true,CycleMethod.NO_CYCLE,new Stop(0,Color.rgb(255,255,255,1)),new Stop(1,Color.rgb(255,255,255,0))),CornerRadii.EMPTY,Insets.EMPTY)));
//         EventHandler<MouseEvent> rectMouseHandler=event->
//         {
//             sat.set(clamp(event.getX()/colorRect.getWidth())*100);
//             bright.set(100-(clamp(event.getY()/colorRect.getHeight())*100));
//             updateHSBColor();
//         };
//         colorRectOverlayTwo=new Pane();
//         colorRectOverlayTwo.getStyleClass().addAll("color-rect");
//         colorRectOverlayTwo.setBackground(new Background(new BackgroundFill(new LinearGradient(0,0,0,1,true,CycleMethod.NO_CYCLE,new Stop(0,Color.rgb(0,0,0,0)),new Stop(1,Color.rgb(0,0,0,1))),CornerRadii.EMPTY,Insets.EMPTY)));
//         colorRectOverlayTwo.setOnMouseDragged(rectMouseHandler);
//         colorRectOverlayTwo.setOnMousePressed(rectMouseHandler);
//         Pane colorRectBlackBorder=new Pane();
//         colorRectBlackBorder.setMouseTransparent(true);
//         colorRectBlackBorder.getStyleClass().addAll("color-rect","color-rect-border");
//         colorBar=new Pane();
//         colorBar.getStyleClass().add("color-bar");
//         colorBar.setBackground(new Background(new BackgroundFill(createHueGradient(),CornerRadii.EMPTY,Insets.EMPTY)));
//         colorBarIndicator=new Region();
//         colorBarIndicator.setId("color-bar-indicator");
//         colorBarIndicator.setMouseTransparent(true);
//         colorBarIndicator.setCache(true);
//         colorRectIndicator.layoutXProperty().bind(sat.divide(100).multiply(colorRect.widthProperty()));
//         colorRectIndicator.layoutYProperty().bind(Bindings.subtract(1,bright.divide(100)).multiply(colorRect.heightProperty()));
//         colorBarIndicator.layoutXProperty().bind(hue.divide(360).multiply(colorBar.widthProperty()));
//         colorRectOpacityContainer.opacityProperty().bind(alpha.divide(100));
//         EventHandler<MouseEvent> barMouseHandler=event->
//         {
//             hue.set(clamp(event.getX()/colorRect.getWidth())*360);
//             updateHSBColor();
//         };
//         colorBar.setOnMouseDragged(barMouseHandler);
//         colorBar.setOnMousePressed(barMouseHandler);
//         newColorRect=new Pane();
//         newColorRect.getStyleClass().add("color-new-rect");
//         newColorRect.setId("new-color");
//         newColorRect.backgroundProperty().bind(new ObjectBinding<Background>()
//         {
//             {
//                 bind(customColorProperty);
//             }
//             @Override
//             protected Background computeValue()
//             {
//                 return new Background(new BackgroundFill(customColorProperty.get(),CornerRadii.EMPTY,Insets.EMPTY));
//             }
//         });
//         colorBar.getChildren().setAll(colorBarIndicator);
//         colorRectOpacityContainer.getChildren().setAll(colorRectHue,colorRectOverlayOne,colorRectOverlayTwo);
//         colorRect.getChildren().setAll(colorRectOpacityContainer,colorRectBlackBorder,colorRectIndicator);
//         VBox.setVgrow(colorRect,Priority.SOMETIMES);
//         box.getChildren().addAll(colorBar,colorRect,newColorRect);
//         getChildren().add(box);
//         if(currentColorProperty.get()==null)
//         {
//             currentColorProperty.set(Color.TRANSPARENT);
//         }
//         updateValues();
//     }
//     private void updateValues()
//     {
//         hue.set(getCurrentColor().getHue());
//         sat.set(getCurrentColor().getSaturation()*100);
//         bright.set(getCurrentColor().getBrightness()*100);
//         alpha.set(getCurrentColor().getOpacity()*100);
//         setCustomColor(Color.hsb(hue.get(),clamp(sat.get()/100),clamp(bright.get()/100),clamp(alpha.get()/100)));
//     }
//     private void colorChanged()
//     {
//         hue.set(getCustomColor().getHue());
//         sat.set(getCustomColor().getSaturation()*100);
//         bright.set(getCustomColor().getBrightness()*100);
//     }
//     private void updateHSBColor()
//     {
//         Color newColor=Color.hsb(hue.get(),clamp(sat.get()/100),clamp(bright.get()/100),clamp(alpha.get()/100));
//         setCustomColor(newColor);
//     }
//     @Override
//     protected void layoutChildren()
//     {
//         super.layoutChildren();
//         colorRectIndicator.autosize();
//     }
//     double clamp(double value)
//     {
//         return value<0?0:value>1?1:value;
//     }
//     private LinearGradient createHueGradient()
//     {
//         double offset;
//         Stop[] stops=new Stop[255];
//         for(int x=0;x<255;x++)
//         {
//             offset=1.0/255*x;
//             int h=(int)((x/255.0)*360);
//             stops[x]=new Stop(offset,Color.hsb(h,1.0,1.0));
//         }
//         return new LinearGradient(0f,0f,1f,0f,true,CycleMethod.NO_CYCLE,stops);
//     }
//     public void setCurrentColor(Color currentColor)
//     {
//         this.currentColorProperty.set(currentColor);
//         updateValues();
//     }
//     Color getCurrentColor()
//     {
//         return currentColorProperty.get();
//     }
//     final ObjectProperty<Color> customColorProperty()
//     {
//         return customColorProperty;
//     }
//     void setCustomColor(Color color)
//     {
//         customColorProperty.set(color);
//     }
//     Color getCustomColor()
//     {
//         return customColorProperty.get();
//     }
// }
// public class CustomColorContextMenu extends Application
// {
//     private final ObjectProperty<Color> sceneColorProperty=new SimpleObjectProperty<>(Color.WHITE);
//     @Override
//     public void start(Stage primaryStage)
//     {
//         Rectangle rect=new Rectangle(400,400);
//         System.out.println("iu");
//         rect.fillProperty().bind(sceneColorProperty);
//         Scene scene=new Scene(new StackPane(rect),400,400);
//         System.out.println("iu");
//         scene.getStylesheets().add(ResourceGetter.getColorPickerStylesheet());
//         scene.setOnMouseClicked(e->
//                                 {
//                                     // System.out.println("poj");
//                                     // if(e.getButton().equals(MouseButton.SECONDARY))
//                                     {
//                                         MyCustomColorPicker myCustomColorPicker=new MyCustomColorPicker();
//                                         myCustomColorPicker.setCurrentColor(sceneColorProperty.get());
//                                         CustomMenuItem itemColor=new CustomMenuItem(myCustomColorPicker);
//                                         itemColor.setHideOnClick(false);
//                                         sceneColorProperty.bind(myCustomColorPicker.customColorProperty());
//                                         ContextMenu contextMenu=new ContextMenu(itemColor);
//                                         contextMenu.setOnHiding(t->sceneColorProperty.unbind());
//                                         contextMenu.show(scene.getWindow(),e.getScreenX(),e.getScreenY());
//                                     }
//                                 });
//         System.out.println("iu");
//         primaryStage.setTitle("Custom Color Selector");
//         primaryStage.setScene(scene);
//         System.out.println("iu");
//         primaryStage.show();
//     }
//     public static void main(String[] args)
//     {
//         System.out.println("iu");
//         launch(args);
//     }
// }
package components;
import _Experiments_.CrayonPanel;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;
/*
 * ColorChooserDemo2.java requires these files:
 *   CrayonPanel.java
 *   images/red.gif
 *   images/yellow.gif
 *   images/green.gif
 *   images/blue.gif
 */
public class ColorChooserDemo2 extends JPanel
    implements ActionListener,
               ChangeListener
{
    public JLabel banner;
    public JColorChooser tcc;
    public ColorChooserDemo2()
    {
        super(new BorderLayout());
        //Set up banner to use as custom preview panel
        banner=new JLabel("Welcome to the Tutorial Zone!",
                          JLabel.CENTER);
        banner.setForeground(Color.yellow);
        banner.setBackground(Color.blue);
        banner.setOpaque(true);
        banner.setFont(new Font("SansSerif",Font.BOLD,24));
        banner.setPreferredSize(new Dimension(100,65));
        JPanel bannerPanel=new JPanel(new BorderLayout());
        bannerPanel.add(banner,BorderLayout.CENTER);
        bannerPanel.setBorder(BorderFactory.createTitledBorder("Banner"));
        //Set up color chooser for setting background color
        JPanel panel=new JPanel(); //use FlowLayout
        JButton bcc=new JButton("Show Color Chooser...");
        bcc.addActionListener(this);
        panel.add(bcc);
        panel.setBorder(BorderFactory.createTitledBorder(
            "Choose Background Color"));
        //Set up color chooser for setting text color
        tcc=new JColorChooser();
        tcc.getSelectionModel().addChangeListener(this);
        tcc.setBorder(BorderFactory.createTitledBorder("Choose Text Color"));
        //Remove the preview panel
        tcc.setPreviewPanel(new JPanel());
        //Override the chooser panels with our own
        AbstractColorChooserPanel panels[]={new CrayonPanel()};
        tcc.setChooserPanels(panels);
        tcc.setColor(banner.getForeground());
        add(bannerPanel,BorderLayout.PAGE_START);
        add(panel,BorderLayout.CENTER);
        add(tcc,BorderLayout.PAGE_END);
    }
    public void actionPerformed(ActionEvent e)
    {
        Color newColor=JColorChooser.showDialog(
            ColorChooserDemo2.this,
            "Choose Background Color",
            banner.getBackground());
        if(newColor!=null)
        {
            banner.setBackground(newColor);
        }
    }
    public void stateChanged(ChangeEvent e)
    {
        Color newColor=tcc.getColor();
        banner.setForeground(newColor);
    }
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI()
    {
        //Create and set up the window.
        JFrame frame=new JFrame("ColorChooserDemo2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Create and set up the content pane.
        JComponent newContentPane=new ColorChooserDemo2();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
}
