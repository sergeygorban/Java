package logic_6;

/**
 * Created by CC on 14.06.2017.
 */
public class UndefinedLoops {

    public static void main(String[] args) {

        int a = 0;

        while (a < 10) {
            System.out.println(a);
            a++;
        }

        /* ������� ����������� ��, ��� ���������
        � ���� do, � ����� ������� � while
        do while ����������� ������ ���� �� 1 ���
        */
        do {
            a++;
            System.out.println(a);
        }
        while (a < 0);
    }
}
