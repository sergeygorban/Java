package LambdaExpressions_31.predicate;

/**
 * Created by CC on 09.03.2018.
 */
public class AppleRedAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean testMy(Apple apple) {
        return "red".equals(apple.getColor()) && apple.getWeight() > 150;
    }
}
