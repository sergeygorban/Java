package exceptions_25;


/* ����������

���������� ���������� - ��� �������� ��������� ������.
�������� ���������� ��������� ��������� ���������� � �������� ������
����������� ���������� �� ���� �����, ��� ������ ����.

������, ��������������� � ������ �������:
    1. ������ �����. �������� ���� �������
    2. ���� ������������.
    3. ���������� �����������. ���� ����� ��������� �������������, � �����������
       ������ � �����������.
    4. ������ ����������������. �����-������ ����� ����� �������� �����������.
       ��������, �� ����� ���������� �������� ��������� ��� ����������� ��������
       ������ ������. ����� �� ���������� ������� �������, ������� �����
       �������������� ������� � ���-�������, ���������� �������� �� ������� ����� �
       ��� ��� ����������� ������� ������ ����������������.

� ����� Java ������ ���������� ������ �������� ����������� ������, ������������ �� ������ Throwable
���� ����������� ������� ������������, ����� ��������� � ���� ����������� ������ ����������.

�������� ������ Error ��������� ���������� ������ � ��������, ����������� � ����� � ��������� �������� � �����������
������� Java.

��� ���������������� �� Java �������� �������� ������� ������� ��������
������ Exception. ��� �������� ����� ����������� �� ��� �����: ����������, ����������� �� ������
RuntimeException, � ���������. ���������� ���� RuntimeException ��������� ���������� ������
����������������. ��� ������ ���� ���������� �������� ���������� ��������������� �������� �������������,
��������, ������ �����-������, ����������� ��� ���������� ������ ���������� ��������.
����������, ����������� �� ������ RuntimeException, ������� �� ����������
������������ ��������:
    1. �������� ���������� �����.
    2. ����� �� ������� �������.
    3. ������� ���������� � ������� �� ������ ������ null.
    4. ��������� ���������� ��������� � ��������� �������.
    5. ������� ������ �� ���������� ����� �����.
    6. ������� ������� �������������� ����.
    7. ������� �������� ������ ���� Class, ���� � ���������� ������ ������ �������������� �����.


���������� ���� RuntimeException ����������� ������ ��������� �� ���� ������������. ���, ���������� ���� ArraylndexOutBoundsException ����� ��������,
���� ������ ��������� ������� �������. � ���������� NullPointerException ������� �� ���������, ���� ����� ���, ��� ��������������� ����������, ���������, ��
�������� �� ��� ������ �������� null.

��������, ��� ����� ����� ������������ ����������, �����, ������� � ��� ��������� �������� ����������,
� ������� public void createE(int a) throws RuntimeException

���� �� ����� ����� ������������ ��������� ����������� ����������, ��� ���
������ ���� ����������� � ��� ��������� ����� �������

�� ���������� ������, �.�. ����������, ����������� �� ������ Error, ���������
�� �����. ����� ���������� ����� �������������� ������ ��������, � ����� �������, ��� ��� �� ��������� �������� ��������.
����� ��� �� ������ �� ����������� ��������� ������������� ����������, ����������� �� ������ RuntimeException


���� ���������� ��������� � ����� �� ���������������, �� ��������� ����������
������, ������ �� ������� ��������� � ���� ���������� � ���������� �����.

���� ��� � ����� tr y �� ���������� ����������, �� ��������� ���������� ����
catch. � ���� �����-������ �� ���������� ����� tr y ����������� ����������, ������������ �� ����, ���������� �
����� catch, �� ���������� ������ ����� ��������� (� ���������, ����������� ������) ���������� ������������. (�������� ������
���������, ��� � ���������� ����� ��������� ��� �� ������������ �������� ���������� ������� ����.)




��������� - ��� �������������� ��������, ������� ����� ���������
�� ����� ���������� ������ (��� ���������� � ����� ������ � �.�)
���������� � ��� ������ ������ ���� Exception. ������������
������� ��� ���� ���������� �������� ����� Exception.

������ ����� ����������� ���������� ��� ������������ ��

������������ ����������:
����� ����������� ���������� � �������
��������� ����� throw, �� ������� ������� ������
Exception: throw new NoCaffeineException();
�����, ������� ����� ��������� ����������, ������
�������� �� ���� � ������� ���������
throws Exception (��� ����������� ����������) ��� �� ���������
��������� throws Exception (��� �� ����������� ����������).
����� ����� ����������� ����������, ������� �� ��������������,
��������� ��������� ���� ������ � ����������� ������ ��
������������

����� ����� ����������� ����� ��������� ����������, ���� �� � ����
����� ���������. �� ��� ���������� ������ ����� ������� ���
����������� ����������, ������� �� ����� ��������� (����, ���� ���
��� ������ �� ��� ����� ������ ������, ����� ������������ �����
������������ �������).

��������� ����������:
���, ������� ����� ������� ����������,
����������� � ���� try, ���, ������� ������������ ����������
����������� � ����� catch
���������� ����� catch ������� �� ����������, ������� ����
���������. ��������, ���� ������ �� ��������, �� ������
������������ ���� catch ��� ������� ��������� � ������ ��������.
���� ����� �� ��������� �� �����, ����� ��������� ������������ ������
��� �����.
���� try/catch ������������ ��� ��������� ��������������
��������, � �� �������� ����. ����������� ���, �����
���������� ��������, ���������� ������� �� �� ������
�������������. � ������� ������ �������� ������������ ���������
� ����������� �����, ����� ���� ����������� ��������, ���
���������.

��� ��������� ���������� ����� ������������ ����� ����
���� catch, �������� ������������ ����� Exception.
����� �� ������� ����������� ����� ����������, ������� ����� ����
���������.

��� ����������, ������� ���������� ������������ ���������� �������
���������� ��������� ��������� ����� catch

����� catch ������ ������������� �� �����������, �� ���� ������
��������� ���� � ������� ����������, ������� � ������� ������������
��������� �� ����� ������ ������. ����, � �������, ������ ����� ������
Exception, � ����� RuntimeException, �� ������ ����� ��������������
���������� ������ Exception. ���� ������� ����� �������, ��
���������� ������� �� ����

����� catch ������ ������ ����� ������������� � ����� �������, ���
��� �� �������� ����������� ����� ����������





Finally � ��� ���� ��� ����, ������� ������ �����������
���������� �� ����, ���� �� ��������� ����������.

���� ���� try ���������� �������� (�����������), �� ����������
����������� ������� ���������� �������� � ����� catch. �� ����������
catch ����������� ���� finally, ����� ��������, � ����
�������, ���������� ����������� �����.

���� ���� try ���������� ������� (��� ������� ����������),
�� ���������� ����������� ������� ���������� ���� catch �
��������� � finally, ����� ��������, � ���� �������, ����������
����������� �����

���� ����� try ��� catch �������� �������� return, �� finally
��� ����� ����� �����������! ����� �������� � finally,
����� ���� �������� � return.

������������ ������������ ���������� � ��������� ���������� � ���������� ����������:
    1. ��������� ���������� �� ����� �������� ����� ������� ��������. �������� ����������
       �������� ������� ������ �������, ��� ������� ��������.
       �� ����� ������� �����: ����������� ������������ ������ � ��� �������, ����� ���
       ����������, ��� �������� ������ ���� � �������������� ���������.
    2. �������� ���������� ��������� ������ �� ��������� ����������.
    3. ��������� ����������� �������������, ������� ������������� �������� ������������ ����������.
       �� ��������������� �������������� ������ ���������� ���� RuntimeException. ������� ����������
       �������� ��� �������� �����������. �� �������������� ���������� ���� Throwable.
       ��� ����� ������� ��� ��� ���������� ������� ��� ��������� � �������������. ��������� ����������
       ����������� � ������������� ����������. ��� ��������� ����������� ���������� ���������
       �������������� ������, ������� �� ���������� �� ��� ����������� � ���������� �������.
    4. �� ���������� ����������. ���������� ���������� - ��� ������������� ������� ����� catch
    5. �� ������� ���������� ���������� ��� ��������� � ����, ��������������� �������.
       �������� ���������������� �������� ���������� ������� �����������, � �� ������������
       ��� ��������������. ������ ����� �������� ������ ����� �������� ���������� �����������
       ������������� �� ������� ��� ������ ���������� �������� ��������.

*/


