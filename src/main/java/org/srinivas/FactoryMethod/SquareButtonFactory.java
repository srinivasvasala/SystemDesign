package org.srinivas.FactoryMethod;

import org.srinivas.SimpleFactory.Button;
import org.srinivas.SimpleFactory.SquareButton;

public class SquareButtonFactory implements ButtonFactory{
    @Override
    public Button createButton(Double border, Double radius, Double length) {
        return new SquareButton(border, length);
    }
}
