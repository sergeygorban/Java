package operations_8;


public class Operations {

    public static void main(String[] args) {

        double x = 1.345;

        /* ����������� ���������� ����� */
        int a = (int) x;

        /* ������������ � �������������� �������� */
        int c = 1;
        c += 4;
        // ���
        c = c + 4;
        System.out.println(c);

        /* ������������ ���������� ����������������� � �����������������
        � ���������� �� �������������, ��������� ��� �������� ����������
        ��� � �������� � �������� �������*/

        /* ����������������� (���������� �������): ���������� ����� */

        int y = 1;
        System.out.println("Incrementing: " + y++);
        System.out.println("After Incrementing: " + y);
        System.out.println();

        /* ����������������� (��������� �������): ���������� ����� */

        int y1 = 1;
        System.out.println("Decreasing: " + y1--);
        System.out.println("After Decreasing: " + y1);
        System.out.println();

        /* �����������������: ����������� ����� */

        int y2 = 1;
        System.out.println("Incrementing: " + ++y2);
        System.out.println("After Incrementing: " + y2);
        System.out.println();

        /* �����������������: ����������� ����� */

        int y3 = 1;
        System.out.println("Decreasing: " + --y3);
        System.out.println("After Decreasing: " + y3);
        System.out.println();

        /* ��������� ��������
        ������� ? ���������_1 : ���������_2
        ���� ������� �������, �� ����������� ������ ���������,
        � ���� ��� ����� � ������ ���������.*/

        int v = 2;
        System.out.println(v == 2 ? v + 1: v + 2);






    }
}
