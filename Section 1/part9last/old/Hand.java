import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        if (!hand.contains(card)) {
            hand.add(card);
        }
    }

    public void print() {
        hand.stream().forEach(card -> System.out.println(card));
    }

    public int compareTo(Hand otherHand) {
        int thisHandValue = this.hand.stream().mapToInt(card -> card.getValue()).sum();
        int otherHandValue = otherHand.hand.stream().mapToInt(card -> card.getValue()).sum();

        if (thisHandValue == otherHandValue) {
            return 0;
        } else if (thisHandValue < otherHandValue) {
            return -1;
        } else {
            return 1;
        }
    }

    public void sort() {
        this.hand.sort((card1, card2) -> card1.compareTo(card2));
    }

    public void sortBySuit() {
        this.hand.sort(new BySuitInValueOrder());
    }

    // public int handValue(Hand hand) {
    // int handSum = hand.stream().map(card -> card.getValue()).mapToInt(value ->
    // Integer.valueOf(value))
    // .sum();
    // return handSum;
    // }
}
