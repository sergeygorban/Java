package string_19;

/*
1. ����� ��������� ��� ���������� ������ �� ���������, ���������� ������� �����
equals ().

2. ��� ���� ����� ��������� ������������ �����, ��������� ������� � ���������
� �������� ������, ������� ������� ����� equalsIgnoreCase ()

3. ��� �������� ���������� ����� �� ��������� ������ ��������� �������� == . ���
���� ����������, �������� �� ��� ������ � ����� � ��� �� ������� ������.
����������, ���� ��� ������ �������� � ����� � ��� �� �����, ��� ������ ���������.
�� ������ �������� ��������, ����� ���������� ���������� ������ �������� � ������
������

*/
public class CompareStrings {

    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        String d = "JAVA";

        if (a == b) {
            System.out.println("a and b = true");
        }

        if (a == c) {
            System.out.println("a and c = true");
        } else {
            System.out.println("a and c = false");
        }

        if (a.equals(c)) {
            System.out.println("a and c = true");
        }

        if (a.equalsIgnoreCase(d)) {
            System.out.println("a and d = true");
        }


    }
}
