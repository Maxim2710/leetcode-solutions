package Easy;

public class NumberOfChangingKeys {
    public int countKeyChanges(String s) {
        String string = s.toLowerCase();
        int countChanges = 0;

        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) != string.charAt(i + 1)) {
                countChanges++;
            }
        }

        return countChanges;
    }
}
