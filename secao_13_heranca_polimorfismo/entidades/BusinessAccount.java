package secao_13_heranca_polimorfismo.entidades;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }
    
    public Double getLoanLimit() {
        return this.loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount) {
        if (amount <= loanLimit) {
            this.balance += amount - 10.0;            
        }
    }
    
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount); // desconta R$ 5,00 (método da classe pai)
        this.balance -= 2.0;    // desconta R$ 2,00
    }
}
