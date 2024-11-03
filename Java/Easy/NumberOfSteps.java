package Easy;

public class NumberOfSteps {
    public int numberOfSteps(int num) {
        int cntSteps = 0;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
                cntSteps++;
            } else {
                num -= 1;
                cntSteps++;
            }
        }

        return cntSteps;
    }
}
