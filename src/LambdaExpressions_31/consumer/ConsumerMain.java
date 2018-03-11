package LambdaExpressions_31.consumer;

import java.util.Arrays;

/**
 * Created by CC on 11.03.2018.
 */
public class ConsumerMain {

    public static void main(String[] args) {

        ConsumerMy.forEach(Arrays.asList(1,2,3,4,5), (Integer i) -> System.out.println(i));

    }
}
