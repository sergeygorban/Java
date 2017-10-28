package generics_11;

import java.util.Date;

/* ќбобщенные методы можно определ€ть как в обычных, так и в обобщенных классах.
 огда вызываетс€ обобщенный метод, ему можно передать конкретные типы
данных, заключа€ их в угловые скобки перед именем метода

*/
public class GeneralizedMethod {

    public <T> T getNum(T a) {
        return a;
    }

    public static void main(String[] args) {

        GeneralizedMethod method = new GeneralizedMethod();
        System.out.println(method.getNum(new Date()));

        GeneralizedMethod method1 = new GeneralizedMethod();
        System.out.println(method.<String>getNum("78"));
    }
}
