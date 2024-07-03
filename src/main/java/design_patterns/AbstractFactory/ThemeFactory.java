package design_patterns.AbstractFactory;

public interface ThemeFactory{
    Button createButton(Double border,Double radius,Double length);
    Radio createRadio();
}
