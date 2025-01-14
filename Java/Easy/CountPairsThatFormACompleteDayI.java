package Easy;

public class CountPairsThatFormACompleteDayI {
    public int countCompleteDayPairs(int[] hours) {
        int cntPairs = 0;

        for (int i = 0; i < hours.length - 1; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    cntPairs++;
                }
            }
        }

        return cntPairs;
    }
}
