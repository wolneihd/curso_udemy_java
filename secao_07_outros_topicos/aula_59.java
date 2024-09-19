package secao_07_outros_topicos;

public class aula_59 {
    public static void main(String[] args) {
        
    String original = "asdfas GSDFASDF ASDFAS asdfsad     ";

    String s01 = original.toLowerCase();
    String s02 = original.toUpperCase();
    String s03 = original.trim();
    String s04 = original.substring(2);
    String s05 = original.substring(2,9);
    String s06 = original.replace('a', 'x');
    int i = original.indexOf("df");
    int j = original.lastIndexOf("df");

    System.out.println("\n Original: " + original);
    System.out.println("\n toLowerCase: " + s01);
    System.out.println("\n toUpperCase: " + s02);
    System.out.println("\n trim: " + s03);
    System.out.println("\n substring: " + s04);
    System.out.println("\n substring: " + s05);
    System.out.println("\n replace: " + s06);
    System.out.println("\n indexOf: " + i);
    System.out.println("\n lastIndexOf: " + j);

    String s = "potato apple lemon";
    String[] vect = s.split(" ");
    String word1 = vect[0];
    String word2 = vect[1];
    String word3 = vect[2];

    System.out.println("\n Word1: " + word1);    
    System.out.println("\n Word2: " + word2);    
    System.out.println("\n Word3: " + word3);    

    }
}