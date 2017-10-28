package methods_2;


public class FinalMetthods {

/* ФИНАЛИЗИРОВАННЫЙ МЕТОД

Метод объявленые с ключевым словом final. Такие
методы нельзя переопределить. Компилятор не позволит это
выполнить. Перегружать такие методы разрешается */

    public final void finalMethod() {
        System.out.println("It is final method");
    }

    public int finalMethod(int a) {
        return a;
    }

    public final int finalMethod(int a, int b) {
        return a + b;
    }
}
