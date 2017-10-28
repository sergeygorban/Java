package methods_2;

/* ¬ €зыке Java всегда используетс€ только вызов по значению, как дл€ примитивных типов,
так и дл€ объектов. Ёто означает, что
метод получает копии значений всех своих параметров. ѕо этой причине метод не
может видоизменить содержимое ни одной из переменных, передаваемых ему в качестве параметров,
если эта переменна€ не €вл€етс€ объектом

*/


public class CallByValue {

    public int create(int a) {
        int x = a + 3;
        return x;
    }

    public static void main(String[] args) {

        int x = 10;

        CallByValue callByValue = new CallByValue();
        System.out.println(callByValue.create(x));

        /* «начение переменной не измен€етс€*/
        System.out.println(x);
    }
}
