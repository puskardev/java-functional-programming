import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EX07UsingCollect {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,5,6,9,11,15,19,22,17,30,40);
        List<String> courses = Arrays.asList("Calculus", "Physics", "Chemistry", "Algebra", "Computer Science", "Stats", "Health Science");
        List<Integer> squaredNums = squareNumbers(numbers);
        List<Integer> evenNums = evenNumbers(numbers);
        List<Integer> courseLength = findCoursesLength(courses);
        squaredNums.forEach(System.out::println);
        evenNums.forEach(System.out::println);
        courseLength.forEach(System.out::println);
    }

    private static List<Integer> findCoursesLength(List<String> courses) {
        return courses.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }

    private static List<Integer> evenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
    }

    private static List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());
    }
}
