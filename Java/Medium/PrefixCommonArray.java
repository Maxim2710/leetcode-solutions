package Medium;

import java.util.HashSet;
import java.util.Set;

public class PrefixCommonArray {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] result = new int[n];

        Set<Integer> seenInA = new HashSet<>();
        Set<Integer> seenInB = new HashSet<>();

        int commonCount = 0;

        for (int i = 0; i < n; i++) {
            if (seenInB.contains(A[i])) {
                commonCount++;
            }
            seenInA.add(A[i]);

            if (seenInA.contains(B[i])) {
                commonCount++;
            }
            seenInB.add(B[i]);

            result[i] = commonCount;
        }

        return result;
    }
}
