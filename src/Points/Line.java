package Points;
/*
Zaimplementuj klasę Line , która będzie zawierać (na zasadzie kompozycji)
instancję dwóch obiektów Point2D z zadania nr 1. Punkty te będą punktem
początkowym oraz końcowym odcinka. Ponadto klasa ta powinna
implementować:
konstruktor przyjmujący dwa punkty: początkowy i końcowykonstruktor przyjmujący 4 parametry: współrzędne punktu początkowego
oraz końcowego
metody typu getter odpowiedzialne za zwracanie punktów: początkowego
i końcowego
metody typu setter odpowiedzialne za ustalanie punktów: początkowego i
końcowego
metodę odpowiedzialną za obliczanie długości linii na podstawie
ustawionych punktów
metodę odpowiedzialną za zwracanie współrzędnych punktu będącego
środkiem stworzonej prostej
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie
 */

public class Line {

    private Point2D p1;
    private Point2D p2;

    public Line(Point2D p1, Point2D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(float p1X, float p1Y, float p2X, float p2Y){
        this.p1=new Point2D(p1X, p1Y);
        this.p2=new Point2D(p2X,p2Y);
    }

    public Point2D getP1() {
        return p1;
    }

    public Point2D getP2() {
        return p2;
    }

    public void setP1(Point2D p1) {
        this.p1 = p1;
    }

    public void setP2(Point2D p2) {
        this.p2 = p2;
    }

    public float lineLength(){
        float a = Math.abs(p2.getX()-p1.getX());
        float b = Math.abs(p2.getY()-p1.getY());

         return  (float)Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));

    }

    public void lineCenter(){
        float x = (p1.getX()+p2.getX())/2;
        float y = (p1.getY()+p2.getY())/2;
        System.out.println("srodek to ("+x+", "+y+" )");
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }
}
