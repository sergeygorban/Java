package generics_11;

/* Обобщенным называется класс с одной или несколькими переменными типа.
Т - Это переменная типа. У обобщенного класса может быть более одной переменной типа

В именах переменных типа принято употреблять прописные буквы и стремиться к их
краткости. Так, в стандартной библиотеке Java буквой Б обозначается тип элемента коллекции,
буквами к и V — типы ключей и значений в таблице, а буквой т (и соседними буквами S и и при
необходимости) — "любой тип вообще", как поясняется в документации.

Иными словами, обобщенный класс действует как фабрика обычных классов.

Ограничения и разрешение:
    1. Примитивный тип нельзя подставить вместо типа параметра. Это означает, что
       не бывает объекта типа Pair<double>, а только объект типа Pair<Double>.
    2. Массивы параметризованных типов недопустимы. Пример: Pair<String>[] table = new Pair<String>[10];
    3. Нельзя генерировать или перехватывать экземпляры обобщенного класса в виде исключений


*/


import java.util.Date;

public class GeneralizedClass <T,U> {

    private T name;
    private U age;
    private T number;

    public GeneralizedClass(T name, U age, T number) {

        this.name = name;
        this.age = age;
        this.number = number;
    }

    public T getName() {
        return name;
    }

    public U getAge() {
        return age;
    }

    public T getNumber() {
        return number;
    }



    public static void main(String[] args) {

        GeneralizedClass<String,String> generalizedClass = new GeneralizedClass("Jora", "32", "32");
        System.out.println(generalizedClass.getName());

        GeneralizedClass<String,Integer> generalizedClass1 = new GeneralizedClass("Jora", 32, 32);
        System.out.println(generalizedClass.getAge());
        System.out.println(generalizedClass.getNumber());


    }


}
