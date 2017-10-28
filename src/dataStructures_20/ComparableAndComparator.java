package dataStructures_20;


/* ����� � ������� ���������� ������������� �������, �� ����������
����������� ��������� Comparable ��� �� ������� ����� compare ��
���������� Comparator

�������� compareTo:
    1. ����� ������������� ����� ��������, ��� ������, ���������� � ��������
    ���������, ������ �������, �� �������� ��������� �����.
    2. ��������� ������������� �����, �� ��������������, ��� ���������,
    �� �������� ��������� compareTo(), ������ ����������� ��� ���������.
    3. ���� ��������, ��� ������� ����� (�� ������� ���� � ����� ������
    ����������).

sort() ��������:
    1. ����� ������ sort(List �) � ����� ���������� ��������, ��� �������
    ���������� ������ compareTo() ������� ��������. �� ���� ������� ��������
    ������ ������ ������������� ��������� Comparable.
    2. ����� sort(List �, Comparator �) ��������, ��� ������ compareTo(),
    ������������� ��������� ������, �� ����� ����������. ������ ����� �����
    ������������ ����� compare() �� Comparator. � ����� ������ ��������
    ������ �� ������ ������������� ��������� Comparable.
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ComparableAndComparator {



    public static void main(String[] args) {

        ArrayList<ListObg> listObj = new ArrayList<ListObg>();
        listObj.add(new ListObg("Asd",24));
        listObj.add(new ListObg("Dfg",35));
        listObj.add(new ListObg("Rty",100));

        //��� ����������
        System.out.println(listObj);

        /* ����� sort() ��������� Comparable */
        Collections.sort(listObj);
        System.out.println(listObj);

        // ����� sort() ��������� Comparator */
        Collections.sort(listObj, new ComparatorMy());
        System.out.println(listObj);

        Collections.sort(listObj);
        System.out.println(listObj);

    }
}
