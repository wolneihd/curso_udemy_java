package secao_17_generic_set_map;

import java.util.Scanner;

import secao_17_generic_set_map.services.PrintService;

public class aula_129 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.println("How many values?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        sc.close();
    }   

}
