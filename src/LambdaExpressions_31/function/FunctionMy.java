package LambdaExpressions_31.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by CC on 11.03.2018.
 */

/*The java.util.function.Function<T, R> interface defines an abstract method named apply that
takes an object of generic type T as input and returns an object of generic type R. You might use
this interface when you need to define a lambda that maps information from an input object to
an output (for example, extracting the weight of an apple or mapping a string to its length). In
the listing that follows we show how you can use it to create a method map to transform a list of
Strings into a list of Integers containing the length of each String.*/


public class FunctionMy {

    public static <T,R>List<R> map(List<T> list, Function<T,R> f) {
        List<R> result = new ArrayList<>();
        for (T i: list) {
            result.add(f.apply(i));
        }

        return result;
    }
}
