package LambdaExpressions_31.consumer;

import LambdaExpressions_31.predicate.Apple;

/**
 * Created by CC on 10.03.2018.
 */
public class AppleSimpleFormatter implements AppleFormatter {

    @Override
    public void accept(Apple apple) {
        System.out.println("Displaying data about Object: An apple of " + apple.getWeight() + "g");
    }
}
