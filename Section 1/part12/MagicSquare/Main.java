package MagicSquare;

public class Main {
    public static void main(String[] args) {
        // MagicSquare square = new MagicSquare(3);
        MagicSquareFactory magicSquare = new MagicSquareFactory();
        MagicSquare square = magicSquare.createMagicSquare(3);

        // ms.placeValue(0, 0, 8);
        // ms.placeValue(0, 1, 1);
        // ms.placeValue(0, 2, 6);
        // ms.placeValue(1, 0, 3);
        // ms.placeValue(1, 1, 5);
        // ms.placeValue(1, 2, 7);
        // ms.placeValue(2, 0, 4);
        // ms.placeValue(2, 1, 9);
        // ms.placeValue(2, 2, 2);
        // square.placeValue(0, 0, 1);
        // square.placeValue(0, 1, 4);
        // square.placeValue(0, 2, 7);
        // square.placeValue(1, 0, 2);
        // square.placeValue(1, 1, 5);
        // square.placeValue(1, 2, 8);
        // square.placeValue(2, 0, 3);
        // square.placeValue(2, 1, 6);
        // square.placeValue(2, 2, 9);
        // MagicSquare sqaure = new MagicSquare(2);
        // sqaure.placeValue(0, 0, 1);
        // sqaure.placeValue(1, 0, 1);
        // sqaure.placeValue(0, 1, 5);
        // sqaure.placeValue(1, 1, 7);

        System.out.println(square);
        System.out.println("Rows " + square.sumsOfRows());
        System.out.println("Columns " + square.sumsOfColumns());
        System.out.println("Diagon" + square.sumsOfDiagonals());
    }
}
