package operations_8;


public class Operations {

    public static void main(String[] args) {

        double x = 1.345;

        /* Статическое приведение типов */
        int a = (int) x;

        /* Присваивания и арифметическая операция */
        int c = 1;
        c += 4;
        // или
        c = c + 4;
        System.out.println(c);

        /* Пользоваться операциями инкрементирования и декрементирования
        в выражениях не рекомендуется, поскольку это зачастую запутывает
        код и приводит к досадным ошибкам*/

        /* Инкрементирование (добавление единицы): Префиксная форма */

        int y = 1;
        System.out.println("Incrementing: " + y++);
        System.out.println("After Incrementing: " + y);
        System.out.println();

        /* Декрементирование (отнимание единицы): Префиксная форма */

        int y1 = 1;
        System.out.println("Decreasing: " + y1--);
        System.out.println("After Decreasing: " + y1);
        System.out.println();

        /* Инкрементирование: Постфиксная форма */

        int y2 = 1;
        System.out.println("Incrementing: " + ++y2);
        System.out.println("After Incrementing: " + y2);
        System.out.println();

        /* Декрементирование: Постфиксная форма */

        int y3 = 1;
        System.out.println("Decreasing: " + --y3);
        System.out.println("After Decreasing: " + y3);
        System.out.println();

        /* Тернарная операция
        условие ? выражение_1 : выражение_2
        Если условие истинно, то вычисляется первое выражение,
        а если оно ложно — второе выражение.*/

        int v = 2;
        System.out.println(v == 2 ? v + 1: v + 2);






    }
}
