package design_patterns.adapter.design_pattern;

import design_patterns.adapter.design_pattern.External.CashFreeApi;
import design_patterns.adapter.design_pattern.External.CashFreeStatus;

public class CashFreeProvider implements PaymentProviderInterface{
    private final CashFreeApi cashFreeApi=new CashFreeApi();
    @Override
    public String generateLink() {
        return cashFreeApi.makeLink();
    }

    @Override
    public void pay(PaymentRequest paymentRequest) {
        cashFreeApi.pay(paymentRequest.getCustomerEmail(), paymentRequest.getAmount());
    }

    @Override
    public PaymentStatus checkStatus() {
        CashFreeStatus status = cashFreeApi.checkStatus();
        return toPayment(status);
    }
    public PaymentStatus toPayment(CashFreeStatus status) {
        if(status==CashFreeStatus.COMPLEATED){
            return PaymentStatus.SUCCESS;
        }
        return PaymentStatus.FAILURE;
    }
}
