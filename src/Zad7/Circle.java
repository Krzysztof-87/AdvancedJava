package Zad7;
/*
Klasa Circle powinna implementować interfejs GeometricObject , a ponadto
zawierać pole: promień. Metody interfejsu GeometricObject powinny zostać
zaimplementowane zgodnie z de nicjami metematycznymi
 */

public class Circle implements GeometricObject {

    protected float radius;

    public Circle(int radius) {
        this.radius = radius;
    }


    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
