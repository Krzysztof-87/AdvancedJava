package Points;

import java.util.Arrays;

public class PointTest {

    public static void main(String[] args) {


        Point3D point = new Point3D(4.5f, 2.6f, 3.3f);
        System.out.println(point);
        point.setX(7);
        System.out.println(point);

        point.setXY(3, 3, 33.3f);
        System.out.println(point);
        String text= Arrays.toString(point.getXY());
        System.out.println(text);
        float [] xyz= point.getXYZ();
        for (float v : xyz) {
            System.out.print(v+" ");
        }


    }

}
