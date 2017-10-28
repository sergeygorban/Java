package readingFromConsole_28;

/**/

import java.util.Scanner;

public class ReadingFromConsole {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What am I");

        String ans = scanner.nextLine();
        scanner.close();
        System.out.println(ans);

    }
}
