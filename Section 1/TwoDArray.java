public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoDArray = new int[100][10];

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = getRandomNum();
            }
        }
        print2DArray(twoDArray);

        // for (int i = 0; i < twoDArray.length; i++) {
        // if (i == 0) {
        // System.out.println("twoDArray: ");
        // }
        // System.out.print("{ ");
        // for (int j = 0; j < twoDArray[i].length; j++) {
        // System.out.print(twoDArray[i][j] + " ");
        // }
        // if (i == twoDArray.length - 1) {
        // System.out.print("} ");
        // } else {
        // System.out.print("}, ");
        // }
        // }
        // for (int i = 0; i < twoDArray.length; i++) {
        // switch (i) {
        // case 0:
        // for (int j = 0; j < twoDArray.length; j++) {
        // switch (j) {
        // case 0:
        // System.out.print(twoDArray[i][j]);
        // break;

        // default:
        // break;
        // }
        // }

        // }
        // }

    }

    public static int getRandomNum() {
        int randomNum = (int) (Math.random() * 100) + 1;
        return randomNum;
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("{ ");

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j == arr[i].length - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print(", ");
                }

            }
            if (i == arr.length - 1) {
                System.out.print("} ");
            } else {
                System.out.print("}, ");
            }

            System.out.println("");
        }
    }
}