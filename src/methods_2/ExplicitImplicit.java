package methods_2;


/*
У метода setAge() имеются два параметра. Первый параметр, называемый
неявным, представляет собой ссылку на объект типа ExplicitImplicit, который указывается
перед именем метода. А второй параметр называется явным и указывается как число
в скобках после имени данного метода.
Нетрудно заметить, что явные параметры перечисляются в объявлении метода,
например int age. Неявный параметр в объявлении метода не приводится. В каждом методе
ключевое слово this обозначает неявный параметр.

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
