public class ProductWarehouseWithHistory extends ProductWarehouse {

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        ChangeHistory().add()
    }
}
