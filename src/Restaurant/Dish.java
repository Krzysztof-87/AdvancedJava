package Restaurant;
/*
Stwórz obiekt Dish (potrawa), potrawa ma posiadać nazwę, cenę, wartość kaloryczną oraz enum - typ (np. BREAKFAST, DINNER, APPETIZER
 */


import java.util.Objects;

public class Dish implements Comparable<Dish> {

    private String dishName;
    private double price;
    private int kcal;
    DishType dishType;


    public Dish(String dishName, double prize, int kcal, DishType dishType) {
        this.dishName = dishName;
        this.price = prize;
        this.kcal = kcal;
        this.dishType = dishType;
    }

    public int getKcal() {
        return kcal;
    }

    public double getPrice() {
        return price;
    }

    public String getDishName() {
        return dishName;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dish)) return false;
        Dish dish = (Dish) o;
        return Double.compare(dish.price, price) == 0 &&
                kcal == dish.kcal &&
                Objects.equals(dishName, dish.dishName) &&
                dishType == dish.dishType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dishName, price, kcal, dishType);
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", prize=" + price+
                ", kcal=" + kcal +
                ", dishType=" + dishType +
                '}';
    }

    @Override
    public int compareTo(Dish dish) {
        int compareByName= dishName.compareTo(dish.getDishName());
        if (compareByName>0){
            return 1;
        }else if (compareByName<0){
            return -1;
        }else return Double.compare(dish.getPrice(), dish.getPrice());

    }


}




