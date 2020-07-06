package Points;
/*
Zaimplementuj klasę Point2D . Klasa powinna zawierać:
dwa pola typu foat: x , y
konstruktor bezparametrowy ustawiający wartość pól x i y na 0
konstruktor z dwoma parametrami: float x , float y
metody typu getter odpowiedzialne za zwracanie wartości zmiennej: x , y
metodę getXY zwracającą współrzędne x i y w postaci tablicy
dwuelementowej
metody typu setter odpowiedzialne za ustawianie wartości pól x , y
metodę setXY ustawiającą współrzędne x i y
metoda toString powinna zwracać łańcuch tekstowy o następującym
formacie: (x, y) ;
 */


public class Point2D {

    private float x;
    private float y;



    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){

        return new float[]{x,y};
    }
    public void setXY(float x, float y){
        this.x =x;
        this.y=y;
    }

    @Override
    public String toString() {
        return '('+x+", "+y+')';
    }


}
