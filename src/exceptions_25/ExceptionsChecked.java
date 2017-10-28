package exceptions_25;


/* ПРОВЕРЯЕМЫЕ ИСКЛЮЧЕНИЯ

Проверяемые исключения - это исключения, которые проверяет компилятор
К таким исключениям относяться все исключения, кроме RuntimeException и
его наследников.


Все проверяемые исключения должны быть объявлены  и обработаны

Пробрасывание исключения:
Если метод выбрасывает исключение и не обрабатывает его, то обработка
такого исключения ложиться на вызывающий метод, вплоть до метода Main.
Такое поведение называется пробрасыванием исключения */


public class ExceptionsChecked {

    // Объявление и Выбрасывание исключения
    public void createE(int a) throws Exception {
        if (a < 1) {
            throw new Exception("exception occurred");
        }
    }

    public void get() throws Exception {
        createE(5);
    }

    // Проброс исключения до Main
    public static void main(String[] args) throws Exception {

        ExceptionsChecked checked = new ExceptionsChecked();
        checked.createE(0);

    }
}
