package entidades;

public class Produto {
    
    private String nome;
    private Double valorUnitario;
    private Integer quantidade;

    public Produto() { }

    public Produto(String nome, Double valorUnitario, Integer quantidade) {
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorUnitario() {
        return this.valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double total() {
        return this.quantidade * this.valorUnitario;
    }

    @Override
    public String toString() {
        return this.getNome() + " " + this.getValorUnitario() + " " + this.getValorUnitario();
    }
}
