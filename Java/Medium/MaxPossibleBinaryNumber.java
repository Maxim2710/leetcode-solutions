package Medium;

import java.util.Scanner;

class MaxPossibleBinaryNumber {
    public int maxGoodNumber(int[] nums) {
        int maxVal = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    for (int k = 0; k < nums.length; k++) {
                        if (k != i && j != k) {
                            StringBuilder sb = new StringBuilder();

                            sb.append(Integer.toBinaryString(nums[i]));
                            sb.append(Integer.toBinaryString(nums[j]));
                            sb.append(Integer.toBinaryString(nums[k]));

                            int currentValue = Integer.parseInt(sb.toString(), 2);
                            maxVal = Math.max(maxVal, currentValue);
                        }
                    }
                }
            }
        }

        return maxVal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] array = input.split(",");

        scanner.close();

        int[] arr_nums = new int[3];

        int index = 0;

        for (String el: array) {
            arr_nums[index] = Integer.parseInt(el.trim());
            index += 1;
        }

        MaxPossibleBinaryNumber maxPossibleBinaryNumber = new MaxPossibleBinaryNumber();
        int result = maxPossibleBinaryNumber.maxGoodNumber(arr_nums);
        System.out.println(result);
    }
}