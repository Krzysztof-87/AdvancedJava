package CarDealer;

import java.util.ArrayList;

public class CarDemo {

    public static void main(String[] args) {
//        Car car = new Car("Range Rover", 1000);
//        Car car1 = new Car("BMW", 234);
//        System.out.println(car);
//        System.out.println(car1);
//        System.out.println(car.howLongToService());
//        car1.addToMileage(1500);
//        System.out.println(car1);
//        System.out.println(car1.howLongToService());

//        CarFactory carFactory = new CarFactory();
//        Car car = carFactory.createCar();
//        Service service = new Service();
//        service.checkService(car);

        CarDealer carDealer = new CarDealer();
        ArrayList<Car>cars= carDealer.getCars();
        Service service= new Service();
        System.out.println(service.howManyForService(cars));
        service.allCarsToService(cars);
        System.out.println(service.howManyForService(cars));


    }
}
