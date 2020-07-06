package ZajeciaJavaZaawansowana;
/*
Za przykładem prowadzącego przerób aplikację tak, aby przenieść kod obsługujący kontrolę przeglądów do osobnego obiektu typu serwis.
 */

import java.util.Scanner;

public class Service {



    public void serviceInfo(Car car) {
        int whenService = car.howLongToInspection();
        if (whenService > 0) {
            System.out.println("Dla samochodu o marce " + car.getMark() + " zostalo jeszcze " + whenService + " kilometrow do przegladu");
        } else if (car.howLongToInspection() < 0) {
            System.out.println("Samochod o marce " + car.getMark() + " powinien zrobic przeglad juz " + Math.abs(whenService) + " kilometrow temu");
        }
    }
}
