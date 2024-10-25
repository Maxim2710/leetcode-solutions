package Easy;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        String[] remakeInputData = inputData.split(" ");
        int[] nums = new int[remakeInputData.length];

        for (int i = 0; i < remakeInputData.length; i++) {
            nums[i] = Integer.parseInt(remakeInputData[i]);
        }

        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

        int k = removeDuplicatesFromSortedArray.removeDuplicates(nums);

        System.out.print(k + ", nums = [");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
            if (i < k - 1) {
                System.out.print(",");
            }
        }

        for (int i = k; i < nums.length; i++) {
            System.out.print(",_");
        }

        System.out.println(']');

    }
}
