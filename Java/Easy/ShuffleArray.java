package Easy;

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffleArr = new int[nums.length];
        int controlInd = 0;

        for (int i = 0; i < shuffleArr.length; i += 2) {
            shuffleArr[i] = nums[controlInd];
            shuffleArr[i + 1] = nums[controlInd + n];
            controlInd++;
        }

        return shuffleArr;
    }
}
