package LambdaExpressions_31.predicate;

import LambdaExpressions_31.formatter.AppleSimpleFormatter;
import LambdaExpressions_31.predicate.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.util.stream.Collectors.toList;
/**
 * Created by CC on 09.03.2018.
 */




public class AppleMain {

    public static void main(String[] args) {

        List<Apple> listApples = Arrays.asList(new Apple("red", 200),
                new Apple("green", 100),
                new Apple("white", 120),
                new Apple("green", 250),
                new Apple("red", 250));


        //Composing Predicates
        List<Apple> notRedApple = Apple.filterMy(listApples, new AppleRedPredicate().negate());
        System.out.println("Not red Apple: " + notRedApple);

        List<Apple> notRedHeavyApple = Apple.filterMy(listApples, new AppleRedPredicate().negate().and(a -> a.getWeight() < 200));
        System.out.println("Not red and heavy Apple: " + notRedHeavyApple);

        List<Apple> redAndHeavyAppleOrGreen = Apple.filterMy(listApples, new AppleRedPredicate().and(a -> a.getWeight() > 200).or(a -> a.getColor().equals("green")));
        System.out.println("Red, heavy and green Apple: " + redAndHeavyAppleOrGreen);

        //Creating Object. Default Constructor
        Supplier<Apple> c1 = Apple::new;
        Apple a1 = c1.get();
        System.out.println(a1.getColor());

        Supplier<Apple> c2 = () -> new Apple();
        Apple a2 = c1.get();

        // Function
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

        //Composing Functions


        //Compare Object
        Comparator<Apple> c = Comparator.comparing((Apple a) -> a.getWeight());

        listApples.sort(Comparator.comparing((a) -> a.getWeight()));
        listApples.sort(Comparator.comparing(Apple::getWeight));
        listApples.sort(Comparator.comparing(Apple::getWeight).reversed());
        listApples.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));

        System.out.println(listApples);









    }


}
