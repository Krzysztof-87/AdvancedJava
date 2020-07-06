package Kompozycja;
/*
Zadanie 1.
Stwórz klasę dla obiektów typu Zwierze, oraz dodaj pole double reprezentujące procentowo
jak bardzo zwierze jest najedzone. Stwórz metodę void nakarm().  Każde
nakarmienie powinno losowo zwiększać poziom najedzenia o 10-20%. Dodaj również metodę sprawdzającą,
czy zwierze jest jeszcze głodne - ma zwracać true, jeśli jest najedzone przynajmniej w 75%. W pakiecie z programem
 o zwierzętach stwórz nową klasę Opiekun. Opiekun ma posiadać pole typu Zwierze i metodę void nakarmZwierze().
 Metoda ta ma karmić zwierzę tyle razy, aż przestanie być głodne, a na koniec drukować komunikat: "<nazwa zwierzęcia> nakarmiony X razy!"

 */



import java.util.Random;

public class Animal {

    private double full;
    private String name;

    public Animal(double full, String name) {
        this.full = full;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void feed(){
        Random random = new Random();
        int food = Math.abs(random.nextInt(11)-20);
        System.out.println(food);
        full+=(full*food)/100;
    }

    public boolean isHungry(){
        return full < 75;

    }
}
