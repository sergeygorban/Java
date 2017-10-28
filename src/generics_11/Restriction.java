package generics_11;

/* Иногда класс или метод нуждается в наложении ограничений на переменные
типа.

extends - означает расширяет или реализует
Переменная типа или подстановка может иметь несколько ограничений

Как и в механизме наследования в Java, у интерфейсов может быть сколько угодно
супертипов, но только один из ограничивающих типов может быть классом. Если
для ограничения служит класс, он должен быть первым в списке накладываемых
ограничений.*/


import java.util.Date;

public class Restriction {

    public <T extends GeneralizedClass> T getNum(T a) {
        return a;
    }

    /* Несколько ограничений*/
    public <T extends GeneralizedClass & Comparable> T getB(T a) {
        return a;
    }

    public static void main(String[] args) {

        Restriction restriction = new Restriction();
        System.out.println(restriction.getNum(new GeneralizedClass("","","")));
    }


}
