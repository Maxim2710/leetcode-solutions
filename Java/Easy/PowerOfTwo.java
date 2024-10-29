package Easy;

import java.util.Scanner;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        boolean flag = false;
        for (int secNum = 0; Math.pow(2, secNum) <= n; secNum++) {
            if (Math.pow(2, secNum) == n) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        boolean resultB = powerOfTwo.isPowerOfTwo(n);

        System.out.println(resultB);
    }
}
