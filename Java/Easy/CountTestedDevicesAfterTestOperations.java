package Easy;

public class CountTestedDevicesAfterTestOperations {
    public int countTestedDevices(int[] batteryPercentages) {
        int countDev = 0;

        for (int i = 0; i < batteryPercentages.length; i++) {
            if (batteryPercentages[i] == 0) {
                continue;
            }

            countDev++;
            for (int j = i + 1; j < batteryPercentages.length; j++) {
                if (batteryPercentages[j] == 0) {
                    continue;
                }
                batteryPercentages[j] = batteryPercentages[j] - 1;
            }
        }

        return countDev;
    }
}
