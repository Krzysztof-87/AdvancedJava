package Restaurant;

import java.util.Comparator;

public class CompareByPrize implements Comparator<Dish> {
    @Override
    public int compare(Dish dish, Dish dish1) {
        return Double.compare(dish.getPrice(), dish1.getPrice());

    }
}
