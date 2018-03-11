package LambdaExpressions_31.predicate;

import LambdaExpressions_31.formatter.AppleSimpleFormatter;
import LambdaExpressions_31.predicate.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.stream.Collectors.toList;
/**
 * Created by CC on 09.03.2018.
 */


/* The word predicate is often used in mathematics to mean something function-like that takes a value
for an argument and returns true or false.
*/

public class AppleMain {

    public static void main(String[] args) {

        System.out.println(Apple.isGreenApple(new Apple("green", 151)));

        List<Apple> listApples = Arrays.asList(new Apple("red", 200),
                new Apple("green", 100),
                new Apple("white", 120),
                new Apple("green", 250));

        System.out.println(Apple.filterApples(listApples, Apple::isGreenApple));
        System.out.println(Apple.filterApples(listApples, (Apple p) -> "red".equals(p.getColor()) || "white".equals(p.getColor())));

        // Sequential processing
        List<Apple> appleWeight = listApples.stream().filter((Apple p) -> p.getWeight() > 10).collect(toList());
        System.out.println(appleWeight);

        //Parallel processing
        List<Apple> appleWeight1 = listApples.parallelStream().filter((Apple p) -> p.getWeight() > 10).collect(toList());
        System.out.println(appleWeight1);

        //Predicate
        System.out.println();
        List<Apple> heavyApples = Apple.filterApples(listApples, new AppleHeavyWeightPredicate());
        System.out.println(heavyApples);

        List<Apple> greenApples = Apple.filterApples(listApples, new AppleGreenColorPredicate());
        System.out.println(greenApples);

        List<Apple> redApples = Apple.filterApples(listApples, new ApplePredicate() {

            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        });

        List<Apple> redApplesNew = Apple.filterApples(listApples, (Apple apple) -> "red".equals(apple.getColor()));
        System.out.println(redApples);
        System.out.println(redApplesNew);

        //Formatter
        System.out.println();
        Apple.prettyPrintApple(listApples, new AppleSimpleFormatter());

        //Creating Object. Default Constructor
        Supplier<Apple> c1 = Apple::new;
        Apple a1 = c1.get();
        System.out.println(a1.getColor());

        Supplier<Apple> c2 = () -> new Apple();
        Apple a2 = c1.get();

        // Constructor with signature
        Function<Integer,Apple> c3 = Apple::new;
        Apple a3 = c3.apply(100);
        System.out.println(a3.getWeight());

        Function<Integer,Apple> c4 = (weight) -> new Apple(weight);
        Apple a4 = c4.apply(100);
        System.out.println(a4.getWeight());

        BiFunction<String, Integer, Apple> c5 = Apple::new;
        Apple a5 = c5.apply("red", 100);
        System.out.println(a5);

        BiFunction<String, Integer, Apple> c6 = (color, weight) -> new Apple(color, weight);
        Apple a6 = c5.apply("red-red", 66);
        System.out.println(a6);

        //Создание нескольких объектов
        List<Integer> weight = Arrays.asList(1, 2, 3, 466, 77);
        List<Apple> list = Apple.map(weight,Apple::new);
        System.out.println(list);





    }


}
