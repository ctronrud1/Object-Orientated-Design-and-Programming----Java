// ************************************************************ 
// File Name: Task8
// Author: Charlie Tronrud
// Purpose: Write a JavaFX application Task8_Pizza that allows the user to pick a set of pizza toppings using a set of check boxes
// ************************************************************
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Task8_Pizza extends Application {

    private double totalCost = 10.0;

    public void start(Stage primaryStage) {

        // create checkboxes for toppings
        CheckBox extraCheeseCheckBox = new CheckBox("Extra Cheese");
        CheckBox greenPepperCheckBox = new CheckBox("Green Pepper");
        CheckBox pepperoniCheckBox = new CheckBox("Pepperoni");
        CheckBox olivesCheckBox = new CheckBox("Olives");
        CheckBox pineappleCheckBox = new CheckBox("Pineapple");
        CheckBox spinachCheckBox = new CheckBox("Spinach");

        // create label for pizza cost
        Label costLabel = new Label("Pizza Cost: $" + String.format("%.2f", totalCost));
        costLabel.setTextFill(Color.WHITE);

        // create a grid pane to hold checkboxes
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(5);
        gridPane.setHgap(20);
        gridPane.addRow(0, extraCheeseCheckBox, greenPepperCheckBox, pepperoniCheckBox);
        gridPane.addRow(1, olivesCheckBox, pineappleCheckBox, spinachCheckBox);

        // create a VBox to hold the checkboxes and cost label
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10));
        vbox.getChildren().addAll(gridPane, costLabel);
        vbox.setStyle("-fx-background-color: green;");

        // create an HBox to hold the VBox and add padding
        HBox hbox = new HBox(vbox);
        hbox.setPadding(new Insets(10));

        // create a scene with the HBox as the root node
        Scene scene = new Scene(hbox, 400, 200);

        // set the scene on the stage and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pizza Toppings");
        primaryStage.show();

        // add event handlers to checkboxes using lambda expressions
        extraCheeseCheckBox.setOnAction(event -> updateCost(costLabel, extraCheeseCheckBox));
        greenPepperCheckBox.setOnAction(event -> updateCost(costLabel, greenPepperCheckBox));
        pepperoniCheckBox.setOnAction(event -> updateCost(costLabel, pepperoniCheckBox));
        olivesCheckBox.setOnAction(event -> updateCost(costLabel, olivesCheckBox));
        pineappleCheckBox.setOnAction(event -> updateCost(costLabel, pineappleCheckBox));
        spinachCheckBox.setOnAction(event -> updateCost(costLabel, spinachCheckBox));

    }

    // method to update the cost label
    private void updateCost(Label costLabel, CheckBox checkBox) {
        if (checkBox.isSelected()) {
            totalCost += 0.5; // add 50 cents for selected topping
        } else {
            totalCost -= 0.5; // subtract 50 cents if topping is deselected
        }
        costLabel.setText("Pizza Cost: $" + String.format("%.2f", totalCost)); // update label with new cost
    }

    public static void main(String[] args) {
        launch(args);
    }
}
