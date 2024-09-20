package secao_08_POO.entities;

public class Funcionario {
    
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double porcentage) {
        this.grossSalary += this.grossSalary * (porcentage / 100.0);
    }

}
