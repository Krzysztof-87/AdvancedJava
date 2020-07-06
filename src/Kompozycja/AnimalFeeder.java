package Kompozycja;

public class AnimalFeeder {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker(new Animal(10, "Koala"));

        careTaker.nakarmZwierze();
    }
}
