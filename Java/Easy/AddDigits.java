package Easy;

public class AddDigits {
    public int addDigits(int num) {
        String currentNum = Integer.toString(num);
        int sum = 0;

        for (char c : currentNum.toCharArray()) {
            sum += Integer.parseInt(String.valueOf(c));
        }

        if (Integer.toString(sum).length() == 1) {
            return sum;
        }

        return addDigits(sum);
    }
}
