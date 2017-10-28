package fields_3;

/* Поле класса определяют, из каких данных будут состоять объекты этого класса.

Свойства:
    1. Могут быть ссылками на другие объекты или простыми данными.
    2. Объявляются внутри класса, но за пределами метода
    3. Могут иметь значения по умолчанию
    4. Поля состоят из:
            Модификатора доступа (может отсутствовать)
        Типа
        Имени
        Может присутствовать или отсутствовать значение поля
*/

public class Fields {

    /* Объявление */
    private int a;

    /* Объявление и инициализация (присвоение значения) */
    private int c = 18;

    /* Без модификатора доступа */
    String b;

    /* Если значение явно не присвоено, устанавливается по умолчанию:
            Целые = 0
            С плавающей точкой = 0,0
            Логические = False
            Ссылочные = null */

    public int a1;
    float a2;
    boolean a3;
    Fields def;

    public static void main(String[] args) {

        Fields fields = new Fields();

        System.out.println(fields.a1);
        System.out.println(fields.a2);
        System.out.println(fields.a3);
        System.out.println(fields.def);

    }
}
