package Easy;

import java.util.Scanner;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int first = 1;
        int second = 2;

        for (int i = 3; i <= n; i++) {
            int cur = first + second;
            first = second;
            second = cur;

        }

        return second;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ClimbingStairs climbingStairs = new ClimbingStairs();

        int resultClimb = climbingStairs.climbStairs(n);

        System.out.println(resultClimb);
    }
}
