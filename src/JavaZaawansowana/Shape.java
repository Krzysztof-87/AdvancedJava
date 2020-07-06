package JavaZaawansowana;
/*
Klasa Shape
Zaimplementuj klasę Shape . Klasa powinna zawierać:
pole odpowiedzialne za przechowywanie koloru
pole odpowiedzialne za przechowywanie informacji o tym czy kolor
powinien wypełniać figurę czy nie
konstruktor bezparametrowy ustawiający wartość pola color na unknown i
isFilled na false
konstruktor przyjmujący parametry color i isFilled
metody typu getter odpowiedzialne za zwracanie wartości pól klasy
metody typu setter odpowiedzialne za ustawianie wartości pól klasy
nadpisaną metodę toString odpowiedzialną za wyświetlanie następującej
informacji: Shape with color of ? and filled/NotFilled , gdzie ?
oznacza wartość kolor, a wartość filled / not filled powinna zostać
zwracana w zależności od pola isFilled
 */


public class Shape {

    private String color;
    boolean isFilled;

    public Shape() {
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        if (isFilled) {
            return "Shape with color of " + getColor() + " is filled";
        }
        else
            return "Shape with color of " + getColor() + " is not filled";
    }

}
