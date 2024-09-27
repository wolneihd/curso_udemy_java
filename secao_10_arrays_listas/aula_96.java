package secao_10_arrays_listas;

public class aula_96 {
    public static void main(String[] args) {
        
        /**
         * Wrapper Classes:
         * double - (d) não aceita valores null
         * Double - (D) aceite valores null
         */
        int x = 20;
        Object obj = x;
        System.out.println(obj);

        int y = (int) obj;
        System.out.println(y);

    }
}
