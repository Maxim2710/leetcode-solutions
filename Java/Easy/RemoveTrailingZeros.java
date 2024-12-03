package Easy;

public class RemoveTrailingZeros {
    public String removeTrailingZeros(String num) {
        int endPoint = num.length() - 1;

        while (endPoint >= 0 && num.charAt(endPoint) == '0') {
            endPoint--;
        }

        return num.substring(0, endPoint + 1);
    }
}
