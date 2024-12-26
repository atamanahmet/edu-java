import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ShoppingCart cart = new ShoppingCart();
        // cart.add("milk", 3);
        // cart.print();
        // System.out.println("cart price: " + cart.price() + "\n");

        // cart.add("buttermilk", 2);
        // cart.print();
        // System.out.println("cart price: " + cart.price() + "\n");

        // cart.add("milk", 3);
        // cart.print();
        // System.out.println("cart price: " + cart.price() + "\n");

        // cart.add("milk", 3);
        // cart.print();
        // System.out.println("cart price: " + cart.price() + "\n");
        // Scanner scanner = new Scanner(System.in);
        // Warehouse warehose = new Warehouse();
        // Store store = new Store(warehose, scanner);

        // store.shop(null);
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("John");
    }
}
