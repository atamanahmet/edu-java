package com.event;

import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch(App.class);
    }

    public void start(Stage window) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a title: ");
        String title = scanner.nextLine();

        window.setTitle(title);
        FlowPane layout = new FlowPane();
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
}