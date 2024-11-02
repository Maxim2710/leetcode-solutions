package Easy;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int cntStones = 0;

        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                char curJ = jewels.charAt(i);
                char curS = stones.charAt(j);

                if (curJ == curS) {
                    cntStones++;
                }
            }
        }

        return cntStones;
    }
}
