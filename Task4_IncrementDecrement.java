// ************************************************************ 
// File Name: Task4
// Author: Charlie Tronrud
// Purpose: Write a JavaFX application Task4_IncrementDecrement.java that presents two buttons and a number. Increment by 5 and decrement by 10.
// ************************************************************
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.event.ActionEvent;

public class Task4_IncrementDecrement extends Application {
	
	private final int increment1 = 5;
	private final int decrement1 = 10;
	private Text value;
	private int initial = 10;
		
	public void start(Stage primaryStage) 
	{
		
		Button increment2 = new Button("Increment"); 
		Button decrement2 = new Button("Decrement");

		value = new Text(" " + initial);
		
		//Define layout
		FlowPane pane = new FlowPane(increment2, value, decrement2);
		pane.setStyle("-fx-background-color: cornsilk");
		pane.setHgap(20);
		pane.setAlignment(Pos.CENTER);
		
		//Calling Button
		increment2.setOnAction(this::Increment3);
		decrement2.setOnAction(this::Decrement3);

		Scene scene = new Scene(pane, 500, 200);
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	
	//Incrementation of Button
	public void Increment3(ActionEvent event) 
	{
		initial += increment1;
		value.setText("" + initial);
	}
	
	//Decrementation of Button
	public void Decrement3(ActionEvent event) 
	{
		initial -= decrement1;
		value.setText("" + initial);
	}
	
	public static void main(String[] args) {
		launch();
	}
}
