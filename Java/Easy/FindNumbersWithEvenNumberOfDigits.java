package Easy;

public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            StringBuilder sb = new StringBuilder();

            while (num > 0) {
                sb.append(num % 10);
                num /= 10;
            }

            if (sb.length() % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
