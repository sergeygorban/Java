package LambdaExpressions_31;

/* ������-��������� � ��� ���� ����, ������� ����������
��� ������������ ���������� ���� ��� ��������� ���.

������-��������� ����� ������������ ������ ���,
����� ��������� ������ ������, ������������ ��������� �
������������ ����������� �������.
����� ��������� ���������� ��������������.

�������� :: �������� ��� ������ �� ����� ������ ��� �������.
���� ��������� ��� ������������� ���� ��������:
    1. ������::���������������
    2. �����::����������������
    3. �����::���������������


� ������ �� ����� ����������� ��������� ������ this. ��������, ������ �� �����
this:: equals ����������� ������-��������� � -> this. equals ( � ).
��� �� ��������� � � ������ super. ���, � ��������� ������ �� �����:
super::���������������
������ super �������� ������� � �������� ������� ��������� ������ ���������� ��
�����������.


������ �� ������������ ��������� ����� �� �������, ��� � ������ �� ������,
�� ����������� ����, ��� ������ ����� ������ ����������� �������� new. ��������,
������ Person: :new �������� �� ����������� ������ Person.


*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LambdaExpressions {

    public String name;
    public String firstName;

    public LambdaExpressions(String name, String firstName) {
        this.name = name;
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return "LambdaExpressions{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Asd");
        arrayList.add("Asdf");
        arrayList.add("jvjdshddf");
        arrayList.add("cvbb");

        /* ������ � �������� ������ comparator */
        Collections.sort(arrayList,(String a, String b) -> a.length() - b.length());
        System.out.println(arrayList);

        Collections.sort(arrayList,new Comparatori().comparator);
        System.out.println(arrayList);

        /* �������� :: �������� ��� ������ �� ����� ������ ��� �������.*/
        Collections.sort(arrayList,String::compareToIgnoreCase);
        System.out.println(arrayList);

        ArrayList<LambdaExpressions> arrayList1 = new ArrayList<>();
        arrayList1.add(new LambdaExpressions("Serg","Dof"));
        arrayList1.add(new LambdaExpressions("Serg","Xgg"));
        arrayList1.add(new LambdaExpressions("Serg","Fop"));
        arrayList1.add(new LambdaExpressions("Soper","Sert"));

        /* ����� ������ ��������� ����� ��� ������*/
        Collections.sort(arrayList1, Comparator.comparing(LambdaExpressions::getName));
        System.out.println(arrayList1);

        /* ���������� ������������ */
        Collections.sort(arrayList1, Comparator.comparing(LambdaExpressions::getName).thenComparing(LambdaExpressions::getFirstName));
        System.out.println(arrayList1);
    }
}
