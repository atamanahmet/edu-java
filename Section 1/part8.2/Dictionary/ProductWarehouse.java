public class ProductWarehouse extends Warehouse {
    private String productName;
    protected ChangeHistory history;

    public ProductWarehouse(String productName, double capacity) {
        super(capacity);
        this.history = new ChangeHistory();
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }

    public void setName(String name) {
        this.productName = name;
    }

    public String toString() {
        return this.productName + ": " + super.toString();
    }
}
