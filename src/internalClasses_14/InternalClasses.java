package internalClasses_14;


/* ¬Ќ”“–≈ЌЌ»≈  Ћј——џ

¬нутренние и вложенные классы - это классы, которые наход€ьс€
внутри другого класса

—войства:
    1. ¬нутренний класс может использовать
    приватные элементы внешнего класса, как будто они
    объ€влены внутри него
    2. ¬нутренний класс в куче прив€зан к внешнему классу
    3. ¬нешний класс может создавать внутри себ€ экземпл€р
    внутренни класса
    4. ¬нутренний класс можно создавать за пределами внешнего
    5. ¬нутренний класс не может содержать статические классы

Ћокальные внутренние классы никогда не объ€вл€ютс€ с помощью модификаторов
доступа (например, public и protected). »х область действи€ всегда
ограничиваетс€ блоком, в котором они объ€влены. ” локальных
внутренних классов имеетс€ следующее большое преимущество: они полностью
скрыты от внешнего кода

*/

import java.util.Date;

public class InternalClasses {

    private int x;

    SmallClasse smallClasse = new SmallClasse();

    public void method() {
        smallClasse.get();
    }

    public void getDate() {

        /* Ћокадьный класс*/
        class DateMy {
            public void getMyDate() {
                Date date = new Date();
                System.out.println(date);
            }
        }

        DateMy dateMy = new DateMy();
        dateMy.getMyDate();
    }




    public class SmallClasse {

        private int a;

        // »спользование пол€ внешнего класса
        private void get() {
            x = 42;
        }

    }

    public static void main(String[] args) {

        InternalClasses internalClasses = new InternalClasses();
        InternalClasses.SmallClasse small = internalClasses.new SmallClasse();

        InternalClasses.SmallClasse smallClasse = new InternalClasses().smallClasse;

        InternalClasses c = new InternalClasses();
        c.getDate();


    }
}
