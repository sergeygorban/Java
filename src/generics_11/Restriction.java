package generics_11;

/* ������ ����� ��� ����� ��������� � ��������� ����������� �� ����������
����.

extends - �������� ��������� ��� ���������
���������� ���� ��� ����������� ����� ����� ��������� �����������

��� � � ��������� ������������ � Java, � ����������� ����� ���� ������� ������
����������, �� ������ ���� �� �������������� ����� ����� ���� �������. ����
��� ����������� ������ �����, �� ������ ���� ������ � ������ �������������
�����������.*/


import java.util.Date;

public class Restriction {

    public <T extends GeneralizedClass> T getNum(T a) {
        return a;
    }

    /* ��������� �����������*/
    public <T extends GeneralizedClass & Comparable> T getB(T a) {
        return a;
    }

    public static void main(String[] args) {

        Restriction restriction = new Restriction();
        System.out.println(restriction.getNum(new GeneralizedClass("","","")));
    }


}
