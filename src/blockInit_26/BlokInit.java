package blockInit_26;


/*���� ������������� ����������� ������, � �����
�� ��� � ���� ������������.
���� �������� ���������� �� ���������� � ������ ��
�����������. ������� ���� ����������� ����� ��������
������� ������� ��������� �������� �����.*/

public class BlokInit {

    public int a;
    public String b;

    {
        a = 23;
        System.out.println("a: " + a);
    }

    public BlokInit(String b) {
        this.b = b;
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {

        BlokInit blokInit = new BlokInit("Qwerty");

    }
}
