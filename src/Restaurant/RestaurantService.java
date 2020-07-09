package Restaurant;
/*
Uwaga, żadna z poniższych metod nie powinna drukować nic w konsoli. Wykorzystaj metody toString oraz wartości zwracane lub obsługę wyjątków :)

stwórz klasę Restaurant, zawierającą zbiór dań
stwórz metody pozwalającą dodać danie i usunąć
dodaj do restauracji 5 różnych dań
zaimplementuj metody equals i hashCode aby uniknąć duplikatów i upewnij się, że spełniają swoje zadanie
stwórz metodę pozwalającą wyszukać danie po nazwie, ma ona zwracać obiekt typu Dish, w przypadku nie odnalezienia takiego obiektu obiektu ma rzucać wyjątek typu RestaurantException
stwórz metodę pozwalającą wyszukać dania po typie potrawy, jeśli nie ma żadnej potrawy w danym typie, metoda ma zwracać pustą listę.

 */

import java.util.*;

public class RestaurantService  {

    private Set<Dish> dishes = new HashSet<>();
    private Set<Dish>dishesToSort=dishes;
    private List<Dish> dishesList = new LinkedList<>();
    Scanner input = new Scanner(System.in);


    public RestaurantService() {
    }


    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }

    public void printUnSortedDishes() {
        for (Dish dish : dishes) {
            System.out.println(dish);
        }
    }


    public Dish findDishByName() throws RestaurantException {
        System.out.println("Jakiego dania szukasz? ");
        String dishName= input.nextLine();
        for (Dish dish : dishes) {
            if (dish.getDishName().equals(dishName))
                return dish;
        }
        throw new RestaurantException("Podane danie nie istnieje");
    }



    public List<Dish> findDishesByDishKind() {
        List<Dish> dishesByDishType = new LinkedList<>();
        System.out.println("Jakiego typu dania szukasz?");
        String dishName = input.nextLine();
        for (Dish dish : dishes) {
            if (dish.dishType.equals(DishType.valueOf(dishName))) {
                dishesByDishType.add(dish);
            }
        }
        return dishesByDishType;
    }

    public void sortByNaturalOrder(){
        dishesList.addAll(dishesToSort);
        Collections.sort(dishesList);
        for (Dish dish : dishesList) {
            System.out.println(dish);
        }

    }

    public void compareByPrice(){
        dishesList.sort(new CompareByPrize());
        for (Dish dish : dishesList) {
            System.out.println(dish);
        }
    }
    public void compareByKcal(){
        dishesList.sort(new CompareByKcal());
        for (Dish dish : dishesList) {
            System.out.println(dish);
        }
    }


}
