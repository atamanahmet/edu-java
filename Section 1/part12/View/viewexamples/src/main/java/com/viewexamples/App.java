package com.viewexamples;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
        menu.getChildren().addAll(newTranslationButton, practiceButton);
        menu.setSpacing(10);

        Label randomWord = new Label();
        TextField textField = new TextField();
        Button guessButton = new Button("Guess");

        randomWord.setText(dictionary.getRandomWord());

        VBox vbox = new VBox();
        vbox.setSpacing(30);
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().addAll(randomWord, textField, guessButton);

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
        BorderPane.setAlignment(borderPane, Pos.CENTER);
        borderPane.setTop(menu);
        borderPane.setCenter(practiceStack);

        newTranslationButton.setOnAction((event) -> {
            borderPane.setCenter(addNewStack);
            dictionary.add(String.valueOf(wordInput), String.valueOf(translationInput));
        });
        practiceButton.setOnAction((event) -> {
            borderPane.setCenter(practiceStack);
        });

        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.show();

    }
}