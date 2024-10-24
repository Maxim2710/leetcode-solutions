package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr_nums = new int[n];
        for (int i = 0; i < n; i++) {
            arr_nums[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        TwoSum tS = new TwoSum();

        int[] result = tS.twoSum(arr_nums, target);

        System.out.println(Arrays.toString(result));

        scanner.close();
    }
}
