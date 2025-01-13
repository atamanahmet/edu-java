package com.application;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class App extends Application {

    public static void main(String[] args) {
        launch(App.class);
    }

    public void start(Stage window) {
        int letters = 0;
        int words = 0;
        String longestWord = "";
        BorderPane borderPane = new BorderPane();
        Button button = new Button("Click");

        Label text1 = new Label("Letters: " + letters);
        Label text2 = new Label("Words: " + words);
        Label text3 = new Label("The longest word is: " + longestWord);
        TextArea textArea = new TextArea();
        StringBuilder line = new StringBuilder("");

        // button.setOnAction((event) -> System.out.println(textArea.getParagraphs()));
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (int i = 0; i < textArea.getParagraphs().size(); i++) {
                    line.append(textArea.getParagraphs().get(i) + "\n");
                }
                System.out.println(textArea.getParagraphs());
                System.out.println(line);
                try {
                    FileWriter writer = new FileWriter("test.txt");
                    writer.write(String.valueOf(line));
                    writer.close();

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        });

        // button.setOnAction((event) -> System.out.println(lines));
        HBox hbox = new HBox();
        hbox.getChildren().add(text1);
        hbox.getChildren().add(text2);
        hbox.getChildren().add(text3);
        hbox.setSpacing(10);

        borderPane.setCenter(textArea);
        borderPane.setRight(button);

        borderPane.setBottom(hbox);
        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();

    }
}