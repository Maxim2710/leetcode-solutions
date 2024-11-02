package Easy;

public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] cntSmallerNumbs = new int[nums.length];

        for (int i = 0; i < cntSmallerNumbs.length; i++) {

            int cnt = 0;
            for (int j = 0; j < cntSmallerNumbs.length; j++) {
                if (i != j) {

                    if (nums[j] < nums[i]) {
                        cnt++;
                    }
                }
            }

            cntSmallerNumbs[i] = cnt;
        }

        return cntSmallerNumbs;
    }
}