import java.io.IOException;

public class Exceptions {


    // ���������� � ������������ ����������
    public void createE(int a) throws RuntimeException {
        if (a < 1) {
            throw new RuntimeException("exception occurred");
        }
    }


    // ��������� ����������
    public void createExe (int a) {

        try {
            if (a < 1) {
                throw new IOException();
            }
        } catch (Exception e) {
            System.out.println("exception occurred");
            e.printStackTrace();
        }
    }

    // ��������� catch � finally
    public void createExe1 (int a) {

        try {
            if (a < 1) {

                throw new Exception();
            } else if (a == 3) {

                throw new RuntimeException();
            }
        } catch (RuntimeException e) {

            System.out.println("RuntimeException occurred");
            e.printStackTrace();

        } catch (Exception e) {

            System.out.println("Exception occurred");
            e.printStackTrace();
        }
        finally {
            System.out.println("!!!!!!!!!!!! Always");
        }
    }

    // ��������� ���������� � ������
    public void get(int a) throws Exception,RuntimeException {
        if (a < 1) {
            throw new Exception();
        }
    }

    public static void main(String[] args) {

        Exceptions exceptions = new Exceptions();

        //exceptions_25.createE(0);
        exceptions.createExe(0);
        exceptions.createExe1(3);

        System.out.println("!!!!!!!!!!!!!!!");

    }
}
