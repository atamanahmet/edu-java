import java.util.ArrayList;

public class ChangeHistory extends ProductWarehouse {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double maxValue = Double.MIN_VALUE;
        for (Double value : history) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }
        double minValue = Double.MAX_VALUE;
        for (Double value : history) {
            if (minValue > value) {
                minValue = value;
            }
        }
        return minValue;
    }

    public double average() {
        if (history.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Double value : history) {
            sum += value;
        }
        return sum * 1.0 / this.history.size();
    }
}
