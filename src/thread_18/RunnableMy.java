package thread_18;

/* ��� ����, ����� ��������� ������ � ��������� ������ ���������� ������� ���������:
    1. ����� ������ �������� ����� ����������� � ��������� ������ ������ �������������
       ��������� Runnable
    2. ��������� Runnable �������� ��������������, � ��� ��������� ����� �������
       � ������� ������-��������� ��������� �������: Runnable � = () -> { ��� ������ }
    3. ������� ������ ���� Thread �� ������� ���� Runnable
    4. ��������� ����� �� ����������, ��������� ����� start()

    */
public class RunnableMy implements Runnable {

    @Override
    public void run() {
        print();
    }

    public void print() {
        System.out.println("RUN!!!!!!!!!!!!!!!!!");
    }



    public static void main(String[] args) {


        Thread thread = new Thread(new RunnableMy());
        thread.start();


        /* ������������� ������ ��������� */
        Runnable runnable = ()-> {
            System.out.println("RUN NEW!!!!!!!!!!");

        };
        Thread thread1 = new Thread(runnable);
        thread1.start();
    }


}
