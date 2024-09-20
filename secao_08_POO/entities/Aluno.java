package secao_08_POO.entities;

public class Aluno {
    
    public double nota01;
    public double nota02;
    public double nota03;

    public String mostrarMedia(double nota01, double nota02, double nota03) {
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.nota03 = nota03;
        double media = this.nota01 + this.nota02 + this.nota03;
        if (media > 60) {
            return "\nPASS";
        } else {
            return "\nFAILED. \nMISSING " + (60 - media) + " POINTS";
        }
    }

}
