package Zad6;
/*
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie. Dodatkowo
uwzględnij w przykładzie reprezentację polimor zmu
 */

public class MoveShapesTest {

    public static void main(String[] args) {

        Movable point = new MovablePoint(2, 5, 3, 3);
        Movable circle = new MovableCircle((MovablePoint) point, 5);
        System.out.println(point);
        point.moveLeft();
        point.moveUp();
        System.out.println(point);
        System.out.println(circle);
        circle.moveDown();
        circle.moveRight();
        System.out.println(circle);


    }

}
