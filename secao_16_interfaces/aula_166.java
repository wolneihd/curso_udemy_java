package secao_16_interfaces;

import java.util.Locale;
import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import secao_16_interfaces.models.CarRental;
import secao_16_interfaces.models.Vehicle;
import secao_16_interfaces.services.BrazilTaxService;
import secao_16_interfaces.services.RentalService;

public class aula_166 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre os dados do aluguel");
        System.out.println("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Retirada (dd/MM/yyyy hh:mm):");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(),fmt);
        System.out.println("Retorno (dd/MM/yyyy hh:mm):");
        LocalDateTime finnish = LocalDateTime.parse(sc.nextLine(),fmt);

        CarRental cr = new CarRental(start, finnish, new Vehicle(carModel)); 

        System.out.println("Entre o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.println("Entre o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + cr.getInvoice().getTotalPayment());
        System.out.println("Pagamento Total: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
