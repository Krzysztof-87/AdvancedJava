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

public class Service {

    private final static int PRICE=20;

    public void Receipt(Car car){
        int repairedWheels = executeRepair(car);
        double cost = repairedWheels*PRICE;
        System.out.println("Warsztat wymienil "+repairedWheels+" kol, do zaplaty jest: "+ cost);
    }


    private int executeRepair(Car car){
        int wheelsRepaired=0;
        ArrayList<Wheel>wheelsToRepaired=car.getWheels();
        for (Wheel wheel : wheelsToRepaired) {
            if (wheel.isFlat()){
                wheel.repair();
                wheelsRepaired++;
            }
        }
        return wheelsRepaired;
    }



}
