package generics_11;

import java.util.Date;

/* ���������� ������ ����� ���������� ��� � �������, ��� � � ���������� �������.
����� ���������� ���������� �����, ��� ����� �������� ���������� ����
������, �������� �� � ������� ������ ����� ������ ������

*/
public class GeneralizedMethod {

    public <T> T getNum(T a) {
        return a;
    }

    public static void main(String[] args) {

        GeneralizedMethod method = new GeneralizedMethod();
        System.out.println(method.getNum(new Date()));

        GeneralizedMethod method1 = new GeneralizedMethod();
        System.out.println(method.<String>getNum("78"));
    }
}
