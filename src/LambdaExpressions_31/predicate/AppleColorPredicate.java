package LambdaExpressions_31.predicate;

/**
 * Created by CC on 09.03.2018.
 */
public class AppleColorPredicate implements ApplePredicate {

    @Override
    public boolean testMy(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
