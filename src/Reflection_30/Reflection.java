package Reflection_30;

/*Программа, способная анализировать возможности классов,
называется рефлективной. Рефлексия — очень мощный механизм,
который можно применять для решения перечисленных ниже задач:
    1. Анализ возможностей классов в процессе выполнения программы.
    2. Проверка объектов при выполнении программы; например, с помощью
    рефлексии можно реализовать метод toString(), совместимый со
    всеми классами.
    3. Реализация обобщенного кода для работы с массивами.
    4. Применение объектов типа Method, которые работают аналогично указателям
    на функции в языках, подобных C++.

Рефлексия — не только эффективный, но и сложный механизм. Ею интересуются в
основном разработчики инструментальных средств, тогда как программисты,
пишущие обычные прикладные программы, зачастую ею не пользуются.

Объект типа Class описывает свойства конкретного класса.

Следует иметь в виду, что объект типа Class фактически описывает тип, который
не обязательно является классом. Например, тип int — это не класс, но, несмотря
на это, int.class — это объект типа Class.

В результате такого вызова newInstance() создается новый экземпляр того же класса, что и е.
Для инициализации вновь созданного объекта в методе newlnstance () используется
конструктор без аргументов. Если в классе отсутствует конструктор без аргументов,
генерируется исключение.

Если при создании объекта по имени класса требуется передать конструктору какие-нибудь
параметры, то использовать необходимо метод newlnstance() из класса Constructor.

Три класса, Field, Method и Constructor, из пакета java. lang.reflect описывают
соответственно поля, методы и конструкторы класса.

Механизм безопасности Java позволяет определить, какие именно поля содержит объект, но не дает
возможности прочитать их содержимое, если эти поля недоступны.

По умолчанию в механизме рефлексии соблюдаются правила доступа, установленные в Java. Но если
программа не контролируется диспетчером защиты, то эти правила можно обойти. Чтобы сделать это,
достаточно вызвать метод setAccessible() для объектов типа Field, Method или Constructor,

Механизм рефлексии позволяет создавать программы с высоким уровнем
абстракции, где поля и методы определяются во время выполнения. Такая
возможность чрезвычайно полезна для системного программирования, но
для прикладного — практически не нужна. Рефлексия — очень хрупкий механизм, поскольку компилятор
не может помочь в обнаружении ошибок. Все ошибки проявляются во время выполнения программы и приводят
к возникновению исключений.
*/


import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflection {

    public String name = "Java";

    public void create() {
        int a = 5;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, NoSuchFieldException {

        Reflection reflection = new Reflection();

        /* Возврат экземпляра Class. */
        System.out.println(reflection.getClass());
        System.out.println();

        /*Возврат имени класса. Если же класс находится в
        пакете, то имя пакета включается в имя класса */
        System.out.println(reflection.getClass().getName());
        System.out.println();

        /*Получение объект типа Class, соответствующий имени класса в
        строковом представлении*/
        String className = "java.util.Date";
        Class cl = Class.forName(className);

        /* Получение объект типа Class */
        Class c2 = Reflection.class;

        /* Создание экземпляра класса */
        Reflection reflection1 = Reflection.class.newInstance();
        System.out.println(reflection1.name);
        System.out.println();

        /* Используя методы forName() и newlnstance(), можно создавать экземпляры
           классов, имена которых хранятся в символьных строках */
        String name = "Reflection_30.Reflection";
        Reflection reflection2 = (Reflection) Class.forName(name).newInstance();
        System.out.println(reflection2.name);
        System.out.println();

        /*Вывод полей класса*/
        Field[] cla = Reflection.class.getFields();
        System.out.println(Arrays.toString(cla));
        System.out.println();

        /*Вывод полей класса*/
        Method[] cla1 = Reflection.class.getMethods();
        System.out.println(Arrays.toString(cla1));
        System.out.println();

        /*Вывод конструктора класса*/
        Constructor[] cla2 = Reflection.class.getConstructors();
        System.out.println(Arrays.toString(cla2));
        System.out.println();


        /*  Анализ объектов во время выполнения с помощью рефлексии.
        Получение значения полей, только public*/
        RefConst refConst = new RefConst("I am Java");
        Object v = refConst.getClass().getDeclaredField("name").get(refConst);
        System.out.println(v.toString());

        /*Получение значения полей private*/
        RefConst refConst1 = new RefConst("I am Java");
        Field field = refConst1.getClass().getDeclaredField("age");
        field.setAccessible(true);
        Object v1 = field.get(refConst1);
        System.out.println(v1.toString());

    }
}
