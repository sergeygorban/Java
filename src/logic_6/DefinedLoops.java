package logic_6;

/**
 * Created by CC on 14.06.2017.
 */
public class DefinedLoops {

    public static void main(String[] args) {

        /*� ��� ���������� ���������� ��������� ��� �����������
        ����������, ����������� ���� �������� � �����������
        ������ ���� �����. */

        /* ������� �������� i ������������ �� ����� ���� �����,
        �� ��������� ����� ���������� */
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        /* ������� �������� i ������������ �� ����� ���� �����
        � �� ������� ����� */
        int i = 0;
        for (i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(i);
    }
}
