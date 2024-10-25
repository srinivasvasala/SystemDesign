package design_patterns.PaymentAdapter;

public class StripeAdapter implements PaymentGateway {
    private StripePayment stripePayment;

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }
    @Override
    public void paymentProcess(double amount) {
        stripePayment.stripePaymentProcess(amount);
    }
}
