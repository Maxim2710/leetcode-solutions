package Easy;

import java.util.Scanner;

public class MinElementAfterReplacement {

    public int findMinResult(int[] num) {

        int min_result = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++) {
            int sumOfDigit = counterSum(num[i]);
            min_result = Math.min(sumOfDigit, min_result);
        }

        return min_result;
    }

    public int counterSum(int cur_num) {

        int cur_sum = 0;

        while (cur_num > 0) {
            cur_sum += cur_num % 10;
            cur_num /= 10;
        }

        return cur_sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count_num = scanner.nextInt();

        int[] numbers = new int[count_num];

        for (int i = 0; i < count_num; i++) {
            numbers[i] = scanner.nextInt();
        }

        MinElementAfterReplacement minElementAfterReplacement = new MinElementAfterReplacement();

        int result = minElementAfterReplacement.findMinResult(numbers);

        System.out.println(result);

        scanner.close();

    }
}
