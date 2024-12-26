import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productStock;
    private Map<String, Integer> productPrice;

    public Warehouse() {
        this.productStock = new HashMap<>();
        this.productPrice = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        if (stock >= 0 || price >= 0) {
            this.productStock.put(product, stock);
            this.productPrice.put(product, price);
        }

    }

    public int price(String product) {
        if (this.productStock.containsKey(product)) {
            return this.productPrice.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (this.productStock.containsKey(product)) {
            return this.productStock.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (this.productStock.containsKey(product) && (this.productStock.get(product) != 0)) {
            int stock = this.productStock.get(product);
            if (stock - 1 >= 0) {
                this.productStock.replace(product, stock - 1);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Set<String> products() {
        Set<String> productNames = this.productStock.keySet();
        return productNames;
    }
}
