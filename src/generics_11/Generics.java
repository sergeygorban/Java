package generics_11;

/* ������� ����� ��������� ����������� � ����������� ��������� ���������� � ����� ������
����� ���������. ����� �������, ��������� �� �������� ��� �������� ������ Dog ����,
��� ��������� Duck.

����� ��������� ����������, ���� ��� ���������� �������� ������� ��������. ����������
���������� ������ �������� � ����� ��������� ������� ���������.

public <T extends Animal> void get() - ����� ������ �������, ��� ����� ����� ���������
��� ������ Animal ��� ��� ����� �������� �����, � ����� ���� Animal �������� �����������,
�� � ������, ������� ��������� ��������� Animal.

<> - ��� ����������� ��������, ������ ��� ������� ������, ���������� ����. ���������
������������ ��������� ������������ ������ � ��������� new. ���������� ���������,
��� ������ ���������� � ����� ���������. ���� ��� ������������� ����������,
���������� ������ ��� ������������ �� ������, �� ���������� ������� ���������
���������� ��� ����������, ��������� ��� ������, � ����� ��������� ���� ��� � ������� ������.

���������� ���������������� �������� ��������� ����, ������� ����� ���� ������������ ����������� � ��������� ����� ������ �����.


*/


import java.util.ArrayList;

public class Generics {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

    }
}
