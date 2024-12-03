package Easy;

import java.util.Arrays;
import java.util.Comparator;

public class SortByBits {
    public static int[] sortByBits(int[] arr) {
        Integer[] integerArr = Arrays.stream(arr)
                .boxed()
                .toArray(Integer[]::new);

        Arrays.sort(integerArr, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                int bitCountA = Integer.bitCount(a);
                int bitCountB = Integer.bitCount(b);

                if (bitCountA != bitCountB) {
                    return bitCountA - bitCountB;
                }
                return a - b;
            }
        });

        return Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray();
    }
}
