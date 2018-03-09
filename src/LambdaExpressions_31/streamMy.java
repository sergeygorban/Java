package LambdaExpressions_31;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.toList;
/**
 * Created by CC on 09.03.2018.
 */


/* The word predicate is often used in mathematics to mean something function-like that takes a value
for an argument and returns true or false.
*/

public class streamMy {

    public static void main(String[] args) {

        Apple apple = new Apple("green", 23);
        System.out.println(apple.isGreenApple(apple));

        List<Apple> listApples = new ArrayList<>();
        listApples.add(new Apple("red", 12));
        listApples.add(new Apple("green", 23));
        listApples.add(new Apple("white", 45));

        System.out.println(Apple.filterApples(listApples, Apple::isGreenApple));
        System.out.println(Apple.filterApples(listApples, (Apple p) -> "red".equals(p.getColor()) || "white".equals(p.getColor())));

        // Sequential processing
        List<Apple> appleWeight = listApples.stream().filter((Apple p) -> p.getWeight() > 10).collect(toList());
        System.out.println(appleWeight);

        //Parallel processing
        List<Apple> appleWeight1 = listApples.parallelStream().filter((Apple p) -> p.getWeight() > 10).collect(toList());
        System.out.println(appleWeight1);










    }


}
