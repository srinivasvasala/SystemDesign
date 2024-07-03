package design_patterns.AbstractFactory;

public class LightButton extends Button{
    private Double length;
    public LightButton(Double border,Double length){
        super(border);
        this.length=length;
    }
    @Override
    public void render() {
        System.out.println("BTN rendered!");
    }

    @Override
    public void onClick() {
        System.out.println("Button was Clicked!");
    }
}
