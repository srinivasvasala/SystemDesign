package design_patterns.adapter.design_pattern.External;

public class RazorPayApi {
    public String makeLink(){
        return "RazorPay";
    }
    public void prePay(){
        System.out.println("RazorPay Payment");
    }
    public void pay(String customerName, int amount){
        System.out.println("RazorPay Payment"+customerName+":"+amount);
    }
    public RazorPayStatus checkStatus(){
        return RazorPayStatus.PASS;
    }
}
