package Zoo;
/*
Przygotuj swoją własną wersję przykładu ze zwierzętami. Stwórz dwie klasy zwierząt, nadaj im po dwie wspólne cechy oraz dwie metody,
 jedną drukującą dźwięk zwierzęcia, drugą robiącą coś charakterystycznego tylko dla niego.
  Stwórz metodę wydającą dźwięk już w klasie bazowej Animal i nadpisz ją odpowiednio w klasach swoich zwierząt.


Zmodyfikuj metodę służącą do wydawania dźwięku w klasie Animal, tak aby była metodą abstrakcyjną,
a w main przygotuj listę obiektów typu Animial, wstaw do niej różne zwierzęta. Za pomocą pętli wywołaj metodę od wydawania dźwięku każdego ze zwierząt na liście.

 */


public abstract class  Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
    


}
