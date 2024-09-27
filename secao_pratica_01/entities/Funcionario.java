package secao_pratica_01.entities;

import secao_pratica_01.enums.Cargo;

public class Funcionario {
    
    private int id;
    private String nome;
    private double salario;
    private Cargo cargo;

    public Funcionario() {}

    public Funcionario(int id, String nome, double salario, Cargo cargo) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Cargo getCargo() {
        return this.cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }   

    public void atualizarSalario(double novoSalario) {
        this.salario = novoSalario;
    }
}
