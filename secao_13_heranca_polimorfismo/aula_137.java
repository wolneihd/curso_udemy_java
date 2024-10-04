package secao_13_heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;

import secao_13_heranca_polimorfismo.entidades.Account;
import secao_13_heranca_polimorfismo.entidades.BusinessAccount;
import secao_13_heranca_polimorfismo.entidades.SavingsAccount;

public class aula_137 {
    public static void main(String[] args) {

        List<Account> list = new ArrayList<>();

        list.add(new BusinessAccount(1001, "Alex", 500.00, 100.0));
        list.add(new SavingsAccount(1002, "Maria", 500.00, 0.01));
        list.add(new BusinessAccount(1004, "José", 1000.00, 0.01));
        list.add(new SavingsAccount(1002, "Anna", 1500.00, 0.05));

        double sum = 0.0;
        for (Account conta : list) {
            sum += conta.getBalance();
        }

        System.out.printf("\nTotal balance: R$ %.2f",sum);
 
    }
}
