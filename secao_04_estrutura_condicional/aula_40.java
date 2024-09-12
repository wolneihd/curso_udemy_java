package secao_04_estrutura_condicional;

public class aula_40 {
    public static void main(String[] args) {
        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println("\nDesconto de: " + desconto);
    }
}
