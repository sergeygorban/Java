package LambdaExpressions_31.function;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by CC on 11.03.2018.
 */

/*The java.util.function.Function<T, R> interface defines an abstract method named apply that
takes an object of generic type T as input and returns an object of generic type R. You might use
this interface when you need to define a lambda that maps information from an input object to
an output (for example, extracting the weight of an apple or mapping a string to its length). In
the listing that follows we show how you can use it to create a method map to transform a list of
Strings into a list of Integers containing the length of each String.*/


public class FunctionMy {

    public static <T,R>List<R> map(List<T> list, Function<T,R> f) {
        List<R> result = new ArrayList<>();
        for (T i: list) {
            result.add(f.apply(i));
        }

        return result;
    }

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

    public static void main(String[] args) throws IOException {

        List<Integer> list = FunctionMy.map(Arrays.asList("first", "sec", "apple"), (String s) -> s.length());
        List<Integer> list1 = FunctionMy.map(Arrays.asList("first", "sec", "apple"), String::length);
        System.out.println(list);
        System.out.println(list1);


        // Any lambdas of the form BufferedReader -> String can be passed as arguments, because they
        // match the signature of the process method defined in the Buffered-ReaderProcessor interface.
        String file = "readingFromFile.txt";
        System.out.println(FunctionMy.processFile((BufferedReader br) -> br.readLine(), file));
        System.out.println(FunctionMy.processFile((BufferedReader br) -> br.readLine() + br.readLine(), file));
    }
}
