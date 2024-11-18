public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoDArray = {
                { 10, 20, 30, 40, 50 }, { 10, 20, 30, 40, 50 }, { 10, 20, 30, 40, 50 }, { 10, 20, 30, 40, 50 }
        };

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
        for (int i = 0; i < twoDArray.length; i++) {
            switch (i) {
                case 0:
                    for (int j = 0; j < twoDArray.length; j++) {
                        switch (j) {
                            case 0:
                                System.out.print(twoDArray[i][j]);
                                break;

                            default:
                                break;
                        }
                    }

            }
        }

    }
}
