package MagicSquare;

public class Main {
    public static void main(String[] args) {
        MagicSquare ms = new MagicSquare(3);

        ms.placeValue(0, 0, 8);
        ms.placeValue(0, 1, 1);
        ms.placeValue(0, 2, 6);
        ms.placeValue(1, 0, 3);
        ms.placeValue(1, 1, 5);
        ms.placeValue(1, 2, 7);
        ms.placeValue(2, 0, 4);
        ms.placeValue(2, 1, 9);
        ms.placeValue(2, 2, 2);
        System.out.println(ms.sumsOfRows());
    }
}
