// ************************************************************ 
// File Name: Task6
// Author: Charlie Tronrud
// Purpose: Write a JavaFX application Task6_PrintInformation that presents four labeled text fields, allowing the user to enter values for
//...name, age favorite color and hobby. 
// ************************************************************
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*; 
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Task6_PrintInformation extends Application 
{
	private TextField Name;
	private TextField Age;
	private TextField favoriteColor;
	private TextField Hobby;
	
	public void start(Stage primaryStage) 
	{
		//Labels on printed information
		Label name = new Label("Name:");
		Label age = new Label("Age:");
		Label favorite = new Label("Favorite Color: ");
		Label hobbie = new Label("Hobby:");
		
		//All text field definitions
		Name = new TextField();
		Name.setAlignment(Pos.BASELINE_LEFT);
		
	    Age = new TextField();
	    Age.setAlignment(Pos.BASELINE_LEFT);
	    
	    favoriteColor = new TextField();
	    favoriteColor.setAlignment(Pos.BASELINE_LEFT);
	    
	    Hobby = new TextField();
	    Hobby.setAlignment(Pos.BASELINE_LEFT);
	    

	    Button print = new Button("Print");
	    print.setOnAction(this::consolePrint);
	    

	    GridPane grid = new GridPane();
	    
	    //All grids for panes
	    grid.add(name, 1, 1);
	    grid.add(Name, 2, 1);
	    
	    grid.add(age, 1, 2);
	    grid.add(Age, 2, 2);
	    
	    grid.add(favorite, 1, 3);
	    grid.add(favoriteColor, 2, 3);
	    
	    grid.add(hobbie, 1, 4);
	    grid.add(Hobby, 2, 4);
	    
	    grid.add(print, 2, 5);
	  
	    grid.setAlignment(Pos.CENTER);
	    grid.setVgap(15);
	    grid.setStyle("-fx-background-color: cornsilk");
	    
	    
	    Scene scene = new Scene(grid, 300, 300);
		primaryStage.setScene(scene);
        primaryStage.show();

	}
	
	//Button action definition
	public void consolePrint(ActionEvent event) 
	{
		System.out.println("Name: "+ Name.getText());
		System.out.println("Age: " + Age.getText());
		System.out.println("Favorite color: " + favoriteColor.getText());
		System.out.println("Hobby: " +Hobby.getText() + "\n");
	}
	

	public static void main(String[] args) 
	{
		launch();
	}

}
