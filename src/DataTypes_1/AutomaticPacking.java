package DataTypes_1;


/* �������������� ��������

��� �������������� ����� ���������� � ��� ��������, �������
���������� �������������

��������:
    1. ��������� �������. ���� ����� ��������� ���-�������,
����� ���������� ��� ��� ������ �� ������, ��� � ��������
���������������� �������� ����. �������� ����������� ����
����� � ���� ����� ��������� ��������, �� ����� ��������
��� ���� �������� ������������ � ��� �������� ����, ����
������ �� �������.

    2. ������������ ��������. ���� ��� ���������� ������ ������
������� ��� ������������� ��������, �� ����� ���������� ���
����������� ��������, ��� � ������ �� �������.
� ���� ��� ���������� �������������� �������, ����� ����������
���� ������ �� ���, ���� �������� �������� ����, ������� ��
�������������.

    3. ������ ��������� �����, ��� ��������� ������
��������, ����� ��������� ���� ���������, ������� ����������
boolean, ���� ����� ��������, ���� ������ �� ������� Boolean.

    4. �������� � �������. ����� ������������ ����-������� � ��������
�������� ���, ��� ��������� ������� ���. ��� ��������, ��� �� ������
���������, ������, �������� ���������� � ������ �� ������ Integer!
�� �� ���������� � ��� ����� ���� ��������� �� ������� �����������.
����� ��������� �� ������ ����������� ������ � �������� ��������
����.

    5. �������� ������������ ����� ����������� ���������� ���� �������,
���� ��������, ���� ��� ���������� ����� ��������������� ���. � �������,
���������� �������� ���� int ����� ���� ��������� ������ �� ������
Integer; ����������  ������ �� ������ Integer ����� ���� ���������
���������� �������� ���� int.



*/

import java.util.ArrayList;

public class AutomaticPacking {

    // 1.
    public int create(int a) {
        return a + 24;
    }

    // 2.
    public Integer createI(int a) {
        int b = a + 3;
        return b;
    }

    public void automaticPacking () {

        /* ��� ���������� �������� � ����� int, ����������
        ������������� ������� �������*/
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(3);

        /* ��� ���������� ���������� ������������� �������
        �������*/
        int a = arrayList.get(0);
    }

    public static void main(String[] args) {

        // 1.
        Integer b = new Integer(12);
        AutomaticPacking packing = new AutomaticPacking();
        System.out.println(packing.create(b));

        // 2.
        System.out.println(packing.createI(3));

        // 4.
        System.out.println(b++);

        // 5.

        int c = new Integer(4);
        int c1 = b;

    }

}
