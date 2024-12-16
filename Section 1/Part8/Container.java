
public class Container {

    private int currentAmount;
    private int limit;

    public Container() {
        this(0, 100);
    }

    public Container(int limit) {
        this(0, limit);
    }

    public Container(int currentAmount, int limit) {
        this.currentAmount = currentAmount;
        this.limit = limit;
    }

    public void add(int amount) {
        if (this.currentAmount + amount > limit) {
            this.currentAmount = limit;
        } else {
            this.currentAmount += amount;
        }

    }

    public int getAmount() {
        return this.currentAmount;
    }

    public void setAmount(int amount) {
        this.currentAmount = amount;
    }

    public void remove(int amount) {
        if (this.currentAmount - amount < 0) {
            this.currentAmount = 0;
        } else {
            this.currentAmount -= amount;
        }
    }

    public void move(Container second, int amount) {
        if (this.currentAmount - amount < 0) {
            if (second.getAmount() + this.currentAmount > limit) {
                second.setAmount(second.limit);
            } else {
                second.setAmount(second.getAmount() + this.currentAmount);
            }
            this.currentAmount = 0;
        } else {
            this.currentAmount = this.currentAmount - amount;
            if (second.getAmount() + this.currentAmount > limit) {
                second.setAmount(second.limit);
            } else {
                second.setAmount(second.getAmount() + this.currentAmount);
            }
        }
    }
}
