
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random randomNum = new Random();

        for (int i = 0; i < 7; i++) {
            int currentRandom = randomNum.nextInt(40) + 1;
            while (true) {
                currentRandom = randomNum.nextInt(40) + 1;
                if (!this.numbers.contains(currentRandom)) {
                    this.numbers.add(currentRandom);
                    break;
                }
            }
        }

        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
