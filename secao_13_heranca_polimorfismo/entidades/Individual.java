package secao_13_heranca_polimorfismo.entidades;

public class Individual extends TaxPayer {

    private double healthExpenditures;

    public Individual() { }

    public Individual(String nome, Double anualIncome, double healthExpenditures) {
        super(nome, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return this.healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public double tax() {
        double totalTax = 0;
        if (this.getAnualIncome() < 20000.0) {
            totalTax = this.getAnualIncome() * 0.15;
        } else {
            totalTax = this.getAnualIncome() * 0.25;
        }
        double desconto = (this.healthExpenditures * 0.5);
        return totalTax - desconto;
    }
    

    
}
