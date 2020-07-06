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

zad3

Mając tak przygotowany obiekt Car zaprogramuj aplikację pytającą o model Twojego samochodu oraz przebieg.
 Aplikacja ta ma stworzyć obiekt samochód i sprawdzić czy dany samochód powinien zrobić przegląd czy nie. Jeśli tak,
 powinna wyświetlić “samochód o marce … powinien zrobić przegląd już … kilometrów temu!”, a jeśli wszystko jest okej
  może wyświetlić “Dla samochodu o marce … zostało jeszcze … kilometrów do przeglądu”.

  zad4

  Za przykładem prowadzącego przerób aplikację tak, aby przenieść kod obsługujący kontrolę przeglądów do osobnego obiektu typu serwis.

 */

import java.util.Scanner;

public class CarDemo {

    public static void main(String[] args) {

      //  Car car1 = new Car();
        int distance = 100;

//        car1.setMark("Land Rover");
//        car1.setMileage(100);
//
//        System.out.println(car1);
//        car1.distanceToMake(distance);
//        System.out.println(car1.getMileage());
//        System.out.println(car1.howLongToInspection());
//
//        System.out.println();
//
//        Car car2=new Car("Polonez", 1200);
//        System.out.println(car2);
//        car2.distanceToMake(distance);
//        System.out.println(car2.getMileage());
//        System.out.println(car2.howLongToInspection());
//        System.out.println();




        CarFactory carFactory = new CarFactory();
        Car car = carFactory.createCar();
        Service service = new Service();
        service.serviceInfo(car);







    }
}
