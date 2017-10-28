package generics_11;

/* ���������� ���������� ����� � ����� ��� ����������� ����������� ����.
� - ��� ���������� ����. � ����������� ������ ����� ���� ����� ����� ���������� ����

� ������ ���������� ���� ������� ����������� ��������� ����� � ���������� � ��
���������. ���, � ����������� ���������� Java ������ � ������������ ��� �������� ���������,
������� � � V � ���� ������ � �������� � �������, � ������ � (� ��������� ������� S � � ���
�������������) � "����� ��� ������", ��� ���������� � ������������.

����� �������, ���������� ����� ��������� ��� ������� ������� �������.

����������� � ����������:
    1. ����������� ��� ������ ���������� ������ ���� ���������. ��� ��������, ���
       �� ������ ������� ���� Pair<double>, � ������ ������ ���� Pair<Double>.
    2. ������� ����������������� ����� �����������. ������: Pair<String>[] table = new Pair<String>[10];
    3. ������ ������������ ��� ������������� ���������� ����������� ������ � ���� ����������


*/


import java.util.Date;

public class GeneralizedClass <T,U> {

    private T name;
    private U age;
    private T number;

    public GeneralizedClass(T name, U age, T number) {

        this.name = name;
        this.age = age;
        this.number = number;
    }

    public T getName() {
        return name;
    }

    public U getAge() {
        return age;
    }

    public T getNumber() {
        return number;
    }



    public static void main(String[] args) {

        GeneralizedClass<String,String> generalizedClass = new GeneralizedClass("Jora", "32", "32");
        System.out.println(generalizedClass.getName());

        GeneralizedClass<String,Integer> generalizedClass1 = new GeneralizedClass("Jora", 32, 32);
        System.out.println(generalizedClass.getAge());
        System.out.println(generalizedClass.getNumber());


    }


}
