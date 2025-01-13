package com.event;

import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Scene;
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
        Label letters = new Label("Letters: ");
        Label words = new Label("Words: ");
        Label longest = new Label("The longest word is: ");
        TextArea textArea = new TextArea();

        textArea.textProperty().addListener((change, oldValue, newValue) -> {

            letters.setText("Letters: ");
            words.setText("Words: ");
            longest.setText("The longest word is: ");

            int letterCount = newValue.length();
            String[] wordArray = newValue.split(" ");

            String longestWord = Arrays.stream(wordArray)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            words.setText(words.getText() + String.valueOf(wordArray.length));
            letters.setText(letters.getText() + String.valueOf(letterCount));
            longest.setText(longest.getText() + longestWord);

        });

        HBox hbox = new HBox();
        BorderPane borderPane = new BorderPane();

        hbox.getChildren().addAll(letters, words, longest);
        hbox.setSpacing(30);
        borderPane.setTop(textArea);
        borderPane.setBottom(hbox);

        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();
    }

}