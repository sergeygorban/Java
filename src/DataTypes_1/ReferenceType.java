package DataTypes_1;


/* ��������� ����������:
�� ����� ���� �� ���������� ������ �������, ���
��������� ����������. ���� ����������, ����������� �� ������.
����������, ����������� �� ������, ������ ����, �������
��������� ���� ��� ������� � �������. ��� ������ �� ������ ���
�������, � ����� ����� ������, ��������� ��� ������. ������ �
Java �� �� �����, ��� �� ����� ���� ��������� ������ �����
����������. �� ����� ��������, ��� ��� �� ��� �� ����, ��� ������
������������ ���� ���� ������. � JVM ����� ������������ ������
��� ��� ���������.
������� �������, ������ � ��� ����� ������ ������, � �������
�������� ������.

������ ������:
� ������������ Java �� �������� ���������� ���������� � ������, ���������� � ������. ��
������ JVM ������ ����������� ������������� ��� ��������� � �������� 32 ���� � 32-������ JVM
� 64 ���� � � 64-������. ��� �� �����, ���������� ���������� JVM
(��������, Zing Virtual Machine �� Azul), � ����� ����������� ���������� � ������ �����
���������� � ���� ������. ������ (��������, Java HotSpot Virtual Machine), ��������, ����������
���������� �Compressed Oops�, ����������� ������������ ������ �������� � 32 ���� �� 64-������
������������ ��������.
��� ������ ��� ����� ������ JVM, ���������� �� ������� ����� ���������� ������
*/

public class ReferenceType {

    LocalVariables localVariables1;

    public void create() {

        /* localVariables - ��������� ��������� ���������� */
        LocalVariables localVariables = new LocalVariables();
    }

    public static void main(String[] args) {

        ReferenceType referenceType = new ReferenceType();
        referenceType.create();
    }

}
