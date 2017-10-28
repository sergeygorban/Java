package LambdaExpressions_31;

/* Лямбда-выражение — это блок кода, который передается
для последующего выполнения один или несколько раз.

Лямбда-выражение можно предоставить всякий раз,
когда ожидается объект класса, реализующего интерфейс с
единственным абстрактным методом.
Такой интерфейс называется функциональным.

операция :: отделяет имя метода от имени класса или объекта.
Ниже приведены три разновидности этой операции:
    1. Объект::МетодЗкземпляра
    2. Класс::СтатическийМетод
    3. Класс::МетодЗкземпляра


В ссылке на метод допускается указывать ссылку this. Например, ссылка на метод
this:: equals равнозначна лямбда-выражению х -> this. equals ( х ).
Это же относится и к ссылке super. Так, в следующей ссылке на метод:
super::МетодЗкземпляра
ссылка super является целевой и вызывает вариант заданного метода экземпляра из
суперкласса.


Ссылки на конструкторы действуют таким же образом, как и ссылки на методы,
за исключением того, что вместо имени метода указывается операция new. Например,
ссылка Person: :new делается на конструктор класса Person.


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

        /* Лямбда в качестве метода comparator */
        Collections.sort(arrayList,(String a, String b) -> a.length() - b.length());
        System.out.println(arrayList);

        Collections.sort(arrayList,new Comparatori().comparator);
        System.out.println(arrayList);

        /* операция :: отделяет имя метода от имени класса или объекта.*/
        Collections.sort(arrayList,String::compareToIgnoreCase);
        System.out.println(arrayList);

        ArrayList<LambdaExpressions> arrayList1 = new ArrayList<>();
        arrayList1.add(new LambdaExpressions("Serg","Dof"));
        arrayList1.add(new LambdaExpressions("Serg","Xgg"));
        arrayList1.add(new LambdaExpressions("Serg","Fop"));
        arrayList1.add(new LambdaExpressions("Soper","Sert"));

        /* Вызов лямбда выражения через имя класса*/
        Collections.sort(arrayList1, Comparator.comparing(LambdaExpressions::getName));
        System.out.println(arrayList1);

        /* Связывание компараторов */
        Collections.sort(arrayList1, Comparator.comparing(LambdaExpressions::getName).thenComparing(LambdaExpressions::getFirstName));
        System.out.println(arrayList1);
    }
}
