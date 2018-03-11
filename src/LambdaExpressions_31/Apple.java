package LambdaExpressions_31;

import LambdaExpressions_31.formatter.AppleFormatter;
import LambdaExpressions_31.predicateMy.ApplePredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

    // The universal method
    public static <T> List<T> filterMy(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T e: list) {
            if (p.test(e)) {
                results.add(e);
            }
        }
        return results;
    }

    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){

        for(Apple apple: inventory){
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
