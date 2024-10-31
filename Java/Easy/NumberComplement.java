package Easy;

public class NumberComplement {
    public int findComplement(int num) {
        int n = Integer.toBinaryString(num).length();

        int mask = (1 << n) - 1;

        return mask ^ num;
    }
}
