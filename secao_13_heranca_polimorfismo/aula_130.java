package secao_13_heranca_polimorfismo;

import secao_13_heranca_polimorfismo.entidades.Account;
import secao_13_heranca_polimorfismo.entidades.BusinessAccount;
import secao_13_heranca_polimorfismo.entidades.SavingsAccount;

public class aula_130 {
    public static void main(String[] args) {
        
        Account conta01 = new Account(1001, "Alex", 1000.0);
        conta01.withdraw(200.0);
        System.out.println(conta01.getBalance());

        Account conta02 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        conta02.withdraw(200.0);
        System.out.println(conta02.getBalance());

        Account conta03 = new BusinessAccount(1002, "Maria", 1000.0, 200.0);
        conta03.withdraw(200.0);
        System.out.println(conta03.getBalance());
        
    }
}
