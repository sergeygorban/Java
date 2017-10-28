package enumMy_16;

/* ������������ ����� ������������ ���
����������, �������� ��������� if ��� switch. ����� ����, ����� ����������
���������� ������������ � ������� ��������� == � ������ equals().

��� �������� ������������ �������� �� ��������� ������ ��
����������� ������������ ����� equals (). ��� ���� ���� ������ ��������
�������� == . �� ������� � ������ ������������ ����� ����� �������� ������������,
������ � ����. ��������, ��� ������������ ����� ���������� ������ ��� ��������
�������� ������������� ����.
*/

import java.util.Arrays;

public enum  EnumMy {

    JERRY("Cat") {
        @Override
        public void vois() {
            System.out.println(EnumMy.JERRY.toString() + " Mau");
        }
    },
    BOBBY("Dog") {
        @Override
        public void vois() {
            System.out.println(EnumMy.BOBBY.toString() + " Gav");
        }
    },
    PHIL("Pig");

    private String name;

    EnumMy (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void vois() {
        System.out.println(EnumMy.PHIL.toString() + " OOOOOOOOOOOOOO");
    }

    public static void main(String[] args) {

        /* ������� �������� ������ ������������*/
        EnumMy[] value = EnumMy.values();
        System.out.println(Arrays.toString(value));
        System.out.println();

        for (EnumMy enumMy: EnumMy.values()) {
            System.out.println(enumMy);
        }
        System.out.println();

        /* ������������� �������� � ������ */
        String a = EnumMy.BOBBY.toString();
        System.out.println(a);
        System.out.println();

        /*���������� ����������*/
        EnumMy s = EnumMy.valueOf(EnumMy.class, "JERRY");
        EnumMy s1 = EnumMy.valueOf("BOBBY");
        EnumMy s2 = Enum.valueOf(EnumMy.class,"BOBBY");
        System.out.println(s.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString() + "!!!!!!!!!!!!!!!!!!!");
        System.out.println();

        /*������� ������� ���������*/
        System.out.println(EnumMy.BOBBY.ordinal());
        System.out.println();

        /*����� ������. ����� ����� vois() ����������, ���� � ��������
        ������������ ��� ������ ���� ������ */
        for (EnumMy enumMy: EnumMy.values()) {
            System.out.println(enumMy.getName());
            enumMy.vois();
        }
    }
};


