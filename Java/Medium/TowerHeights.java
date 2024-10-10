package Medium;

import java.util.Arrays;
import java.util.Scanner;

public class TowerHeights {

    public long maximumTotalSum(int[] arr) {
        Arrays.sort(arr);

        long resultHeight = 0;
        long curHeight = Long.MAX_VALUE;

        for (int i = arr.length - 1; i >= 0; i--) {
            curHeight = Math.min(curHeight - 1, arr[i]);
            if (curHeight <= 0) {
                return -1;
            }

            resultHeight += curHeight;
        }

        return resultHeight;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int cnt = scanner.nextInt();

        int[] arr = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            arr[i] = scanner.nextInt();
        }

        TowerHeights towerHeights = new TowerHeights();
        long result = towerHeights.maximumTotalSum(arr);

        System.out.println(result);

        scanner.close();
    }
}
