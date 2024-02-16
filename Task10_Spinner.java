// ************************************************************ 
// File Name: Task10_Spinner
// Author: Charlie Tronrud
// Purpose: Task10 Create a new version of the Task10_Spinner.java program
// ************************************************************
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Task10_Spinner extends Application {

    private static final String[] EMOTIONS = {
            "Happy", "Sad", "Angry", "Excited", "Confused, Grumpy"
    };


    public void start(Stage primaryStage) {
        Spinner<Integer> numberSpinner = new Spinner<>(1, 10, 5);
        numberSpinner.setEditable(true);

        Spinner<String> emotionSpinner = new Spinner<>(FXCollections.observableArrayList(EMOTIONS));
        emotionSpinner.setEditable(true);

        Label valueLabel = new Label();

        // Create a change listener for the number spinner value
        numberSpinner.valueProperty().addListener(new ChangeListener<Integer>() {

            public void changed(ObservableValue<? extends Integer> observable, Integer oldValue, Integer newValue) {
                updateValueLabel(newValue, emotionSpinner.getValue(), valueLabel);
            }
        });

        // Create a change listener for the emotion spinner value
        emotionSpinner.valueProperty().addListener(new ChangeListener<String>() {

            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                updateValueLabel(numberSpinner.getValue(), newValue, valueLabel);
            }
        });

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(numberSpinner, emotionSpinner, valueLabel);

        Scene scene = new Scene(vbox, 200, 200);
        primaryStage.setTitle("Spinner Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateValueLabel(int number, String emotion, Label valueLabel) {
        valueLabel.setText("Number: " + number + " | Emotion: " + emotion);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
