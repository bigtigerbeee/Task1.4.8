import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }


    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 3; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(value));
        }
        return result;

    }
}