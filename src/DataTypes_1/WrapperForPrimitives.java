package DataTypes_1;


/* ������� ��� ����������

���� ���������� ������������ �������� ��� ������,
�� ������������ �������.
���������� ������-������� ��� ������� �������� ����.

� ���� ��������� ������ Integer, ������ ��������
��������� ���� � ����� int = 23
*/

public class WrapperForPrimitives {



    public static void main(String[] args) {
        int a = 23;

        Integer integer = new Integer(a);

        System.out.println(a);
        System.out.println(integer);
    }

}
