package LambdaExpressions_31.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by CC on 09.03.2018.
 */
public class Apple {

    private String color;
    private double weight;

    public Apple() {

    }

    public Apple(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Apple(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public static boolean isGreenApple(Apple apple) {
        return "green".equals(apple.getColor());
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
