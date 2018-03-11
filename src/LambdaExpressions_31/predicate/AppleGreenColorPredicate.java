package LambdaExpressions_31.predicate;

/**
 * Created by CC on 10.03.2018.
 */
public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
