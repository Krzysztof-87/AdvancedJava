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


public class CareTaker {

    private Animal animal;

    public CareTaker(Animal animal) {
        this.animal = animal;
    }

    public void nakarmZwierze(){
        int counter=0;
        while (animal.isHungry()){
            animal.feed();
            counter++;
        }
        System.out.println(animal.getName()+" nakarmiony "+counter+" razy");

    }


}
