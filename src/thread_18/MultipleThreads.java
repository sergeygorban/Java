package thread_18;

/* ����� �� ������ ������������? ������� �� �� �� �����
������������ ����������? � ����� �������� ��� �����
��������? ��� ������ ��������? ���� ��� � ���� ��������?
����� �����: �� �� �����! ��� ��� �� ������� ������������.
�� ����� �� � ���������� ������� JVM � ����� ��
����������� �� ������ �������� ������ ������ ����������.
��� ����������� OS X 10.2 (Jaguar) � �������� �����
���������� ����� ����� ����������� �� �����, �����
��������� ���� ������ ����� ����. ��� ��������, �� �����
���������������.
��� ���������� ���������� �������� �� 25 � ����
���������� ���������. ����� ����� ����� �� ������ ��������� ���
25 ��������, ������ ��� ����������� ������� ���
��������������� � ���� ���� ������ ����. */


public class MultipleThreads implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("Now running" + threadName);
        }
    }

    public static void main(String[] args) {

        Runnable run = new MultipleThreads();

        Thread alfa = new Thread(run);
        Thread beta = new Thread(run);

        alfa.setName("Thread Alfa");
        beta.setName("Thread Beta");

        alfa.start();
        beta.start();
    }
}
