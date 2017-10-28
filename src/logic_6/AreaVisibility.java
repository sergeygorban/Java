package logic_6;

/* Все локальные переменные, объвленные внутри оператора,
видны только в нем */

public class AreaVisibility {

    public static void main(String[] args) {

        String a = "Java";

        if (a.equals("Java")) {
            String b = "is";
        } else {

            /* b внутри данного блока не видна
               a видна*/
            String c = "is" + a;
        }
    }
}
