public class Warehouse {

    private double capacity;
    protected double balance;

    public Warehouse(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }
        this.balance = 0.0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount > 0) {
            if (this.howMuchSpaceLeft() > amount) {
                this.balance += amount;
            } else {
                this.balance = this.capacity;
            }
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount > 0) {
            if (amount > this.balance) {
                double helper = this.balance;
                this.balance = 0;
                return helper;
            } else if (this.balance - amount >= 0) {
                this.balance = this.balance - amount;
                return amount;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}