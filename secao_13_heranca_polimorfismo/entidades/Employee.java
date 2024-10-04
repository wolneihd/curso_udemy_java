package secao_13_heranca_polimorfismo.entidades;

public class Employee {
    
    private String name;
    private Integer hours;
    private double valuePerHour;
    
    public Employee() { }    

    public Employee(String name, Integer hours, double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return this.hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double getValuePerHour() {
        return this.valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public double payment() {
        return this.valuePerHour * this.hours;
    }

}
