package JavaZaawansowana;
/*Klasa Square
Zaimplementuj klasę Square , która będzie rozszerzać klasę Rectangle . Klasa
ta nie powinna wprowadzać nowych pól oraz funkcjonalności, ale powinna
wymuszać na klasie bazowej zachowanie kwadratu.
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie.

 */

public class Square  extends Rectangle {


    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public double getArea() {
        return getWidth()*getWidth();
    }

    @Override
    public double getPerimeter() {
        return 4*getWidth();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
