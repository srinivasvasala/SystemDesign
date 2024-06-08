package org.srinivas.AbstractFactory;

public interface ThemeFactory{
    Button createButton(Double border,Double radius,Double length);
    Radio createRadio();
}
