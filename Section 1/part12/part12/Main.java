
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // LotteryRow row = new LotteryRow();
        // ArrayList<Integer> lotteryNumbers = row.numbers();

        // System.out.println("Lottery numbers:");
        // for (Integer number : lotteryNumbers) {
        // System.out.print(number + " ");
        // }
        // System.out.println("");
        // int rows = 2;
        // int columns = 3;
        // int[][] matrix = new int[rows][columns];
        // matrix[0][1] = 5;
        // matrix[1][0] = 3;
        // matrix[1][2] = 7;
        // System.out.println(arrayAsString(matrix));
        int[][] matrix = {
                { 3, 2, 7, 6 },
                { 2, 4, 1, 0 },
                { 3, 2, 1, 0 }
        };

        System.out.println(arrayAsString(matrix));
    }

    public static String arrayAsString(int[][] array) {
        String asString = "";

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                asString += String.valueOf(array[i][j]);
            }
            asString += "\n";
        }
        return asString;
    }
}
