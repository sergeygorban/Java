package LambdaExpressions_31.formatter;

import LambdaExpressions_31.predicate.Apple;

/**
 * Created by CC on 10.03.2018.
 */
public class AppleSimpleFormatter implements AppleFormatter {

    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
