 // ************************************************************ 
// File Name: Task3Scribble
// Author: Charlie Tronrud
// Purpose: Write a JavaFX application Task3_Scribble that allows the user to draw (scribble) on the scene by dragging the mouse. In the upper-left corner, provide a button to clear the scene and a color picker
// ************************************************************
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class Task3_Scribble extends Application {
    
    private Canvas canvas;
    private GraphicsContext gc;
    private Color color = Color.BLACK;
    private double lineWidth = 3.0;


    public void start(Stage primaryStage) {
        canvas = new Canvas(800, 600);
        gc = canvas.getGraphicsContext2D();
        gc.setLineCap(StrokeLineCap.ROUND);
        gc.setLineJoin(StrokeLineJoin.ROUND);
        gc.setLineWidth(lineWidth);
        gc.setStroke(color);
        canvas.setOnMousePressed(e -> {
            gc.setStroke(color);
            gc.setLineWidth(lineWidth);
            gc.setLineDashes(null);
            gc.beginPath();
            gc.moveTo(e.getX(), e.getY());
            gc.stroke();
        });
        canvas.setOnMouseDragged(e -> {
            gc.lineTo(e.getX(), e.getY());
            gc.stroke();
        });
        
        Button clearButton = new Button("Clear");
        clearButton.setOnAction(e -> {
            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
        });
        
        ColorPicker colorPicker = new ColorPicker(color);
        colorPicker.setOnAction(e -> {
            color = colorPicker.getValue();
        });
        
        BorderPane root = new BorderPane(canvas);
        root.setTop(clearButton);
        root.setBottom(colorPicker);
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("Scribble");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
