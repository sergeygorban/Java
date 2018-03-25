package LambdaExpressions_31.predicate.my_predicate;

import LambdaExpressions_31.predicate.Apple;

/**
 * Created by CC on 10.03.2018.
 */
@FunctionalInterface
public interface AppleFormatter {

    String accept(Apple apple);
}
