package org.srinivas.AbstractFactory;

public class DarkButton extends Button{
    private Double radius;
    public DarkButton(Double radius,Double border){
        super(border);
        this.radius=radius;
    }
    @Override
    public void render() {
        System.out.println("DarkButton Rendered!");
    }

    @Override
    public void onClick() {
        System.out.println("DarkButton was Clicked!");
    }
}
