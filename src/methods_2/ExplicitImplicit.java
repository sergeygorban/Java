package methods_2;


/*
� ������ setAge() ������� ��� ���������. ������ ��������, ����������
�������, ������������ ����� ������ �� ������ ���� ExplicitImplicit, ������� �����������
����� ������ ������. � ������ �������� ���������� ����� � ����������� ��� �����
� ������� ����� ����� ������� ������.
�������� ��������, ��� ����� ��������� ������������� � ���������� ������,
�������� int age. ������� �������� � ���������� ������ �� ����������. � ������ ������
�������� ����� this ���������� ������� ��������.

*/

public class ExplicitImplicit {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        ExplicitImplicit explicitImplicit = new ExplicitImplicit();
        explicitImplicit.setAge(35);

        System.out.println(explicitImplicit.getAge());
    }
}
