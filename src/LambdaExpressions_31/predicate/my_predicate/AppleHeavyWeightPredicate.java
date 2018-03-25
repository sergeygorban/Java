package LambdaExpressions_31.predicate.my_predicate;

import LambdaExpressions_31.predicate.Apple;
import LambdaExpressions_31.predicate.my_predicate.ApplePredicate;

/**
 * Created by CC on 10.03.2018.
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {

    @Override
    public boolean testMy(Apple apple) {
        return apple.getWeight() > 150;
    }
}
