package entities;

public class Product {
    private String name;
    private double price;
    private int quantity;

    // Overload:
    public Product() {

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulamento:
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Métodos:
    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public String priceTag(){
        return String.format("%s $ %.2f", getName(), getPrice());
    }

    @Override
    public String toString() {
        return String.format("Product data: %s, %.2f, %d units, Total: %.2f", getName(), getPrice(), getQuantity(), totalValueInStock());
    }
}
