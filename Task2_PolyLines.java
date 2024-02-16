// ************************************************************ 
// File Name: Task2 Polylines
// Author: Charlie Tronrud
// Purpose: Learn to use polylines and mouse events
// ************************************************************
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Task2_PolyLines extends Application {

    private Canvas myCanvas;
    private ArrayList<Double> xCoords = new ArrayList<>();
    private ArrayList<Double> yCoords = new ArrayList<>();
    private boolean isDrawing = false;

    public void start(Stage myStage) {
        myCanvas = new Canvas(600, 400);

        myCanvas.setOnMouseClicked(e -> {
            if (e.getClickCount() == 2) {
                finishLine();
            } else {
                if (!isDrawing) {
                    startLine(e.getX(), e.getY());
                } else {
                    continueLine(e.getX(), e.getY());
                }
            }
        });

        Button myClearButton = new Button("Clear");
        myClearButton.setOnAction(e -> clearCanvas());

        BorderPane myRoot = new BorderPane(myCanvas);
        myRoot.setBottom(myClearButton);

        Scene myScene = new Scene(myRoot, 600, 450);
        myStage.setScene(myScene);
        myStage.show();
    }

    private void startLine(double x, double y) {
        xCoords.add(x);
        yCoords.add(y);
        isDrawing = true;
    }

    private void continueLine(double x, double y) {
        xCoords.add(x);
        yCoords.add(y);
        myCanvas.getGraphicsContext2D().setStroke(Color.BLACK);
        myCanvas.getGraphicsContext2D().strokePolyline(convertToArray(xCoords), convertToArray(yCoords), xCoords.size());
    }

    private void finishLine() {
        isDrawing = false;
    }

    private void clearCanvas() {
        xCoords.clear();
        yCoords.clear();
        myCanvas.getGraphicsContext2D().setStroke(Color.TRANSPARENT);
        myCanvas.getGraphicsContext2D().clearRect(0, 0, myCanvas.getWidth(), myCanvas.getHeight());
    }

    private double[] convertToArray(ArrayList<Double> list) {
        double[] array = new double[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
