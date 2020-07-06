package List;
/*
Stwórz listę imion i uzupełnij je 5 imionami.
Wyświetl wszystkie imiona
Wyświetl pierwsze imię
Zmień drugie imię na “Marcin”
Usuń jedno z imion
Stwórz drugą listę z dwoma kolejnymi imionami i dodaj do niej wszystkie imiona z poprzedniej za pomocą metody addAll
Wyświetl wszystkie imiona z drugiej listy wielkimi literami
Wyświetl tylko żeńskie imiona (umownie - te kończące się na ‘a’)

 */

import java.util.ArrayList;
import java.util.Arrays;

public class List {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Pawel");
        names.add("Krzysiek");
        names.add("Iwona");
        names.add("Gerry");

        System.out.println(names);
        System.out.println(names.get(0));
        names.remove(1);
        names.add(1, "Marcin");
        System.out.println(names);
        names.remove(4);
        System.out.println(names);
        ArrayList<String>otherNames=new ArrayList<>(Arrays.asList("Irmina", "Karolina"));
        for (String s : otherNames) {
            System.out.println(s.toUpperCase());
        }

        names.addAll(otherNames);
        System.out.println(names);
        for (String name : names) {
            if (name.endsWith("a")){
                System.out.println(name);
            }
        }

    }
}
