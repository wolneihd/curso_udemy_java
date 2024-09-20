package secao_08_POO.entities;

public class CurrencyConverter {
    
    public static double convertUsdToBrl(double cotacao, double valor) {
        return (cotacao * valor) + ((cotacao * valor) * 0.06);
    }

}
