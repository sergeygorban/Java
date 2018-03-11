package LambdaExpressions_31.predicate;

import java.util.function.Predicate;

/**
 * Created by CC on 12.03.2018.
 */
public class AppleRedPredicate implements Predicate<Apple> {

    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor());
    }
}
