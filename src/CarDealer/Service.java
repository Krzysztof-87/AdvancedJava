package CarDealer;

/*
Mając tak przygotowany obiekt Car zaprogramuj aplikację pytającą o model Twojego samochodu oraz przebieg.
 Aplikacja ta ma stworzyć obiekt samochód i sprawdzić czy dany samochód powinien zrobić przegląd czy nie.
 Jeśli tak, powinna wyświetlić “samochód o marce … powinien zrobić przegląd już … kilometrów temu!”,
  a jeśli wszystko jest okej może wyświetlić “Dla samochodu o marce … zostało jeszcze … kilometrów do przeglądu”.
 */

import java.util.ArrayList;

public class Service {

    public void checkService(Car car){
        int whenService=Math.abs(car.SERVICE-car.getMileage());
        if (car.howLongToService()>0){
            System.out.println("Dla samochodu o marce "+ car.getBrand()+" zostalo jeszcze "+whenService+" do przegladu");
        }else
            System.out.println("Samochod o marce "+car.getBrand()+" powinien zrobic przeglad juz "+ whenService+" kilometrow temu" );
    }

    public int howManyForService(ArrayList<Car> cars){
        int counter=0;
        for (Car car : cars) {
            if (car.isService()) {
                counter++;
            }
        }
        return counter;
    }

    public void allCarsToService(ArrayList<Car>cars){
        for (Car car : cars) {
            if (car.isService()){
                car.setService(false);
            }

        }
    }




}
