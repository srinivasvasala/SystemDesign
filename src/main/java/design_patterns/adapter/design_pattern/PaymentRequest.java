package design_patterns.adapter.design_pattern;

import lombok.Getter;

@Getter
public class PaymentRequest {
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private int amount;
}
