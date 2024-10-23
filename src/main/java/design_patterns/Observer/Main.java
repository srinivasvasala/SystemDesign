package design_patterns.Observer;

public class Main {

    public static void main(String[] args) {
        StockPricePublisher publisher = new StockPricePublisher();
        MobileAppObserver mobileAppObserver = new MobileAppObserver();
        WebAppObserver webAppObserver = new WebAppObserver();
        publisher.subscribe(mobileAppObserver);
        publisher.subscribe(webAppObserver);
       // publisher.unsubscribe(webAppObserver);
        publisher.setPrice(100.0);
    }
}
