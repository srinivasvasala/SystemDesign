package design_patterns.FactoryMethod;

import design_patterns.SimpleFactory.Button;

public class RoundButtonFactory implements ButtonFactory{
    @Override
    public Button createButton(Double border, Double radius, Double length) {
        return new RoundButton(border, radius);
    }
}
