package blockInit_26;

/* ����������� ���� �������������

����������� ���� ������������� �����������
����� ����� �������� ������, ����� ������� ������
������������ ������ � ������, ��� ����� ���� ������������
����� ����������� ���������� */

public class StaticBlockInit {

    public static final int CONST;

    public StaticBlockInit() {
        System.out.println("Works after static block");
    }

    static {
        System.out.println("static block works first");
        CONST = 123;
    }

    public static void main(String[] args) {

    }
}
