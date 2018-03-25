package LambdaExpressions_31.predicate;

/**
 * Created by CC on 09.03.2018.
 */
public class AppleWeightPredicate implements ApplePredicate {

    @Override
    public boolean testMy(Apple apple) {
        return apple.getWeight() > 150;
    }

}
