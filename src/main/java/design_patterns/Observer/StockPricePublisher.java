package design_patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockPricePublisher {

    private List<Iobserver> observers = new ArrayList<>();
    private double price;

    public void subscribe(Iobserver observer){
        observers.add(observer);
    }
    public void unsubscribe(Iobserver observer){
        observers.remove(observer);
    }
    public void setPrice(double newPrice){
        this.price = newPrice;
        updateObserver(newPrice);
    }
    public void updateObserver(double newPrice){
        for (Iobserver iobserver:observers){
            iobserver.updateObserver(newPrice);
        }
    }
}
