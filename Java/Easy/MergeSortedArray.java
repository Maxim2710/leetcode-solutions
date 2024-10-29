package Easy;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int rPointerFirst = m - 1;
        int rPointerSecond = n - 1;
        int endPoint = nums1.length - 1;

        while (rPointerSecond >= 0) {
            if (rPointerFirst >= 0 && nums1[rPointerFirst] >= nums2[rPointerSecond]) {
                nums1[endPoint] = nums1[rPointerFirst];
                endPoint--;
                rPointerFirst--;
            } else {
                nums1[endPoint] = nums2[rPointerSecond];
                endPoint--;
                rPointerSecond--;
            }
        }
    }

}
