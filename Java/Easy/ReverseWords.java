package Easy;

public class ReverseWords {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] reformatString = s.split(" ");

        int endPoint = reformatString.length - 1;
        int k = 0;

        for (String str : reformatString) {
            StringBuilder timer = new StringBuilder();

            sb.append(timer.append(str).reverse());

            if (!(endPoint == k)) {
                sb.append(" ");
            }

            k++;
        }

        return sb.toString();
    }
}
