package arrays_21;

/*
������ � ��� ��������� ������, � ������� �������� �������� ����������� ����.
������ � ���������� �������� ������� �������������� �� �������������� �������.

��������� �������� ������� ���������� � 0

�������� �� ���������:
    1. ��� �������� ������� ����� ��� ��� �������� ���������������� ������.
    2. ������� �������� ���� boolean ���������������� ���������� ��������� false
    3. ������� �������� � ������ ��������� null, ����������� �� ��, ��� ������ ���� ��� ��
       �������� �� ������ �������.

����� �������� ������� �������� ��� ������ ������

��������� ������ - ��� ������ ��� �������� �� ������������ ���������
����������
*/


import java.util.Arrays;

public class ArrayMy {

    public void create(int[] a) {
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {

        /* ��������� � ������������� ������� */
        int[] a = new int[5];

        /* ���������� ������� */
        a[0] = 12;
        System.out.println(a[0]);

        /* ���������� ������� � ����� */
        for (int i = 0; i < 5; i++) {
            a[i] = i;
        }

         /* �������� ������� �� ��������.
         ��������� �������� ������� � �������� �� ��������*/
        Dog[] dogs = new Dog[4];

        dogs[0] = new Dog("Jec");
        dogs[1] = new Dog("Des");
        dogs[2] = new Dog("Cop");
        dogs[3] = new Dog("Sar");
        System.out.println(dogs[0].getName());

        /* ���� ��������� ������� */
        System.out.println(Arrays.toString(a));

        /* �������� �� ��������� */
        int[] b = new int[5];
        boolean[] c = new boolean[5];
        String[] d = new String[5];

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));

        /* ����������� ������� �������*/
        int v = b.length;
        System.out.println("length: " + v);

        /* ������� ���� ��������� ������� ��� ����� �����, ������� ���������
        ��������� Iterable */
        for (int f: a) {
            System.out.println(f);
        }

        for (int x = 0; x < a.length; x++ ) {
            System.out.println(a[x]);
        }

        /* ����������,  ������������� � �������� */
        int[] m = {2,3,4,5,6,7};

        /* ��������� ������ */
        ArrayMy arrayMy = new ArrayMy();
        arrayMy.create(new int[] {2,3,4,5});

        for (int n: new int[] {3,4,5,6,7,8,9,}) {
            System.out.println(n);
        }

        /* ����������� ������� */
        int[] g = Arrays.copyOf(m,24);
        System.out.println(Arrays.toString(g));

        /* ���������� ������� */
        String[] sa = {"wewe","fgfdg", "cvvb","kjasc"};
        Arrays.sort(sa);
        System.out.println(Arrays.toString(sa));

        /* ��������� �������� */
        String[] code = {"q", "w"};
        String[] code1 = {"q", "w"};
        System.out.println(Arrays.equals(code,code1));





    }
}
