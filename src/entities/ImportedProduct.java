package entities;

public class ImportedProduct extends Product{
    private double customsFee;

    public ImportedProduct(double customsFee) {
        this.customsFee = customsFee;
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        return String.format("%s $ %.2f (Customs fee: $ %.2f)\n", getName(), totalPrice(), getCustomsFee());
    }
}
