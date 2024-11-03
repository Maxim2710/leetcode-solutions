package Easy;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinOperations {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);
        }

        int cntOperations = 0;

        while(!minHeap.isEmpty() && minHeap.peek() < k) {
            minHeap.poll();
            cntOperations++;
        }

        return cntOperations;
    }
}
