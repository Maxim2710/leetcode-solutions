package Easy;

import java.util.Scanner;

public class MajorityElementFinder {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        String[] remakeInputData = inputData.split(" ");

        int[] nums = new int[remakeInputData.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(remakeInputData[i]);
        }

        MajorityElementFinder majorityElementFinder = new MajorityElementFinder();

        int result = majorityElementFinder.majorityElement(nums);

        System.out.println(result);
    }
}
