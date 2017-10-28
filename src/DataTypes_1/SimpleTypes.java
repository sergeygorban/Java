package DataTypes_1;


public class SimpleTypes {

    /* �������� 1 ����;
    �������� �� - 128 �� 127
     */
    private byte d = 23;

    /* �������� 2 �����;
    �������� �� - 32768 �� 32767
     */
    private short b = 2;

    /* �������� 4 �����;
    �������� �� -2147483648 �� 2147483647
     */
    private int a = 3;

    /* �������� 8 ����;
    �������� �� - 9223372036854775808 �� 9223372036854775807
    */
    private long c = 234587;

    /* �������� 4 ����;
    �������� �������������� �3,40282347E+38F (6-7 �������� ���������� ����)
    ��� �������� � ������ � Java ��������� � ���� double, �� ����� ������������
    ����� �������� f
     */
    private float e = 2.245f;

    /* �������� 8 ����;
    �������� �������������� �1,7976931348623157E+308F
    (15 �������� ���������� ����) �������� � ���� ��������� float
    */
    private double v = 2.345;

    /* ������ ������� �� JVM
    */
    private boolean s = true;

    /* �������� 2 �����
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
