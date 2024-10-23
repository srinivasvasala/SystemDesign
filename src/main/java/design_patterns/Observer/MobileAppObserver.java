package design_patterns.Observer;

public class MobileAppObserver implements Iobserver{
    @Override
    public void updateObserver(double newPrice) {
        System.out.println("Price of Mobile App is " + newPrice);
    }
}
