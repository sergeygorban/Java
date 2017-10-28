package thread_18;

import java.io.IOException;

/* ����� ����� �������� ������������� ������ � ������� ������ stop(), �� ���������������� � ����������.
�� ��� ������� �� ���������� ������ ���������� ����� ���� ������ ����� interrupt().
����� ����� interrupt() ����������  ��� ������ ����������, ��������������� ��������� ���������� ������� ������.
��� ������� ���� boolean, ��������� � ������� ������ ����������. � ������ ������ ���������� �������
������������ ��������� �������� ������� ��������, ����� �����, ����� ����� ������ ���� �������.
����� ��������, ���� �� ����������� ��������� ���������� ������ ����������, ���������� �����������
����� Thread.currentThread(), ���������� ������� ����� ���������� � ���������� �����
����� is Interrupted(). �� ���� ����� ���������� ������������, �� ��������� ��������� ��� ���������� ������.
� ����� �� ������ �������� ���������� ���� InterruptedException. ����� ����� interrupt () ���������� ��� ������
����������, ������� ������������, ��������, � ���������� ������ ������ sleep() ��� wait(), ����������� �����
����������� ����������� ���� InterruptedException. (���������� ����������� ������ �����-������, ������� �� ����� ����
��������. � ����� ������� ������� ����������� �������������� ������� ���������� ������ ����������.
� ����� Java �� ���������� ����������, ����� ���������� ����� ��������� ����������. ���������� ���� ����������
�������� ������. � ���������� ����� ����� ��� ������, ��� ����������� �� ���������� ��� ����������.
��������� ������ ��������� �����, ��� ������ ������������ ���������� � ���������� ���� ����������.
�� �������� ����� ������ ������ ���������������� ���������� ��� ������ �� ����������� ������ ����������.

�������� ��������� ���������� ������ ���������� ������� ������ islnterrupted() �� ����������� � �� ������, ���� �����
������� ����� sleep() (��� ������ ����������� �����) ����� ������� �������� ���� �����. ���� �� ����� sleep()
����������, ����� ����������� ��������� ����������, ����� ���������� �� ��������� � ��������� ��������.
������ ����� �� ������� ���� ��������� (!) � ���������� ���������� ���� InterruptedException.
���, ���� ����� sleep() ���������� � �����, �� ��������� ��������� ���������� �� �������. ������ ����� �����
������������ �������� ���������� ���� InterruptedException,

*/
public class InterruptFlow implements Runnable {

    public void sum() {

        Runnable runnable = () -> {

            int s = 0;
            for (int i = 0; i <= 6; i++) {
                try {
                    Thread.sleep(300);
                    System.out.println("Thread number 2: Wait number " + i + " State " + Thread.currentThread().getState());

                    if (i == 5) {
                        Thread.currentThread().interrupt();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("!!!! Thread number 2: InterruptedException " + i);
                }
                s = s + i;
            }

            System.out.println(s);
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }


    @Override
    public void run() {

    }

    public static void main(String[] args) {


        InterruptFlow flow = new InterruptFlow();
        flow.sum();

        for (int i = 0; i <= 10; i++) {

            try {
                System.out.println("Thread number 1: Wait number " + i + " State " + Thread.currentThread().getState());
                Thread.sleep(400);

                //���������� ������
                if (i == 2) {
                    Thread.currentThread().interrupt();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("!!!! Thread number 1: InterruptedException " + i);
            }
        }
    }
}
