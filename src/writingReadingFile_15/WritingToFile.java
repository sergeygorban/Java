package writingReadingFile_15;


import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("fileForWriting.txt");

        fileWriter.write("Write Write Write Write");
        fileWriter.close();
    }
}
