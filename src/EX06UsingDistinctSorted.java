import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EX06UsingDistinctSorted {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,5,7,8,6,5,7,9,17,16,19,22);
        List<String> myString = Arrays.asList("API", "Basic", "Container", "Azure", "APZ", "Jenkins");
        displaySorted(numbers);
        displaySortedStrings(myString);
        displaySortedStringsReverse(myString);
        displaySortedLength(myString);
    }

    private static void displaySortedLength(List<String> myString) {
        myString.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }

    private static void displaySortedStringsReverse(List<String> myString) {
        myString.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    private static void displaySortedStrings(List<String> myString) {
        myString.stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static void displaySorted(List<Integer> numbers) {
        numbers.stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
