package org.srinivas.Adapter_Design_Pattern;

//Step 1- create common adapter interface
public interface PaymentProviderInterface {
    public String generateLink();

    public void pay(PaymentRequest paymentRequest);

    public PaymentStatus checkStatus();


}
