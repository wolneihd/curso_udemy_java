package secao_12_enumeracao_composicao;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import secao_12_enumeracao_composicao.entities.*;
import secao_12_enumeracao_composicao.entities.enums.WorkerLevel;

public class aula_123 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("\nEntre o nome do departamento: ");
        String departmentName = sc.nextLine();
        System.out.print("\nEnter worker data:");
        System.out.print("\nNome: ");
        String workerName = sc.nextLine();
        System.out.print("\nLevel: ");
        String workerLevel = sc.nextLine();
        System.out.print("\nBase salárial: ");
        double workerSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(departmentName));

        System.out.print("\nQuantos contratos o colaborador terá? ");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++) {
            System.out.println("\nEntre com os dados do contrato " + i + ": ");
            System.out.print("\nData (DD/MM/YYYY): ");
            Date contractDate = (Date) sdf.parse(sc.next());
            System.out.print("\nValor por hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("\nQuantidade de horas: ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Entre o mês e ano para calcular o salário (MM/YYYY): ");
        String monthAndYear = sc.nextLine();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Nome: " + worker.getName());
        System.out.println("Departamento: " + worker.getDepartment().getName());
        System.out.println("Salário por " + monthAndYear + " : " + worker.income(year, month));

        sc.close();
    }
}
