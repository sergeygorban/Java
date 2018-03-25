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
        System.out.println();

        //http://pr0java.blogspot.com/2015/05/biginteger-bigdecimal_70.html
        double c1 = -23.5335;
        double c2 = 23.5335;

        BigDecimal bigDecimal6 = new BigDecimal(c1).setScale(3,BigDecimal.ROUND_CEILING);
        BigDecimal bigDecimal7 = new BigDecimal(c2).setScale(3,BigDecimal.ROUND_CEILING);

        System.out.println(bigDecimal6);
        System.out.println(bigDecimal7);
        System.out.println();

        BigDecimal bigDecimal8 = new BigDecimal(c1).setScale(3,BigDecimal.ROUND_DOWN);
        BigDecimal bigDecimal9 = new BigDecimal(c2).setScale(3,BigDecimal.ROUND_DOWN);

        System.out.println(bigDecimal8);
        System.out.println(bigDecimal9);
        System.out.println();

        BigDecimal bigDecimal10 = new BigDecimal(c1).setScale(3,BigDecimal.ROUND_UP);
        BigDecimal bigDecimal11 = new BigDecimal(c2).setScale(3,BigDecimal.ROUND_UP);

        System.out.println(bigDecimal10);
        System.out.println(bigDecimal11);
        System.out.println();

        BigDecimal bigDecimal12 = new BigDecimal(c1).setScale(3,BigDecimal.ROUND_FLOOR);
        BigDecimal bigDecimal13 = new BigDecimal(c2).setScale(3,BigDecimal.ROUND_FLOOR);

        System.out.println(bigDecimal12);
        System.out.println(bigDecimal13);
        System.out.println();

        BigDecimal bigDecimal14 = new BigDecimal(c1).setScale(3,BigDecimal.ROUND_HALF_UP);
        BigDecimal bigDecimal15 = new BigDecimal(c2).setScale(3,BigDecimal.ROUND_HALF_UP);

        System.out.println(bigDecimal14);
        System.out.println(bigDecimal15);
        System.out.println();


        double c22 = 23;
        BigDecimal bigDecimal16 = new BigDecimal(c22).setScale(0,BigDecimal.ROUND_UNNECESSARY);
        System.out.println(bigDecimal16);

        double c11 = -23;
        double c211 = 12;
        double c311 = 3;

        BigDecimal bigDecimal311 = new BigDecimal(c211).setScale(3,BigDecimal.ROUND_CEILING).multiply(new BigDecimal(c311));
        System.out.println("bigDecimal3: " + bigDecimal311);










    }

}
