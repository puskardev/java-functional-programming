import java.util.Arrays;
import java.util.List;

public class EX06UsingDistintSorted {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,5,7,8,6,5,7,9,17,16,19,22);
        List<String> myString = Arrays.asList("API", "Basic", "Container", "Azure", "APZ", "Jenkins");
        displaySorted(numbers);
        displaySortedStrings(myString);
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
