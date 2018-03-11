package LambdaExpressions_31.primitivePredicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/**
 * Created by CC on 11.03.2018.
 */

/*But this comes with a performance cost. Boxed values are essentially a wrapper around
primitive types and are stored on the heap. Therefore, boxed values use more memory and
require additional memory lookups to fetch the wrapped primitive value.
Java 8 brings a specialized version of the functional interfaces we described earlier in order to
avoid autoboxing operations when the inputs or outputs are primitives. For example, in the
following code, using an IntPredicate avoids a boxing operation of the value 1000, whereas
using a Predicate<Integer> would box the argument 1000 to an Integer object*/


public class PrimitivePredicateMy {

    public static void main(String[] args) {

        // No boxing
        IntPredicate evenNumbers = (int i) -> i % 2 == 0;
        System.out.println(evenNumbers.test(1000));

        //boxing
        Predicate<Integer> oddNumbers = (Integer i) -> i % 2 == 0;
        System.out.println(evenNumbers.test(1000));


    }
}
