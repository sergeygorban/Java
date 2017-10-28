package methods_2;



public class OverridingMethods extends Methods {


    /* Переопределение метода*/
    @Override
    public int createAge(int age) {

        int v = age + 30;
        return v;
    }

    /* Перегрузка переопределенного метода */
    public String createAge(String age,String c) {
        String v = age + "!!!!!!!!";
        return v;
    }

    public static void main(String[] args) {

        OverridingMethods overridingMethods = new OverridingMethods();
    }

}
