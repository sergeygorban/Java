package interfaceMy_13;


/*��������� � Java ������ �������� �������������� ������������,
�������� ��� ������������ �������������� ����� ������������ ���
���������� ����������� �� �������������� ����� ������

�������� ����������:
    1. ��������� - ��� ����������� �� 100% ������ ����������� �����
    2. ������ ���������� ������ �������� ���������� � ������������


����� �� ����������� ��������� ��� ��������������� ��� (��������, ������ ���
�������� Pet), ������� ����� ���� ������ ������. ������������
���������� � ��� ������ ��������� �����, ������� ��������� ���� ���������.
����������� ������� �� ������ �������� ������������ ��������������
����� ��������� � �������� ����������� � Java API. ������, �����
������ �������� ���� ��������� � ����? ���������� ���������
Serializable. ������, ����� ������� ��������� ���� ������ � ���������
�������? ���������� Runnable.


��� ������, ����� ����� ��������� �����, ��������, ����������� �����
��� ���������:
    1. ���������� �����, ������� ������ �� ��������� (�� ������ Object),
    ����� ��� ����� ����� �� �������� �������� �� ������������ ������ �����.
    2. ���������� �������� �����, ������ ����� ��� ����� ������� �����
    ����������� ������ �������������  ������ � �������� ��� ��������
    ����� ���������.
    3. ����������� ����������� �����, ����� ������ ���������� ������
    ��� ������ ���������� � � ��� ���� ���� �����-������ ��� ����������,
    ������� ������ ��������� ��� ���������. ������� ����� �����������, �����
    ������ �������� �������� ����, ��� ����� �� ������ ������� ������� ������� ����.
    3. ����������� �����������, ����� ������ ���������� ����, �������
    ������ ������ ������ ������, �������� �� ��, ��� ��� ��������� �
    �������� ������������.

��������� ��������� ���������, ��� ������ ������ ������ ������,
�� �������, ��� ������ ��� ������ ��� ������.

��������� � Java �� �������� �������. �� ������������ ����� ��� ����������,
������������� � ������, ������� ������ ��������������� ����������.

��� ������ ���������� ������������� ��������� ���������, �������, ��������
����� � ����������, ��������� ����������� ������� public �������������.

� ����������� ����������� ����

���������� � ��� �� ������. � ���������, � ������� �������� new ������
������� ��������� ����������

��, �������� �� ��, ��� �������������� ������������ ������� ������, ���������
������������ ���������� �����

���������� �������, ���������� ����� ����� ������������ �������� ������������.
��� ��������� ��������� ������� ����������� � ����������� �� ����� �����������
� ����� ������������������.


� ����������� �����������:
    1. ��������� ���������: ���� � ����������� ������������� �����������
       public static final, ���� ���� ���� �� ������� ������ �������� �����.
       ���� ������� ��� ���������� ��������� public static final, �� ��� ��
       ����� �������� �������, �� � ������������ Java �� �������������
       ����������� ������ �������� �����.
       ��������� ���������� �������� ��� ������ ������������ ��������� � ��
       ����������� ������� ������ �� ������� ������������.

    2. ��������� ����������� ������: ��� ������ � ���������� �������������
       ��������� ���������, ��� ������ �������� ������������ ������� public

    3. ��������� ����������� ������.

    4. ��������� ������ �� ���������: ������ �� ��������� �������������
    ������������� � ������� ����������� ���������, �� ��� �������� ��� ������.
    ������ ������ ������, ����� ���������� �������� ������ � ��� ��������������
    ���������, ��� ���� �� ������� ������������.

��������� ������� �� ���������.
���� ����� �� ��������� ��������� � ���������� ���������� � ����� ������ ���
� ����� �� ������ � ����� ������, �� ��������� ������� ����, ������� ��������
��������� �������:
    1. � ��������� ���� ���������� ����������. ���� ���������� �������������
    ���������� �����, �� ������ �� ��������� � ����������� ������� � ������
    ���������� ������ ������������

    2. ���������� �������� � ��������. ���� �������������� ������������� �����,
    � ������ ��������� � ����� (�� ��������� ��� �����) � ����� �� �����
    ������ � ������ ����������, �� ��� ���������� ��������� ����������
    �������������� ���� �����.




*/


import java.util.Arrays;

public interface Pet {

    /*���������� ���������*/
    int ID = 123;

    /* ���������� ������������ ������ */
    abstract void beFriendly();
    abstract void play();

    /* ���������� ������������ ������ � ���������� ������
    ���������� */
    static String createRation(String...food) {
        return Arrays.toString(food);
    }

    /* ����� �� ��������� */
    default void print() {
        System.out.println("!!!!!!!!!!!!!");
    }



}
