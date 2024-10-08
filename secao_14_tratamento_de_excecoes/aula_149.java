import java.util.Scanner;

import model.entities.ReservationRefactor01;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class aula_149 {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("\nDigite o n° do quarto: ");
        int number = sc.nextInt();
        System.out.print("\nDigite a data de check-in (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("\nDigite a data de check-out (dd/MM/yyyy): ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: Checkout deve ser uma data posterior a data de check-in!");
        } else {
            ReservationRefactor01 reserva = new ReservationRefactor01(number, checkIn, checkOut);
            System.out.println(reserva.toString());

            System.out.println();
            System.out.println("Entre os novos dados da reserva: ");
            System.out.print("\nDigite a data de check-in (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("\nDigite a data de check-out (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            String error = reserva.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println(error);
            } else {
                System.out.println(reserva.toString());
            }
        }
        sc.close();
    }
}
