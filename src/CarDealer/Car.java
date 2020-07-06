package CarDealer;
/*
Stwórz klasę typu Car. Obiekty typu Car mają mieć dwie cechy - marka i przebieg.
Stwórz również pole informujące o tym przy jakim przebiegu powinniśmy zrobić przegląd.
 W klasie do testów (np. CarDemo) przygotuj metodę main, a w niej stwórz dwa obiekty typu Car.

Dla obiektów typu Car przygotuj następujące funkcjonalności oraz przetestuj je w main:

Stwórz metodę wyświetlającą markę samochodu oraz przebieg
Stwórz metodę przyjmującą odległość do przejechania i zwiększającą przebieg samochodu o tę odległość
Stwórz metodę zwracającą ilość kilometrów jakie można przejechać przed zrobieniem przeglądu

 */

public class Car {

    private String brand;
    private int mileage;
    static int SERVICE=15000;
    private boolean service;

    public Car(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
        if (howLongToService()<0){
            this.service=true;
        }
    }

    public Car() {

    }

    public boolean isService() {
        return service;
    }

    public void setService(boolean service) {
        this.service = service;
    }

    public int getMileage() {
        return mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void addToMileage(int kmToAdd){
        mileage+=kmToAdd;

    }

    public int howLongToService(){
        return SERVICE-mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", mileage=" + mileage +
                ", service=" + service +
                '}';
    }
}
