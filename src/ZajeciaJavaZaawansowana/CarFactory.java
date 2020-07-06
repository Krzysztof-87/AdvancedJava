package ZajeciaJavaZaawansowana;

import java.util.Scanner;

public class CarFactory {

    public Car createCar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj marke samochodu ");
        String brand = input.nextLine();
        System.out.println("Podaj przebieg:");
        int mileage= input.nextInt();

        return new Car(brand, mileage);
    }
}
