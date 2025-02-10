package secao_18_funcional_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class aula_200 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,4,5,10,7);
        System.out.println("Lista: " + list);
        
        Stream<Integer> str1 = list.stream().map(x -> x * 10);
        System.out.println("Stream: " + Arrays.toString(str1.toArray()));

        Stream<String> str2 = Stream.of("Maria","Alex","Bob");
        System.out.println(Arrays.toString(str2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x +2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        Stream<Integer> st4 = Stream.iterate(0, x -> x +2);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

        Stream<Long> fibonacci = Stream.iterate(new Long[] {0L, 1L}, p -> new Long[] {p[1], p[0]+p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(fibonacci.limit(10).toArray()));
    }
}
