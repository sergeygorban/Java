package classes_5;

/* ����� toString(), ���������� �������� ������� �
���� ���������� ������.*/


public class ToString {

    private String a = "Java";
    private String b = " is a";

    @Override
    public String toString() {
        return "ToString{" +
                "a='" + a + '\'' +
                ", b='" + b + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ToString str = new ToString();
        System.out.println(str.toString());
    }

}
