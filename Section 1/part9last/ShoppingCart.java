import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Integer> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.cart.containsKey(product)) {

        }
        this.cart.put(product, price);

    }

    public int price() {
        int cartSum = 0;
        for (int value : cart.values()) {
            cartSum += value;
        }
        return cartSum;
    }

    public void print() {

    }
}
