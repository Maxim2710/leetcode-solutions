package Easy;

import java.util.Scanner;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        int value = scanner.nextInt();

        String[] remakeInputData = inputData.split(" ");
        int[] nums = new int[remakeInputData.length];

        for (int i = 0; i < remakeInputData.length; i++) {
            nums[i] = Integer.parseInt(remakeInputData[i]);
        }

        RemoveElement removeElement = new RemoveElement();

        int k = removeElement.removeElement(nums, value);

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
        System.out.print("]");
    }
}
