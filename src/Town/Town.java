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

import java.util.ArrayList;

public class Town {

    private ArrayList<Citizen>citizens = new ArrayList<>();

  public void add(Citizen citizen){
      citizens.add(citizen);
  }


    public int howManyCanVote(){
        int canVote=0;
        for (Citizen citizen1 : citizens) {
            if (citizen1.canVote()){
                canVote++;
            }
        }
        return canVote;
    }

    public void whoCanVote(){
        for (Citizen citizen1 : citizens) {
            if (citizen1.canVote()){
                System.out.println(citizen1.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "Town{" +
                "citizens=" + citizens +
                '}';
    }
}
