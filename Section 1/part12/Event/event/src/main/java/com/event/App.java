package com.event;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(App.class);
    }

    public void start(Stage window) {
        BorderPane borderpane = new BorderPane();
        VBox vbox = new VBox();
        GridPane grid = new GridPane();
        Label first = new Label("First View!");
        Label second = new Label("Second View!");
        Label third = new Label("Third View!");
        Button buttonSecond = new Button("To the third view!");
        Button buttonThird = new Button("To the first view!");
        Button buttonFirst = new Button("To the second view!");

        borderpane.setTop(first);
        borderpane.setCenter(buttonFirst);

        vbox.getChildren().addAll(second, buttonSecond);

        grid.add(third, 0, 0);
        grid.add(buttonThird, 1, 1);

        Scene sceneBorderPane = new Scene(borderpane);
        Scene sceneVbox = new Scene(vbox);
        Scene sceneGrid = new Scene(grid);

        buttonFirst.setOnAction((event) -> {
            window.setScene(sceneVbox);
        });
        buttonSecond.setOnAction((event) -> {
            window.setScene(sceneGrid);
        });
        buttonThird.setOnAction((event) -> {
            window.setScene(sceneBorderPane);
        });

        window.setScene(sceneBorderPane);

        window.show();

    }
}