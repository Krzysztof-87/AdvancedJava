package CarDealer;

/*
Mając tak przygotowany obiekt Car zaprogramuj aplikację pytającą o model Twojego samochodu oraz przebieg.
 Aplikacja ta ma stworzyć obiekt samochód i sprawdzić czy dany samochód powinien zrobić przegląd czy nie.
 Jeśli tak, powinna wyświetlić “samochód o marce … powinien zrobić przegląd już … kilometrów temu!”,
  a jeśli wszystko jest okej może wyświetlić “Dla samochodu o marce … zostało jeszcze … kilometrów do przeglądu”.
 */

import java.util.Scanner;

public class CarFactory {

    public Car createCar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj model Twojego samochodu?");
        String brand = input.nextLine();
        System.out.println("Podaj przebieg Twojego samochodu");
        int mileage = input.nextInt();
        return new Car(brand, mileage);
    }
}
