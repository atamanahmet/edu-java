package com.viewexamples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(App.class);
    }

    public void start(Stage window) {
        Label instruction = new Label("Enter your name and start.");
        Label welcomeText = new Label();
        TextField textField = new TextField();
        Button startButton = new Button("Start");
        GridPane grid = new GridPane();

        grid.add(instruction, 0, 0);
        grid.add(textField, 0, 1);
        grid.add(startButton, 0, 2);
        grid.setPrefSize(250, 150);
        grid.setVgap(20);
        grid.setHgap(20);
        grid.setAlignment(Pos.CENTER);

        VBox welcome = new VBox();
        welcome.getChildren().add(welcomeText);
        welcome.setPrefSize(300, 180);
        welcome.setAlignment(Pos.CENTER);

        Scene welcomeScene = new Scene(welcome);

        Scene register = new Scene(grid);

        startButton.setOnAction((event) -> {
            welcomeText.setText("Welcome " + textField.getText() + "!");
            window.setScene(welcomeScene);
        });

        window.setScene(register);
        window.show();
    }
}