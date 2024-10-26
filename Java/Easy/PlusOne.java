package Easy;

import java.util.Scanner;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        String[] normalInputLine = inputLine.split(" ");

        int[] nums = new int[normalInputLine.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(normalInputLine[i]);
        }

        PlusOne plusOne = new PlusOne();

        int[] result = plusOne.plusOne(nums);

        for (int elem : result) {
            System.out.print(elem + " ");
        }
    }
}
