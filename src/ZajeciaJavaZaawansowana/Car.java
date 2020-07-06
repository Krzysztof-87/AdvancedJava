package ZajeciaJavaZaawansowana;
/*
Stwórz klasę typu Car. Obiekty typu Car mają mieć dwie cechy - marka i przebieg.
Stwórz również pole informujące o tym przy jakim przebiegu powinniśmy zrobić przegląd. W klasie do testów (np. CarDemo) przygotuj metodę main, a w niej stwórz dwa obiekty typu Car.

Dla obiektów typu Car przygotuj następujące funkcjonalności oraz przetestuj je w main:

Stwórz metodę wyświetlającą markę samochodu oraz przebieg
Stwórz metodę przyjmującą odległość do przejechania i zwiększającą przebieg samochodu o tę odległość
Stwórz metodę zwracającą ilość kilometrów jakie można przejechać przed zrobieniem przeglądu

zad2

Zadbaj o dobre praktyki projektowania obiektów, ustaw pola jako prywatne i dawaj do nich dostęp za pomocą getterów i
 setterów tylko jeśli jest to konieczne. Zamień metodę wyświetlającą na przysłoniętą metodę toString().
Przygotuj dwa konstruktory. Pierwszy pozwalający stworzyć domyślny samochód bez przekazywania żadnych parametrów
np. “Fiat 126p przebieg 300 000tyś”. Drugi konstruktor pozwalający ustawić dowolną markę i przebieg.


 */

public class Car {

    private String mark;
    private int mileage;
    final int WhenInspection=1500;

    public Car(String mark, int mileage) {
        this.mark = mark;
        this.mileage = mileage;
    }

    public Car() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", mileage=" + mileage +
                '}';
    }

    public void distanceToMake(int distance){
        mileage+=distance;
    }

    public int howLongToInspection(){
        return WhenInspection-mileage;
    }
}
