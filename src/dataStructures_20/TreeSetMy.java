package dataStructures_20;

/* ������ �������� ���������������� � ������������� ������������.

���� ����� ������� �������� ��� ��� �������, ����� ��� ����� ���������
(�� ��������� � ��� ������ �����) ��� ����� �� ������, ��� ������ ������
������ ���������� ��������������� � ���������� �������. � ������ �������,
���� ��� �� �����, ����� ������ ��������� ���������������, TreeSetMy �����
��������� ���������� � ������ ���, ����� �� ���������� � ���� ��������
����� ������ ����� �� ����� ����� ��� ����� ��������.

��������� TreeSetMy, ��� � HashSet, ������������� ������������ ���������.
����� ����, ��� ��������� �� ����������������. ��� �������� ���������� ������ sort() � ���
�������� ���������� TreeSet � ������� ������������, �� ������������ ���������, ���
���������� ����� ����������� ����� compareTo() ������� ��������. �� ������ ����� �� ������
�������� Comparator � ����������� TreeSet. ���������� ��������� ����������� � ���, ���,
���� ��� �� ����� ����������, �� ��� ����� ��������������� �� ��� ���������
������������������. �� ��� ����������� ���������� ���� ������ ����� ����������� ���������.

��� ������������� TreeSet ������ ����������� ���� �� ���� �������:
    1. �������� � ������ ������� ����� ���, ������� ���������
       ��������� Comparable.

    ���
    2. ��� �������� TreeSet �� ����������� ������������� �����������, �������
    ��������� Comparator

����� TreeSet ��������� ����������� ���������, �������� ���-���������, ��
� ����� �������������� �������������������: ����������� ��������� ������������ ����� ��������������� ���������. � ����� ��������� ����� ������� ��������
� ����� �������. ����� �� ����������� ������� �� ���������, ����������� �� ��� �������� ����������� ������������� ����������������.

��� ������� �� ����� ������ TreeSet, ���������� �������������� �����������
���������� ������. (� ������� ���������� ������������ ��������� ��� �����������
������-������� ������.






*/

import java.util.TreeSet;

public class TreeSetMy {

    public static void main(String[] args) {

        TreeSet<ListObg> treeSet = new TreeSet<ListObg>();
        treeSet.add(new ListObg("Asd", 24));
        treeSet.add(new ListObg("Asd", 24));
        treeSet.add(new ListObg("gbn", 33));
        treeSet.add(new ListObg("tr", 66));
        treeSet.add(new ListObg("bn", 55));
        treeSet.add(new ListObg("xcv", 33));

        System.out.println(treeSet);

        TreeSet<ListObg> treeSet1 = new TreeSet<ListObg>(new ComparatorMy());
        treeSet1.add(new ListObg("Asd", 24));
        treeSet1.add(new ListObg("Asd", 24));
        treeSet1.add(new ListObg("gbn", 33));
        treeSet1.add(new ListObg("tr", 66));
        treeSet1.add(new ListObg("bn", 55));
        treeSet1.add(new ListObg("xcv", 33));

        System.out.println(treeSet1);
    }


}
