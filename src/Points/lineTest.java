package Points;


public class lineTest {


    public static void main(String[] args) {

        Point2D p1 = new Point2D(5, 10);
        Point2D p2 = new Point2D(9, 15);
        Line line = new Line(p1, p2);
        System.out.println(line.lineLength());
        line.lineCenter();
    }
}
