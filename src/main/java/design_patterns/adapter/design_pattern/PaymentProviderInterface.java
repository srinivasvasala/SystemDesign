package design_patterns.adapter.design_pattern;

//Step 1- create common adapter interface
public interface PaymentProviderInterface {
    public String generateLink();

    public void pay(PaymentRequest paymentRequest);

    public PaymentStatus checkStatus();


}
