package string_19;

/*
1. ������ ��������� ���������� ������ ������� �����.
������ ������ �������� � Java ��������, � �������
�������� ������� (�.�. 0) ����� ���������� ������ �
������ ����������.
��� ��������� ����� ������ ������������ ����� length()

2. � ���������� ���� String ����� ����� ���������
����������� ������ �������� null, ����������� �� ��,
��� � ��������� ������ �� ���� �� �������� �� ������
� ������ ����������. ����� ���������, �������� ��
���������� ������ �������, �.�. �������� �������� null,
������ ������� if (str == null).

*/


public class EmptyNull {

    public static void main(String[] args) {

        String a = "";
        String b = null;

        if (a.length() == 0) {
            System.out.println("String is empty");
        }

        if (a.equals("")) {
            System.out.println("String is empty");
        }

        if (b == null) {
            System.out.println("String is empty");
        }
    }


}
