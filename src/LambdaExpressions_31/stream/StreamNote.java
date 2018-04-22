package LambdaExpressions_31.stream;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by CC on 26.03.2018.
 */

/*Stream is a sequence of elements from a source that supports data processing operations

https://github.com/java8/Java8InAction/blob/master/src/main/java/lambdasinaction/chap6/Grouping.java


*/
public class StreamNote {

    public enum CaloricLevel { DIET, NORMAL, FAT }

    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season fruit", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH));


        List<String> lowCaloricDishesName =
                menu.parallelStream()
                        .filter(d -> d.getCalories() > 300)
                        .sorted(Comparator.comparing(Dish::getCalories))
                        .map(Dish::getName)
                        .limit(3)
                        .collect(Collectors.toList());
        System.out.println(lowCaloricDishesName);
        System.out.println();

        // Filtering unique elements (Deleting duplicates) - distinct()
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        // Truncating a stream - limit(3)
        List<Dish> dishes = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(dishes);
        System.out.println();

        // Skipping elements - skip(n). If the stream has fewer elements than n, then an empty stream is returned.
        List<Dish> dishes1 = menu.stream()
                .filter(d -> d.getCalories() > 300)
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(dishes1);
        System.out.println();

        // Map
        List<String> dishNames = menu.stream()
                .map(Dish::getName)
                .collect(Collectors.toList());
        System.out.println(dishNames);

        List<Integer> dishNameLengths = menu.stream()
                .map(Dish::getName)
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(dishNameLengths);
        System.out.println();

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares =
                numbers1.stream()
                        .map(n -> n * n)
                        .collect(Collectors.toList());
        System.out.println("squares: " + squares);

        // FlatMap
        List<String> words = Arrays.asList("Hello", "World");
        List<String> arrayOfWords = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("arrayOfWords: " + arrayOfWords);

        List<Integer> number1 = Arrays.asList(1, 2, 3);
        List<Integer> number2 = Arrays.asList(3, 4);
        List<int[]> pairs =
                number1.stream()
                        .flatMap(i -> number2.stream()
                                        .map(j -> new int[]{i, j})
                        )
                        .peek(a -> System.out.println("pairs: " + Arrays.toString(a)))
                        .collect(Collectors.toList());

        List<int[]> pairs1 =
                number1.stream()
                        .flatMap(i -> number2.stream()
                                        .filter(j -> (i + j) % 3 == 0)
                                        .map(j -> new int[]{i, j})
                                        .peek(a -> System.out.println("pairs1: " + Arrays.toString(a)))
                        )
                        .collect(Collectors.toList());


        // anyMatch - Checking to see if a predicate matches at least one element
        if (menu.stream().anyMatch(Dish::isVegetarian)) {
            System.out.println("The menu is (somewhat) vegetarian friendly!!");
        }

        // allMatch - Checking to see if a predicate matches all elements
        boolean isHealthy = menu.stream()
                .allMatch(d -> d.getCalories() < 1000);
        System.out.println("isHealthy: " + isHealthy);

        // noneMatch
        boolean isHealthy1 = menu.stream()
                .noneMatch(d -> d.getCalories() >= 1000);
        System.out.println("isHealthy1: " + isHealthy1);

        // findAny - Finding an element
        /* The Optional<T> class (java.util.Optional) is a container class to represent the existence
           or absence of a value.
           isPresent() returns true if Optional contains a value, false otherwise.
            ifPresent(Consumer<T> block) executes the given block if a value is present. We introduced the
            T get() returns the value if present; otherwise it throws a NoSuchElement-Exception.
            T orElse(T other) returns the value if present; otherwise it returns a default value.
        */
        menu.stream()
                .filter(Dish::isVegetarian)
                .findAny()
                .ifPresent(d -> System.out.println("getName: " + d.getName()));

        // findFirst - Finding the first element
        List<Integer> someNumbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> firstSquareDivisibleByThree =
                someNumbers.stream()
                        .map(x -> x * x)
                        .filter(x -> x % 3 == 0)
                        .findFirst();
        System.out.println("someNumbers: " + someNumbers);
        System.out.println();

        // reduce
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("sum: " + sum);

        // reduce. sum
        int sum1 = numbers.stream().reduce(0, Integer::sum);
        System.out.println("sum1: " + sum1);

        // reduce. No initial value
        Optional<Integer> sum2 = numbers.stream().reduce((a, b) -> (a + b));
        System.out.println("sum2: " + sum2);

        // reduce. max and min
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println("Max: " + max);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        System.out.println("Min: " + min);

        // redice. Count
        int count = menu.stream()
                .map(d -> 1)
                .reduce(0, (a, b) -> {

                    System.out.println(a + b);
                    return a + b;
                });
        System.out.println("Count: " + count);


        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // Find all transactions in 2011 and sort by value (small to high)
        List<Transaction> tr2011 = transactions.stream()
                .filter(tr -> tr.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        System.out.println("tr2011: " + tr2011);

        // Return a string of all traders’ names sorted alphabetically
        String traderStr = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 + n2);
        System.out.println("traderStr: " + traderStr);

