package secao_13_heranca_polimorfismo.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    
    private LocalDate manufactureDate;
    
    public UsedProduct() { }
    
    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return this.manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = this.getManufactureDate().format(formato);
        return this.getName() + " (usado) - R$ " + this.getPrice() + " - data de fabricação: " + dataFormatada;
    } 
}
