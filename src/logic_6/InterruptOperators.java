package logic_6;

/**
 * Created by CC on 14.06.2017.
 */
public class InterruptOperators {

    public static void main(String[] args) {

        //Прерывание цикла
        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;

            if (i == 5) {
                System.out.println("Остановка цикла");
                break;
            }
        }

        // Прерывание цикла и переход к метке
        int i1 = 0;

        stop_while:
        while (i1 < 10) {
            System.out.println("i:" + i1);

            for (int a = 0; a < i1; a++) {
                System.out.println("a: " + a);

                if (a == 4) {
                    System.out.println("Цикл while остановлен из цикла for");
                    break stop_while;
                }
            }
            i1++;
        }

        // Переход в начало цикла
        int i2 = 0;

        while (i2 < 10) {
            i2++;
            if (i2 == 5) continue;
            System.out.println("i:" + i);
        }
    }
}
