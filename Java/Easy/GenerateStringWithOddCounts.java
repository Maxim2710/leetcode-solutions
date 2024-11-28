package Easy;

public class GenerateStringWithOddCounts {
    public String generateTheString(int n) {
        if (n % 2 == 0) {
            return "a".repeat(n - 1) + "b";
        }

        return "a".repeat(n);
    }
}
