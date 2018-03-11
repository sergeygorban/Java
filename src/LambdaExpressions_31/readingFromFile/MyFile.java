package LambdaExpressions_31.readingFromFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by CC on 11.03.2018.
 */
public class MyFile {

    public static String processFile(String file) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            return br.readLine();
        }
    }

    public static String processFile(BufferedReaderProcessor p, String file) throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            return p.process(br);
        }
    }
}
