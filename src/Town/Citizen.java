package Town;

/*Stwórz klasę abstrakcyjną Citizen oraz klasy dziedziczące:
Peasant(Chłop),
Townsman(Mieszczanin),
King(Król),
Soldier(Żołnierz)
Wszystkie klasy posiadają pole imie (przemyśl gdzie powinno się znajdować to pole).
Citizen powinien być klasą abstrakcyjną która posiada metodę abstrakcyjną 'canVote' która zwraca true dla townsman'a i soldier'a, ale false dla chłopa i króla.

Stwórz klasę Town która posiada zbiór obiektów typu Citizen. Dodaj do niej kilku citizenów (tworząc ich w main). Obiekt klasy Town ma mieć metody:
howManyCanVote -  które zwracają ilość osób które mogą głosować
whoCanVote -  która wypisuje imiona osób które mogą głosować

 */

public abstract class Citizen {

    private String name;

    public Citizen(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean canVote();


}
