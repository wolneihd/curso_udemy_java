package secao_pratica_01.entities;

public class Endereco {
    
    private String rua;
    private int numero;
    private String cidade;
    private String estado;    
    
    public Endereco() {}

    public Endereco(String rua, int numero, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // método da classe:

    public void mostrarEndereco() {
        System.out.printf("\nEndereço: %s n° %d - %s %s", this.rua, this.numero, this.cidade, this.estado); 
    } 

}
