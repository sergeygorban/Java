package exceptions_25;


/* ����������� ����������

����������� ���������� - ��� ����������, ������� ��������� ����������
� ����� ����������� ���������� ��� ����������, ����� RuntimeException �
��� �����������.


��� ����������� ���������� ������ ���� ���������  � ����������

������������� ����������:
���� ����� ����������� ���������� � �� ������������ ���, �� ���������
������ ���������� �������� �� ���������� �����, ������ �� ������ Main.
����� ��������� ���������� �������������� ���������� */


public class ExceptionsChecked {

    // ���������� � ������������ ����������
    public void createE(int a) throws Exception {
        if (a < 1) {
            throw new Exception("exception occurred");
        }
    }

    public void get() throws Exception {
        createE(5);
    }

    // ������� ���������� �� Main
    public static void main(String[] args) throws Exception {

        ExceptionsChecked checked = new ExceptionsChecked();
        checked.createE(0);

    }
}
