package secao_13_heranca_polimorfismo.entidades;

public final class SavingsAccount extends Account {
    
    // Aula 133: "final" inibe que seja criado uma classe ou método abaixo dela.

    private Double interestRate;

    public SavingsAccount() {}

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return this.interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        this.balance += this.balance * this.interestRate; 
    }

    @Override
    public final void withdraw(double amount) {
        this.balance -= amount;
    }
}
