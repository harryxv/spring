import java.util.Arrays;

public class LambdaExpression {



    public static void main(String[] args) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17};
        System.out.println("use for loop to check each element ");
        for (int prime : primes) {
            System.out.println(prime);
        }

        System.out.println("use Array.stream() + lambda to check each element ");
        Arrays.stream(primes).forEach((el)->System.out.println(el));
    }
}
