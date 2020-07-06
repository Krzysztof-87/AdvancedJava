package Zad7;
/*
Klasa ResizableCircle powinna implementować interfejs Resizable . Metoda
resize interfejsu powinna zmniejszać procentowo promień koła.
 */

public class ResizableCircle extends Circle implements Resizable {


    public ResizableCircle(int radius) {
        super(radius);
    }

    @Override
    public void resize(int percent) {
        radius-=radius*percent/100;

    }
}
