package secao_13_heranca_polimorfismo.entidades;

public abstract class TaxPayer {
    
    private String nome;
    private Double anualIncome;

    public TaxPayer() { }

    public TaxPayer(String nome, Double anualIncome) {
        this.nome = nome;
        this.anualIncome = anualIncome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getAnualIncome() {
        return this.anualIncome;
    }

    public void setAnualIncome(Double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract double tax();
}
