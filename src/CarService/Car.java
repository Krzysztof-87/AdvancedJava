package CarService;
/*Zadanie 1.
W programie zrealizuj następujący scenariusz: Samochód ma koła, a ich opony mają ustalone ciśnienie i mogą być przebite.
  Warsztat może przyjmować samochód żeby go naprawić. W klasie WarsztatDemo stwórz samochód z czterema kołami oraz  warsztat.
   Następnie tworząc i wywołując odpowiednie metody zasymuluj następujące zdarzenia:
samochód łapie gumę w losowym kole,
warsztat przyjmuje samochód do naprawy,
warsztat sprawdza stan kół i wymienia przebite opony,
warsztat po wykonaniu usługi drukuje ile kół wymienił i ile będzie to kosztowało.

*/

import java.util.ArrayList;
import java.util.Random;

public class Car {

   private ArrayList<Wheel> wheels;

    public Car() {
        wheels = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Wheel wheel = new Wheel();
            wheels.add(wheel);
        }
    }

        public void punctureRandomWheel(){
            Random random= new Random();
            int randomIndex= random.nextInt(5);
            Wheel wheelToPuncture = wheels.get(randomIndex);
            wheelToPuncture.puncture();
        }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                '}';
    }
}
