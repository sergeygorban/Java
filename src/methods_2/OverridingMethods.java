package methods_2;



public class OverridingMethods extends Methods {


    /* ��������������� ������*/
    @Override
    public int createAge(int age) {

        int v = age + 30;
        return v;
    }

    /* ���������� ����������������� ������ */
    public String createAge(String age,String c) {
        String v = age + "!!!!!!!!";
        return v;
    }

    public static void main(String[] args) {

        OverridingMethods overridingMethods = new OverridingMethods();
    }

}
