package secao_08_POO;

import java.util.Scanner;
import secao_08_POO.entities.Funcionario;

public class exercicio_02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        funcionario.name = "Joao Silva";
        funcionario.grossSalary = 6000.00;
        funcionario.tax = 1000.00;

        System.out.printf("\nO colaborador %s tem salário liquído de %.2f", funcionario.name, funcionario.netSalary());

        System.out.print("\nDigite a % do novo salário: ");
        double porcentage = sc.nextDouble();
        funcionario.increaseSalary(porcentage);

        System.out.printf("\nO colaborador %s teve salário liquído atualizado para %.2f", funcionario.name, funcionario.grossSalary);

        sc.close();
    }
    
}
