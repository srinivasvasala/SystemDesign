package design_patterns.adapter.design_pattern.External;

public class CashFreeApi {
    public String makeLink(){
        return "CashFreeApi";
    }
    public void pay(String customerEmail, int amount){
        System.out.println("Paying CashFreeApi");
    }
    public CashFreeStatus checkStatus(){
        return CashFreeStatus.COMPLEATED;
    }

}
