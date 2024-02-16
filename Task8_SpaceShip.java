// ************************************************************ 
// File Name: Task8_SpaceShip
// Author: Charlie Tronrud
// Purpose:Write a JavaFX application TasK8_SpaceShip.java that displays a group of four alien spaceships in space.
// ************************************************************

import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import java.util.Random;

public class Task8_SpaceShip extends Application {

	public void start (Stage primaryStage) 
{

	Random random = new Random();
	
	SpaceShip ship1 = new SpaceShip();
	ship1.setTranslateX(80);
	ship1.setTranslateY(70);
	

	SpaceShip ship2 = new SpaceShip();
	ship2.setTranslateX(450);
	ship2.setTranslateY(100);
	ship2.setScaleX(0.75);
	ship2.setScaleY(0.75);
	

	SpaceShip ship3 = new SpaceShip();
	ship3.setTranslateX(300);
	ship3.setTranslateY(260);
	ship3.setScaleX(1.5);
	ship3.setScaleY(1.5);
	

	SpaceShip ship4 = new SpaceShip();
	ship4.setTranslateX(390);
	ship4.setTranslateY(20);
	ship4.setScaleX(0.3);
	ship4.setScaleY(0.3);
	
	// GROUP	
	Group root = new Group(ship1, ship2, ship3, ship4);
	
	for(int stars = 1; stars < 250; stars++) 
	{

		Circle star = new Circle(random.nextInt(750), random.nextInt(500), 0.75);
		star.setFill(Color.WHITE);
		

		root.getChildren().add(0, star);
	}


	Scene scene =new Scene(root, 750, 500, Color.BLACK);
	primaryStage.setTitle("Spaceship");
	primaryStage.setScene(scene);
	primaryStage.show();
}

public static void main(String[] args) {
	launch();
}
}