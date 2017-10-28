package string_19;

/*
1. Пустая считается символьная строка нулевой длины.
Пустая строка является в Java объектом, в котором
хранится нулевая (т.е. 0) длина символьной строки и
пустое содержимое.
Для получения длины строки используется метод length()

2. В переменной типа String может также храниться
специальное пустое значение null, указывающее на то,
что в настоящий момент ни один из объектов не связан
с данной переменной. Чтобы проверить, является ли
символьная строка нулевой, т.е. содержит значение null,
служит условие if (str == null).

*/


public class EmptyNull {

    public static void main(String[] args) {

        String a = "";
        String b = null;

        if (a.length() == 0) {
            System.out.println("String is empty");
        }

        if (a.equals("")) {
            System.out.println("String is empty");
        }

        if (b == null) {
            System.out.println("String is empty");
        }
    }


}
