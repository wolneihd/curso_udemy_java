package secao_08_POO;

import secao_08_POO.entities.Aluno;

public class exercicio_03 {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();

        String aluno01 = aluno.mostrarMedia(27, 31, 32);
        System.out.println(aluno01);

        String aluno02 = aluno.mostrarMedia(17, 20, 15);
        System.out.println(aluno02);
    }
}
