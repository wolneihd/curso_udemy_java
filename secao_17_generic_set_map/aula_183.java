package secao_17_generic_set_map;

import secao_17_generic_set_map.entities.Cliente;

public class aula_183 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Wolnei", "teste@teste.com.br");
        Cliente c2 = new Cliente("Maria", "maria@maria.com.br");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
    }
}
