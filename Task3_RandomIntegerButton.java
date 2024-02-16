// ************************************************************ 
// File Name: Task3_RandomIntegerButton
// Author: Charlie Tronrud
// Purpose: Write a JavaFX application Task3_RandomIntegerButton.java that displays a button and number. 
//Every time the button is pushed, it changes the number to a random value between -100 to 100.
// ************************************************************
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.util.Random;

public class Task3_RandomIntegerButton extends Application
{

	private int rand;
	private Text text;
	Random ran = new Random();

	public void start(Stage primaryStage) 
	{
		//Random number generation (Button)
		Button press = new Button("Generate Random Integers");
		text = new Text("--");
		
		//Flowpane layout
		FlowPane flow = new FlowPane(press, text);
		Scene scene = new Scene(flow, 400, 150);
		flow.setHgap(15);
		flow.setAlignment(Pos.CENTER);
		flow.setStyle("-fx-background-color: cornsilk");
		
		//Call Button
		press.setOnAction(this::randomGen);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	//Define button
	public void randomGen(ActionEvent event) 
	{
		rand = ran.nextInt()%100;
		text.setText(" " + rand);
	}

	public static void main(String[] args)
	{
	launch();
	}
}
