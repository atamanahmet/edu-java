package com.viewexamples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(App.class);
    }

    public void start(Stage window) {
        Dictionary dictionary = new Dictionary();
        Button newTranslationButton = new Button("Add New");
        Button practiceButton = new Button("Practice");

        HBox menu = new HBox();
        menu.getChildren().addAll(practiceButton, newTranslationButton);
        menu.setSpacing(10);

        Label randomWord = new Label();
        randomWord.setPadding(new Insets(10));
        TextField textField = new TextField();
        Button guessButton = new Button("Guess");
        Button passButton = new Button("Next");

        Label emptyInput = new Label("Fill empty fields");

        dictionary.add("word", "trans1");
        dictionary.add("word2", "trans2");
        dictionary.add("word3", "trans3");
        randomWord.setText(dictionary.getRandomWord());

        VBox vbox = new VBox();
        vbox.setSpacing(20);
        vbox.setAlignment(Pos.CENTER);

        HBox buttonHBox = new HBox();
        buttonHBox.setSpacing(30);
        buttonHBox.setAlignment(Pos.CENTER);
        buttonHBox.getChildren().addAll(passButton, guessButton);

        vbox.getChildren().addAll(randomWord, textField, buttonHBox);

        StackPane practiceStack = new StackPane();
        practiceStack.getChildren().add(vbox);

        Label instruction = new Label("Enter Word and Translation");
        instruction.setLineSpacing(10);
        TextField wordInput = new TextField();
        TextField translationInput = new TextField();

        Label label1 = new Label("Word");
        Label label2 = new Label("Translation");
        VBox wordLayout = new VBox();
        VBox transLayout = new VBox();
        wordLayout.getChildren().addAll(label1, wordInput);
        transLayout.getChildren().addAll(label2, translationInput);
        wordLayout.setPadding(new Insets(10));
        transLayout.setPadding(new Insets(10));
        wordLayout.setSpacing(10);
        transLayout.setSpacing(10);
        Button addButton = new Button("Save");

        HBox hbox1 = new HBox();
        hbox1.getChildren().addAll(wordLayout, transLayout);
        hbox1.setAlignment(Pos.TOP_CENTER);

        VBox vbox1 = new VBox();
        vbox1.getChildren().addAll(hbox1, addButton);
        vbox1.setAlignment(Pos.TOP_CENTER);

        StackPane addNewStack = new StackPane();

        addNewStack.getChildren().add(vbox1);
        StackPane.setAlignment(addNewStack, Pos.TOP_CENTER);

        BorderPane borderPane = new BorderPane();
        borderPane.setPrefSize(350, 150);
        BorderPane.setMargin(borderPane, new Insets(10));
        borderPane.setPadding(new Insets(20));
        BorderPane.setAlignment(borderPane, Pos.CENTER);
        borderPane.setTop(menu);
        borderPane.setCenter(practiceStack);

        newTranslationButton.setOnAction((event) -> {

            borderPane.setCenter(addNewStack);

        });
        practiceButton.setOnAction((event) -> {
            borderPane.setCenter(practiceStack);
        });
        passButton.setOnAction((event) -> {
            randomWord.setText(dictionary.getRandomWord());
        });
        addButton.setOnAction((event) -> {
            System.out.println(wordInput.getText());

            if (wordInput.getText().isEmpty() || translationInput.getText().isEmpty()) {
                borderPane.setBottom(emptyInput);
            } else {
                dictionary.add(wordInput.getText(), translationInput.getText());
                wordInput.setText("");
                translationInput.setText("");
            }
        });
        Label resultText = new Label();
        guessButton.setOnAction((event) -> {
            if (dictionary.get(randomWord.getText()).equals(textField.getText())) {
                randomWord.setText("Correct!");
                resultText.setText("");

            } else {
                resultText.setText("Try Again!");
                borderPane.setBottom(resultText);
            }
        });

        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();

    }

}