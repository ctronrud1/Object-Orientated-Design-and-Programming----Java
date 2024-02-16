// ************************************************************ 
// File Name: Task10
// Author: Charlie Tronrud
// Purpose: Write a JavaFX application Task10_MousePointer.java that changes its background color
//...depending on where the mouse pointer is located
// ************************************************************
 

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.input.MouseEvent;

public class Task10_MousePointer extends Application {
	Scene scene;
public void start (Stage primaryStage) 

{
	
	// Create a text object that says "MOVE THE MOUSE AROUND"
	Text text = new Text("MOVE THE MOUSE AROUND");
	text.setFill(Color.BLACK);  // Set the text color to black
	
	// Create a StackPane and add the text object to it
	StackPane stackPane = new StackPane(text);

	// Create a new scene with the StackPane and set its dimensions
	scene = new Scene(stackPane, 300, 300);
	
	// Attach the processMouseMove method to the MouseMoved event of the scene
	scene.setOnMouseMoved(this::processMouseMove);
	
	// Set the title of the primary stage to "Spaceship" and display the scene
	primaryStage.setTitle("Spaceship");
	primaryStage.setScene(scene);
	primaryStage.show();
}

// This method is called whenever the mouse moves on the scene
public void processMouseMove(MouseEvent event) 
{
    if(event.getX()>=150)
    {
        	scene.setFill(Color.GREEN);  // Set the scene to green (Mouse on right)
    }
    else 
    {
    	scene.setFill(Color.RED);  // Set the scene background color to red (Mouse on LEft)
    }
}

// Launch the application
public static void main(String[] args) {
	launch();
}
}