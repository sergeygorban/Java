package writingReadingFile_15;


import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PrintWriterForWriter {


    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        /* При отсутствии файла, файл создается автоматически */
        PrintWriter printWriter = new PrintWriter("printWriterForWriter.txt","UTF-8");
        printWriter.print("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        /* Если поток не закрыть, данные в файл не записываються*/
        printWriter.close();
    }
}
