package LambdaExpressions_31;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CC on 09.03.2018.
 */
public class Apple {

    private String color;
    private double weight;

    public Apple(String color, double weight) {
        this.color = color;
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

    public static List<Apple> filterApples(List<Apple> appleList, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: appleList) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
