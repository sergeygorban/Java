package LambdaExpressions_31.function;

import LambdaExpressions_31.predicate.Apple;
import string_19.StringBuilderMy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
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


public class FunctionNote {

    public static List<Apple> mapApple (List<Integer> list, Function<Integer,Apple> f) {
        List<Apple> result = new ArrayList<>();
        for (Integer i: list) {
            result.add(f.apply(i));
        }

        return result;
    }

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

    public static String addHeader(String text){
        return "From Raoul, Mario and Alan: " + text;
    }
    public static String addFooter(String text){
        return text + " Kind regards";
    }
    public static String checkSpelling(String text){
        return text.replaceAll("labda", "lambda");
    }


    public static void main(String[] args) throws IOException {

        List<Integer> list = FunctionNote.map(Arrays.asList("first", "sec", "apple"), (String s) -> s.length());
        List<Integer> list1 = FunctionNote.map(Arrays.asList("first", "sec", "apple"), String::length);
        System.out.println(list);
        System.out.println(list1);


        // Any lambdas of the form BufferedReader -> String can be passed as arguments, because they
        // match the signature of the process method defined in the Buffered-ReaderProcessor interface.
        String file = "readingFromFile.txt";
        System.out.println(FunctionNote.processFile((BufferedReader br) -> br.readLine(), file));
        System.out.println(FunctionNote.processFile((BufferedReader br) -> br.readLine() + br.readLine(), file));

        //Creating several Objects
        List<Integer> weight = Arrays.asList(1, 2, 3, 466, 77);
        List<Apple> list2 = FunctionNote.mapApple(weight,Apple::new);
        System.out.println("Function " + list2);
        System.out.println();

        // Constructor with signature
        Function<Integer,Apple> c3 = Apple::new;
        Apple a3 = c3.apply(100);
        System.out.println(a3.getWeight());

        Function<Integer,Apple> c4 = (weight1) -> new Apple(weight1);
        Apple a4 = c4.apply(100);
        System.out.println(a4.getWeight());

        BiFunction<String, Integer, Apple> c5 = Apple::new;
        Apple a5 = c5.apply("red", 100);
        System.out.println(a5);

        BiFunction<String, Integer, Apple> c6 = (color, weight1) -> new Apple(color, weight1);
        Apple a6 = c5.apply("red-red", 66);
        System.out.println(a6);
        System.out.println();

        // Composing Functions
        // 2 + 2 = 3 >>> 3 * 2 = 6
        Function<Integer,Integer> f = x -> x + 1;
        Function<Integer,Integer> g = x -> x * 2;
        Function<Integer,Integer> h = f.andThen(g);
        int result = h.apply(2);
        System.out.println(result);
        System.out.println();

        // 2 * 2 = 4 >>> 4 + 1 = 5
        Function<Integer,Integer> f1 = x -> x + 1;
        Function<Integer,Integer> g1 = x -> x * 2;
        Function<Integer,Integer> h1 = f1.compose(g1);
        int result1 = h1.apply(2);
        System.out.println(result1);
        System.out.println();

        // Practical use
        Function<String, String> addHeader = FunctionNote::addHeader;
        Function<String, String> transformationPipeline = addHeader
                .andThen(FunctionNote::checkSpelling)
                .andThen(FunctionNote::addFooter);
        String res = transformationPipeline.apply("labda");
        System.out.println(res);
        System.out.println();

        Function<String, String> addHeader1 = FunctionNote::addHeader;
        Function<String, String> transformationPipeline1
                = addHeader1.andThen(FunctionNote::addFooter);
        String res1 = transformationPipeline1.apply("labda");
        System.out.println(res1);
    }
}
