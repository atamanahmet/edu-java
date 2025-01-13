package com.application;

// import javafx.application.Application;
// import javafx.stage.Stage;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.control.Label;
// import javafx.scene.layout.BorderPane;
// import javafx.scene.layout.FlowPane;

// public class App extends Application {
//     public static void main(String[] args) {

//         // System.out.println(componentGroup.getChildren());
//         launch(App.class);
//     }

//     public void start(Stage window) {
//         Label text = new Label();
//         text.setText("Diagonally");
//         Button button = new Button("Button");
//         BorderPane componentGroup = new BorderPane();
//         componentGroup.setTop(new Button("Top"));
//         componentGroup.setBottom(new Button("Bottom"));
//         componentGroup.setRight(new Button("Right"));
//         componentGroup.setLeft(new Button("Left"));
//         // componentGroup.getChildren().add(text);

//         Scene scene1 = new Scene(componentGroup);
//         // window.setTitle("Test window");
//         window.setScene(scene1);
//         window.show();
//     }

// }

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(App.class);
    }

    public void start(Stage window) {
        Label north = new Label("NORTH");
        Label south = new Label("SOUTH");
        Label east = new Label("EAST");

        VBox layout = new VBox(10);
        layout.setSpacing(20);
        layout.getChildren().add(north);
        layout.getChildren().add(south);
        layout.getChildren().add(east);
        // layout.set
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
}