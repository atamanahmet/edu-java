public class Warehouse {
    private int price;
    private int stock;
    private String product;

    public void addProduct(String product, int price, int stock) {
        this.product = product;
        this.price = price;
        this.stock = stock;
    }

    public int price(String product) {
        if (product != null || product != "") {
            return this.price;
        } else {
            return -99;
        }
    }
}
