import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card> {
    public int compare(Card card1, Card card2) {
        int suitComparison = card1.getSuit().ordinal() - card2.getSuit().ordinal();
        if (suitComparison != 0) {
            return suitComparison;
        }
        return Integer.compare(card1.getValue(), card2.getValue());
    }
}
