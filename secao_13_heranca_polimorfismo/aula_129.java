package secao_13_heranca_polimorfismo;

import secao_13_heranca_polimorfismo.entidades.Account;
import secao_13_heranca_polimorfismo.entidades.BusinessAccount;
import secao_13_heranca_polimorfismo.entidades.SavingsAccount;

public class aula_129 {
    public static void main(String[] args) {
        
        Account contaPessoal = new Account(1001, "Wolnei", 0.0);
        BusinessAccount contaEmpresarial = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account conta01 = contaEmpresarial;
        Account conta02 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account conta03 = new SavingsAccount(1004, "Ana", 0.0, 0.1);

        System.out.println(contaPessoal.toString() + conta01.toString());

        // DOWNCASTING
        BusinessAccount conta04 = (BusinessAccount)conta02;
        conta04.loan(200.00);

        if (conta03 instanceof BusinessAccount) {
            BusinessAccount conta05 = (BusinessAccount) conta03;
            conta05.loan(200.0);
            System.out.println("Empréstimo!");
        }

        if (conta03 instanceof SavingsAccount) {
            SavingsAccount conta05 = (SavingsAccount) conta03;
            conta05.updateBalance();
            System.out.println("Conta atualizada!");
        }
    }
}
