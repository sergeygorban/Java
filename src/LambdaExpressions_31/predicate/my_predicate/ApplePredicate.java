package LambdaExpressions_31.predicate.my_predicate;

import LambdaExpressions_31.predicate.Apple;

/**
 * Created by CC on 09.03.2018.
 */


@FunctionalInterface
public interface ApplePredicate {

    boolean testMy(Apple apple);
}
