package LambdaExpressions_31.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by CC on 26.03.2018.
 */

/*Stream is a sequence of elements from a source that supports data processing operations




*/
public class StreamNote {


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
    }
}
