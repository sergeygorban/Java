package DataTypes_1;


public class SimpleTypes {

    /* Занимает 1 байт;
    Диапазон от - 128 до 127
     */
    private byte d = 23;

    /* Занимает 2 байта;
    Диапазон от - 32768 до 32767
     */
    private short b = 2;

    /* Занимает 4 байта;
    Диапазон от -2147483648 до 2147483647
     */
    private int a = 3;

    /* Занимает 8 байт;
    Диапазон от - 9223372036854775808 до 9223372036854775807
    */
    private long c = 234587;

    /* Занимает 4 байт;
    Диапазон приблизительно ±3,40282347E+38F (6-7 значащих десятичных цифр)
    Все значения с точкой в Java относятся к типу double, по этому используется
    после значения f
     */
    private float e = 2.245f;

    /* Занимает 8 байт;
    Диапазон приблизительно ±1,7976931348623157E+308F
    (15 значащих десятичных цифр) Точность в двое превышает float
    */
    private double v = 2.345;

    /* Размер зависит от JVM
    */
    private boolean s = true;

    /* Занимает 2 байта
    */
    private char f = 'a';

    public static void main(String[] args) {

        /* Infinity */
        double a = 1;
        double b = 0;
        double c = -1;
        System.out.println(a / 0);
        System.out.println(c / 0);

        /* NaN */
        System.out.println(b / 0);

        char v = 78;
        System.out.println(v);

    }

}
