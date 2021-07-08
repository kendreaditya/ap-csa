import javafx.animation.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.effect.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.stage.*;
import javafx.util.*;
import javafx.scene.text.*;
import java.util.*;
 

public class ColorfulCircles extends Application
{
 public static void main(String args[])
 {
  launch(args);
 }
 public void start(Stage primaryStage)
 {
  Group root = new Group();
  Scene scene = new Scene(root, 800, 600, Color.WHITE);
  
  primaryStage.setScene(scene);
  
//  root.getChildren().add(new Text(scene.getWidth()/2,
//                                  scene.getHeight()/2,
//                                  "AP Computer Science"));
//  
//  root.getChildren().add(new Line(0, 5, scene.getWidth(),5));
//  root.getChildren().add(new Line(5, 0, 5, scene.getWidth()));
//  primaryStage.show();
  
  Random r = new Random(System.currentTimeMillis());
  
  for(int n = 1; n <= 500; n++)
  {
    Text text = new Text(r.nextInt((int)scene.getWidth()),
                         r.nextInt((int)scene.getHeight()),
                         new Character((char)(r.nextInt(26)+65)).toString());
    text.setFont(Font.font("Serif", r.nextInt(30)));
    text.setFill(Color.rgb(r.nextInt(225),
                           r.nextInt(225),
                           r.nextInt(225),
                           0.5));
    root.getChildren().add(text);
  }
  Text t2 = new Text(60, scene.getHeight()/2,"This was aswsome!");
  t2.setFont(Font.font("Serif", FontWeight.EXTRA_BOLD,
                       FontPosture.REGULAR, 60));
  t2.setFill(Color.RED);
  t2.setFontSmoothingType(FontSmoothingType.LCD);
  root.getChildren().add(t2);
  primaryStage.show();
 }
}
