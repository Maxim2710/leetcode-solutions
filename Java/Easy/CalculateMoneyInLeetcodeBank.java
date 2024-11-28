package Easy;

public class CalculateMoneyInLeetcodeBank {
    public int totalMoney(int n) {
        int start = 1;
        int daily = 0;
        int bank = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 7 == 1) {
                daily = start;
                start++;
            } else {
                daily++;
            }

            bank+= daily;
        }

        return bank;
    }
}
