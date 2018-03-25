package LambdaExpressions_31.consumer;

import LambdaExpressions_31.predicate.Apple;

import java.util.function.Consumer;

/**
 * Created by CC on 25.03.2018.
 */
public class FormatMy implements Consumer<Apple>{

    @Override
    public void accept(Apple apple) {

        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        System.out.println("Displaying data about Object: " + characteristic + " " + apple.getColor() +" apple");
    }
}
