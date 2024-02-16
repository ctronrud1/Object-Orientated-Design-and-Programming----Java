// ************************************************************ 
// File Name: Task2_ImageViewPort
// Author: Charlie Tronrud
// Purpose: Write a JavaFX application Task2_ImageViewPort.java that displays an image next to another version of that image using viewport to restrict the visual area displayed 
// ************************************************************
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;

public class Task2_ImageViewPort extends Application {
	
	public void start(Stage primaryStage) 
	{
		//Calling images
		Image img1 = new Image("image1.jfif");
		Image img2 = new Image("image1.jfif");
		
		//Images to variables
		ImageView image1 = new ImageView(img1);
		ImageView image2 = new ImageView(img2);
		
		//Cropping image 2
		image2.setViewport(new Rectangle2D(220,60,100,60));
		
		FlowPane pane = new FlowPane(image1, image2);
		pane.setHgap(20);
		pane.setAlignment(Pos.CENTER);
		pane.setStyle("-fx-background-color: cornsilk");
	
		Scene scene = new Scene(pane, 600, 400);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) 
	{
		launch();
	}
}

