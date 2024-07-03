package design_patterns.SimpleFactory;

public class ButtonFactory {
    //create static factory method
    public static Button createButton(ScreenSize screenSize,Double border,Double radius,Double length){
        switch (screenSize){
            case DESKTOP : return new SquareButton(border,length);
            case TABLET :return new RoundButton(border, radius);
            case PHONE :
        }
        throw new IllegalArgumentException("Invalid type: "+ screenSize);
    }
}
