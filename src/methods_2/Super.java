package methods_2;


public class Super extends Methods {

    /* ����� ������������� ������ */
    public int createA(int c) {
        int a = super.createAge(c);
        int b = c + a;
        return b;
    }
}
