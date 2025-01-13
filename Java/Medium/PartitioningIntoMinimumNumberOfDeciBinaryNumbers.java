package Medium;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public int minPartitions(String n) {
        int maxCount = 0;

        for (char c : n.toCharArray()) {
            maxCount = Math.max(maxCount, c - '0');

            if (maxCount == 9) {
                break;
            }
        }

        return maxCount;
    }
}
