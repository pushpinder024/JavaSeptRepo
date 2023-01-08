package JAN_05_DEMO.StreamsAPI.Dish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainDriver {
    public static void main(String[] args) {
        List<Dish> dishes = new ArrayList<>();
        dishes.add(new Dish("Pizza", 1000, Arrays.asList("Pizza", "Sauce"), DishType.American));
        dishes.add(new Dish("Pasta", 500, Arrays.asList("Pasta", "Pasta_Sauce", "Cheese"), DishType.Italian));
        dishes.add(new Dish("Butter_Chicken", 700, Arrays.asList("Chicken", "Tomatoes", "Onion"), DishType.Indian));
        dishes.add(new Dish("Salad", 200, Arrays.asList("Spinach", "Reddish", "Onions", "Lettuce", "Carrots"), DishType.American));
        dishes.add(new Dish("Butter_Chicken", 700, Arrays.asList("Chicken", "Tomatoes", "Onion"), DishType.Indian));
        dishes.add(new Dish("Salad", 200, Arrays.asList("Spinach", "Reddish", "Onions", "Lettuce", "Carrots"), DishType.American));

//        dishes.stream().filter(d -> d.getCalories() <= 700).forEach(d -> System.out.println(d));

//        dishes.stream().filter(d -> d.getCalories() <= 700 && d.getDishName()=="Pasta").distinct().forEach(d -> System.out.println(d));
//        List<Dish> dishList = dishes.stream().filter(d -> d.getCalories() <= 700 && d.getDishName() == "Pasta").distinct().collect(Collectors.toList());
//        System.out.println(dishList);
//
//
        List<String> stringList = dishes.stream().filter(d -> d.getCalories() <= 700).map(d -> d.getDishName()).distinct().collect(Collectors.toList());
        System.out.println(stringList);

//        List<Dish> dishes1 = dishes.stream()
//                .filter(d -> d.getCalories() <= 700)
//                .map( (d) -> {
//            d.setDishName("CommonName");
//            return d;
//        }
//        )
//                .collect(Collectors.toList());
//        System.out.println(dishes1);
    }
}
