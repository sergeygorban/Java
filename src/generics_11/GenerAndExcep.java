package generics_11;


/* ���������� � ���������� ����� ������ ������������ � ����� catch
   ���������� ���� ����� ������������ � ������������ ����������.

��� ������ ���������������� ������� ��������� ���������� � Java, ��� ����
����������� ���������� ������ ���� ������������� �����������. �� ��� ����������� �����
����������, ��������� ���������. � ������� ��������� ��� ���������� ���� ���� ������ ��������� �����:

@SuppressWarnings("unchecked")
public static <T extends Throwable> void throwAs(Throwable e) throws T
{
throw (T) e;
}
*/

public class GenerAndExcep {

    public <T extends Throwable> void doT(T t) throws T {

    }
}
