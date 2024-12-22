public class ProductWarehouseWithHistory extends ProductWarehouse {

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.addToWarehouse(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    public void addToWarehouse(double amount) {
        if (amount > 0) {
            if (this.howMuchSpaceLeft() > amount) {
                this.balance += amount;
                this.history.add(this.getBalance());
            } else {
                this.balance = this.getCapacity();
                this.history.add(this.getBalance());
            }
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount > 0) {
            if (amount > this.getBalance()) {
                double helper = this.getBalance();
                this.balance = 0;
                this.history.add(this.getBalance());
                return helper;
            } else if (this.balance - amount >= 0) {
                this.balance = this.balance - amount;
                this.history.add(this.getBalance());
                return amount;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName() +
                "\nHistory: " + this.history().toString() +
                "\nLargest amount of product: " + this.history.maxValue()
                + "\nSmallest amount of product: " + this.history.minValue()
                + "\nAverage: " + this.history.average());
    }
}
