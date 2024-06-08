package org.srinivas.AbstractFactory;

public class DarkThemeFactory implements ThemeFactory{
    @Override
    public Button createButton(Double border, Double radius, Double length) {
        return new DarkButton(border,radius);
    }

    @Override
    public Radio createRadio() {
        return new DarkRadio();
    }
}
