// ************************************************************ 
// File Name: Task7_Quilt
// Author: Charlie Tronrud
// Purpose:Write a JavaFX application called Task7_Quilt that display a quilt made up of two alternating square patterns
// ************************************************************
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Task7_Quilt extends Application {

    public void start(Stage primaryStage) {
        
        GridPane pane = new GridPane();

        for (int x = 0; x < 10; x += 2) {
            for (int column = 1; column <= 10; column += 2) {
                Quilt_Square quilt1 = new Quilt_Square(false, Color.DARKGREEN, Color.PINK);
                Quilt_Square quilt2 = new Quilt_Square(true, Color.YELLOW, Color.RED);

                pane.add(quilt2, column, x + 1);
                pane.add(quilt1, column, x + 2);

                int columnLoop = 0;
                while (columnLoop < 10) {
                    Quilt_Square quilt3 = new Quilt_Square(false, Color.DARKGREEN, Color.PINK);
                    Quilt_Square quilt4 = new Quilt_Square(true, Color.YELLOW, Color.RED);

                    pane.add(quilt3, columnLoop, x + 1);
                    pane.add(quilt4, columnLoop, x + 2);

                    columnLoop += 2;
                }
            }
        }

        Scene scene = new Scene(pane, 500, 500, Color.TAN);
        primaryStage.setTitle("Task7_Quilt");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
