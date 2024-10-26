package Easy;

import java.util.Scanner;

public class Sqrt {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int left = 1;
        int right = x;
        int res = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid <= x / mid) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        Sqrt sqrt = new Sqrt();

        int result = sqrt.mySqrt(x);

        System.out.println(result);

        scanner.close();
    }
}
