package exceptions_25;

/* Конструкция try c ресурсами эффективна при одном условии:
используемый ресурс принадлежит классу, реализующему интерфейс
AutoCloseable. В этом интерфейсе имеется единственный метод,
объявляемый следующим образом: void close() throws Exception
Имеется также интерфейс Closeable производный от интерфейса AutoCloseable.
В нем также имеется единственный метод close(), но он объявляется для
генерирования исключения типа IOException.

Как было показано ранее, трудности возникают в том случае, если исключение
генерируется не только в блоке try, но и в методе close(). Оператор try с ресурсами предоставляет
довольно изящный выход из столь затруднительного положения.
Исходное исключение генерируется повторно, а любые исключения, генерируемые
в методе close(), считаются "подавленными". Они автоматически перехватываются и добавляются
к исходному исключению с помощью метода addSuppressed().
И если они представляют какой-то интерес с точки зрения обработки, то следует вызвать метод getSuppressed(),
предоставляющий массив подавленных исключений из метода close ().
Но самое главное, что все это не нужно программировать вручную. Всякий раз,
когда требуется освободить используемый ресурс, достаточно применить оператор try с ресурсами.

*/


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResources {


    /* Независимо от того, происходит ли выход из блока try нормально, или же в нем
       возникает исключение, метод in.close() вызывается в любом случае, как и при использовании блока finally.*/
    public void readText() throws FileNotFoundException {

        try (Scanner in = new Scanner(new FileInputStream("scannerFromReading.txt"), "UTF-8");) {

            while (in.hasNext())
                System.out.println(in.next());
        }

    }

    /* В блоке try можно также указать несколько ресурсов
       Таким образом, независимо от способа завершения блока try оба потока ввода
       и вывода благополучно закрываются. Если бы такое освобождение ресурсов пришлось программировать вручную,
       для этого пришлось бы составлять вложенные блоки try/finally.*/
    public void readText1() throws FileNotFoundException {

        try (Scanner in = new Scanner (new FileInputStream("scannerFromReading.txt"), "UTF-8");
             PrintWriter out = new PrintWriter("out.txt")) {

            while (in.hasNext())
                out.println(in.next().toUpperCase());
        }
    }

    public static void main(String[] args) throws FileNotFoundException {

        TryWithResources tryWithResources = new TryWithResources();
        tryWithResources.readText();
        tryWithResources.readText1();

    }
}
