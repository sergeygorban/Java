package arrays_21;

/*
Массив — это структура данных, в которой хранятся величины одинакового типа.
Доступ к отдельному элементу массива осуществляется по целочисленному индексу.

Нумерация элементо массива начинается с 0

Значения по умолчанию:
    1. При создании массива чисел все его элементы инициализируются нулями.
    2. Массивы значений типа boolean инициализируются логическим значением false
    3. Массивы объектов — пустым значением null, указывающим на то, что массив пока еще не
       содержит ни одного объекта.

После создания массива изменить его размер нельзя

Анонимный массив - это массив для которого не используется ссылочная
переменная
*/


import java.util.Arrays;

public class ArrayMy {

    public void create(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        /* Объяление и инициализация массива */
        int[] a = new int[5];

        /* Заполнение массива */
        a[0] = 12;
        System.out.println(a[0]);

        /* Заполнение массива в цикле */
        for (int i = 0; i < 5; i++) {
            a[i] = i;
        }

         /* Создание массива из объектов.
         Получение элемента массива и значения из элемента*/
        Dog[] dogs = new Dog[4];

        dogs[0] = new Dog("Jec");
        dogs[1] = new Dog("Des");
        dogs[2] = new Dog("Cop");
        dogs[3] = new Dog("Sar");
        System.out.println(dogs[0].getName());

        /* Выод элементов массива */
        System.out.println(Arrays.toString(a));

        /* Значения по умолчанию */
        int[] b = new int[5];
        boolean[] c = new boolean[5];
        String[] d = new String[5];

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));

        /* Определение размера массива*/
        int v = b.length;
        System.out.println("length: " + v);

        /* Перебор всех элементов массива или любой класс, который реализует
        интерфейс Iterable */
        for (int f: a) {
            System.out.println(f);
        }

        for (int x = 0; x < a.length; x++ ) {
            System.out.println(a[x]);
        }

        /* Объявление,  инициализация и создание */
        int[] m = {2,3,4,5,6,7};

        /* Анонимный массив */
        ArrayMy arrayMy = new ArrayMy();
        arrayMy.create(new int[] {2,3,4,5});

        for (int n: new int[] {3,4,5,6,7,8,9,}) {
            System.out.println(n);
        }

        /* Копирование массива */
        int[] g = Arrays.copyOf(m,24);
        System.out.println(Arrays.toString(g));

        /* Сортировка массива */
        String[] sa = {"wewe","fgfdg", "cvvb","kjasc"};
        Arrays.sort(sa);
        System.out.println(Arrays.toString(sa));

        /* Сравнение массивов */
        String[] code = {"q", "w"};
        String[] code1 = {"q", "w"};
        System.out.println(Arrays.equals(code,code1));





    }
}
