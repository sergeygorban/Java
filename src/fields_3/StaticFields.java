package fields_3;

/* ����������� ����������

���������� ����������� � �������� ������ static
�������� �����������.

��������:
    1. ����������� ���������� ����� ���������� ��������
    ��� ���� ����������� ������, �� ���� ���� �������� ���
    ������*/

public class StaticFields {

    public static int a = 1;

    public static void main(String[] args) {

        StaticFields variables = new StaticFields();
        System.out.println(variables.a);

        StaticFields variables1 = new StaticFields();
        System.out.println(variables1.a);

    }
}
