package methods_2;

/* � ����� Java ������ ������������ ������ ����� �� ��������, ��� ��� ����������� �����,
��� � ��� ��������. ��� ��������, ���
����� �������� ����� �������� ���� ����� ����������. �� ���� ������� ����� ��
����� ������������ ���������� �� ����� �� ����������, ������������ ��� � �������� ����������,
���� ��� ���������� �� �������� ��������

*/


public class CallByValue {

    public int create(int a) {
        int x = a + 3;
        return x;
    }

    public static void main(String[] args) {

        int x = 10;

        CallByValue callByValue = new CallByValue();
        System.out.println(callByValue.create(x));

        /* �������� ���������� �� ����������*/
        System.out.println(x);
    }
}
