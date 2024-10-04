package secao_13_heranca_polimorfismo;

import java.util.ArrayList;
import java.util.List;

import secao_13_heranca_polimorfismo.entidades.Company;
import secao_13_heranca_polimorfismo.entidades.Individual;
import secao_13_heranca_polimorfismo.entidades.TaxPayer;

public class exercicio_fixacao {
    public static void main(String[] args) {
        
        List<TaxPayer> contribuintes = new ArrayList<>();

        TaxPayer pagantePF = new Individual("Wolnei", 50000.0, 2000.0);
        TaxPayer pagantePJ = new Company("T-Systems", 400000.0, 25);

        contribuintes.add(pagantePF);
        contribuintes.add(pagantePJ);

        for (TaxPayer contribuinte: contribuintes) {
            System.out.printf("\nTotal de impostos: %.2f", contribuinte.tax());
        }

    }
}
