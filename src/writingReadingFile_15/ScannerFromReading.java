package writingReadingFile_15;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class ScannerFromReading {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(Paths.get("scannerFromReading.txt"), "UTF-8");

        System.out.println(scanner.nextLine());
        scanner.close();
    }
}
