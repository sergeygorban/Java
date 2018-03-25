package LambdaExpressions_31.predicate.my_predicate;

import LambdaExpressions_31.predicate.Apple;
import LambdaExpressions_31.predicate.my_predicate.ApplePredicate;

/**
 * Created by CC on 09.03.2018.
 */
public class AppleColorPredicate implements ApplePredicate {

    @Override
    public boolean testMy(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
