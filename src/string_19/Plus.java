package string_19;


/* При каждом соединении символьных строк
конструируется новый объект типа String,
на что расходуется время и память. Этого можно
избежать, применяя класс StringBuilder.

*/

public class Plus {

    public static void main(String[] args) {

        String a = "Ja";
        String b = "va";
        String c = a + b;
        System.out.println(c);
    }
}
