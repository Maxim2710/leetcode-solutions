package Easy;

import java.math.BigInteger;
import java.util.Scanner;

public class BinaryAddition {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);

        BigInteger sum = num1.add(num2);

        return sum.toString(2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        BinaryAddition binaryAddition = new BinaryAddition();

        String result = binaryAddition.addBinary(a, b);

        System.out.println(result);
    }
}
