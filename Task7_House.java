// ************************************************************ 
// File Name: Task7_House
// Author: Charlie Tronrud
// Purpose:	Write a JavaFX application that draws a house with a door and doorknob, windows, and a chimney relatively close to the one given
// ************************************************************ 
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Task7_House extends Application {
public void start(Stage primaryStage)  {
    Group root = new Group();
    Scene scene = new Scene(root, 800, 600, Color.LIGHTBLUE);
    
    Rectangle greenRect = new Rectangle (0,450,800,150);
    greenRect.setFill(Color.GREEN);
    root.getChildren().add(greenRect);
    // Draw the house
    Rectangle house = new Rectangle(120, 250, 600, 300);
    house.setFill(Color.MAROON);
    root.getChildren().add(house);
    
    //Draw the roof
    Rectangle roof = new Rectangle(100,170,640,80);
    roof.setFill(Color.BURLYWOOD);
    root.getChildren().add(roof);
    
    // Draw the door
    Rectangle door = new Rectangle(370, 370, 100, 180);
    door.setFill(Color.TAN);
    root.getChildren().add(door);
    
    // Draw the doorknob
    Circle doorknob = new Circle(460, 480, 5);
    doorknob.setFill(Color.BLACK);
    root.getChildren().add(doorknob);
    
    // Draw the windows
    Rectangle window1 = new Rectangle(160, 300, 120, 100);
    window1.setFill(Color.LIGHTYELLOW);
    root.getChildren().add(window1);
    
    Rectangle window2 = new Rectangle(560, 300, 120, 100);
    window2.setFill(Color.LIGHTYELLOW);
    root.getChildren().add(window2);
    
    // Draw the chimney
    Polygon chimney = new Polygon();
    chimney.getPoints().addAll(new Double[]{
        600.0, 140.0,
        650.0, 140.0,
        650.0, 210.0,
        600.0, 210.0
    });
    chimney.setFill(Color.DARKRED);
    root.getChildren().add(chimney);
    
    // Draw the smoke
    Circle smoke1 = new Circle(625, 110, 20);
    smoke1.setFill(Color.GRAY);
    Circle smoke2 = new Circle(645, 90, 20);
    smoke2.setFill(Color.GRAY);
    root.getChildren().addAll(smoke1, smoke2);
    
    //Draw the clouds
    Ellipse ellipse1 = new Ellipse(200, 70, 80, 60);
    Ellipse ellipse2 = new Ellipse(160, 100, 100, 50);

    // Set the fill color of the ellipses to white
    ellipse1.setFill(Color.WHITE);
    ellipse2.setFill(Color.WHITE);
    root.getChildren().addAll(ellipse1,ellipse2);
    
   
    
    primaryStage.setTitle("House with Door, Windows, Chimney, Smoke, and Clouds");
    primaryStage.setScene(scene); 
    primaryStage.show();
}

// Launches the JavaFX application
public static void main(String[] args) {
    launch(args);
}
}
