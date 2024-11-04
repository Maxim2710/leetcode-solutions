package Easy;

public class HarshadNumber {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sumDigits = 0;

        int constX = x;

        while (x > 0) {
            sumDigits += x % 10;
            x /= 10;
        }

        if (constX % sumDigits == 0) {
            return sumDigits;
        }

        return -1;
    }
}
