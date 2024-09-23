package secao_09_construtores_this;

import secao_09_construtores_this.entities.Banco;

public class exercicio {
    public static void main(String[] args) {
        
        // EXEMPLO 01
        Banco cliente01 = new Banco(8532, "Alex Green", 500);

        System.out.printf("\nConta Criada para %s de número %d com valor inicial de %.2f", cliente01.getNomeCliente(), cliente01.getNumeroConta(), cliente01.getSaldoConta());

        // depósito de R$ 200.00
        cliente01.deposito(200.00);
        System.out.printf("\nConta atualizada para %s de número %d com saldo inicial de %.2f", cliente01.getNomeCliente(), cliente01.getNumeroConta(), cliente01.getSaldoConta());

        // saque de R$ 300.00
        cliente01.saque(300.00);
        System.out.printf("\nConta atualizada para %s de número %d com saldo de %.2f", cliente01.getNomeCliente(), cliente01.getNumeroConta(), cliente01.getSaldoConta());

        // EXEMPLO 01
        Banco cliente02 = new Banco(7801, "Maria Brown", 0);

        System.out.printf("\nConta Criada para %s de número %d com valor inicial de %.2f", cliente02.getNomeCliente(), cliente02.getNumeroConta(), cliente02.getSaldoConta());

        // depósito de R$ 200.00
        cliente02.deposito(200.00);
        System.out.printf("\nConta atualizada para %s de número %d com saldo de %.2f", cliente02.getNomeCliente(), cliente02.getNumeroConta(), cliente02.getSaldoConta());

        // saque de R$ 198.00
        cliente02.saque(198.00);
        System.out.printf("\nConta atualizada para %s de número %d com saldo de %.2f", cliente02.getNomeCliente(), cliente02.getNumeroConta(), cliente02.getSaldoConta());
    }   
}
