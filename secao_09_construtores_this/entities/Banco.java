package secao_09_construtores_this.entities;

public class Banco {
    
    /**
     * informar:
     *  numero da conta
     *  nome do titular
     *  valor do depósito inicial ao abrir a conta
     *      caso não informado, é zero.
     * 
     * numero da conta nunca poderá ser atualizado. okay
     * nome pode ser alterado okay
     * saldo não pode ser atualizado livremente
     * valor por saque: R$ 5.00
     */

    private int numeroConta;
    private String nomeCliente;
    private double saldoConta;

    // Construtor caso tenha depósito na abertura
    public Banco(int numeroConta, String nomeCliente, double saldoConta) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.saldoConta = saldoConta;
    }

    // Construtor caso NÃO tenha depósito na abertura
    public Banco(int numeroConta, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
    }

    // GET & SETTERS
    public int getNumeroConta() {
        return this.numeroConta;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldoConta() {
        return this.saldoConta;
    }

    // DEMAIS MÉTODOS:
    public void deposito(double valor) {
        this.saldoConta += valor;
    }

    public void saque(double valor) {
        this.saldoConta -= valor + 5.00;
    }
}
