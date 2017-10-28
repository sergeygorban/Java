package enumMy_16;

/* ѕеречисление можно использовать при
ветвлени€х, примен€€ операторы if или switch.  роме того, можно сравнивать
экземпл€ры перечислений с помощью выражени€ == и метода equals().

ƒл€ проверки перечислимых значений на равенство совсем не
об€зательно использовать метод equals (). ƒл€ этой цели вполне подойдет
операци€ == . ѕо желанию в классы перечислимых типов можно добавить конструкторы,
методы и пол€. ќчевидно, что конструкторы могут вызыватьс€ только при создании
констант перечислимого типа.
*/

import java.util.Arrays;

public enum  EnumMy {

    JERRY("Cat") {
        @Override
        public void vois() {
            System.out.println(EnumMy.JERRY.toString() + " Mau");
        }
    },
    BOBBY("Dog") {
        @Override
        public void vois() {
            System.out.println(EnumMy.BOBBY.toString() + " Gav");
        }
    },
    PHIL("Pig");

    private String name;

    EnumMy (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void vois() {
        System.out.println(EnumMy.PHIL.toString() + " OOOOOOOOOOOOOO");
    }

    public static void main(String[] args) {

        /* ¬озврат значений класса перечислений*/
        EnumMy[] value = EnumMy.values();
        System.out.println(Arrays.toString(value));
        System.out.println();

        for (EnumMy enumMy: EnumMy.values()) {
            System.out.println(enumMy);
        }
        System.out.println();

        /* ѕребразование значени€ в строку */
        String a = EnumMy.BOBBY.toString();
        System.out.println(a);
        System.out.println();

        /*ѕрисвоение переменной*/
        EnumMy s = EnumMy.valueOf(EnumMy.class, "JERRY");
        EnumMy s1 = EnumMy.valueOf("BOBBY");
        EnumMy s2 = Enum.valueOf(EnumMy.class,"BOBBY");
        System.out.println(s.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString() + "!!!!!!!!!!!!!!!!!!!");
        System.out.println();

        /*¬озврат позиции константы*/
        System.out.println(EnumMy.BOBBY.ordinal());
        System.out.println();

        /*¬ызов метода. ќбщий метод vois() вызываетс€, если у значени€
        перечислени€ нет своего тела класса */
        for (EnumMy enumMy: EnumMy.values()) {
            System.out.println(enumMy.getName());
            enumMy.vois();
        }
    }
};


