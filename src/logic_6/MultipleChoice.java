package logic_6;

/*� �������� ����� ����� case ����� ���� ������� ���������:
    1. ����������� ��������� ���� char, byte, short ��� int.
    2. ��������� ������������� ����.
    3. ��������� �������
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