        String traderStr1 =
                transactions.stream()
                        .map(transaction -> transaction.getTrader().getName())
                        .distinct()
                        .sorted()
                        .collect(Collectors.joining());
        System.out.println("traderStr1: " + traderStr1);

        // Find the transaction with the smallest value
        Optional<Transaction> smallestTransaction =
                transactions.stream()
                        .min(Comparator.comparing(Transaction::getValue));
        System.out.println("smallestTransaction: " + smallestTransaction);

        // Mapping to a numeric stream
        int calories = menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println("calories: " + calories);

        OptionalInt maxCalories = menu.stream()
                .mapToInt(Dish::getCalories)
                .max();
        int max1 = maxCalories.orElse(0);
        System.out.println("maxCalories: " + maxCalories);

        // Converting back to a stream of objects
        Stream<Integer> stream = menu.stream()
                .mapToInt(Dish::getCalories)
                .boxed();
        System.out.println("stream: + " + stream);
        System.out.println();

        // Numeric ranges
        long onlyNumbers = IntStream.rangeClosed(1, 100)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("onlyNumbers: " + onlyNumbers);

        long onlyNumbers1 = IntStream.range(1, 100)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println("onlyNumbers1: " + onlyNumbers1);

        // Generating a values
        Stream<int[]> pythagoreanTriples =
                IntStream.rangeClosed(1, 100).boxed()
                        .flatMap(a -> IntStream.rangeClosed(a, 100)
                                        .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                                        .mapToObj(b ->
                                                new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                        );
        System.out.println("pythagoreanTriples: " + pythagoreanTriples);

        // Streams from values
        Stream<String> streamm = Stream.of("Java 8 ", "Lambdas ", "In ", "Action");
        streamm.map(String::toUpperCase).forEach(a -> System.out.println("streamm: " + a));

        //  Streams from arrays
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum3 = Arrays.stream(num).sum();

        //Streams from files

        // Iterate
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        // Generate
        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        // Collecting data with streams

        // Counting the quantity
        long howManyDishes = menu.stream().collect(Collectors.counting());
        System.out.println("Counting the quantity " + howManyDishes);

        // Finding maximum and minimum in a stream of values
        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostCalorieDish = menu.stream().collect(Collectors.maxBy(dishCaloriesComparator));
        System.out.println("mostCalorieDish " + mostCalorieDish.get());

        // Summarization
        int totalCalories = menu.stream().collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("totalCalories " + totalCalories);

        double avgCalories = menu.stream().collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("avgCalories " + avgCalories);

        IntSummaryStatistics menuStatistics = menu.stream().collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println("menuStatistics " + menuStatistics);

        // Joining Strings
        String shortMenu = menu.stream().map(Dish::getName).collect(Collectors.joining());
        System.out.println("shortMenu " + shortMenu);

        String shortMenu1 = menu.stream().map(Dish::getName).collect(Collectors.joining(", "));
        System.out.println("shortMenu1 " + shortMenu1);

        String shortMenu2 = menu.stream().map(Dish::getName).collect(Collectors.reducing((s1, s2) -> s1 + s2)).get();
        System.out.println("shortMenu2 " + shortMenu2);

        // Generalized summarization with reduction
        int totalCalories2 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, (i, j) -> i + j));
        System.out.println("totalCalories2 " + totalCalories2);

        Optional<Dish> mostCalorieDish1 =
                menu.stream().collect(Collectors.reducing(
                        (d1, d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));
        System.out.println("mostCalorieDish1 " + mostCalorieDish1.get());


        int totalCalories1 = menu.stream().collect(Collectors.reducing(0, Dish::getCalories, Integer::sum));
        System.out.println("totalCalories1 " + totalCalories1);

        int totalCalories3 = menu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
        System.out.println("totalCalories3 " + totalCalories3);

        int totalCalories4 = menu.stream().mapToInt(Dish::getCalories).sum();
        System.out.println("totalCalories4 " + totalCalories4);


        // Grouping
        Map<Dish.Type, List<Dish>> dishesByType = menu.stream().collect(Collectors.groupingBy(Dish::getType));
        System.out.println("dishesByType " + dishesByType);

        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = menu.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getCalories() <= 400) return CaloricLevel.DIET;
            else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
            else return CaloricLevel.FAT;
        }));

        System.out.println("dishesByCaloricLevel " + dishesByCaloricLevel);


        // Multilevel grouping
        Map<Dish.Type, Map<CaloricLevel, List<Dish>>> dishesByTypeCaloricLevel1 =
            menu.stream().collect(
                    Collectors.groupingBy(Dish::getType,
                            Collectors.groupingBy((Dish dish) -> {
                                if (dish.getCalories() <= 400) return CaloricLevel.DIET;
                                else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                                else return CaloricLevel.FAT;
                            })
                    )
            );

        System.out.println("dishesByTypeCaloricLevel1 " + dishesByTypeCaloricLevel1);


    }
}














