public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoDArray = {
                { 10, 20, 30, 40, 50 }, { 10, 20, 30, 40, 50 }, { 10, 20, 30, 40, 50 }, { 10, 20, 30, 40, 50 }
        };
        for (int i = 0; i < twoDArray.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.print("}, ");
        }
    }
}
