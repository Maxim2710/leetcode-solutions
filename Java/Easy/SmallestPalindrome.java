package Easy;

public class SmallestPalindrome {
    public String makeSmallestPalindrome(String s) {
        char[] charArr = s.toCharArray();
        int n = charArr.length;
        for (int i = 0; i < n / 2; i++) {
            int j = n - i - 1;

            if (charArr[i] != charArr[j]) {
                charArr[i] = charArr[j] = (char) Math.min(charArr[i], charArr[j]);
            }
        }

        return new String(charArr);
    }
}
