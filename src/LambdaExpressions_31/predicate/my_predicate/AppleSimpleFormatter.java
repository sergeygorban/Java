package LambdaExpressions_31.predicate.my_predicate;

import LambdaExpressions_31.predicate.Apple;
import LambdaExpressions_31.predicate.my_predicate.AppleFormatter;

/**
 * Created by CC on 10.03.2018.
 */
public class AppleSimpleFormatter implements AppleFormatter {

    @Override
    public String accept(Apple apple) {
        return "Displaying data about Object: An apple of " + apple.getWeight() + "g";
    }
}
