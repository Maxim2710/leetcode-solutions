package Easy;

import java.util.Scanner;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int unique = 0;
        for (int num : nums) {
            unique ^= num;
        }

        return unique;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String[] remakeInputLine = inputLine.split(" ");

        int[] nums = new int[remakeInputLine.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(remakeInputLine[i]);
        }

        SingleNumber singleNumber = new SingleNumber();

        int result = singleNumber.singleNumber(nums);

        System.out.println(result);
    }
}
