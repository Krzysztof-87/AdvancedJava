package CarDealer;
/*
Dla ambitnych - zrób obiekt symulujący komis samochodowy, który będzie przechowywał kilka obiektów typu samochód.
Stwórz obiekt komis i przekaż mu 3 samochody. Stwórz funkcjonalność pozwalającą zwrócić ile samochodów w komisie wymaga przeglądu.
Zaimplementuj w dowolny sposób funkcjonalność pozwalającą jednym wywołaniem wysłać wszystkie samochody na przegląd,
tak żeby poprzednia metoda zwróciła tym razem 0.
 */


import java.util.ArrayList;

public class CarDealer {

    private ArrayList<Car> cars;


    public ArrayList<Car> getCars() {
        return cars;
    }



    public CarDealer() {
        CarFactory carFactory = new CarFactory();
        cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Car car = carFactory.createCar();
            cars.add(car);
        }
    }

        @Override
        public String toString() {
            return "CarDealer{" +
                    "cars=" + cars +
                    '}';
        }

}
