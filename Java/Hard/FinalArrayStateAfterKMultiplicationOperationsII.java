package Hard;

import java.util.*;

public class FinalArrayStateAfterKMultiplicationOperationsII {
    public int[] getFinalState(int[] nums, int operationsRemaining, int multiplier) {
        if (multiplier == 1)
            return nums;

        final int arrayLength = nums.length;
        final int maxInitialValue = Arrays.stream(nums).max().getAsInt();
        int[] result = new int[arrayLength];

        Queue<int[]> minHeap = new PriorityQueue<>(
                (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        for (int i = 0; i < arrayLength; ++i)
            minHeap.offer(new int[] {nums[i], i});

        while (operationsRemaining > 0 && (long) minHeap.peek()[0] * multiplier <= maxInitialValue) {
            final int minValue = minHeap.peek()[0];
            final int index = minHeap.poll()[1];
            minHeap.offer(new int[] {minValue * multiplier, index});
            --operationsRemaining;
        }

        List<int[]> sortedValuesWithIndices = new ArrayList<>(minHeap);
        Collections.sort(
                sortedValuesWithIndices,
                (a, b) -> a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));

        final int multiplicationsPerElement = operationsRemaining / arrayLength;
        final int remainingOperations = operationsRemaining % arrayLength;


        for (int[] valueWithIndex : sortedValuesWithIndices)
            valueWithIndex[0] = (int) ((long) valueWithIndex[0] * fastModularExponentiation(multiplier, multiplicationsPerElement) % MODULO);

        for (int i = 0; i < remainingOperations; ++i)
            sortedValuesWithIndices.get(i)[0] = (int) ((long) sortedValuesWithIndices.get(i)[0] * multiplier % MODULO);

        for (int[] valueWithIndex : sortedValuesWithIndices) {
            final int value = valueWithIndex[0];
            final int index = valueWithIndex[1];
            result[index] = value;
        }

        return result;
    }

    private static final int MODULO = 1_000_000_007;

    private long fastModularExponentiation(long base, long exponent) {
        if (exponent == 0)
            return 1;
        if (exponent % 2 == 1)
            return base * fastModularExponentiation(base, exponent - 1) % MODULO;
        return fastModularExponentiation(base * base % MODULO, exponent / 2);
    }

}
