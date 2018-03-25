package LambdaExpressions_31.predicate;

import LambdaExpressions_31.formatter.AppleFancyFormatter;
import LambdaExpressions_31.formatter.AppleFormatter;
import LambdaExpressions_31.formatter.AppleSimpleFormatter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

/**
 * Created by CC on 25.03.2018.
 */

/* The word predicate is often used in mathematics to mean something function-like that takes a value
for an argument and returns true or false.

The java.util.function.Predicate<T> interface defines an abstract method named test that
accepts an object of generic type T and returns a boolean. It’s exactly the same one that you
created earlier, but is available out of the box! You might want to use this interface when you
need to represent a boolean expression that uses an object of type T.

public interface Predicate<T> {
    boolean testMy(T t);
}


*/

public class Note {

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


    public static void main(String[] args) {

        List<Apple> listApples = Arrays.asList(new Apple("red", 200),
                new Apple("green", 100),
                new Apple("white", 120),
                new Apple("green", 250),
                new Apple("red", 250));

        // Applying Predicate
        List<Apple> list =  Note.filterMy(listApples, a -> {
            return "red".equals(a.getColor());
        });
        System.out.println("Selecting only red apples: + " + list);

        List<Apple> list1 =  Note.filterMy(listApples, a -> "red".equals(a.getColor()));
        System.out.println("Selecting only red apples: + " + list1);

        List<Apple> list2 = Note.filterMy(listApples, new AppleRedPredicate());
        System.out.println("Selecting only red apples: + " + list2);

        // Anonymous classes
        List<Apple> list3 =  Note.filterMy(listApples, new AppleRedPredicate() {

            @Override
            public boolean test(Apple apple) {
                return "red1".equals(apple.getColor());
            }

        });
        System.out.println("Selecting only red apples: + " + list3);
        System.out.println();

        // Displaying data about Object
        Note.prettyPrintApple(listApples, new AppleFancyFormatter());
        Note.prettyPrintApple(listApples, new AppleSimpleFormatter());
        System.out.println();

        // Sequential processing
        List<Apple> appleWeight = listApples.stream().filter((Apple p) -> p.getWeight() > 10).collect(toList());
        System.out.println("Sequential processing: " + appleWeight);

        //Parallel processing
        List<Apple> appleWeight1 = listApples.parallelStream().filter((Apple p) -> p.getWeight() > 10).collect(toList());
        System.out.println("Parallel processing: " + appleWeight1);


    }


}
