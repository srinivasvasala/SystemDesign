package design_patterns.PaymentAdapter;

public class PaypalAdapter implements PaymentGateway {

    private PaypalPayment paypalPayment;
    public PaypalAdapter(PaypalPayment paypalPayment) {
        this.paypalPayment = paypalPayment;
    }
    @Override
    public void paymentProcess(double amount) {
        paypalPayment.payPalPaymentProcess(amount);

    }
}
