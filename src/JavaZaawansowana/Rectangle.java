package JavaZaawansowana;
/*Klasa Rectangle
Zaimplementuj klasę Rectangle , która będzie rozszerzać klasę Shape o
następujące cechy:
pole szerokość oraz długość będące typem double
konstruktor bezparametrowy ustawiający wartość pola color na unknown i
isFilled na false oraz pola width i length na 1
konstruktor przyjmujący parametry color , isFilled , width i length
metody typu getter do zwracania wartości pól width , length
metody typu setter do ustawiania wartości pól width i length
metodę getArea odpowiedzialną za obliczanie pola powierzchni
metodę getPerimeter odpowiedzialną za obliczanie obwodu
nadpisaną metodę toString odpowiedzialną za wyświetlanie następującej
informacji: Rectangle with width=? and length=? which is a subclass
off y , gdzie ? oznacza wartość odpowiednio szerokości i długości, awartość y powinna być rezultatem wywołania metody toString z klasy
bazowej
 */

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        String result = super.toString();
        return "rectangle with width="+width+" and length="+length+" which is a subclass of "+result;
    }
}
