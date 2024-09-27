package secao_10_arrays_listas;

import java.util.Scanner;

import secao_10_arrays_listas.entities.Inquilino;

public class exercicio_02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Inquilino[] quarto = new Inquilino[10];

        int novaReserva;
        String nome;
        String email;
        int sair = 0;

        while (sair == 0) {
            System.out.print("\nDigite o quarto a reservar: ");
            novaReserva = sc.nextInt();

            if (novaReserva >= 0 && novaReserva <= 10) {
                sc.nextLine();
                System.out.printf("\nDigite o nome do Inquilino do quarto %d: ", novaReserva);
                nome = sc.nextLine();
                System.out.printf("\nDigite o e-mail do Inquilino do quarto %d: ", novaReserva);
                email = sc.nextLine();
                quarto[novaReserva] = new Inquilino(nome,email);
            }           

            for (int i = 0; i < quarto.length; i++) {
                if (quarto[i] != null) {
                    System.out.printf("\nQuarto: %d | nome: %s | email: %s", i, quarto[i].getName(), quarto[i].getEmail());
                }                
            }

            System.out.print("\nDeseja sair? [1] sim - [0] não ");
            sair = sc.nextInt();    
      
        }
        sc.close();
    }
}
