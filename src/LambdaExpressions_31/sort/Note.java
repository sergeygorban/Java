package LambdaExpressions_31.sort;

import LambdaExpressions_31.predicate.Apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by CC on 25.03.2018.
 */
public class Note {


    public static void main(String[] args) {

        List<Apple> listApples = Arrays.asList(new Apple("red", 200),
                new Apple("green", 100),
                new Apple("white", 120),
                new Apple("green", 250),
                new Apple("red", 250));

        listApples.sort(new Comparator<Apple>() {

            @Override
            public int compare(Apple o1, Apple o2) {
                return 0;
            }
        });
    }
}
