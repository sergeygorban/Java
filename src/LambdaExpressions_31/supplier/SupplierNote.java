package LambdaExpressions_31.supplier;

import LambdaExpressions_31.predicate.Apple;

import java.util.function.Supplier;

/**
 * Created by CC on 25.03.2018.
 */
public class SupplierNote {


    public static void main(String[] args) {

        //Creating Object. Default Constructor
        Supplier<Apple> c1 = Apple::new;
        Apple a1 = c1.get();
        System.out.println(a1.getColor());

        Supplier<Apple> c2 = () -> new Apple();
        Apple a2 = c1.get();

    }


}
