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

Anonymous� We say anonymous because it doesn�t have an explicit name like a method would normally have: less to
write and think about!
Function� We say function because a lambda isn�t associated with a particular class like a method is. But like a
method, a lambda has a list of parameters, a body, a return type, and a possible list of exceptions that can be thrown.
Passed around� A lambda expression can be passed as argument to a method or stored in a variable.
Concise� You don�t need to write a lot of boilerplate like you do for anonymous classes.

So where exactly can you use lambdas? You can use a lambda expression in the context of a
functional interface.


*/


import java.util.ArrayList;
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
