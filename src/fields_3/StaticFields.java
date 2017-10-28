package fields_3;

/* СТАТИЧЕСКАЯ ПЕРЕМЕННАЯ

Переменная объявленная с ключевым словом static
является статической.

Свойства:
    1. Статическая переменная имеет одинаковое значение
    для всех экземпляров класса, то есть одно значение для
    класса*/

public class StaticFields {

    public static int a = 1;

    public static void main(String[] args) {

        StaticFields variables = new StaticFields();
        System.out.println(variables.a);

        StaticFields variables1 = new StaticFields();
        System.out.println(variables1.a);

    }
}
