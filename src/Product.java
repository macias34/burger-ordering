public class Product {
    private String type;
    private double price;

    public Product(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public double getPrice(int quantity) {
        return price * quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}