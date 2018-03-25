package LambdaExpressions_31.comparator;

import LambdaExpressions_31.predicate.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by CC on 11.03.2018.
 */
public class ComparatorNote {

    // Without type inference
    //Comparator<Apple> c = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());

    // With type inference
    //Comparator<Apple> c = (a1, a2) -> a1.getWeight().compareTo(a2.getWeight());

    public static void main(String[] args) {

        List<Apple> listApples = Arrays.asList(new Apple("red", 200),
                new Apple("green", 100),
                new Apple("white", 120),
                new Apple("green", 250),
                new Apple("red", 250));

        //Compare Object
        Comparator<Apple> c = Comparator.comparing((Apple a) -> a.getWeight());

        listApples.sort(Comparator.comparing((a) -> a.getWeight()));
        System.out.println(listApples);
        listApples.sort(Comparator.comparing(Apple::getWeight));
        System.out.println(listApples);
        listApples.sort(Comparator.comparing(Apple::getWeight).reversed());
        System.out.println(listApples);
        listApples.sort(Comparator.comparing(Apple::getWeight).reversed().thenComparing(Apple::getColor));
        System.out.println(listApples);

    }


}
