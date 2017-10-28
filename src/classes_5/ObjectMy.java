package classes_5;

/* Класс Object является исходным предшественником всех классов в Java,
поэтому каждый класс в Java расширяет класс Object.
Но явно отражать этот факт совсем не обязательно.

Свойства:
    1. Переменную типа Object можно использовать в качестве ссылки
    на объект любого. Разумеется, переменная этого класса полезна
    лишь как средство для хранения значений произвольного типа.
*/


public class ObjectMy {

    public static void main(String[] args) {

        /* Ссылка на любой объект */
        Object object = new ObjectMy();

        ObjectMy objectMy = new ObjectMy();

        /* getClass() возвращает класс объекта */
        System.out.println(object.getClass());

        /* Проверка принадлежности объекта к классу */
        System.out.println(object instanceof Object);

        /* Возвращает имя класса.*/
        System.out.println(object.getClass().getName());

        /* Возвращает имя суперкласса данного класса в виде объекта типа Class. */
        System.out.println(object.getClass().getSuperclass());
    }


}
