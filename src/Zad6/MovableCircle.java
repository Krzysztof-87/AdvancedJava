package Zad6;
/*
Klasa MovableCircle
Klasa MovableCircle powinna implementować interfejs Movable , a ponadto
powinna zawierać (na zasadzie kompozycji) instancję klasy MovablePoint .
Dodatkowo powinna zawierać pole niezbędne do określenia promienia koła.
metody moveUp() oraz moveDown() powinny każdorazowo
zwiększać/zmniejszać wartość współrzędnej y punktu MovablePoint o
wskazaną w nim wartość: ySpeed
metody moveLeft oraz moveRight() powinny każdorazowo
zwiększać/zmniejszać wartość współrzędnej x punktu MovablePoint o
wskazaną w nim wartość: xSpeed
 */

public class MovableCircle implements Movable {

    private  MovablePoint movablePoint;
    private int radius;

    public MovableCircle(MovablePoint movablePoint, int radius) {
        this.movablePoint = movablePoint;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        movablePoint.setY(movablePoint.getY()+movablePoint.getySpeed());

    }

    @Override
    public void moveDown() {
        movablePoint.setY(movablePoint.getY()-movablePoint.getySpeed());

    }

    @Override
    public void moveLeft() {
        movablePoint.setX(movablePoint.getX()-movablePoint.getxSpeed());

    }

    @Override
    public void moveRight() {
        movablePoint.setX(movablePoint.getX()+movablePoint.getxSpeed());

    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "movablePoint=" + movablePoint +
                ", radius=" + radius +
                '}';
    }
}
