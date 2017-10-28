package classes_5;

/* ����� Object �������� �������� ���������������� ���� ������� � Java,
������� ������ ����� � Java ��������� ����� Object.
�� ���� �������� ���� ���� ������ �� �����������.

��������:
    1. ���������� ���� Object ����� ������������ � �������� ������
    �� ������ ������. ����������, ���������� ����� ������ �������
    ���� ��� �������� ��� �������� �������� ������������� ����.
*/


public class ObjectMy {

    public static void main(String[] args) {

        /* ������ �� ����� ������ */
        Object object = new ObjectMy();

        ObjectMy objectMy = new ObjectMy();

        /* getClass() ���������� ����� ������� */
        System.out.println(object.getClass());

        /* �������� �������������� ������� � ������ */
        System.out.println(object instanceof Object);

        /* ���������� ��� ������.*/
        System.out.println(object.getClass().getName());

        /* ���������� ��� ����������� ������� ������ � ���� ������� ���� Class. */
        System.out.println(object.getClass().getSuperclass());
    }


}
