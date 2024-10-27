package Easy;

import java.util.Scanner;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int leftInd = 0;
        int rightInd = nums.length - 1;

        while (leftInd <= rightInd) {
            int mid = leftInd + (rightInd - leftInd) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                leftInd = mid + 1;
            } else {
                rightInd = mid - 1;
            }
        }

        return leftInd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();
        int target = scanner.nextInt();

        String[] remakeInputData = inputData.split(" ");

        int[] nums = new int[remakeInputData.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(remakeInputData[i]);
        }

        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();

        int result = searchInsertPosition.searchInsert(nums, target);

        System.out.println(result);
    }

}
