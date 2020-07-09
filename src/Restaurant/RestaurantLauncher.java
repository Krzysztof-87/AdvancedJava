package Restaurant;



public class RestaurantLauncher {

    public static void main(String[] args) {
        RestaurantService restaurantService = new RestaurantService();
        restaurantService.addDish(new Dish("Kaszotto", 33.40, 440, DishType.Dinner));
        restaurantService.addDish(new Dish("Curry", 25.80, 390, DishType.Dinner));
        restaurantService.addDish(new Dish("All day breakfast", 19, 330, DishType.Breakfast));
        restaurantService.addDish(new Dish("Paszteciki", 11, 120, DishType.Appetizer));

        try {

            System.out.println(restaurantService.findDishByName());
        }catch (RestaurantException e){
            System.out.println(e.getMessage());
        }
        System.out.println(restaurantService.findDishesByDishKind());


        System.out.println("not sorted: ");
       restaurantService.printUnSortedDishes();

        System.out.println("Compare by natural order");
        restaurantService.sortByNaturalOrder();

        System.out.println("Compare by price:");
        restaurantService.compareByPrice();

        System.out.println("Compare by Kcal:");
        restaurantService.compareByKcal();


    }




}
