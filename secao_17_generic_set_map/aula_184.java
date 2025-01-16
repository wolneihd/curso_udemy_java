package secao_17_generic_set_map;

import java.util.LinkedHashSet;
import java.util.Set;

public class aula_184 {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(set);
    }
}
