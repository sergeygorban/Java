package writingReadingFile_15;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PrintWriterForWriter {


    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        /* ��� ���������� �����, ���� ��������� ������������� */
        PrintWriter printWriter = new PrintWriter("printWriterForWriter.txt","UTF-8");
        printWriter.print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        /* ���� ����� �� �������, ������ � ���� �� �������������*/
        printWriter.close();
    }
}
