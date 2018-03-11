package LambdaExpressions_31.function;

import java.util.Arrays;
import java.util.List;

/**
 * Created by CC on 11.03.2018.
 */
public class FunctionMain {

    public static void main(String[] args) {

        List<Integer> l = FunctionMy.map(Arrays.asList("first","sec","apple"), (String s) -> s.length());
        System.out.println(l);
    }
}
