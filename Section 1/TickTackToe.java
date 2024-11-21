import java.util.Scanner;
import java.util.Arrays;

public class TickTackToe {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isWin = false;
        char empty = '_';
        int turnCounter = 0;
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = empty;
            }
        }
        printBoard(board);
        getSelection(turnCounter, board, isWin);

    }

    public static void printBoard(char[][] array) {
        System.out.println("\nTick Tack Toe\n");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("\n");

        }

    }

    public static void getSelection(int counter, char[][] boardArray, boolean isWinCheck) {

        char turn = '!';
        while (!isWinCheck) {
            switch (counter % 2) {
                case 0:
                    turn = 'X';
                    break;
                case 1:
                    turn = 'O';
                    break;
                default:

                    break;
            }
            System.out.println("\nTurn: " + turn);
            System.out.println("Pick a row and column number: ");

            String[] strToChar = scan.nextLine().split(" ");

            char[] selection = new char[2];

            for (int i = 0; i < selection.length; i++) {
                selection[i] = (char) strToChar[i].charAt(0);
            }

            boardArray[selection[0] - '0'][selection[1] - '0'] = turn;
            if (counter == 8) {
                System.out.println("Game Over. Draw");
                System.exit(0);
            }
            counter++;
            printBoard(boardArray);

        }

    }

    // public static void isWin(char[][] array) {
    // if (array[0][0].equals(array[0][1]) && array[0][0].equals(array[0][2])
    // || array[1][0].equals(array[1][1]) && array[1][0].equals(array[1][2])
    // || array[2][0].equals(array[2][1]) && array[2][0].equals(array[2][2])
    // || array[0][0].equals(array[1][1]) && array[2][0].equals(array[0][2])
    // || array[2][0].equals(array[1][1]) && array[2][0].equals(array[0][2])) {
    // System.out.println("\nPlayer " + array[0] + " WIN!");
    // }

    // }

}

// --0 1 2
// 0 X X X
// 1 X X X
// 2 X X X