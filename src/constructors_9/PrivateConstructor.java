package constructors_9;


/* ������ �������� ����������� ������

���� ����� �������� ������ ����������� ������ ���
�� ����� �� ������ ������� ���������� ���������
�������� ����������� ������, �� ���������� ��������
� ����� ������ ����������� � ������������� �������
private

��������� ����� Main � ������ ������, ��������� ���������
��������� ������� ������, �� ���� ����������� �������
��������� ������ � ������ ������, �� ���������� ������ ������*/

public class PrivateConstructor {

    public int a = 4;
    private PrivateConstructor() {

    }

    public static void main(String[] args) {

        PrivateConstructor constructor = new PrivateConstructor();
        System.out.println(constructor.a);

    }
}
