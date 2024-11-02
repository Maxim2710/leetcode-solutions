package Easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCntCandies = 0;

        for (int i = 0; i < candies.length; i++) {
            maxCntCandies = Math.max(maxCntCandies, candies[i]);
        }

        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies < maxCntCandies) {
                result.add(false);
            } else {
                result.add(true);
            }
        }

        return result;
    }
}
