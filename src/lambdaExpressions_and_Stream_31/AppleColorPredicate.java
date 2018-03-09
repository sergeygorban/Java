package lambdaExpressions_and_Stream_31;

/**
 * Created by CC on 09.03.2018.
 */
public class AppleColorPredicate implements ApplePredicate {


    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
