import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private int price;
    private int stock;
    private String product;
    private Map<String, Integer> productMap;

    public Warehouse() {
        this.productMap = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.product = product;
        this.price = price;
        this.stock = stock;
        this.productMap.put(product, stock);
    }

    public int price(String product) {
        if (product != null || product != "") {
            return this.price;
        } else {
            return -99;
        }
    }
}
