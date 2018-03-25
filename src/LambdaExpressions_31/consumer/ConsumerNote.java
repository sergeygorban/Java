package LambdaExpressions_31.consumer;

import LambdaExpressions_31.predicate.Apple;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by CC on 11.03.2018.
 */

/*The java.util.function.Consumer<T> interface defines an abstract method named accept that
takes an object of generic type T and returns no result (void). You might use this interface when
you need to access an object of type T and perform some operations on it. For example, you can
use it to create a method forEach, which takes a list of Integers and applies an operation on each
element of that list. In the following listing you use this forEach method combined with a
lambda to print all the elements of the list.*/


public class ConsumerNote {

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T i: list) {
            c.accept(i);
        }
    }

    public static <T> void prettyPrintApple(List<T> list, Consumer<T> p){

        for(T i: list){
            p.accept(i);
        }
    }

    public static void main(String[] args) {

        List<Apple> listApples = Arrays.asList(new Apple("red", 200),
                new Apple("green", 100),
                new Apple("white", 120),
                new Apple("green", 250),
                new Apple("red", 250));

        ConsumerNote.forEach(Arrays.asList(1, 2, 3, 4, 5), (Integer i) -> System.out.println(i));
        ConsumerNote.forEach(Arrays.asList(1, 2, 3, 4, 5), System.out::println);
        System.out.println();

        // Displaying data about Object
        ConsumerNote.prettyPrintApple(listApples, a -> System.out.println(a));
        ConsumerNote.prettyPrintApple(listApples, new FormatMy());
        ConsumerNote.prettyPrintApple(listApples, new AppleSimpleFormatter());

    }
}
