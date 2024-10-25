package design_patterns.PaymentAdapter;

public class StripePayment {

    public void stripePaymentProcess(double amount) {
        System.out.println("processing payment of $"+amount+" through Stripe");
    }
}
