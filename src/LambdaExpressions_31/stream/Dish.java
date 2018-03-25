package LambdaExpressions_31.stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by CC on 26.03.2018.
 */
public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return name;
    }
    public enum Type { MEAT, FISH, OTHER }

    public Type getType() {
        return type;
    }

}
