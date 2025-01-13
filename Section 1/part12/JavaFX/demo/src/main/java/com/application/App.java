package com.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

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
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {
    Font font = new Font("Calibri", 50);
    int letters = 0;
    int words = 0;
    String longestWord = "";

    public static void main(String[] args) {
        launch(App.class);
    }

    public void start(Stage window) {

        BorderPane borderPane = new BorderPane();
        Button button = new Button("Click");

        Label text1 = new Label("Letters: ");
        Label text2 = new Label("Words: ");
        Label text3 = new Label("The longest word is: ");
        TextArea textArea = new TextArea();
        textArea.setFont(font);
        textArea.setWrapText(true);
        StringBuilder line = new StringBuilder("");

        // button.setOnAction((event) -> System.out.println(textArea.getParagraphs()));
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                for (int i = 0; i < textArea.getParagraphs().size(); i++) {
                    line.append(textArea.getParagraphs().get(i) + "\n");
                    String[] wordList = String.valueOf(line).split("\n");
                    if (String.valueOf(wordList[0]) != null) {
                        longestWord = String.valueOf(wordList[0]);
                    } else {
                        longestWord = " ";
                    }
                    text3.setText("The longest word is: ");
                    for (int j = 0; j < wordList.length; j++) {
                        if (longestWord.length() < wordList[j].length()) {
                            longestWord = wordList[j];
                        }
                    }
                    text1.setText("Words: ");
                    for (int j = 0; j < textArea.getParagraphs().size(); j++) {
                        if (wordList[j] != null || !wordList[j].equals("")) {
                            words++;
                        }
                    }
                    letters = 0;
                    text1.setText("Letters: ");
                    for (int j = 0; j < textArea.getParagraphs().size(); j++) {
                        System.out.println("wordListLength" + wordList.length);
                        wordList[j].chars().forEach(letter -> letters++);
                        System.out.println(letters);
                    }
                }
                text1.setText(text1.getText() + letters);
                text3.setText(text3.getText() + longestWord);
                text2.setText(text2.getText() + words);
                System.out.println("paragraph Count" + textArea.getParagraphs().size());
                // System.out.println(longestWord);
                try {
                    FileWriter writer = new FileWriter("test.txt", StandardCharsets.UTF_8);
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
    // public String[] getWords(StringBuilder line){

    // }
}