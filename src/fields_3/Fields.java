package fields_3;

/* ���� ������ ����������, �� ����� ������ ����� �������� ������� ����� ������.

��������:
    1. ����� ���� �������� �� ������ ������� ��� �������� �������.
    2. ����������� ������ ������, �� �� ��������� ������
    3. ����� ����� �������� �� ���������
    4. ���� ������� ��:
            ������������ ������� (����� �������������)
        ����
        �����
        ����� �������������� ��� ������������� �������� ����
*/

public class Fields {

    /* ���������� */
    private int a;

    /* ���������� � ������������� (���������� ��������) */
    private int c = 18;

    /* ��� ������������ ������� */
    String b;

    /* ���� �������� ���� �� ���������, ��������������� �� ���������:
            ����� = 0
            � ��������� ������ = 0,0
            ���������� = False
            ��������� = null */

    public int a1;
    float a2;
    boolean a3;
    Fields def;

    public static void main(String[] args) {

        Fields fields = new Fields();

        System.out.println(fields.a1);
        System.out.println(fields.a2);
        System.out.println(fields.a3);
        System.out.println(fields.def);

    }
}
