package secao_13_heranca_polimorfismo.entidades;

public class ImportedProduct extends Product {
     
    private double customsFee;

    public ImportedProduct() { }

    public ImportedProduct(String name, Double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return this.customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return this.getName() + " - R$ " + this.totalPrice() + " - Custom fee: " + this.customsFee;
    } 

    public double totalPrice() {
        return this.getPrice() + this.customsFee;
    }
}
