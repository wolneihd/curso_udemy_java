package secao_13_heranca_polimorfismo.entidades;

public final class OutsourcedEmployee extends Employee {
    
    private double additionalCharge;

    public OutsourcedEmployee() { }

    public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return this.additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }    

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    } 
}