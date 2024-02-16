// ************************************************************ 
// File Name: Task7
// Author: Charlie Tronrud
// Purpose: Write a JavaFX application Task7_TextFieldColor that presents a text field and takes a constant color from user.
// ************************************************************
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;


public class Task7_TextFieldColor extends Application 
{

	private TextField color;
	String stringscolor;
	Rectangle rectangle;
	
	public void start(Stage primaryStage) 
	{
		
		color = new TextField();
		color.setAlignment(Pos.CENTER);
		
		rectangle = new Rectangle(0, 0, 500, 400);
		
		StackPane stack = new StackPane(rectangle , color);
		stack.setAlignment(Pos.CENTER);
		
		color.setOnAction(this::change_color);
	
		Scene scene = new Scene(stack, 500, 400);
		primaryStage.setScene(scene);
        primaryStage.show();
		
        
	}
	
	public void change_color(ActionEvent event) 
	{
		stringscolor = color.getText();
	
		//Convert string to color
		Color color_change = Color.web(stringscolor);
		rectangle.setFill(color_change);
	}	

	public static void main(String[] args) 
	{
	 launch(args);
	}
}
