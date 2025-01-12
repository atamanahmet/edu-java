package MagicSquare;

public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // Siamese method matrix
        int r = 0; // start r
        int c = 1; // start c
        int holderR;
        int holderC;
        int currentNumber = 1;

        for (currentNumber = 1; currentNumber <= size * size; currentNumber++) {
            holderR = r;
            holderC = c;
            if (c - 1 < 0) {
                c = 2;
            } else {
                c = c - 1;
            }
            if (r + 1 > 2) {
                r = 0;
            } else {
                r = r + 1;
            }
            if (square.readValue(r, c) == 0) {
                square.placeValue(r, c, currentNumber);
            } else {
                r = holderR;
                c = holderC + 1; // one line down because of siamese method
                square.placeValue(r, c, currentNumber);
            }
        }

        return square;
    }

}
