package constructors_9;

/* 1. super() ������������ ��� ������ ������������
������������� ������. ���� � ������ �����������
�����������: �� ����������
��� ��������� ��������� ������

    public Dog() {
        super();
    }
� �������� ����������� ������������� ������ ������ �� Object

2. ���� � ������ ������ �����������, �� �� ������������ super(),
�� ���������� �������� ������ super() � ������ ��� �������������
�����������, ���� ������ ����������� �� ��������
������ ������������� �����������. ��� ������ ������ �����
��������� ���: super();

��������� ����, ��� ���������� ��� ��������� super(), ����������
������������ ������ ������������ ������ � ������ �������, � �����
��� ��������

������ ����������� ����� ����� ���� ����� this(), ���� super(), �� �� ��� �����!

super() ����� ������������ ��� ������ ������������� ������ */

public class ConstSuper extends Constructors {


    /* ����� ������������ ������������� ������ */
    public ConstSuper(int weight) {
        super(weight);
    }
}
