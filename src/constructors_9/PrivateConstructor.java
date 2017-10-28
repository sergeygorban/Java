package constructors_9;


/* «јѕ–≈“ —ќ«ƒјЌ»я Ё «≈ћѕЋя–ќ¬  Ћј——ј

≈сли класс содержит только статические методы или
по какой то другой причине необходимо запретить
создание экземпл€ров класса, то достаточно объ€вить
в таком классе конструктор с модификатором доступа
private

»спользу€ метод Main в данном классе, разрешено создавать
экземпл€р данного класса, но если попробывать создать
экземпл€р класса в другом классе, то компил€тор выдаст ошибку*/

public class PrivateConstructor {

    public int a = 4;
    private PrivateConstructor() {

    }

    public static void main(String[] args) {

        PrivateConstructor constructor = new PrivateConstructor();
        System.out.println(constructor.a);

    }
}
