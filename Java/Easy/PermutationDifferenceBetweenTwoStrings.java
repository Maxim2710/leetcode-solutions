package Easy;

public class PermutationDifferenceBetweenTwoStrings {
    public int findPermutationDifference(String s, String t) {
        int dif = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int indexInS = i;
            int indexInT = t.indexOf(c);

            dif += Math.abs(indexInS - indexInT);
        }

        return dif;
    }
}
