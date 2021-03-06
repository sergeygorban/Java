package constructors_9;

/* ����������� - ��� ����������� �����, ��������������� ���
�������� � ������������� ���������� ������. � ������������
����� ���� ������������ ������, ��������� ���������� (������, ������� ���������� ������),
����������� ������.

�������� ������������:
    1. ����������� ����� ������������ ������� �����������
     �������
    2. ��� ������������ ������ ��������� � ������ ������.
    3. ����������� ����� ����� ���� ��� ��������� ����������
    ��� �� ������ �� �� �����.
    4. ����������� �� ���������� �������� ��������, � ������� �� ������
    5. ����������� ������ ���������� ��������� � ��������� new.
    6. ����� ����� ����� ��������� �������������.
    7. �������� ����������� ������������ � �� ����������� �� ����,
    ��� ������ ����� ���� �������� ������.
    8. ��������� ������������ ���������� ���������� �������


����������� �� ��������� - ��� �����������, ������� �������� JVM, ���� �
������ �� ���������� �� ������ ������������. ������ ����������� ���������
��� ���������� � ��� ���� (���������� ������������ ��� ����������).  � �����
������������ ���� ����� ���������� ������������� �� ��������, ���������������
�� ���������.

������������� ������������ - ��� ��������� ������������� � ����� ������

���� �� � ������ ���� ���� �� ���� ����������� � ���� �� ��������� �����������
��� ����������, �� ��������� �������, �� ������������ ���������, ������.
*/


public class Constructors {

    private int weight = 12;
    private String color;

    // ����������� ��� ����������
    public Constructors() {

    }

    // ����������� � ����� ����������
    public Constructors(int weight) {
        this.weight = weight;
    }

    // ����������� � �����������
    public Constructors(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    // ����������� � �����������, ������� �������� �������
    public Constructors(String color, int weight) {
        this.weight = weight;
        this.color = color;
    }

    /* ����� ������������ �� ������������
    this - ������ �� ������� ������.
    this ����������� ������ ���������� � ������������ */
    public Constructors(String color) {
        this(color,24);
    }
}
