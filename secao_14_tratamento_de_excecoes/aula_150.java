import java.util.Scanner;

import model.entities.ReservationRefactor02;
import model.exceptions.DomainException;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class aula_150 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");         
        
        try {

            System.out.print("\nDigite o n° do quarto: ");
            int number = sc.nextInt();
            System.out.print("\nDigite a data de check-in (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("\nDigite a data de check-out (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            ReservationRefactor02 reserva = new ReservationRefactor02(number, checkIn, checkOut);        
            System.out.println(reserva.toString());

            System.out.println();
            System.out.println("Entre os novos dados da reserva: ");
            System.out.print("\nDigite a data de check-in (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("\nDigite a data de check-out (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reserva.updateDates(checkIn, checkOut);
            reserva.toString();

        } catch (ParseException e) {
            System.out.println("Data inválida: " + e);
        } catch (DomainException e) {
            System.out.println("Erro na reserva: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado!");
        }

        sc.close();
    }
}