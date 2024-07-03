package design_patterns.SimpleFactory;

import lombok.Getter;

// step 2 create concrete classes
@Getter
public class SquareButton extends Button{
    private Double length;

    public SquareButton(Double border,Double length){
        super(border);
        this.length = length;
    }

    @Override
    public void render() {
        System.out.println("Square btn Rendered!");
    }

    @Override
    public void onClick() {
        System.out.println("Square Btn was Clicked!");
    }
}
