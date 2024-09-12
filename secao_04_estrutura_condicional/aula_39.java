package secao_04_estrutura_condicional;

import java.util.Scanner;

public class aula_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia = sc.nextInt();
        
        switch (dia) {
            case 1:
                System.out.printf("O dia n° %d é domingo.", dia);
                break;
            case 2:
                System.out.printf("O dia n° %d é segunda-feira.", dia);
                break;
            case 3:
                System.out.printf("O dia n° %d é terça-feira.", dia);
                break;
            case 4:
                System.out.printf("O dia n° %d é quarta-feira.", dia);
                break;
            case 5:
                System.out.printf("O dia n° %d é quinta-feira.", dia);
                break;
            case 6:
                System.out.printf("O dia n° %d é sexta-feira.", dia);
                break;
            case 7:
                System.out.printf("O dia n° %d é sábado.", dia);
                break;        
            default:
                System.out.printf("O dia n° %d é inválido", dia);
                break;
        }
        
        sc.close();
    }
}
