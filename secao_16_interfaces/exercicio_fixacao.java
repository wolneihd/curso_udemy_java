package secao_16_interfaces;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import secao_16_interfaces.models.Contract;
import secao_16_interfaces.models.Installment;
import secao_16_interfaces.services.ContractService;
import secao_16_interfaces.services.PaypalService;

public class exercicio_fixacao {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Data: ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalvalue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalvalue);

        System.out.print("Entre o número de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(obj, n);

        System.out.println("PARCELAS:");
        for (Installment installment : obj.getInstallments()) {
            System.out.println(installment.toString());
        }

        System.out.println();

        sc.close();
    }
}
