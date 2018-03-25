package LambdaExpressions_31.consumer;

import LambdaExpressions_31.predicate.Apple;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by CC on 10.03.2018.
 */


public interface AppleFormatter extends Consumer<Apple> {

    @Override
    void accept(Apple apple);
}
