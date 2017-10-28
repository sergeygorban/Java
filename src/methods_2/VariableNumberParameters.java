package methods_2;


/* (...) ������������ ����� ���� Java. ��� ��������� �� ��, ���
� ���������� � ��������� a ����� ��������� ����� ���������� ��������.
�� ��������, ����� sum1 �������� ��� ���������: ������ � ������
���� Integer[], � ������� �������� ��� ��������� ���������.
*/

public class VariableNumberParameters {

    public int sum(int...a) {
        int b = 0;
        for (int i: a) {
            b = i + b;
        }

        return b;
    }

    public String sum1(String a, Integer...b) {
        int c = 0;
        for (int i: b) {
            c = i + c;
        }

        return c + " " + a;
    }

    public String sum2(String a, Integer...b) {
        int c = 0;
        for (int i: b) {
            c = i + c;
        }

        return c + " " + a;
    }


    public static void main(String[] args) {

        VariableNumberParameters var = new VariableNumberParameters();
        System.out.println(var.sum(1,2,3,4,5));

        System.out.println(var.sum1("12", 2, 3, 4, 5));

        System.out.println(var.sum1("12", new Integer[] {2,3,4,5}));
    }


}
