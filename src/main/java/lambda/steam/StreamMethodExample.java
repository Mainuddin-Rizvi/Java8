package lambda.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodExample {
    public static void main(String[] args) {
        // Creating a Stream
        Stream<String> stream = Stream.of("apple", "banana", "cherry");

        // forEach - Performs an action for each element in the stream
        stream.forEach(System.out::println);

        // filter - Filters the elements based on a condition
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // map - Transforms each element in the stream
        List<String> names = Arrays.asList("John", "Robert", "Alice");
        List<String> upperCaseNames = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(upperCaseNames);

        // flatMap - Flattens nested collections into a single stream
        List<List<Integer>> nestedNumbers = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> flattenedNumbers = nestedNumbers.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(flattenedNumbers);

        // distinct - Removes duplicate elements from the stream
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 3, 4, 4, 5);
        List<Integer> distinctNumbers = numbersWithDuplicates.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNumbers);

        // sorted - Sorts the elements in natural order or using a custom comparator
        List<Integer> unsortedNumbers = Arrays.asList(5, 3, 2, 7, 1, 6, 4);
        List<Integer> sortedNumbers = unsortedNumbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        // limit - Limits the number of elements in the stream
        List<Integer> numbersToLimit = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> limitedNumbers = numbersToLimit.stream()
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(limitedNumbers);

        // skip - Skips the specified number of elements in the stream
        List<Integer> numbersToSkip = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> skippedNumbers = numbersToSkip.stream()
                .skip(5)
                .collect(Collectors.toList());
        System.out.println(skippedNumbers);

        // reduce - Performs a reduction on the elements of the stream
        List<Integer> numbersToSum = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = numbersToSum.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
