package LambdaExpressions_31.predicateMy;

import LambdaExpressions_31.Apple;
import LambdaExpressions_31.predicateMy.ApplePredicate;

/**
 * Created by CC on 09.03.2018.
 */
public class AppleRedAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
