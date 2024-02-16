// ************************************************************ 
// File Name: Task1_Images
// Author: Charlie Tronrud
// Purpose: Write  a  JavaFX  application  Task1_Images.java  that  displays  three  images  side  by  side  using flowpane
// ************************************************************
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;


public class Task1_Images extends Application{

	public void start(Stage primaryStage) {
	
		Image img = new Image("image1.jfif");
		Image img1 = new Image("image2.jfif");
		Image img2 = new Image("image3.jfif");
		Image img3 = new Image("image4.png");
		
		//Images to variables 
		ImageView imgView4 = new ImageView(img3);
		ImageView imgView3 = new ImageView(img2);
		ImageView imgView2 = new ImageView(img1);
		ImageView imgView = new ImageView(img);
		
		FlowPane pane = new FlowPane(imgView, imgView2, imgView3, imgView4);
		pane.setStyle("-fx-background-color: purple");
		pane.setAlignment(Pos.CENTER);
		 
		Scene scene = new Scene(pane, 750, 650);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) 
	{
		launch();
	}
	 
}
