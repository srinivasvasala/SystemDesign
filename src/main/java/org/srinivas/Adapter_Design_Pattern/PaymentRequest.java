package org.srinivas.Adapter_Design_Pattern;

import lombok.Getter;

@Getter
public class PaymentRequest {
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private int amount;
}
