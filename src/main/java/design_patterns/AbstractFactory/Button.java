package design_patterns.AbstractFactory;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

//Step 1- create a common product interface
@Getter
@Setter
@AllArgsConstructor
public abstract class Button {
    private Double border;
    public abstract void render();
    public abstract void onClick();
}
