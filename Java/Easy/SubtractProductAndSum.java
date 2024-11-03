package Easy;

public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        String nInString = Integer.toString(n);

        int numsSum = 0;
        int numsMultiply = 1;

        for (char c : nInString.toCharArray()) {
            int curNum = Integer.parseInt(String.valueOf(c));

            numsSum += curNum;
            numsMultiply *= curNum;
        }

        return numsMultiply - numsSum;
    }
}
