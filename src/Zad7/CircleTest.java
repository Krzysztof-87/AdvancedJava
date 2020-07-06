package Zad7;

public class CircleTest {

    public static void main(String[] args) {

        ResizableCircle resizableCircle = new ResizableCircle(25);
        System.out.println(resizableCircle.getArea());
        System.out.println(resizableCircle.getPerimeter());
        resizableCircle.resize(10);
        System.out.println(resizableCircle);



    }
}
