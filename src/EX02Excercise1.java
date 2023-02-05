import java.util.Arrays;
import java.util.List;

//Print Odd numbers to console in an array of numbers.

public class EX02Excercise1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,4,6,7,60,91,23,44);
        printOddNumbers(numbers);
    }
    private static void printOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(x -> x%2 != 0)
                .forEach(System.out::println);
    }
}
