package writingReadingFile_15;


import java.io.*;

public class ReadingFromFile {

    public static void main(String[] args) throws IOException {

        File file = new File("readingFromFile.txt");
        FileReader fileReader = new FileReader(file);

        BufferedReader reader = new BufferedReader(fileReader);

        String line = null;
        while ((line = reader.readLine()) != null ) {
            System.out.println(line);
        }

        reader.close();
    }


}
