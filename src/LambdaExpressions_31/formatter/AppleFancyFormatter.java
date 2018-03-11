package LambdaExpressions_31.formatter;

import LambdaExpressions_31.Apple;
import LambdaExpressions_31.formatter.AppleFormatter;

/**
 * Created by CC on 10.03.2018.
 */
public class AppleFancyFormatter implements AppleFormatter {

    @Override
    public String accept(Apple apple) {

        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristic + " " + apple.getColor() +" apple";
    }
}
