 // ************************************************************ 
// File Name: Task4Color
// Author: Charlie Tronrud
// Purpose: Write a JavaFX application Task3_Scribble that allows the user to draw (scribble) on the scene by dragging the mouse. In the upper-left corner, provide a button to clear the scene and a color picker
// ************************************************************
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Task4_ColorText extends Application {
    
    private TextField textField;
    private ColorPicker colorPicker;
    private Text displayText;
    
    @Override
    public void start(Stage primaryStage) {
        
        // Create text field and color picker
        textField = new TextField();
        colorPicker = new ColorPicker(Color.BLACK);
        
        // Create button
        Button button = new Button("Display");
        button.setOnAction(e -> displayText());
        
        // Create HBox for text field and button
        HBox hbox1 = new HBox(10, textField, button);
        hbox1.setPadding(new Insets(10));
        
        // Create HBox for color picker and display text
        displayText = new Text();
        displayText.setStyle("-fx-font-size: 20px;");
        HBox hbox2 = new HBox(10, colorPicker, displayText);
        hbox2.setPadding(new Insets(10));
        
        // Create VBox to hold both HBoxes
        VBox vbox = new VBox(10, hbox1, hbox2);
        
        // Create scene
        Scene scene = new Scene(vbox, 400, 200);
        
        // Set stage properties and show it
        primaryStage.setScene(scene);
        primaryStage.setTitle("Color Text");
        primaryStage.show();
    }
    
    private void displayText() {
        String text = textField.getText();
        Color color = colorPicker.getValue();
        displayText.setText(text);
        displayText.setFill(color);
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
