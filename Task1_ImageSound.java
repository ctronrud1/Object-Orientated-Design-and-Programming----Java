// ************************************************************ 
// File Name: Task1 ImageSound
// Author: Charlie Tronrud
// Purpose: Learn to use image and sound array along with mouse click
// ************************************************************
import java.io.File;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Task1_ImageSound extends Application {
	
	//image
	Image img = new Image("C:\\Users\\charl\\eclipse-workspace\\LabTen\\src\\image5.jfif");;
	Image img2 = new Image("C:\\Users\\charl\\eclipse-workspace\\LabTen\\src\\image6.jfif");
	Image img3 = new Image("C:\\Users\\charl\\eclipse-workspace\\LabTen\\src\\image7.jfif");
	Image img4 = new Image("C:\\Users\\charl\\eclipse-workspace\\LabTen\\src\\image8.png");
	ImageView imgv;
	Image[] gallery;
	Group flow =  null;
	Scene scene = null;
	AudioClip current;
	File[] audioFiles = {new File("C:\\Users\\charl\\eclipse-workspace\\LabTen\\src\\6.mp3"),
						new File("C:\\Users\\charl\\eclipse-workspace\\LabTen\\src\\7.mp3"),
						new File("C:\\Users\\charl\\eclipse-workspace\\LabTen\\src\\8.mp3"),
						new File("C:\\Users\\charl\\eclipse-workspace\\LabTen\\src\\9.mp3"),
						new File ("C:\\Users\\charl\\eclipse-workspace\\LabTen\\src\\10.mp3")};
	AudioClip[] tunes;
	public void start(Stage primaryStage) 
	{
		gallery = new Image[4];
		
		gallery[0] = img;
		gallery[1] = img2;
		gallery[2] = img3;
		gallery[3] = img4;
		
		tunes = new AudioClip[audioFiles.length];
		
		imgv = new ImageView(gallery[3]);
		flow = new Group(imgv);
		scene = new Scene(flow,800,600);
		
		scene.setOnMouseClicked(this::mouseclicked);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	int counter = 0;
	
	public void mouseclicked(MouseEvent event)
	{
		if(counter>0) tunes[counter-1].stop();
		
		if(counter == gallery.length) counter = 0;
	    imgv.setImage(gallery[counter]);
	    tunes[counter] = new AudioClip(audioFiles[counter].toURI().toString());
	    tunes[counter].play();
	    
	    counter++;
	}
	
	public static void main(String[] args) 
	{
		launch();
	}
}
