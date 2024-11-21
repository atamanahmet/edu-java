import java.util.Scanner;
// import java.util.Arrays;

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
        getSelection(turnCounter, board, isWin, empty);
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

    public static void getSelection(int counter, char[][] board, boolean isWinCheck, char empty) {
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

            int[] selection = getSelection();
            while (board[selection[0]][selection[1]] != empty) {
                System.out.println("Area allready occupied. Try diffrent area");
                System.out.println("Pick a row and column number: ");
                selection = getSelection();
            }

            board[selection[0]][selection[1]] = turn;
            if (counter == 9) {
                System.out.println("Game Over. Draw");
                System.exit(0);
            }
            counter++;
            printBoard(board);
            isWin(board, turn, empty);
        }
    }

    public static int[] getSelection() {
        String[] strToInt = scan.nextLine().split(" ");
        int[] input = new int[2];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(strToInt[i]);
        }
        return input;
    }

    public static void isWin(char[][] array, char turn, char empty) {
        if ((array[0][0] == array[0][1] && array[0][0] == array[0][2] && array[0][0] != '_')
                || (array[1][0] == array[1][1] && array[1][0] == array[1][2] && array[1][0] != empty)
                || (array[2][0] == array[2][1] && array[2][0] == array[2][2] && array[2][0] != empty)
                || (array[0][0] == array[1][1] && array[0][0] == array[2][2] && array[0][0] != empty)
                || (array[2][0] == array[1][1] && array[2][0] == array[0][2] && array[2][0] != empty)
                || (array[0][0] == array[1][0] && array[0][0] == array[2][0] && array[0][0] != empty)
                || (array[0][1] == array[1][1] && array[0][1] == array[2][1] && array[0][1] != empty)
                || (array[0][2] == array[1][2] && array[0][2] == array[2][2] && array[0][2] != empty)) {
            System.out.println("\nPlayer " + turn + " WIN!");
            System.exit(0);
        }
    }
}

// --0 1 2
// 0 X X X
// 1 X X X
// 2 X X X