// ************************************************************ 
// File Name: Task9SpaceShip
// Author: Charlie Tronrud
// Purpose: Write JavaFX application Task9_SpaceShipFollowing.java that displays the side view of the spaceship that follows the movement of the mouse. When the mouse button is pressed down, have
///...a laser beam shoot out of the front of the ship.
// ************************************************************
import javafx.stage.Stage;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

import javafx.scene.input.MouseEvent;
import java.util.Random;

public class Task9_SpaceShipFollowing extends Application {

	//instance variables
    private Group root;
    SpaceShip spaceship;
    private Line beam;
    
    public void start(Stage primaryStage) {

        spaceship = new SpaceShip();
        spaceship.setTranslateX(100);
        spaceship.setTranslateY(75);
        //GROUP	
        root = new Group(spaceship);
        
         //Scene and show
        Scene scene = new Scene(root, 750, 510, Color.BLACK);
        
        //Mouse actions
        scene.setOnMouseMoved(this::processMouseMove);
        scene.setOnMousePressed(this::processMousePress);
        scene.setOnMouseReleased(this::mouserelease);
        
        primaryStage.setTitle("Spaceship");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    //process mouse movement
    public void processMouseMove(MouseEvent event) {
        spaceship.setTranslateX(event.getX());
        spaceship.setTranslateY(event.getY());
    }
    
    //when mouse is  pressed
    public void processMousePress(MouseEvent event) {
        beam = new Line(event.getX() + 230, event.getScreenY() - 30, 700, event.getScreenY() - 30);
        beam.setStroke(Color.GREEN);
        beam.setStrokeWidth(5);
        root.getChildren().add(beam);
    }

    //when mouse is released remove the beam from children
    public void mouserelease(MouseEvent event) {
        root.getChildren().remove(beam);
    }

    public static void main(String[] args) {
        launch();
    }
}