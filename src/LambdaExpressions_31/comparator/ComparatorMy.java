package LambdaExpressions_31.comparator;

import LambdaExpressions_31.predicate.Apple;

import java.util.Comparator;

/**
 * Created by CC on 11.03.2018.
 */
public class ComparatorMy {

    // Without type inference
    //Comparator<Apple> c = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());

    // With type inference
    //Comparator<Apple> c = (a1, a2) -> a1.getWeight().compareTo(a2.getWeight());


}
