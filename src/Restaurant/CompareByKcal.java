package Restaurant;

import java.util.Comparator;

public class CompareByKcal implements Comparator<Dish> {
    @Override
    public int compare(Dish dish, Dish dish1) {
        return Integer.compare(dish.getKcal(), dish1.getKcal());

    }
}
