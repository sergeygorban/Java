package blockInit_26;


/*Блок инициализации выполняется первым, а вслед
за ним — тело конструктора.
Этот механизм совершенно не обязателен и обычно не
применяется. Намного чаще применяются более понятные
способы задания начальных значений полей.*/

public class BlokInit {

    public int a;
    public String b;

    {
        a = 23;
        System.out.println("a: " + a);
    }

    public BlokInit(String b) {
        this.b = b;
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {

        BlokInit blokInit = new BlokInit("Qwerty");

    }
}
