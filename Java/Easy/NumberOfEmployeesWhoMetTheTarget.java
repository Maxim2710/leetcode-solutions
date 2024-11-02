package Easy;

public class NumberOfEmployeesWhoMetTheTarget {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int cntCompleteTarget = 0;

        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                cntCompleteTarget++;
            }
        }

        return cntCompleteTarget;
    }
}
