package design_patterns.FactoryMethod;

import design_patterns.SimpleFactory.Button;
import design_patterns.SimpleFactory.SquareButton;

public class SquareButtonFactory implements ButtonFactory{
    @Override
    public Button createButton(Double border, Double radius, Double length) {
        return new SquareButton(border, length);
    }
}
