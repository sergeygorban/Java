package exceptions_25;

/* ����������� try c ��������� ���������� ��� ����� �������:
������������ ������ ����������� ������, ������������ ���������
AutoCloseable. � ���� ���������� ������� ������������ �����,
����������� ��������� �������: void close() throws Exception
������� ����� ��������� Closeable ����������� �� ���������� AutoCloseable.
� ��� ����� ������� ������������ ����� close(), �� �� ����������� ���
������������� ���������� ���� IOException.

��� ���� �������� �����, ��������� ��������� � ��� ������, ���� ����������
������������ �� ������ � ����� try, �� � � ������ close(). �������� try � ��������� �������������
�������� ������� ����� �� ����� ���������������� ���������.
�������� ���������� ������������ ��������, � ����� ����������, ������������
� ������ close(), ��������� "������������". ��� ������������� ��������������� � �����������
� ��������� ���������� � ������� ������ addSuppressed().
� ���� ��� ������������ �����-�� ������� � ����� ������ ���������, �� ������� ������� ����� getSuppressed(),
��������������� ������ ����������� ���������� �� ������ close ().
�� ����� �������, ��� ��� ��� �� ����� ��������������� �������. ������ ���,
����� ��������� ���������� ������������ ������, ���������� ��������� �������� try � ���������.

*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {


    /* ���������� �� ����, ���������� �� ����� �� ����� try ���������, ��� �� � ���
       ��������� ����������, ����� in.close() ���������� � ����� ������, ��� � ��� ������������� ����� finally.*/
    public void readText() throws FileNotFoundException {

        try (Scanner in = new Scanner(new FileInputStream("scannerFromReading.txt"), "UTF-8");) {

            while (in.hasNext())
                System.out.println(in.next());
        }

    }

    /* � ����� try ����� ����� ������� ��������� ��������
       ����� �������, ���������� �� ������� ���������� ����� try ��� ������ �����
       � ������ ������������ �����������. ���� �� ����� ������������ �������� �������� ��������������� �������,
       ��� ����� �������� �� ���������� ��������� ����� try/finally.*/
    public void readText1() throws FileNotFoundException {

        try (Scanner in = new Scanner (new FileInputStream("scannerFromReading.txt"), "UTF-8");
             PrintWriter out = new PrintWriter("out.txt")) {

            while (in.hasNext())
                out.println(in.next().toUpperCase());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        TryWithResources tryWithResources = new TryWithResources();
        tryWithResources.readText();
        tryWithResources.readText1();

    }
}
