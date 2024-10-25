package design_patterns.PaymentAdapter;

public class PaypalPayment {
    public void payPalPaymentProcess(double amount) {
        System.out.println("processing payment of $"+amount+" through PayPal");
    }
}
