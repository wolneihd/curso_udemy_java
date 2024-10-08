package model.entities;

import model.exceptions.AccountException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() { }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return this.balance;
    }

    public Double getWithdrawLimit() {
        return this.withdrawLimit;
    }

    public void withdraw(Double amount) {
        if (this.balance < amount ) {
            throw new AccountException("Sem saldo em conta para saque.");
        } 
        if (this.withdrawLimit < amount) {
            throw new AccountException("Sem limite para saque - limite de R$ " + this.getWithdrawLimit());
        }
        this.balance -= amount;
    }

    public void deposito(Double amount) {
        this.balance += amount; 
    }

    @Override
    public String toString() {
        return "Saldo atual: " + this.balance;
    }

}
