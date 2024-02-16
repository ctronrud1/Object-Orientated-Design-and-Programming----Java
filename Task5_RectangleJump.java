// ************************************************************ 
// File Name: Task5
// Author: Charlie Tronrud
// Purpose: Write a JavaFX application Task5_RectangleJump.java that presents a button and a rectangle. 
//Every time the button is pushed, the rectangle should be moved to a new random location
// ************************************************************
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.event.ActionEvent;
import java.util.Random;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.Group;


public class Task5_RectangleJump extends Application
{
	Rectangle rectangle;
	private int movex;
	private int movey;

	
	public void start(Stage primaryStage) 
	{
		//Rectangle size
		rectangle = new Rectangle(0, 150, 60, 40);
		//Initial color
		rectangle.setFill(Color.RED);
		
		Button jump = new Button("Jump");
		jump.setOnAction(this::changePOS);
		
		//Position of "Jump"
		FlowPane pane = new FlowPane(jump);
		pane.setAlignment(Pos.TOP_LEFT);
		
		Group group = new Group(pane, rectangle);
		Scene scene = new Scene(group,400,400);
		
		primaryStage.setScene(scene);
		primaryStage.show();
	
	}
	
	//Action (Button)
	public void changePOS(ActionEvent event) {
		
		//Random object
		Random random = new Random();
		
		//Random color
		Random rgb = new Random();
		
		movex = random.nextInt(350)+1;
		movey = random.nextInt(100)+1;
		
		rectangle.setLayoutX(movex);
		rectangle.setLayoutY(movey);
		
		//RGB/Color Random
		rectangle.setFill(Color.rgb(rgb.nextInt(250), rgb.nextInt(250), rgb.nextInt(250)));
	}
	
	
	public static void main(String[] args) {
		launch();
	}

}
