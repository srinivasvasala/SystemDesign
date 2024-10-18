package design_patterns.adapter.design_pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentRequest {
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private int amount;
}
