package LambdaExpressions_31.consumer;

import LambdaExpressions_31.predicate.Apple;

/**
 * Created by CC on 10.03.2018.
 */
public class AppleFancyFormatter implements AppleFormatter {

    @Override
    public void accept(Apple apple) {

        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        System.out.println("Displaying data about Object: " + characteristic + " " + apple.getColor() +" apple");
    }
}
