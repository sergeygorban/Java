package thread_18;


/* �� ��� ������, ��� ��� ����� �� ��������� ��
��������� ���������� ���������� �������, �� ����� ��
�� ���������� �����? � �� � ���. �� ����� ���� ���
�� ����� ��������, ��� ��� ��� ���������� �����
������ ���������� ���������������] �� ��
������������ ���� ������ ������������� � �����������
�����. ����������, ����� ����� ������ ���� �� �������
������������. ��� ����������, ������� �� �������
���������� ������������ � �������� ����� ���������
�������� Thread, ��� ����� ��������� ���, ������ �����
������������ ���� ������ ����� �� ������� (������,
����� 2000 ��). �� �� ������������� �� ��� ���
�������� ����� ����������.
*/


public class SuspendingThreads implements Runnable {

    public void go() {
        System.out.println("The top of the stack");
    }

    @Override
    public void run() {
        go();
    }


    public static void main(String[] args) throws InterruptedException {

        Runnable threadMy = new ThreadMy();
        Thread thread = new Thread(threadMy);


        // ������������ ������
        thread.sleep(3000);

        // ������ ������
        thread.start();
        System.out.println("Return to Main");

    }
}
