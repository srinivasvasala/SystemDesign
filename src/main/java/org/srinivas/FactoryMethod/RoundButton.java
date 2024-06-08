package org.srinivas.FactoryMethod;

import lombok.Getter;
import org.srinivas.SimpleFactory.Button;

//Step 2 create the concrete product classes
@Getter
public class RoundButton extends Button {
    private final Double radius;
    public RoundButton(Double border, Double radius){
        super(border);
        this.radius=radius;
    }
    @Override
    public void render() {
        System.out.println("Round btn Rendered!");
    }
    @Override
    public void onClick() {
        System.out.println("Round Button was Clicked!");
    }
}
