package LambdaExpressions_31.predicateMy;

import LambdaExpressions_31.Apple;
import LambdaExpressions_31.predicateMy.ApplePredicate;

/**
 * Created by CC on 10.03.2018.
 */
public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
