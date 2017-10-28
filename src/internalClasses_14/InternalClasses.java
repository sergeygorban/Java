package internalClasses_14;


/* ���������� ������

���������� � ��������� ������ - ��� ������, ������� ���������
������ ������� ������

��������:
    1. ���������� ����� ����� ������������
    ��������� �������� �������� ������, ��� ����� ���
    ��������� ������ ����
    2. ���������� ����� � ���� �������� � �������� ������
    3. ������� ����� ����� ��������� ������ ���� ���������
    ��������� ������
    4. ���������� ����� ����� ��������� �� ��������� ��������
    5. ���������� ����� �� ����� ��������� ����������� ������

��������� ���������� ������ ������� �� ����������� � ������� �������������
������� (��������, public � protected). �� ������� �������� ������
�������������� ������, � ������� ��� ���������. � ���������
���������� ������� ������� ��������� ������� ������������: ��� ���������
������ �� �������� ����

*/

import java.util.Date;

public class InternalClasses {

    private int x;

    SmallClasse smallClasse = new SmallClasse();

    public void method() {
        smallClasse.get();
    }

    public void getDate() {

        /* ��������� �����*/
        class DateMy {
            public void getMyDate() {
                Date date = new Date();
                System.out.println(date);
            }
        }

        DateMy dateMy = new DateMy();
        dateMy.getMyDate();
    }




    public class SmallClasse {

        private int a;

        // ������������� ���� �������� ������
        private void get() {
            x = 42;
        }

    }

    public static void main(String[] args) {

        InternalClasses internalClasses = new InternalClasses();
        InternalClasses.SmallClasse small = internalClasses.new SmallClasse();

        InternalClasses.SmallClasse smallClasse = new InternalClasses().smallClasse;

        InternalClasses c = new InternalClasses();
        c.getDate();


    }
}
