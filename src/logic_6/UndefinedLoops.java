package logic_6;

/**
 * Created by CC on 14.06.2017.
 */
public class UndefinedLoops {

    public static void main(String[] args) {

        int a = 0;

        while (a < 10) {
            System.out.println(a);
            a++;
        }

        /* Сначала выполняется то, что находится
        в теле do, а потом условие в while
        do while выполняется всегда хоты бы 1 раз
        */
        do {
            a++;
            System.out.println(a);
        }
        while (a < 0);
    }
}
