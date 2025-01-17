// package com.viewexamples;

// import javafx.application.Application;
// import javafx.geometry.Insets;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.layout.BorderPane;
// import javafx.scene.layout.HBox;
// import javafx.scene.layout.StackPane;
// import javafx.stage.Stage;

// public class App extends Application {
// public static void main(String[] args) {
// launch(App.class);

// }

// public void start(Stage window) {
// Button jokeButton = new Button("Joke");
// Button answerButton = new Button("Answer");
// Button explanationButton = new Button("Explanation");

// Label joke = new Label("\"What do you call a bear with no teeth?\"");
// Label answer = new Label("\"A gummy bear.\"");
// Label explain = new Label("\"Etc.Etc.\"");

// StackPane jokeStack = new StackPane(joke);
// StackPane answerStack = new StackPane(answer);
// StackPane explainStack = new StackPane(explain);

// HBox menu = new HBox();
// menu.getChildren().addAll(jokeButton, answerButton, explanationButton);
// menu.setSpacing(10);

// BorderPane borderPane = new BorderPane();
// borderPane.setPrefSize(300, 180);
// BorderPane.setMargin(borderPane, new Insets(20.0));
// BorderPane.setAlignment(borderPane, Pos.CENTER);
// borderPane.setTop(menu);
// borderPane.setCenter(jokeStack);

// jokeButton.setOnAction((event) -> {
// borderPane.setCenter(jokeStack);
// });
// answerButton.setOnAction((event) -> {
// borderPane.setCenter(answerStack);
// });
// explanationButton.setOnAction((event) -> {
// borderPane.setCenter(explainStack);
// });

// Scene scene = new Scene(borderPane);
// window.setScene(scene);
// window.show();

// }
// }