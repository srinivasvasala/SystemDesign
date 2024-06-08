package org.srinivas.FactoryMethod;

import org.srinivas.SimpleFactory.Button;

public class RoundButtonFactory implements ButtonFactory{
    @Override
    public Button createButton(Double border, Double radius, Double length) {
        return new RoundButton(border, radius);
    }
}
