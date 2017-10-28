package logic_6;

/**
 * Created by CC on 14.06.2017.
 */
public class DefinedLoops {

    public static void main(String[] args) {

        /*В нем количество повторений находится под управлением
        переменной, выполняющей роль счетчика и обновляемой
        каждом шаге цикла. */

        /* Область действия i простирается до конца тела цикла,
        за пределами цикла недоступна */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        /* Область действия i простирается до конца тела цикла
        и за пределы цикла */
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(i);
    }
}
