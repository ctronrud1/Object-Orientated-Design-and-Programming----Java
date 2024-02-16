// ************************************************************ 
// File Name: Task8_UST
// Author: Charlie Tronrud
// Purpose: Task8 contains a program that uses a split pane to display three versions of an image side by side
// ************************************************************
import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Task8_UST extends Application {

    public void start(Stage primaryStage) {
        // Load the images
        Image colorImage = new Image("C:\\Users\\charl\\eclipse-workspace\\LabTwelve\\src\\UST.jfif");
        Image blackWhiteImage = new Image("C:\\Users\\charl\\eclipse-workspace\\LabTwelve\\src\\UST.jfif");
        Image sepiaImage = new Image("C:\\Users\\charl\\eclipse-workspace\\LabTwelve\\src\\UST.jfif");

        // Create image views
        ImageView colorImageView = new ImageView(colorImage);
        ImageView blackWhiteImageView = new ImageView(blackWhiteImage);
        ImageView sepiaImageView = new ImageView(sepiaImage);

        // Set preserve ratio to true for the image views
        colorImageView.setPreserveRatio(true);
        blackWhiteImageView.setPreserveRatio(true);
        sepiaImageView.setPreserveRatio(true);

        // Create a split pane
        SplitPane splitPane = new SplitPane();
        splitPane.setOrientation(Orientation.HORIZONTAL);
        splitPane.getItems().addAll(colorImageView, blackWhiteImageView, sepiaImageView);

        // Set initial divider positions
        splitPane.setDividerPositions(0.33, 0.67);

        // Create a scene and set it to the stage
        Scene scene = new Scene(splitPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Image Split Pane");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
