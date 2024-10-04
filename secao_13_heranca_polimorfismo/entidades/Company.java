package secao_13_heranca_polimorfismo.entidades;

public class Company extends TaxPayer{

    private int numberOfEmployees;

    public Company() { }

    public Company(String nome, Double anualIncome, int numberOfEmployees) {
        super(nome, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double taxaImposto = 0.16;
        if (this.numberOfEmployees > 10 ) {
            taxaImposto = 0.14;
        }
        return this.getAnualIncome() * taxaImposto;
    }
    
}
