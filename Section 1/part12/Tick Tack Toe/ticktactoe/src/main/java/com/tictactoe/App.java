package com.tictactoe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class App extends Application {
    public boolean state = true;
    public Label turnText = new Label("Turn: X");
    public int[][] stateArray = new int[3][3];
    int number = 10;

    public static void main(String[] args) {

        launch(App.class);
    }

    public void start(Stage window) {
        for (int i = 0; i < stateArray.length; i++) {
            for (int j = 0; j < stateArray.length; j++) {
                stateArray[i][j] = number;
                number++;
            }
        }
        GridPane grid = new GridPane();
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        Button btn6 = new Button();
        Button btn7 = new Button();
        Button btn8 = new Button();
        Button btn9 = new Button();

        BorderPane borderPane = new BorderPane();

        Font font = new Font("Calibri", 30);

        btn1.setMinSize(100, 100);
        btn2.setMinSize(100, 100);
        btn3.setMinSize(100, 100);
        btn4.setMinSize(100, 100);
        btn5.setMinSize(100, 100);
        btn6.setMinSize(100, 100);
        btn7.setMinSize(100, 100);
        btn8.setMinSize(100, 100);
        btn9.setMinSize(100, 100);

        btn1.setFont(font);
        btn2.setFont(font);
        btn3.setFont(font);
        btn4.setFont(font);
        btn5.setFont(font);
        btn6.setFont(font);
        btn7.setFont(font);
        btn8.setFont(font);
        btn9.setFont(font);

        turnText.setFont(font);

        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10));

        grid.add(btn1, 0, 0);
        grid.add(btn2, 1, 0);
        grid.add(btn3, 2, 0);
        grid.add(btn4, 0, 1);
        grid.add(btn5, 1, 1);
        grid.add(btn6, 2, 1);
        grid.add(btn7, 0, 2);
        grid.add(btn8, 1, 2);
        grid.add(btn9, 2, 2);

        buttonLogic(btn1, turnText, grid);
        buttonLogic(btn2, turnText, grid);
        buttonLogic(btn3, turnText, grid);
        buttonLogic(btn4, turnText, grid);
        buttonLogic(btn5, turnText, grid);
        buttonLogic(btn6, turnText, grid);
        buttonLogic(btn7, turnText, grid);
        buttonLogic(btn8, turnText, grid);
        buttonLogic(btn9, turnText, grid);

        borderPane.setTop(turnText);
        borderPane.setCenter(grid);
        Scene scene = new Scene(borderPane);
        window.setScene(scene);
        window.setTitle("Tick Tack Toe? Probably No.");
        window.show();

        // Application Logic

    }

    public void buttonLogic(Button btn, Label text, GridPane grid) {
        if (!isWin(stateArray)) {
            btn.setOnAction((event) -> {
                int col = GridPane.getColumnIndex(btn);
                int row = GridPane.getRowIndex(btn);
                // if(getIndex(grid, col, row).equals("X")){
                // }

                if (btn.getText().isEmpty() && !isWin(stateArray)) {
                    if (state) {
                        btn.setText("X");
                        stateArray[col][row] = 1;
                        text.setText("Turn: O");

                    } else {
                        btn.setText("O");
                        stateArray[col][row] = 0;
                        text.setText("Turn: X");

                    }
                    System.out.println(isWin(stateArray));
                    System.out.println(stateArray[0][0]);
                    System.out.println(stateArray[1][0]);
                    System.out.println(stateArray[2][0]);
                    if (isWin(stateArray)) {
                        turnText.setText(btn.getText() + " Wins!");
                        return;
                    }
                    // System.out.println(getIndex(grid, col, row).getText());

                    state = !state;
                }
            });
        } else {
            System.out.println("Game Over!");
            // System.out.println(isWin(stateArray));
            // System.out.println(stateArray[0][0]);
            // System.out.println(stateArray[1][0]);
            // System.out.println(stateArray[2][0]);
        }

    }

    public Button getIndex(GridPane grid, int col, int row) {
        for (Node node : grid.getChildren()) {
            if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
                return (Button) node;
            }
        }
        return null;
    }

    public boolean isWin(int[][] stateArray) {
        if (stateArray[0][0] == stateArray[1][0] && stateArray[2][0] == stateArray[0][0] // first row
                || stateArray[0][1] == stateArray[1][1] && stateArray[2][1] == stateArray[0][1] // second row
                || stateArray[0][2] == stateArray[1][2] && stateArray[2][2] == stateArray[0][2] // third row
                || stateArray[0][0] == stateArray[1][1] && stateArray[2][2] == stateArray[0][0] // diagonal left to
                                                                                                // right (from top)
                || stateArray[0][2] == stateArray[1][1] && stateArray[2][0] == stateArray[0][2] // diagonal right to
                                                                                                // left (from top)
                || stateArray[0][0] == stateArray[0][1] && stateArray[0][2] == stateArray[0][0] // first column
                || stateArray[1][0] == stateArray[1][1] && stateArray[1][2] == stateArray[1][0] // second column
                || stateArray[2][0] == stateArray[2][1] && stateArray[2][2] == stateArray[2][0]) {// third column
            return true;
        }
        return false;

    }
}
// //0 1 2
// 0
// 1
// 2