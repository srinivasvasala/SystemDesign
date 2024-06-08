package org.srinivas.FactoryMethod;

import org.srinivas.SimpleFactory.Button;

public interface ButtonFactory {
    //step 3 Button method
    Button createButton(Double border, Double radius, Double length);
}
