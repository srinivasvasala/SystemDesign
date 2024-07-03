package design_patterns.FactoryMethod;

import design_patterns.SimpleFactory.Button;

public interface ButtonFactory {
    //step 3 Button method
    Button createButton(Double border, Double radius, Double length);
}
