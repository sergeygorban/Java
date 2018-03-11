package LambdaExpressions_31;

/* Ћ€мбда-выражение Ч это блок кода, который передаетс€
дл€ последующего выполнени€ один или несколько раз.

Ћ€мбда-выражение можно предоставить вс€кий раз,
когда ожидаетс€ объект класса, реализующего интерфейс с
единственным абстрактным методом.
“акой интерфейс называетс€ функциональным.

операци€ :: отдел€ет им€ метода от имени класса или объекта.
Ќиже приведены три разновидности этой операции:
    1. ќбъект::ћетод«кземпл€ра
    2.  ласс::—татическийћетод
    3.  ласс::ћетод«кземпл€ра


¬ ссылке на метод допускаетс€ указывать ссылку this. Ќапример, ссылка на метод
this:: equals равнозначна л€мбда-выражению х -> this. equals ( х ).
Ёто же относитс€ и к ссылке super. “ак, в следующей ссылке на метод:
super::ћетод«кземпл€ра
ссылка super €вл€етс€ целевой и вызывает вариант заданного метода экземпл€ра из
суперкласса.


—сылки на конструкторы действуют таким же образом, как и ссылки на методы,
за исключением того, что вместо имени метода указываетс€ операци€ new. Ќапример,
ссылка Person: :new делаетс€ на конструктор класса Person.

AnonymousЧ We say anonymous because it doesnТt have an explicit name like a method would normally have: less to
write and think about!
FunctionЧ We say function because a lambda isnТt associated with a particular class like a method is. But like a
method, a lambda has a list of parameters, a body, a return type, and a possible list of exceptions that can be thrown.
Passed aroundЧ A lambda expression can be passed as argument to a method or stored in a variable.
ConciseЧ You donТt need to write a lot of boilerplate like you do for anonymous classes.

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

        /* Ћ€мбда в качестве метода comparator */
        Collections.sort(arrayList,(String a, String b) -> a.length() - b.length());
        System.out.println(arrayList);

        Collections.sort(arrayList,new Comparatori().comparator);
        System.out.println(arrayList);

        /* операци€ :: отдел€ет им€ метода от имени класса или объекта.*/
        Collections.sort(arrayList,String::compareToIgnoreCase);
        System.out.println(arrayList);

        ArrayList<LambdaExpressions> arrayList1 = new ArrayList<>();
        arrayList1.add(new LambdaExpressions("Serg","Dof"));
        arrayList1.add(new LambdaExpressions("Serg","Xgg"));
        arrayList1.add(new LambdaExpressions("Serg","Fop"));
        arrayList1.add(new LambdaExpressions("Soper","Sert"));

        /* ¬ызов л€мбда выражени€ через им€ класса*/
        Collections.sort(arrayList1, Comparator.comparing(LambdaExpressions::getName));
        System.out.println(arrayList1);

        /* —в€зывание компараторов */
        Collections.sort(arrayList1, Comparator.comparing(LambdaExpressions::getName).thenComparing(LambdaExpressions::getFirstName));
        System.out.println(arrayList1);
    }
}
