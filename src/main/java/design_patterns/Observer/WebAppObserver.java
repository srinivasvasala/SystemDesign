package design_patterns.Observer;

public class WebAppObserver implements Iobserver{

    @Override
    public void updateObserver(double newPrice) {
        System.out.println("WebAppObserver got new price: "+newPrice);
    }
}
