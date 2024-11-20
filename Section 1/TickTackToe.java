import java.util.Scanner;
import java.util.Arrays;

public class TickTackToe {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isWin = false;
        String empty = "_";
        int turnCounter = 0;
        String[][] board = new String[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = empty;
            }
        }
        printBoard(board);
        getSelection(turnCounter, board, isWin);

    }

    public static void printBoard(String[][] array) {
        System.out.println("\nTick Tack Toe\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");

        }

    }

    public static void getSelection(int counter, String[][] boardArray, boolean isWinCheck) {

        String turn = "!";
        while (!isWinCheck) {
            switch (counter % 2) {
                case 0:
                    turn = "X";
                    break;
                case 1:
                    turn = "O";
                    break;
                default:

                    break;
            }
            System.out.println("\nTurn: " + turn);
            System.out.println("Pick a row and column number: ");

            String[] selection = scan.nextLine().split(" ");
            boardArray[Integer.parseInt(selection[0])][Integer.parseInt(selection[1])] = turn;
            if (counter == 8) {
                System.out.println("Game Over. Draw");
                System.exit(0);
            }
            counter++;
            printBoard(boardArray);

        }

    }

}