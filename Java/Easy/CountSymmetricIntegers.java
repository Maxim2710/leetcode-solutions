package Easy;

public class CountSymmetricIntegers {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;

        for (int i = low; i <= high; i++) {
            String curNum = Integer.toString(i);

            if (curNum.length() % 2 == 0) {
                int mid = curNum.length() / 2;

                String leftPart = curNum.substring(0, mid);
                String rightPart = curNum.substring(mid);

                int leftSum = 0;
                for (char c : leftPart.toCharArray()) {
                    leftSum += c - '0';
                }

                int rightSum = 0;
                for (char c : rightPart.toCharArray()) {
                    rightSum += c - '0';
                }

                if (rightSum == leftSum) cnt++;
            }
        }

        return cnt;
    }
}
