package Sets;
/*
Wykonaj następujące polecenia:
Stwórz zbiór nazw potraw i uzupełnij 5 potrawami.
Spróbuj dodać potrawę która znajduje się już w zbiorze
Spróbuj wyświetlić pierwszą potrawę w zbiorze
Przeiteruj się po wszystkich elementach zbioru wyświetlając potrawy dużymi literami

 */

import java.util.HashSet;
import java.util.Set;

public class Meals {

    public static void main(String[] args) {


        Set<String> meals = new HashSet<>();
        meals.add("Zupa");
        meals.add("Kotlet");
        meals.add("Ziemiaki");
        meals.add("jajecznica");
        meals.add("Curry");
        meals.add("Kotlet");

        for (String meal : meals) {
            System.out.print(meal.toUpperCase()+" ");
        }
    }
}
