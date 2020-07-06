package JavaZaawansowana;
/*
Klasa CircleZaimplementuj klasę Circle , która będzie rozszerzać klasę Shape o
następujące cechy:
pole odpowiedzialne za przechowywanie wartości promienia
konstruktor bezparametrowy ustawiający wartość pola color na unknown i
isFilled na false oraz pola radius na 1
konstruktor przyjmujący parametry color , isFilled , radius
metodę typu getter odpowiedzialną za zwracanie wartości pola radius
metodę typu setter odpowiedzialną za ustawianie wartości pola radius
metodę getArea odpowiedzialną za obliczanie pola powierzchni
metodę getPerimeter odpowiedzialną za obliczanie obwodu
nadpisaną metodę toString odpowiedzialną za wyświetlanie następującej
informacji: Circle with radius=? which is a subclass off y , gdzie ?
oznacza wartość promienia, a wartość y powinna być rezultatem
wywołania metody toString z klasu bazowej
 */

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;

    }

    @Override
    public String toString() {
        String result = super.toString();
        return "Circle with radius= "+radius+"wich is subclass of "+result;
    }
}
