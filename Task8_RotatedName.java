// ************************************************************ 
// File Name: Task8_RotatedName
// Author: Charlie Tronrud
// Purpose: Write a JavaFX application that displays your name rotated at a random angle (0 to 360).
// ************************************************************ 
import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;

public class Task8_RotatedName extends Application {

    public void start(Stage primaryStage) {
        // Create a new Text object with your name
        Text name = new Text("Charlie Tronrud");
        name.setFont(new Font(30));
        name.setFill(Color.BLACK);

        // Create a new StackPane to center the text
        StackPane root = new StackPane();
        root.setAlignment(Pos.CENTER);
        root.getChildren().add(name);

        // Set up a random angle for the text rotation
        Random rand = new Random();
        double angle = rand.nextDouble() * 360;

        // Rotate the text around its center point
        Bounds bounds = name.getBoundsInLocal();
        name.setTranslateX((root.getWidth() - bounds.getWidth()) / 2);
        name.setTranslateY((root.getHeight() - bounds.getHeight()) / 2);
        name.setRotate(angle);

        // Set up the stage
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setTitle("Rotated Name");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
