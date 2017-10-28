package DataTypes_1;


/* ОБЕРТКИ ДЛЯ ПРИМИТИВОВ

Если необходимо использовать примитив как объект,
то используется обертка.
Существуют классы-обертки для каждого простого типа.

В куче создается объект Integer, внутри которого
находится поле с типом int = 23
*/

public class WrapperForPrimitives {



    public static void main(String[] args) {
        int a = 23;

        Integer integer = new Integer(a);

        System.out.println(a);
        System.out.println(integer);
    }

}
