package Easy;

public class SumOfDigitsInBaseK {
    public int sumBase(int n, int k) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % k);

            n /= k;
        }

        System.out.println(sb);

        int sum = 0;

        for (int i = sb.length() - 1; i >= 0; i--) {
            sum += sb.charAt(i) - '0';
        }

        return sum;
    }
}
