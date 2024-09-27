package secao_pratica_01.entities;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    
    // atributos:
    private String nome;

    // atributos classe com relação:
    private Endereco endereco; // 1 x 1
    private List<Funcionario> funcionarios = new ArrayList<>(); // 1 x n 

    public Empresa() {}

    public Empresa(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Funcionario> getFuncionarios() {
        return this.funcionarios;
    }

    // métodos da classe:

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(int id) {
        funcionarios.removeIf(f -> f.getId() == id);
    }

    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            System.out.printf("\nid: %d | nome: %s | salario: %.2f | cargo: %s", f.getId(), f.getNome(), f.getSalario(), f.getCargo());
        }
    }

    public void atualizarSalarioFuncionario(int id, double novoSalario) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                f.atualizarSalario(novoSalario);
                System.out.printf("\nSalário do funcionário %s atualizado para %.2f\n", f.getNome(), novoSalario);
                return;
            }
        }
        System.out.println("Funcionário com ID " + id + " não encontrado.");
    }
}
