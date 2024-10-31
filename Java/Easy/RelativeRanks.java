package Easy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class RelativeRanks {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ratingResult = new String[n];

        Integer[] ind = new Integer[n];

        for (int i = 0; i < ind.length; i++) {
            ind[i] = i;
        }

        Arrays.sort(ind, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return score[o2] - score[o1];
            }
        });

        for (int i = 0; i < ratingResult.length; i++) {
            if (i == 0) ratingResult[ind[i]] = "Gold Medal";
            else if (i == 1) ratingResult[ind[i]] = "Silver Medal";
            else if (i == 2) ratingResult[ind[i]] = "Bronze Medal";
            else ratingResult[ind[i]] = String.valueOf(i + 1);
        }

        return ratingResult;
    }
}
