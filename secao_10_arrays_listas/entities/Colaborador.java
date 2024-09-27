package secao_10_arrays_listas.entities;

public class Colaborador {
    
    private int id;
    private String name;
    private double salary;

    public Colaborador(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "dados - id: " + this.id + " | nome: " + this.name + " | salário: " + this.salary;  
	}
}
