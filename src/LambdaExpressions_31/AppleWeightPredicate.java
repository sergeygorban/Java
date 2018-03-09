package LambdaExpressions_31;

/**
 * Created by CC on 09.03.2018.
 */
public class AppleWeightPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
