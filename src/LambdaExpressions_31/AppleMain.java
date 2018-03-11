package LambdaExpressions_31;

import LambdaExpressions_31.formatter.AppleSimpleFormatter;
import LambdaExpressions_31.predicateMy.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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

    }


}
