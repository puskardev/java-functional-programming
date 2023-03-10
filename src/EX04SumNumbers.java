import java.util.Arrays;
import java.util.List;

public class EX04SumNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,5,7,9,1,15,17,19,23);
        int sum = addNumbersIntegerClass(numbers);
        System.out.println(sum);
    }

    private static int addNumbersIntegerClass(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }

    private static int addNumbersLambda(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (x,y) -> x+y);
    }

    private static int sum(int x, int y)  {
        return x+y;
    }

    private static int addNumbers(List<Integer> numbers) {
       return numbers.stream()
                .reduce(0,EX04SumNumbers::sum);
    }
}
