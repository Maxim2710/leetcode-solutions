package Easy;

public class CheckBalancedString {
    public boolean isBalanced(String num) {
        int evenNumsSum = 0;
        int oddNumsSum = 0;

        for (int i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                evenNumsSum += Character.getNumericValue(num.charAt(i));
            } else {
                oddNumsSum += Character.getNumericValue(num.charAt(i));
            }
        }

        return oddNumsSum == evenNumsSum;
    }
}
