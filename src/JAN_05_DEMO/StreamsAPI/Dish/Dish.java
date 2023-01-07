package JAN_05_DEMO.StreamsAPI.Dish;

import java.util.List;
import java.util.Objects;


public class Dish {
    private String dishName;
    private int calories;
    private List<String> ingredients;
    private DishType dishType;

    public Dish(String dishName, int calories, List<String> ingredients, DishType dishType) {
        this.dishName = dishName;
        this.calories = calories;
        this.ingredients = ingredients;
        this.dishType = dishType;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setDishType(DishType dishType) {
        this.dishType = dishType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dish dish = (Dish) o;
        return getCalories() == dish.getCalories() && Objects.equals(getDishName(), dish.getDishName()) && Objects.equals(getIngredients(), dish.getIngredients()) && getDishType() == dish.getDishType();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDishName(), getCalories(), getIngredients(), getDishType());
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", calories=" + calories +
                ", ingredients=" + ingredients +
                ", dishType=" + dishType +
                '}';
    }
}
