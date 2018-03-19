package jmeter;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by CC on 19.03.2018.
 */
public class Big {


    public static void main(String[] args) {


        double a = 23.22;
        double a1 = 23;

        BigDecimal bigDecimal = new BigDecimal(a,new MathContext(10));
        BigDecimal bigDecimal1 = new BigDecimal(a1,new MathContext(10));
        BigDecimal bigDecimal2 = new BigDecimal(a,new MathContext(10,RoundingMode.DOWN));


        System.out.println(bigDecimal);
        System.out.println(bigDecimal1);
        System.out.println(bigDecimal2);
        System.out.println();


        BigDecimal bigDecimal3 = new BigDecimal(a).setScale(6,BigDecimal.ROUND_DOWN);
        BigDecimal bigDecimal4 = new BigDecimal(a).setScale(6,1);


        System.out.println(bigDecimal3);
        System.out.println(bigDecimal4);
        System.out.println();

        BigDecimal bigDecimal5 = new BigDecimal(a,new MathContext(10,RoundingMode.DOWN)).setScale(3,BigDecimal.ROUND_UP);
        System.out.println(bigDecimal5);


        double c = -23.2242;
        BigDecimal bigDecimal6 = new BigDecimal(c).setScale(3,BigDecimal.ROUND_FLOOR);
        System.out.println(bigDecimal6);








    }

}
