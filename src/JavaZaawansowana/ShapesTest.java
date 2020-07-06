package JavaZaawansowana;

public class ShapesTest {

    public static void main(String[] args) {
        Shape square = new Square("Red", true, 4);
        Shape rectangle = new Rectangle("Green", false, 23.5, 1);
        Shape shape = new Shape();
        String text=shape.toString();
        System.out.println(text);
        System.out.println(rectangle);
        System.out.println(((Rectangle)rectangle).getArea());
        System.out.println(((Rectangle)rectangle).getPerimeter());
        System.out.println(((Square)square).getArea());
//        Square typeSquare= (Square)square;
//        double area = typeSquare.getArea();
        System.out.println(square);

    }
}
