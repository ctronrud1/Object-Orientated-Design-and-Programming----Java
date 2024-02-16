// ************************************************************ 
// File Name: Task9
// Author: Charlie Tronrud
// Purpose: Write a JavaFX application Task9_TrafficLight.java that displays the drawing of a traffic light
// ************************************************************
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Task9_TrafficLight extends Application {

    private Circle redCircle;
    private Circle yellowCircle;
    private Circle greenCircle;

    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        HBox buttonBox = new HBox();
        StackPane trafficLightPane = new StackPane();
        
        //create the traffic light rectangle
        Rectangle trafficLight = new Rectangle(150, 300, Color.BLACK);
        trafficLight.setStroke(Color.WHITE);
        
        //create the 3 circles for the traffic light
        redCircle = new Circle(30, Color.GRAY);
        redCircle.setTranslateY(10);
        yellowCircle = new Circle(30, Color.GRAY);
        yellowCircle.setTranslateY(5);
        greenCircle = new Circle(30, Color.GRAY);
        
        //stack the circles on top of each other vertically
        StackPane.setAlignment(redCircle, Pos.TOP_CENTER);
        StackPane.setAlignment(yellowCircle, Pos.CENTER);
        StackPane.setAlignment(greenCircle, Pos.BOTTOM_CENTER);
        trafficLightPane.getChildren().addAll(trafficLight, redCircle, yellowCircle, greenCircle);
        
        //create the buttons for stop, caution, and go
        Button stopButton = new Button("Stop");
        Button cautionButton = new Button("Caution");
        Button goButton = new Button("Go");
        
        //set the button actions
        stopButton.setOnAction(e -> changeLightColor(Color.RED));
        cautionButton.setOnAction(e -> changeLightColor(Color.YELLOW));
        goButton.setOnAction(e -> changeLightColor(Color.GREEN));
        
        //create VBox for the buttons and add them
        VBox vBox = new VBox(stopButton, cautionButton, goButton);
        vBox.setAlignment(Pos.CENTER_LEFT);
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(10));
        
        //add the traffic light and buttons to the root pane
        root.setCenter(trafficLightPane);
        root.setRight(vBox);
        
        Scene scene = new Scene(root, 300, 300);
        
        primaryStage.setTitle("Traffic Light");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void changeLightColor(Color color) {
        redCircle.setFill(Color.GRAY);
        yellowCircle.setFill(Color.GRAY);
        greenCircle.setFill(Color.GRAY);
        
        if (color == Color.RED) {
            redCircle.setFill(color);
        } else if (color == Color.YELLOW) {
            yellowCircle.setFill(color);
        } else if (color == Color.GREEN) {
            greenCircle.setFill(color);
        }
    }



    public static void main(String[] args) {
        launch(args);
    }
}
