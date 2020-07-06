package Zad6;
/*
Klasa MovablePoint powinna implementować interfejs Movable , a ponadto
powinna zawierać 4 pola typu int : x , y , xSpeed , ySpeed . Pola x , y powinny
defniować współrzędne punktu, natomiast pola xSpeed , ySpeed powinny
określać o ile powinny zmieniać się odpowiednie współrzędne.
metody moveUp() oraz moveDown() powinny każdorazowo
zwiększać/zmniejszać wartość współrzędnej y o wskazaną wartość:
ySpeed
metody moveLeft oraz moveRight() powinny każdorazowo
zwiększać/zmniejszać wartość współrzędnej x o wskazaną wartośćxSpeed
 */

public class MovablePoint implements Movable {

    private int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    @Override
    public void moveUp() {
        y+=ySpeed;

    }

    @Override
    public void moveDown() {
        y-=ySpeed;

    }

    @Override
    public void moveLeft() {
        x-=xSpeed;

    }

    @Override
    public void moveRight() {
        x+=xSpeed;

    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
