package design_patterns.adapter.design_pattern;

import design_patterns.adapter.design_pattern.External.RazorPayApi;
import design_patterns.adapter.design_pattern.External.RazorPayStatus;

//Step-2 Create Concrete Adapter
public class RazorPayProvider implements PaymentProviderInterface{
    private final RazorPayApi razorPayAPI = new RazorPayApi();
    @Override
    public String generateLink() {
        return razorPayAPI.makeLink();
    }

    @Override
    public void pay(PaymentRequest paymentRequest) {
        razorPayAPI.prePay();
        razorPayAPI.pay(paymentRequest.getCustomerName(),paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus checkStatus() {
        RazorPayStatus status = razorPayAPI.checkStatus();
        return toPaymentStatus(status);
    }
    private PaymentStatus toPaymentStatus(RazorPayStatus status){
        if(status==RazorPayStatus.PASS){
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }
}
