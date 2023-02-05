import java.util.Arrays;
import java.util.List;

public class EX05UsingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3);
        int sumOfSquares = findSumOfSquares(numbers);
        int sumOfCubes = findSumOfCubes(numbers);
        int sumOfOddNumbers = findSumOfOdd(numbers);
        System.out.println("Sum of squares is " + sumOfSquares);
        System.out.println("Sum of cubes is " + sumOfCubes);
        System.out.println("Sum of Odd numbers is " + sumOfOddNumbers);
    }

    private static int findSumOfOdd(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x%2 != 0)
                .reduce(0,Integer::sum);
    }

    private static int findSumOfCubes(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (x,y) -> x + y*y*y);
    }

    private static int findSumOfSquares(List<Integer> numbers) {
       return numbers.stream()
                .reduce(0, (x,y) -> x + y*y);
       // Can use map to map numbers first.
     /*   return numbers.stream()
                .map(x->x*x)
                .reduce(0, Integer::sum);*/
    }
}
