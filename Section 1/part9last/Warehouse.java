import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        if (this.productMap.containsKey(product)) {
            return this.price;
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (this.productMap.containsKey(product)) {
            return this.productMap.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (this.productMap.containsKey(product) && (this.productMap.get(product) != 0)) {
            int stock = this.productMap.get(product);
            if (stock - 1 >= 0) {
                this.productMap.replace(product, stock - 1);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Set<String> products() {
        Set<String> productNames = this.productMap.keySet();
        return productNames;
    }
}
