package LambdaExpressions_31.predicate.my_predicate;

import LambdaExpressions_31.predicate.Apple;
import LambdaExpressions_31.predicate.my_predicate.ApplePredicate;

/**
 * Created by CC on 09.03.2018.
 */
public class AppleRedAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean testMy(Apple apple) {
        return "red".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
