package secao_18_funcional_lambda;

import java.util.Arrays;
import java.util.List;

public class aula_201 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,10,7);
        System.out.println("Lista: " + list);

        int sum = list.stream().reduce(0, (x,y) -> x+y);
        System.out.println(sum);

        List<Integer> newList = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println("Lista: " + newList);
    }
}
