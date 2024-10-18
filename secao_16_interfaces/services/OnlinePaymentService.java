package secao_16_interfaces.services;

public interface OnlinePaymentService {
    
    public double paymentFee(double amount);

    public double interest(double amount, int months);

}
