package methods_2;

/* ����������� ����� � ��� ������ ������� ������� � ������ ����� ���������� ���������.


*/


import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Map;

public class TraceStack {

    public void print() {
        System.out.println("!!!!!!!!!");
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        TraceStack traceStack = new TraceStack();
        traceStack.print();

        /* ����� ����� � ���� */
        Throwable t = new Throwable();
        PrintWriter printWriter = new PrintWriter("printWriterForWriter.txt","UTF-8");
        t.printStackTrace(printWriter);
        printWriter.close();
        System.out.println();

        /* ����� ����� � ������ */
        StackTraceElement[] stackTraceElements = t.getStackTrace();
        for (StackTraceElement element: stackTraceElements) {
            System.out.println(element);
        }
        System.out.println();

        /* ����� ����� ���� ������� */
        Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
        for (Thread thread: map.keySet()) {
            StackTraceElement[] stackTraceElements1 = map.get(thread);
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            for (StackTraceElement element: stackTraceElements1) {
                System.out.println(element);
            }
        }

        /* ���������� ����� */
        Thread.dumpStack();

    }
}
