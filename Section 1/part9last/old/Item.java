public class Item {
    private int unitPrice;
    private String product;
    private int quantity;

    public Item(String product, int quantity, int unitPrice) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.unitPrice * this.quantity;
    }

    public void increaseQuantity() {
        this.quantity++;
    }

    public String toString() {
        return this.product + ": " + this.quantity;
    }
}
