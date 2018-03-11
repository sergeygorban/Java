package LambdaExpressions_31.readingFromFile;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by CC on 11.03.2018.
 */
public class FileMain {



    public static void main(String[] args) throws IOException {

        String file = "readingFromFile" +
                ".txt";


        System.out.println(MyFile.processFile((BufferedReader br) -> br.readLine(), file));
        System.out.println(MyFile.processFile((BufferedReader br) -> br.readLine() + br.readLine(), file));


    }
}
