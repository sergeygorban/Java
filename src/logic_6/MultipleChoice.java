package logic_6;

/*В качестве метки ветви case может быть указано следующее:
    1. Константное выражение типа char, byte, short или int.
    2. Константа перечислимого типа.
    3. Строковый литерал
*/
public class MultipleChoice {

    public static void main(String[] args) {

        int i = 0;
        for (i = 0; i < 10; i++) {
            switch (i) {
                case 1:
                    System.out.println(i);
                    break;
                case 2:
                    System.out.println(i);
                    break;
                case 3:
                    System.out.println(i);
                    break;
                default:
                    System.out.println("!!!!");
                    break;
            }
        }
    }
}
