package secao_13_heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import secao_13_heranca_polimorfismo.entidades.Employee;
import secao_13_heranca_polimorfismo.entidades.OutsourcedEmployee;

public class aula_135 {

    public static void main(String[] args) {
        
        List<Employee> funcionarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.printf("\nQuantidade de funcionários: ");
        int quantidadeFuncionarios = sc.nextInt();

        char resposta; 
        String nome;
        int horas;
        double valuePerHour;
        double additionalCharge;

        for (int i=1; i<=quantidadeFuncionarios; i++) {

            sc.nextLine();

            System.out.printf("\nColaborador é interno? [s]im - [n]ão: ");
            resposta = sc.next().charAt(0);

            sc.nextLine();
            System.out.printf("\nNome do colaborador: ");
            nome = sc.nextLine();

            System.out.printf("\nHoras trabalhadas: ");
            horas = sc.nextInt();

            System.out.printf("\nValor por hora: ");
            valuePerHour = sc.nextDouble();

            if (resposta == 'n') {
                System.out.printf("\nValor adicional: ");
                additionalCharge = sc.nextDouble();
                Employee emp = new OutsourcedEmployee(nome, horas, valuePerHour, additionalCharge);
                funcionarios.add(emp);
            } else {
                Employee emp = new Employee(nome, horas, valuePerHour);
                funcionarios.add(emp);
            }
        }

        for (Employee funcionario : funcionarios) {
            System.out.println("nome: " + funcionario.getName() + " pagamento: " + funcionario.payment());          
        }

        sc.close();
    }    
}
