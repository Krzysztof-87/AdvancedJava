package Zoo;
/*

Przygotuj swoją własną wersję przykładu ze zwierzętami.
Stwórz dwie klasy zwierząt, nadaj im po dwie wspólne cechy oraz dwie metody, jedną drukującą dźwięk zwierzęcia,
drugą robiącą coś charakterystycznego tylko dla niego.
 Stwórz metodę wydającą dźwięk już w klasie bazowej Animal i nadpisz ją odpowiednio w klasach swoich zwierząt.

 */

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    public Lion() {
        super("Dziki", 3);
    }


    public void attackOtherAnimals(){
        System.out.println("Lion attack zebra");
    }

    @Override
    public void makeSound() {
        System.out.println("Odglos Lwa");
    }
}
