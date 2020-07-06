package Points;
/*
Na podstawie klasy Point2D zaimplementuj klasę Point3D. Klasa ta powinna
rozszerzać klasę Point2D oraz dodawać następującą implementację:
pole prywatne typu oat: z
konstruktor przyjmujący wartości dla pól: x , y , z
metodę typu getter odpowiedzialną za zwracanie wartości zmiennej z
metodę getXYZ zwracającą współrzędne x , y , z w postaci tablicy
trzyelementowej
metodę typu setter odpowiedzialną za ustawianie zmiennej zmetodę setXYZ ustawiającą wartości dla zmiennych x , y , z
metoda toString powinna zwracać łańcuch tekstowy o następującym
formacie: (x, y, z) ;
Zaprezentuj zaimplementowane powyżej rozwiązanie na przykładzie
 */

public class Point3D extends Point2D {

    private float z;


    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

        public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    public void setXY(float x, float y, float z) {
        super.setXY(x, y);
        this.z =z;
    }

    @Override
    public String toString() {
        return '('+getX()+", "+getY()+", "+z+')';
    }
}
