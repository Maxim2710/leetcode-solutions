package Easy;

import java.util.Scanner;

public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputData = scanner.nextInt();

        ReverseBits reverseBits = new ReverseBits();

        int result = reverseBits.reverseBits(inputData);

        System.out.println(result);
    }
}
